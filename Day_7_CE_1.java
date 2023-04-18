package com.selenium.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_7_CE_1 {
  @Test
  public void f() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String t="Guest Registration Form – User Registration";
	  String t1=driver.getTitle();
	  AssertJUnit.assertEquals(t, t1);
  }
}
