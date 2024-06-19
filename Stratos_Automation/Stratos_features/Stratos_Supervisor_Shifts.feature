Feature: Supervisor Shifts functionality

  Background: 
    Given Admin User Enter the Stratos application URL
    Then User click on log in as employee
    Then User enter the valid pin as " valid pin " in employee login page
    And User click on login button
    Then User verifies the success message as "Login Successfull"

  Scenario: Verify the assign functionality
    Given User click on shifts
    And User click on assign
    Then User clic on employee name
    Then User select the employee name
    Then User click on job card name
    Then User select the job card
    Then User click on assign button
    Then User vaidates the invalid employee
    Then User click on cancel button
    Then User click on unassigned employee button
    Then User select the valid employee name
    Then User select the valid job card
    Then User click on assign button
    Then User validates the success message.
    
    Scenario: Verify the filter functionality
    Given User click on shifts
    And User enters valid employee name in filter and validate
    Given User click on shifts
    Then User enters the invalid employee name
    Then User validates the error message
    And User clicks on Items per page drop down in supervisor login
    Then User selects the desired number from items per page dropdown