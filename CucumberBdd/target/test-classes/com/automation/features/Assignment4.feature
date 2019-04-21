Feature: User registration in  http://automationpractice.com/index.php

@automationpractice
Scenario Outline: Register atleast 3 users in a web application

Given Navigate to http://automationpractice.com/index.php
When Click on SignIn Button

And Create an account box -> In email adress - > pass a valid email id "<email>"
And Click on Register
And Validate you are on the registration page
And Select the title radiobox "<title>"
And Enter first name "<firstname>"
And Enter last name "<lastname>"
And Enter passwd "<password>"
And Select date "<day>" ,month "<month>" and year "<year>" of birth
And Enter Address1 "<address>"
And Enter Cityy "<city>"
And Select country "<country>"
And Select state "<state>"
And Enter postal code "<postalcode>"
And Enter Mobile Phone "<mobile>"
And Click on Register button 
Then Validate that you are successfully registered

Examples:
|email 				|title  |firstname 			|lastname 	|password	|day 	|month	 |year	 |address 		|city 			| country		|state 		|postalcode	|mobile 	|
|stest50@gmail.com	|Mr	 	|harikau			|sankar		|testing1	|26 	|8		 |1988   |222 address1	|san francisco  |United States	|California	|90000		|8189659030	|
|stest60@gmail.com	|Mrs 	|srinuv				|sankar		|testing2	|27 	|9		 |1989   |422 address1	|texas			|United States	|Texas		|60000		|8189659033	|
|stest70@gmail.com	|Mr	 	|shivanisk			|sankar		|testing3	|28 	|9		 |1989   |522 address1	|new york		|United States	|New York	|70000		|8189659032	|
