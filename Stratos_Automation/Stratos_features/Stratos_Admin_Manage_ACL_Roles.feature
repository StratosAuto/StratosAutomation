Feature: Manage ACL Roles

  Background: 
     Given User Enter the Stratos application URL
    Then User enter the valid username
    Then User enter the valid password
    Then user click on login button

  Scenario: Verify the Add Role functionality
    Given User clicks on Manage ACL Roles in the menu
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
    Then User clicks on Users button and navigates to Manage ACL Users page
    
    Scenario: Verify the Filter functionality
    Given User clicks on Manage ACL Roles in the menu
    And User enters valid Role Name as "roleName"
    Then User validates the filtered data of valid Role Name
    And User enters invalid Role Name as "roleName"
    Then User validates the error message as "errorMessage" of invalid Role Name
    And User clicks on Items per page dropdown to display items
    And Users selects the desired number from items per page dropdown