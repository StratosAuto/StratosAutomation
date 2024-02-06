Feature: Supervisor Shifts functionality

  Scenario: Verify the assign functionality
    Given User click on shifts
    Then User click on filter
    And User enter the valid shift ref number
    Then User navigates to ref number details
    And User click on assign
    Given User select the invalid employee details in assign job card page
    Then User click on assign button
    Then User select the valid employee name
    Then User select the valid job card name
    Then User click on assign button
    And Verify the success message "assigened successfuly"
