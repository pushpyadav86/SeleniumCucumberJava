Feature: Login
Background:
Given User launch Chrome browser
When User opens url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
#And User clicks on the login option
Then Page title contains "OrangeHRM"
And  User enters username as "Admin" and password as "admin123"
And User clicks on the login button
Then the url contains "dashboard"

 @regression
Scenario: User login with valid credentials.
And User clicks on the user account tab
When User clicks on the Log out button
Then the url contains "login"
And User close the browser

@regression @smoke
Scenario: Search customer by Nmae from Admin page
When User clicks on the Admin
Then the url contains "admin"
And user enters "Prueba1" in username box
When user clicks on the search button 
Then user should found "Prueba1" in the admin table 
And User close the browser

 @test @regression
Scenario: Add Employee and Search from PIM page
When User clicks on the PIM
Then the url contains "pim"
And user clicks on the Add button 
And user enters "Pushp" in first name box
And user enters "Yadav" in last name box
And user enters id in employee ID box
When user clicks on the save button 
Then user should see the profile name as "Pushp Yadav"
And  User clicks on the PIM
And user search with employee name "Pushp Yadav"
When user clicks on the search button 
Then user should found "Pushp" in the PIM table  
And User close the browser