package com.projectheen.admin.Projectheen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeacherPortal {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://qa-trunkie.projectheen.com/Manage/ApplyLeave");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		WebElement userName = driver.findElement(By.xpath("//*[@id=\"input-with-icon-textfield\"]"));
		highlightElement(driver, userName);
		userName.sendKeys("t2025022519376");

		WebElement password = driver.findElement(By.name("password"));
		highlightElement(driver, password);
		password.sendKeys("ENSXOY9Z");

		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div/div[4]/span/span[1]/input"));
		checkbox.click();

		WebElement btn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div/div[5]/a/span[1]"));
		highlightElement(driver, btn);
		btn.click();
			
		WebElement subTeaSelect = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/label[2]/span[1]/span[1]/input"));
		highlightElement(driver, subTeaSelect);
		subTeaSelect.click();
		
		WebElement clsDropdown = driver.findElement(By.xpath("//*[@id=\"mui-component-select-Class\"]"));
		highlightElement(driver, clsDropdown);
		clsDropdown.click();
		
		WebElement clsDropdownSel = driver.findElement(By.xpath("//*[@id=\"menu-Class\"]/div[3]/ul/li"));
		highlightElement(driver, clsDropdownSel);
		clsDropdownSel.click();
		
		WebElement subDropdown = driver.findElement(By.xpath("//*[@id=\"mui-component-select-Subject\"]"));
		highlightElement(driver, subDropdown);
		subDropdown.click();
		
		WebElement subDropdownSel = driver.findElement(By.xpath("//*[@id=\"menu-Subject\"]/div[3]/ul/li"));
		highlightElement(driver, subDropdownSel);
		subDropdownSel.click();
		
		WebElement proceedBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/button/span[1]"));
		highlightElement(driver, proceedBtn);
		proceedBtn.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement NotFiBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[1]/div[2]/div[1]/button/span[1]"));
		highlightElement(driver, NotFiBtn);
		NotFiBtn.click();
		
		Thread.sleep(5000);
		WebElement heading = driver.findElement(By.xpath("//label[text()='Heading *']/..//div//input"));
		heading.click();
		highlightElement(driver, heading);
		heading.sendKeys("Trunkie");
		
		Thread.sleep(5000);
		WebElement notificationBox = driver.findElement(By.xpath("(//textarea[@placeholder='Write Message Here'])[1]"));
		notificationBox.click();
		highlightElement(driver, notificationBox);
		notificationBox.sendKeys("Test Message");
		
		WebElement date = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[3]/div[1]/div/div/input"));
		date.click();
		highlightElement(driver, date);
		date.sendKeys("26-04-2025");
		
		WebElement exdate = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[3]/div[2]/div/div/input"));
		highlightElement(driver, exdate);
		exdate.sendKeys("27-04-2025");
		
		WebElement sendNotiF = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[3]/div[2]/div/div/div/button/span[2]"));
		sendNotiF.click();
		highlightElement(driver, sendNotiF);
		sendNotiF.sendKeys("10-04-2025");
		
		WebElement sendbutton = driver.findElement(By.xpath("//button[contains(., 'Send Notification')]"));
		sendbutton.click();
		
	}
	
	    public static void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'; arguments[0].style.border='2px solid red';", element);
	}

}