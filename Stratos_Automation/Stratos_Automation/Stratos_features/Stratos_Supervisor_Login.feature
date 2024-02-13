Feature: Supervisor Login functionality

  Scenario: Verify the login functionality with valid pin
    Given User Enter the Stratos application URL
    Then User click on log in as employee
    Then User enter the valid pin as " valid pin " in employee login page
    And User click on login button
    Then User verifies the success message as "Login Successfull"
  
  
   Scenario: Verify the login functionality with invalid pin
    Given User Enter the Stratos application URL
    Then User click on log in as employee
    Then User click on login button
    Then User verifies the error message as "Please fill in all required fields"
    #----------------
    Then User enter the invalid pin as " invalid pin " in employee login page
    Then User click on login button
    Then User verifies the invalid data error message as "4 attempts remaining."
  
  
    Scenario: Verify the forgot pin functionality
		Given User Enter the Stratos application URL
		Then User click on log in as employee
		Then User click on forgot pin button
		Then User enter the invalid employee id as "employee id" in request new pin page
		Then User click on request new pin button
		Then User verifies the error message
		#----------------
		Then User enter the valid employee id
		Then User click on request new pin button
		Then User verifies the success message and navigates to request new pin page
		Then User enter the 5 didgit pin as "5 digit pin" in request new pin page
		Then User click on login button
		Then User verifies the success message as "Login Successfull"
		
		