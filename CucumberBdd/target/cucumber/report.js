$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Assignment1_2.feature");
formatter.feature({
  "line": 1,
  "name": "User navigated to search flight page. Login to website",
  "description": "",
  "id": "user-navigated-to-search-flight-page.-login-to-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify that you are navigated successfully to search flight page",
  "description": "",
  "id": "user-navigated-to-search-flight-page.-login-to-website;verify-that-you-are-navigated-successfully-to-search-flight-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@flight"
    },
    {
      "line": 3,
      "name": "@airasia"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is navigated successfully to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Verify its Title",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Flights Icon",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Enter Origin as \"Bengaluru\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Enter Destination as \"Pune\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Select depart date as \"15/12/2018\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Select Return date as \"One Way\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click on Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Verify that you are navigated successfully to search flight page",
  "keyword": "Then "
});
formatter.match({
  "location": "Assignment1Steps.user_is_navigated_successfully_to_the_website()"
});
formatter.result({
  "duration": 4375807786,
  "status": "passed"
});
formatter.match({
  "location": "Assignment1Steps.verify_its_Title()"
});
formatter.result({
  "duration": 2359409858,
  "status": "passed"
});
formatter.match({
  "location": "Assignment1Steps.click_on_Flights_Icon()"
});
formatter.result({
  "duration": 7359502018,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//p[contains(text(),\u0027Find flights\u0027)]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-P5SR7E9\u0027, ip: \u0027192.168.8.189\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.automation.steps.Assignment1Steps.click_on_Flights_Icon(Assignment1Steps.java:41)\r\n\tat ✽.When Click on Flights Icon(Assignment1_2.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bengaluru",
      "offset": 17
    }
  ],
  "location": "Assignment1Steps.enter_Origin_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pune",
      "offset": 22
    }
  ],
  "location": "Assignment1Steps.enter_Destination_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "15/12/2018",
      "offset": 23
    }
  ],
  "location": "Assignment1Steps.select_depart_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "One Way",
      "offset": 23
    }
  ],
  "location": "Assignment1Steps.select_Return_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Assignment1Steps.click_on_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Assignment1Steps.verify_that_you_are_navigated_successfully_to_search_flight_page()"
});
formatter.result({
  "status": "skipped"
});
});