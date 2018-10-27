package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test2 {
	@Test
	public void test1() {
	SoftAssert s = new SoftAssert();
	System.out.println("Start test1");
	s.assertTrue(false);
	s.assertTrue(false);
	s.assertTrue(true);
	System.out.println("End Test1");
	s.assertAll();
    
	}
	@Test
	public void test2() {
	SoftAssert s = new SoftAssert();
    System.out.println("Start Test2");
    s.assertTrue(false);
    s.assertTrue(false);
    s.assertTrue(false);
    s.assertTrue(true);
    System.out.println("End Test2");
    
	}

}
