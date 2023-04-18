package com.selenium.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_7_CE_4 {
	WebDriver driver;
	@BeforeSuite
	void init(){
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
	}
	@Test
	void Test1() throws InterruptedException{	
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement uname=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("password"));
		WebElement submit=driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		uname.sendKeys("Admin");
		pwd.sendKeys("admin123");
		submit.click();
	}
	@Test(dependsOnMethods = "Test1")
	void Test2() throws Exception{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		Thread.sleep(3000);
		String s1="OrangeHRM";
		String s2=driver.getTitle();
		AssertJUnit.assertEquals(s1, s2);
		driver.close();
	}
}
