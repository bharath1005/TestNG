package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@BeforeClass
	public void beforeclass() {
    System.out.println("launch Browser");
	}
	
	@AfterClass
	public void afterClass() {
     System.out.println("Close The Browser ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
    System.out.println("Start time");
	}

	@AfterMethod
	public void afterMethod() {
    System.out.println("End Time");
	}
	
	@Test
	public void test1() {
    System.out.println("Login Test Case");
	}
	
	@Test
	public void test2() {
    System.out.println("Register the Test case");
	}
	
}
