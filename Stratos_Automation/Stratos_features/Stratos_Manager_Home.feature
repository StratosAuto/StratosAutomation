Feature: Manager Homepage

  Background: 
    Given User enters the URL
    And User clicks on Login as Employee button
    And User enters Pin as "pin"
    And User clicks on Login button
    And Verify the success message as "successMessage"

  Scenario: Verify Themes and Logout functionality
    Given User is on Homepage
    And User clicks on Themes button
    And User selects Theme as "theme"
    And User clicks on settings symbol
    Then User clicks on Logout
    And Verify user is on Login page
