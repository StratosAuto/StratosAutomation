Feature: Login functionality

  Scenario: Verify the login functionality with valid credentials
    Given Admin User Enter the Stratos application URL
    Then Admin User enter the valid username
    Then Admin User enter the valid passsword
    Then Admin user click on login button
    Then Admin User verifies the success message "Login Successfull"
    Then Admin User navigates to home page

   Scenario: Verify the login functionality with invalid credentials
    Given Admin User Enter the Stratos application URL
    Then Admin User enter the invalid username
    Then Admin User enter the invalid passsword
    Then Admin user click on login button
    Then Admin User verifies the error message "Please fill in all required fields."
    
   Scenario: Verify the login functionality with empty fields
     Given Admin User Enter the Stratos application URL
    Then Admin User give the empty username
    Then Admin User give the empty passsword
    Then Admin User click on login button
    Then Admin User verifies the error message "Please fill in all required fields"