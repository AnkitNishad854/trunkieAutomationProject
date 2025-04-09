package com.projectheen.admin.Projectheen;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement searchBar = driver.findElement(By.id("datepicker"));
		searchBar.click();

		while (true) {
			WebElement monthElement = driver.findElement(By.className("ui-datepicker-month"));
			WebElement yearElement = driver.findElement(By.className("ui-datepicker-year"));

			String month = monthElement.getText().trim();
			String year = yearElement.getText().trim();

			System.out.println("Current Month-Year: " + month + " " + year);

			if (month.equalsIgnoreCase("January") && year.equals("2043")) {
				System.out.println("January 2040 aa gaya, script yahin ruk jani chahiye!");
				break;
			}

			WebElement nextBtnClick = driver.findElement(By.className("ui-datepicker-next"));
			nextBtnClick.click();
		}

		driver.quit();
	}
}