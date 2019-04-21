package com.automation.steps;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.testbase.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Assignment2Steps extends DriverFactory  {
	
	public WebDriver driver = getDriver();
	
	@Given("^Navigate to the site url$")
	public void navigate_to_the_site_url() throws Throwable {
		driver.get("https://www.airasia.com/booking/home/en/gb");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("^Verify the title$")
	public void verify_the_title() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals(title, "AirAsia | Booking | Book low fare online");
		Thread.sleep(2000);
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Log in/Sign up')]")).click();
		Thread.sleep(2000);
	}

	@When("^Enter username as a@gmail\\.com$")
	public void enter_username_as_a_gmail_com() throws Throwable {
		driver.findElement(By.cssSelector("#username-input--login")).sendKeys("ab@gmail.com");
	}

	@When("^Enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
		driver.findElement(By.cssSelector("#password-input--login")).sendKeys("India1234");
	}

	@When("^Click on Sign In Button$")
	public void click_on_Sign_In_Button() throws Throwable {
		driver.findElement(By.cssSelector("#loginbutton")).click();
		Thread.sleep(1000);
	}

	@Then("^Verify that error message is displayed on screen in red and contains the text \"([^\"]*)\"$")
	public void verify_that_error_message_is_displayed_on_screen_in_red_and_contains_the_text(String arg1) throws Throwable {
		String actual = driver.findElement(By.xpath("//div[contains(text(),'Your log in attempts has been unsuccessful. As a s')]")).getText();
		Assert.assertEquals("Your log in attempts has been unsuccessful. As a security measure, we’ve locked your account and you’re required to reset your password.", actual);
	}
}
