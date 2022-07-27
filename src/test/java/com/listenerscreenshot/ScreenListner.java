package com.listenerscreenshot;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baselistener.BaseClass;


@Listeners(com.utility.listener.Listenerclass.class)
public class ScreenListner extends BaseClass {
	
	@Test
	public void testcase1() {
		setup();
		driver.findElement(By.name("q")).sendKeys("nilesh");
		Assert.assertTrue(false);
		
	}@Test
	public void testcase2() {
		setup();
		Assert.assertTrue(false);
		
		
	}@AfterMethod
	public void teardown() {
		driver.close();
		Assert.assertTrue(false);
	}

}
