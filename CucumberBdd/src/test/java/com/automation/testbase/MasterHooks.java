package com.automation.testbase;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MasterHooks extends DriverFactory {
	
	@Before
	public static WebDriver setUp() {
		return getDriver();
	}
	
	@After
	public static void tearDown() {
		if(getDriver()!= null) {
			getDriver().quit();
		}
	}
}
