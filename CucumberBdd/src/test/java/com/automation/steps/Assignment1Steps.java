package com.automation.steps;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.testbase.DriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Assignment1Steps extends DriverFactory {
	
	public WebDriver driver = getDriver();
	
	@Given("^User is navigated successfully to the website$")
	public void user_is_navigated_successfully_to_the_website() throws Throwable {
		driver.get("https://www.airasia.com/booking/home/en/gb");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		System.out.println("User successfully navigated to website");
	}
	
	@Given("^Verify its Title$")
	public void verify_its_Title() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals(title, "AirAsia | Booking | Book low fare online");
//		System.out.println("Title is successfully verified");
		Thread.sleep(2000);
	}

	@When("^Click on Flights Icon$")
	public void click_on_Flights_Icon() throws Throwable {
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Find flights')]"));
		if (element.isDisplayed()) {
			element.click();
		}
		else {
			driver.findElement(By.xpath("//img[@class='aa-logo-image']")).click();	
		}
		System.out.println("Clicked on flights icon");
		Thread.sleep(2000);
//		System.out.println("User clicked on flights icon");
	}

	@When("^Enter Origin as \"([^\"]*)\"$")
	public void enter_Origin_as(String origin) throws Throwable {
		driver.findElement(By.xpath("//input[@id='home-origin-autocomplete-heatmap']")).sendKeys(origin);
		driver.findElement(By.xpath("//input[@id='home-origin-autocomplete-heatmap']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
//		System.out.println("User entered orgin details");
	}

	@When("^Enter Destination as \"([^\"]*)\"$")
	public void enter_Destination_as(String destination) throws Throwable {
		driver.findElement(By.xpath("//input[@id='home-destination-autocomplete-heatmap']")).sendKeys(destination);
		driver.findElement(By.xpath("//input[@id='home-destination-autocomplete-heatmap']")).sendKeys(Keys.ENTER);
//		System.out.println("User entered destination details");
	}

	@When("^Select depart date as \"([^\"]*)\"$")
	public void select_depart_date_as(String departDate) throws Throwable {
		driver.findElement(By.xpath("//input[@id='home-depart-date-heatmap']")).click();
		for (int i =0; i < 7; i++) {
			driver.findElement(By.xpath("//div[3]//table[1]//thead[1]//tr[2]//td[3]//em[1]")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"wcaMainContent\"]/div[2]/form/div[1]/div[2]/airasia-airasia-calendar/div[1]/div[2]/div[2]/div/div[3]/table/tbody/tr[3]/td[7]/div[1]")).click();
//		System.out.println("User selected departure date");
	}

	@When("^Select Return date as \"([^\"]*)\"$")
	public void select_Return_date_as(String returnDate) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"wcaMainContent\"]/div[2]/form/div[1]/div[2]/airasia-airasia-calendar/div[1]/div[2]/div[1]/div/div[1]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"wcaMainContent\"]/div[2]/form/div[1]/div[2]/airasia-airasia-calendar/div[1]/div[2]/div[3]/div/button")).click();
//		System.out.println("User selected one way trip");
	}

	@When("^Click on Search Button$")
	public void click_on_Search_Button() throws Throwable {
		driver.findElement(By.xpath("//button[@id='home-flight-search-airasia-button-inner-button-select-flight-heatmap']")).click();
		Thread.sleep(2000);
//		System.out.println("User clicked on search button");
	}

	@Then("^Verify that you are navigated successfully to search flight page$")
	public void verify_that_you_are_navigated_successfully_to_search_flight_page() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Bengaluru to Pune Flights | 1 Guest | One Way | NaN {6} | AirAsia");
//		System.out.println("User successfully navigated to search flight page");
		driver.close();
	}
}
