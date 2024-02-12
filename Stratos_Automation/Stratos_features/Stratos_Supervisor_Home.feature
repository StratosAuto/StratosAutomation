Feature: Supervisor Home Functionality

  Background: 
   Given User Enter the Stratos application URL
    Then User click on log in as employee
    Then User enter the valid pin as " valid pin " in employee login page
    And User click on login button
    Then User verifies the success message as "Login Successfull"

  Scenario: Verify the themes and Logout functionality
    Given User clicks on Themes Button
    Then User selects the theme from options
    And User can verify the theme should update
 #-------Logout functionality
    Given User click on settings button
    Then User select the logout button
    Then User can navigates to login page 