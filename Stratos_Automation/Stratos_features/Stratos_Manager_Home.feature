Feature: Manager Homepage

  Background: 
    Given User enters the URL
    And User clicks on Login as Employee button
    And User enters Pin as "pin"
    And User clicks on Login button
    And User validates logged in successfull and navigated to Homepage

  Scenario: Verify Themes and Logout functionality
    Given User clicks on Themes button
    And User selects Theme as "theme"
    And User clicks on Logout button
    Then User validates navigated to login page