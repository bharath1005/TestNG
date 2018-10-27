package org.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\TestNG\\driver\\chromedriver.exe");
    
    driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    Thread.sleep(1000);
    
	}
	
	@BeforeMethod
	public void beforeMethod() {
    Date d=new Date();
    System.out.println(d);
	}
	
    
   	@Test
   	public void test() throws InterruptedException {
   	Assert.assertEquals("https://www.flipkart.com/",driver.getCurrentUrl());
   	Assert.assertTrue(driver.getTitle().contains("Online"));
   	
   	WebElement usertxt = driver.findElement(By.xpath("//input[@class='_2zrpKA']"));
   	usertxt.sendKeys("bharatharuncse");
   	Thread.sleep(500);
    
   	WebElement passtxt = driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']"));
   	passtxt.sendKeys("100593181194");
	}

   	@AfterMethod
   	public void afterMethod() {
    Date d=new Date();
    System.out.println(d);
	}
   	
   	@AfterClass
   	public void afterClass() {
    driver.quit();
	}
   	
}
