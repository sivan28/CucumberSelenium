package com.automation.steps;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.automation.testbase.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Assignment4Steps extends DriverFactory {
	
	public WebDriver driver = getDriver();
	
	@Given("^Navigate to http://automationpractice\\.com/index\\.php$")
	public void navigate_to_http_automationpractice_com_index_php() throws Throwable {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@When("^Click on SignIn Button$")
	public void Click_on_Sign_In_Button() throws Throwable {
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
	}
	
	@When("^Create an account box -> In email adress - > pass a valid email id \"([^\"]*)\"$")
	public void create_an_account_box_In_email_adress_pass_a_valid_email_id(String email) throws Throwable {
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);
	}

	@When("^Click on Register$")
	public void click_on_Register() throws Throwable {
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
	}

	@When("^Validate you are on the registration page$")
	public void validate_you_are_on_the_registration_page() throws Throwable {
		String text = driver.findElement(By.xpath("//h3[contains(text(),'Your personal information')]")).getText();
		assertEquals(text, "YOUR PERSONAL INFORMATION");
	}

	@When("^Select the title radiobox \"([^\"]*)\"$")
	public void select_the_title_radiobox(String title) throws Throwable {
		if (title == "Mr") {
			driver.findElement(By.xpath("//input[@id='id_gender1']")).click();	
		}else {
			driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		}
	}

	@When("^Enter first name \"([^\"]*)\"$")
	public void enter_first_name(String firstname) throws Throwable {
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(firstname);
	}

	@When("^Enter last name \"([^\"]*)\"$")
	public void enter_last_name(String lastname) throws Throwable {
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys(lastname);
	}
	
	@When("^Enter passwd \"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(password);
	}

	@When("^Select date \"([^\"]*)\" ,month \"([^\"]*)\" and year \"([^\"]*)\" of birth$")
	public void select_date_month_and_year_of_birth(String day, String month, String year) throws Throwable {
		Select option1 = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		option1.selectByValue(day);
		
		Select option2 = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		option2.selectByValue(month);
		
		Select option3 = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		option3.selectByValue(year);
	}
	
	@When("^Enter Address1 \"([^\"]*)\"$")
	public void enter_Address(String address) throws Throwable {
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address);
	}

	@When("^Enter Cityy \"([^\"]*)\"$")
	public void enter_City(String city) throws Throwable {
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
	}
	
	@When("^Select country \"([^\"]*)\"$")
	public void select_country(String country) throws Throwable {
		Select option = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
		option.selectByVisibleText(country);
	}

	@When("^Select state \"([^\"]*)\"$")
	public void select_state(String state) throws Throwable {
		Select option = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		option.selectByVisibleText(state);
	}

	@When("^Enter postal code \"([^\"]*)\"$")
	public void enter_postal_code(String postalcode) throws Throwable {
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys(postalcode);
	}

	@When("^Enter Mobile Phone \"([^\"]*)\"$")
	public void enter_Mobile_Phone(String mobile) throws Throwable {
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(mobile);
	}

	@When("^Click on Register button$")
	public void click_on_Register_button() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	}

	@Then("^Validate that you are successfully registered$")
	public void validate_that_you_are_successfully_registered() throws Throwable {
		String text = driver.findElement(By.xpath("//p[@class='info-account']")).getText();
		assertEquals(text, "Welcome to your account. Here you can manage all of your personal information and orders.");
		driver.findElement(By.xpath("//a[@title='Log me out']")).click();
	}
}
