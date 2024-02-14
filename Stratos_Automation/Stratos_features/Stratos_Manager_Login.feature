Feature: Manager Login

  Scenario: Login with valid pin
    Given User enters the URL
    And User clicks on Login as Employee button
    And User enters invalid pin as "pin"
    And User clicks on Login button
    And User validates login is unsuccessfull
    And User clicks on Login button to validate null pin
    And User enters Pin as "pin"
    And User clicks on Login button
    And User validates logged in successfull and navigated to Homepage
    And User clicks on Logout button
    Then User validates navigated to login page