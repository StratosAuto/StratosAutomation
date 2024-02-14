Feature: Supervisor Home Functionality

  Background: 
    Given Admin User Enter the Stratos application URL
    Then Admin User enter the valid username
    Then Admin User enter the valid passsword
    Then Admin user click on login button
    Then Admin User verifies the success message "Login Successfull"
    Then Admin User navigates to home page

  Scenario: Verify the themes and Logout functionality
    Given User clicks on Themes Button
    Then User selects the theme from options
    And User can verify the theme should update

  Scenario: Verify the logout functionality in supervisor
    Given User click on settings button
    Then User select the logout button
    Then User can navigates to login page
