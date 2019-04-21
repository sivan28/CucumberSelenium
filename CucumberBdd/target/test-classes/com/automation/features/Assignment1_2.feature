Feature: User navigated to search flight page. Login to website

@flight @airasia
Scenario: Verify that you are navigated successfully to search flight page 

Given User is navigated successfully to the website 

And Verify its Title 
When Click on Flights Icon
And Enter Origin as "Bengaluru" 
And Enter Destination as "Pune" 
And Select depart date as "15/12/2018" 
And Select Return date as "One Way"
And Click on Search Button 
Then Verify that you are navigated successfully to search flight page 

@login @airasia
Scenario: Verify that error message is displayed on screen in red and contains the text "Your
log in attempt has been unsuccessful." 

Given Navigate to the site url 

And Verify the title 
When Click on login button
And Enter username as a@gmail.com 
And Enter password as "India1234" 
And Click on Sign In Button
Then Verify that error message is displayed on screen in red and contains the text "Your login attempt has been unsuccessful." 
	
	