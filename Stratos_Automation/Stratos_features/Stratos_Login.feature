Feature: Admin Login functionality

  Scenario: Verify the login functionality with valid credentials
    Given User Enter the Stratos application URL
    Then User enter the valid username
    Then User enter the valid passsword
    Then user click on login button
    Then User navigates to home page

  Scenario: Verify the login functionality with invalid credentials
    Given User Enter the Stratos application URL
    Then User enter the invalid username
    Then User enter the invalid passsword
    Then user click on login button
    Then User verifies the error message "Please fill in all required fields."
    #Then User click on login button
    #Then User verifies the error message "Please fill in all required fields"
    
    