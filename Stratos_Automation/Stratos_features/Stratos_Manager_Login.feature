Feature: Manager Login

  Scenario: Verify the Manager Login functionality
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
    
Scenario: Verify the Forgot PIN functionality
		Given User enters the URL
    And User clicks on Login as Employee button
		And User clicks on Forgin PIN link and navigate to Forgot Your Pin page
		And User enter invalid Employee ID as "employeeID"
		Then User clicks on Request New PIN button on Forgot Your Pin page
		And User validates the error message as "errorMessage" of invalid Employee ID
		And User clicks on Go To Login link and navigate to Manager Login page
		And User clicks on Forgin PIN link and navigate to Forgot Your Pin page
		Then User clicks on Request New PIN button on Forgot Your Pin page to validate null Employee ID
		And User validates the error message as "errorMessage" of null Employee ID
		And User clicks on Go To Login link and navigate to Manager Login page
		And User clicks on Forgin PIN link and navigate to Forgot Your Pin page
		Then User clicks on Request New PIN button on Forgot Your Pin page
#		And User enters valid Employee ID as "employeeID"
#		And User validates the success message as "successMessage" of valid Employee ID