Feature: Manage ACL Users

  Background: 
    Given Admin User Enter the Stratos application URL
    Then Admin User enter the valid username
    Then Admin User enter the valid password
    Then Admin User click on Submit button
    Then Admin User navigates to home page

  Scenario: Verify the Add New User functionality
    Given User clicks on Manage ACL Users in the menu
    And User clicks on Add New User button
    And Verify that user able to enter invalid data in Create user page
    Then User Validates the error messages of Invalid data of all the feilds in Create User page
    And User clicks on Cancel button on Create User page
    And User clicks on Add New User button
    And Verify that user able to enter invalid field length data in Create User page
    Then User Validates the error messages of Invalid field length data of all the feilds in Create User page
    Then User clicks on Cancel button on Create User page
    And User clicks on Add New User button
    Then User clicks on Add button to validate mandatory fields
    Then User clicks on Cancel button on Create User page
    And User clicks on Add New User button
    And User enters First Name as "firstName" in Create User page
    And User enters Email Address as "emailAddress" in Create User page
    And User enters password as "password" in Create User page
    And User selects Role as "role" from Role dropdown in Create User page
    And User enters Last Name as "lastName" in Create User page
    And User enters Mobile Number as "mobileNumber" in Create User page
    And User enters Confirm Password as "confirmPassword" in Create User page
    And User selects Gender as "gender" from Gender dropdown in Create User page
    Then User clicks on Add button
    And User verifies the created user to validate user is created
    And User clicks on Add New User button
    And Verify that user able to create duplicate user
    Then User clicks on Add button
    And User validates the error message duplicate user

Scenario: Verify the Filter functionality
    Given User clicks on Manage ACL Users in the menu
    And User enters valid ACL User Name as "userName"
    Then User validates the filtered data of valid ACL User Name
    And User enters invalid ACL User Name as "userName"
    Then User validates the error message as "errorMessage" of invalid ACL User Name
    And User clicks on Items per page dropdown to display items
    And Users selects the desired number from items per page dropdown
    
  Scenario: Verify the Manage ACL User functionality
    Given User clicks on Manage ACL Users in the menu
    And User clicks on Manage ACL User button
    And User enters Mobile Number as "mobileNumber" in Edit User page
    And User clicks on Update button on Edit User page
    And User validates the updates