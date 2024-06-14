Feature: Home functionality

  Background: 
  Given Admin User Enter the Stratos application URL
    Then Admin User enter the valid username
    Then Admin User enter the valid password
    Then Admin User click on Submit button
    Then Admin User navigates to home page

  Scenario: Verify the Home module Theme functionality
    And Admin User click on themes
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
    #Then Admin User verifies the success message
   