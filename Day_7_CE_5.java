package com.selenium.test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_7_CE_5 {
	@Test(groups= {"SmokeTest"})
	  public void f() {
		 WebDriverManager.edgedriver().setup();
		 WebDriver driver;
		 driver=new EdgeDriver();
		 driver.get("https://www.godaddy.com/en-in");
		 driver.manage().window().maximize();
		 String actualTitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		 String extractedTitle=driver.getTitle();
		 AssertJUnit.assertEquals(actualTitle, extractedTitle);
		 String actualURL="https://www.godaddy.com/en-in";
		 String extractedURL=driver.getCurrentUrl();
		 AssertJUnit.assertEquals(actualURL, extractedURL);
		 System.out.println("Smoke test");
		 driver.quit();	
	  }
	  @SuppressWarnings("deprecation")
	@Test(groups= {"RegressionTest"})
	  public void f1() {
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver;
		  driver=new EdgeDriver();
		  driver.get("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		  driver.findElement(By.linkText("Domain Name Search")).click();
		  System.out.println("Regressiontest");
	  }
}
