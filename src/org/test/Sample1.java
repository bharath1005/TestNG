package org.test;

import static org.testng.Assert.assertEquals;

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

public class Sample1 {
	WebDriver driver;
	
	@BeforeClass
	public void launch() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\eclipse-selenium\\TestNG\\driver\\chromedriver.exe");
    
    driver=new ChromeDriver();
    driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&switch_account=");
	}
   
	@BeforeMethod
	public void beforeMethod() {
    Date d=new Date();
    System.out.println(d);
	}
	
	@AfterMethod
	public void afterMethod() {
    Date d=new Date();
    System.out.println(d);
	}
	
	@Test
	public void test() {
    Assert.assertEquals("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&switch_account=",driver.getCurrentUrl());
    Assert.assertTrue(driver.getTitle().contains("Amazon"));

	WebElement usertxt = driver.findElement(By.id("ap_email"));
	usertxt.sendKeys("bharatharuncse");
	
	WebElement passtxt = driver.findElement(By.id("ap_password"));
	passtxt.sendKeys("100593");
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
    
	}
	
}
