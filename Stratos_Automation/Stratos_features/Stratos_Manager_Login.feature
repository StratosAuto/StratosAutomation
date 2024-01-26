Feature: Manager Login

  Scenario: Login with valid pin
    Given User enters the URL
    And User clicks on Login as Employee button
    And User enters Pin as "pin"
    And User clicks on Login button
    And Verify the success message as "successMessage"

  Scenario: Login with invalid pin
    Given User enters the URL
    And User clicks on Login as Employee button
    And User enters pin as "pin"
    And User clicks on Login button
    And Verify the error message as "errorMessage"
