package com.automation.testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/com/automation/features"},
		glue = {"com.automation.steps"},
		monochrome = true,
//		tags = {"@login, @flight, @airasia, @travel, @automationpractice"},
		tags = {"@flight"},
		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
		)
public class RunnerClass {

}
