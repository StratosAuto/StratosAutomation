Feature: Admin Login functionality

  Scenario: Verify the login functionality with valid credentials
    Given Admin User Enter the Stratos application URL
    Then Admin User enter the valid username
    Then Admin User enter the valid password
    Then Admin User click on Login button
    Then Admin User navigates to home page

  Scenario: Verify the login functionality with invalid credentials
    Given Admin User Enter the Stratos application URL
    Then Admin User enter the invalid username
    Then Admin User enter the invalid passsword
    Then Admin User click on Login button
    Then Admin User verifies the error message "Please fill in all required fields."
<<<<<<< HEAD:Stratos_Automation/Stratos_features/Stratos_Admin_Login.feature
  
=======
    Then User click on login button
    Then Admin User verifies the error message "Please fill in all required fields"

    
>>>>>>> df135186f38d20776151afab36aa4e77dad9352d:Stratos_Automation/Stratos_features/Stratos_Login.feature
    Scenario: Verify the forgot pin functionality
    Given Admin User Enter the Stratos application URL
    Then Admin User click on the forgot pin link
    Then Admin User enter the valid email address as "email address" in forgot password page
    Then Admin User click on the submit button 