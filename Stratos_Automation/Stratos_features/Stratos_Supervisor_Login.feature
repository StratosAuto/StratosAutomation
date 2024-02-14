Feature: Supervisor Login functionality

  Scenario: Verify the login functionality with valid pin
    Given User Enter the Stratos application URL
    Then User click on log in as employee
    Then User enter the valid pin
    And User click on login button
    Then User verifies the success message as "Login Successfull"
    Then User navigates to home page

  Scenario: Verify the login functionality with invalid pin
    Given Admin User Enter the Stratos app URL
    Then User click on log in as employee
    Then User enter the invalid pin
    Then Uer click on login button
    Then User verifies the error message as "4 attempts remaining."
    Then User click on log in as employee
    Then User click on login button
    Then User verifies the error message as "Please fill in all required fields"
