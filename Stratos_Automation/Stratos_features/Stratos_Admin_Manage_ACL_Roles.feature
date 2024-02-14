Feature: Manage ACL Roles

  Background: 
    Given Enter the Url
    And Enter Email Address
    And Enter Password
    When Click on Log In button
    Then Verify Success message

  Scenario: Verify the Add Role functionality
    Given user clicks on Manage ACL Roles in the menu
    And User clicks on Add Role button
    And User clicks on Add button to validate mandatory fields of Roles
    And User clicks on close button
    And User clicks on Add Role button
    And User enters Name as "name" in Add Roles page
    And User selects the checkboxes to assign permissions
    Then User clicks on Add button on Add Role page
    And User validates the created Role
    And User clicks on Manage Role button
    And User enters Name as "name" in Add Roles page to update name
    And User cliks on Update button
    And User validates changes made
    And User clicks on Items per page dropdown
    And Users selects the desired number from items per page dropdown