package com.projectheen.admin.Projectheen;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperAdmin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://admin.projectheen.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		highlightElement(driver, userName);
		userName.sendKeys("Superadmin");

		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		highlightElement(driver, password);
		password.sendKeys("5VRPu7g5");

		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[6]/div[1]/input"));
		checkbox.click();

		WebElement btn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[6]/div[2]"));
		highlightElement(driver, btn);
		btn.click();

		WebElement orgListBtn = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[1]"));
		highlightElement(driver, orgListBtn);
		orgListBtn.click();

		WebElement addOrgBtn = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div/div[2]/a"));
		highlightElement(driver, addOrgBtn);
		addOrgBtn.click();

		WebElement orgName = driver.findElement(By.xpath("//*[@id=\"accountName\"]"));
		highlightElement(driver, orgName);
		orgName.sendKeys("Name_ORG256306");

		WebElement descBtn = driver.findElement(By.xpath("//*[@id=\"description\"]"));
		highlightElement(driver, descBtn);
		descBtn.sendKeys("Test Desc");

		WebElement boardNameDropdownBtn = driver
				.findElement(By.xpath("//*[@id=\"mainDiv\"]/div/div[1]/div[3]/div/span/span[1]/span"));
		highlightElement(driver, boardNameDropdownBtn);
		boardNameDropdownBtn.click();

		WebElement boardNameSelectDropdownBtn = driver
				.findElement(By.xpath("//li[@role='treeitem' and normalize-space()='CBSE']"));
		highlightElement(driver, boardNameSelectDropdownBtn);
		boardNameSelectDropdownBtn.click();

		WebElement primaryadr = driver.findElement(By.xpath("//*[@id=\"primaryAddress\"]"));
		highlightElement(driver, primaryadr);
		primaryadr.sendKeys("GURGUGRAM");

		WebElement emailId = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		highlightElement(driver, emailId);
		emailId.sendKeys("ankitnishad6395@gmail.com");

		WebElement conEmail = driver.findElement(By.xpath("//*[@id=\"emailCnfrm\"]"));
		highlightElement(driver, conEmail);
		conEmail.sendKeys("ankitnishad6395@gmail.com");

		WebElement mobNo = driver.findElement(By.xpath("//*[@id=\"mobileNo\"]"));
		highlightElement(driver, mobNo);
		mobNo.sendKeys("6395124031");

		WebElement orgImageUpload = driver.findElement(By.id("file"));
		highlightElement(driver, orgImageUpload);
		orgImageUpload.sendKeys("C:\\Users\\Dell\\Downloads\\images.png");

		WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"orgSaveBtn\"]"));
		highlightElement(driver, saveBtn);
		saveBtn.click();

		WebElement btnSucess = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/button[1]"));
		highlightElement(driver, btnSucess);
		btnSucess.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// * Branches List *//

		WebElement branchesList = driver.findElement(By.xpath("//*[@id=\"style-15\"]/li[2]"));
		highlightElement(driver, branchesList);
		branchesList.click();

		WebElement orgNameDropdown = driver.findElement(By.xpath("//*[@id=\"select2-organizationList-container\"]"));
		highlightElement(driver, orgNameDropdown);
		orgNameDropdown.click();

		WebElement orgNameSelectDropdown = driver
				.findElement(By.xpath("//li[@role='treeitem' and text()='Name_ORG256261']"));
		highlightElement(driver, orgNameSelectDropdown);
		orgNameSelectDropdown.click();

		WebElement statusBtn = driver.findElement(By.xpath("//label[@class='switch']"));
		highlightElement(driver, statusBtn);
		statusBtn.click();

		WebElement saveChangesBtn = driver
				.findElement(By.xpath("//div[@id='topDis']//a[contains(@class,'AddModlBtn') and text()='Change']"));
		highlightElement(driver, saveChangesBtn);
		saveChangesBtn.click();

		WebElement saveBranchesBtn = driver.findElement(By.xpath("//*[@id=\"orgSaveBtn\"]"));
		highlightElement(driver, saveBranchesBtn);
		saveBranchesBtn.click();

		WebElement btnSucessBranchesList = driver.findElement(By.xpath("//button[text()='OK']"));
		highlightElement(driver, btnSucessBranchesList);
		btnSucessBranchesList.click();

	}

	public static void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='Yellow'; arguments[0].style.border='2px solid Red';", element);
	}
}