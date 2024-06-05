Feature: Supervisor Shifts functionality

  Background: 
    Given User Enter the Stratos application URL
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
   