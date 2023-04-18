package com.selenium.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_7_CE_3 {
	WebDriver driver;
	@Test
	public void OpenURL() throws InterruptedException{
		Thread.sleep(3000);
		WebElement uname=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		uname.sendKeys("Admin");
		pwd.sendKeys("admin123");
		submit.click();
		String url1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String ActualUrl=driver.getCurrentUrl();
		AssertJUnit.assertEquals(url1,ActualUrl);
	}
	@BeforeMethod
	public void beforemethod() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
	}
	@AfterMethod
	public void aftermethod() {
		driver.close();
	}

}
