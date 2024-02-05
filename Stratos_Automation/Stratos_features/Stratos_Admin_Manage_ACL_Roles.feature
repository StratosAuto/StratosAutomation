Feature: Manage ACL Roles

  Background: 
    Given Enter the Url
    And Enter Email Address
    And Enter Password
    When Click on Log In button
    Then Verify Success message

  Scenario: Verify the Add New User functionality
    Given user clicks on Manage ACL Roles in the menu
    And User clicks on Add Role button
    And User clicks on Add button to validate mandatory fields
    And User clicks on close button
    And User clicks on Add Role button
    And User enters Name as "name" in Add Roles page
    And User selects the checkboxes to assign permissions
    Then User clicks on Add button
    And User validates the created Role
    And User clicks on Manage Role button
    And User unselects Client Bulk Upload checkbox
    And User cliks on Update button
    And User clicks on Items per page dropdown
    And Users selects the desired number from items per page dropdown

  Scenario: Verify the Users functionality
    Given user clicks on Manage ACL Roles in the menu
    And User clicks on Users button
    And User clicks on Add New User button
    And User enters all the necessary details and selects role as previously created role
    And User clicks on Add button
    And User clicks on settings symbol
    And User selects Logout option
    And User Logs in with previously created user
    And User clicks on Clients in the menu
    And User validates the assign permissions are enabled
