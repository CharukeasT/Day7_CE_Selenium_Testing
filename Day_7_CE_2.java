package com.selenium.test1;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Day_7_CE_2 {
	int a=10,b=2,c;
	  @Test
	  public void add() {
		  c=a+b;
		  AssertJUnit.assertEquals(12,c);
	  }
	  @Test
	  public void sub() {
		  c=a-b;
		  AssertJUnit.assertEquals(8,c);
	  }
	  @Test
	  public void mul() {
		  c=a*b;
		  AssertJUnit.assertEquals(20,c);
	  }
	  @Test
	  public void div() {
		  c=a/b;
		  AssertJUnit.assertEquals(5,c);
	  }
}
