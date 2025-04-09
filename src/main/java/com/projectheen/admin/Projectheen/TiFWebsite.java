package com.projectheen.admin.Projectheen;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiFWebsite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://theindigenousforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		js.executeScript("window.scrollTo(0, 0);");

		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"menu-1-1793b98e\"]/li[1]/a"));
		checkbox.click();

	}
}