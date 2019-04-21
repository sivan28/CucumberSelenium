package com.automation.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory  {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva\\Downloads\\Compressed\\CucumberBdd\\src\\test\\resources\\executables\\chromedriver.exe");
		if(driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}
}
