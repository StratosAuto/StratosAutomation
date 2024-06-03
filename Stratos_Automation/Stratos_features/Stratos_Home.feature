Feature: Home functionality

  Background: 
   Given User Enter the Stratos application URL
    Then User enter the valid username
    Then User enter the valid passsword
    Then user click on login button

  Scenario: Verify the Home module Theme functionality
    And Admin User  click on Themes
    Then Admin User Select a theme
    Then Admin User verifies the theme
    
  Scenario: Verify the Home module logout functionality
    Then Admin User  verify user navigates to homepage
    And Admin User click on settings
    Then Admin User click on logout
    Then Admin User navigates to Login Page

  Scenario: Verify the Home module Settings change password functionality
    And Admin User click on settings
    Then Admin User click on change password Button
    Then Admin User enter the current password as "current password" in change password 
    And Admin User enter new password as "new password" in change password 
    And Admin User enter confirm password as "confirm password" in change password
    Then Admin User click update button
    Then Admin User verifies the success message
   