package com.automation.steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.automation.testbase.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Assignment3Steps extends DriverFactory {
	
	public WebDriver driver = getDriver();
	
	@Given("^Navigate to homepage of http://newtours\\.demoaut\\.com/mercurywelcome\\.php$")
	public void navigate_to_homepage_of_http_newtours_demoaut_com_mercurywelcome_php() throws Throwable {
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^Click on the register link$")
	public void click_on_the_register_link() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	}
	
	@When("^Enter First name \"([^\"]*)\"$")
	public void enter_First_name(String firstname) throws Throwable {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
	}

	@When("^Enter Last Name \"([^\"]*)\"$")
	public void enter_Last_Name(String lastname) throws Throwable {
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
	}

	@When("^Enter Phone \"([^\"]*)\"$")
	public void enter_Phone(String phone) throws Throwable {
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
	}

	@When("^Enter Email \"([^\"]*)\"$")
	public void enter_Email(String email) throws Throwable {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(email);
		Thread.sleep(1000);
	}

	@When("^Enter Address \"([^\"]*)\"$")
	public void enter_Address(String adrress) throws Throwable {
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(adrress);
		Thread.sleep(1000);
	}

	@When("^Enter City \"([^\"]*)\"$")
	public void enter_City(String city) throws Throwable {
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		Thread.sleep(1000);
	}

	@When("^Enter State \"([^\"]*)\"$")
	public void enter_State(String state) throws Throwable {
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
	}

	@When("^Enter Postal Code \"([^\"]*)\"$")
	public void enter_Postal_Code(String postalcode) throws Throwable {
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postalcode);
	}

	@When("^Select Country india \"([^\"]*)\"$")
	public void select_Country_india(String country) throws Throwable {
		Select option = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		option.selectByValue("92");
		Thread.sleep(1000);
	}

	@When("^Enter Username \"([^\"]*)\" of your choice$")
	public void enter_Username_of_your_choice(String username) throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	}

	@When("^Enter password \"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@When("^Enter same password in confirm password \"([^\"]*)\" field$")
	public void enter_same_password_in_confirm_password_field(String confirmpassword) throws Throwable {
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmpassword);
	}

	@When("^Click on submit$")
	public void click_on_submit() throws Throwable {
		driver.findElement(By.xpath("//input[@name='register']")).click();
	}
}
