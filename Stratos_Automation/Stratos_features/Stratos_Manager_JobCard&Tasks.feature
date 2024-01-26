Feature: Manager Job Card & Tasks
  
  Given User enters the URL
    And User clicks on Login as Employee button
    And User enters Pin as "pin"
    And User clicks on Login button
    And Verify the success message as "successMessage"

  Scenario: Verify Add New Job Card functionality
    Given User clicks on Job Card & Tasks in the menu
    And User clicks on Add New Job Card button
    And Verify that user able to enter invalid data in Add Job Card page
    Then User Validates the error messages of Invalid data of all the feilds
    And User clicks on Cancel button
    And User clicks on Add New Job Card button
    And Verify that user able to enter invalid field length data in Add Job Card page
    Then User Validates the error messages of Invalid field length data of all the feilds
    Then User clicks on Cancel button
    And User clicks on Add New Provider button
    Then User clicks on Save and Continue button
    And User validates the error message as "errorMessage"
    Then User clicks on Cancel button
    And User enters Job Card Name as "jobCardName"
    And User enters Job Card Description as "jobCardDescription"
    And User enters Client Name as "clientName"
    And User enters Site Name as "Site Name"
    Then User clicks on Save and Continue button
    And User validates the success message as "successMessage"

  Scenario: Verify the Active Job Cards and Inactive Job Cards filter functionality
    Given User clicks on Job Card & Tasks in the menu
    And User enters valid Job Card Name as "jobCardName" on Active Job Cards
    Then User validates the filtered data
    And User enters invalid Job Card Name as "jobCardName" on Active Job Cards
    Then User validates the error message as "errorMessage"
    And User clicks on Inactive Job Cards
    And User enters valid Job Card Name as "jobCardName" on Inactive Job Cards
    Then User validates the filtered data
    And User enters invalid Job Card Name  as "jobCardName" on Inactive Job Cards
    Then User validates the error message as "errorMessage"
    And User clicks on Items per page dropdown
    And Users selects the desired number from items per page dropdown
    Then User validates the displayed Job Cards

  Scenario: Verify the Manage Job Card and Manage Tasks functionality
    Given User clicks on Job Card & Tasks in the menu
    And User clicks on Manage Job Card button
    And User enters Job Card Name as "jobCardName"
    And User clicks on Update button
    Then User validates the success message as "successMessage"
    And User clicks on Manage Job Card button
    Then User clicks on Deactivate button
    And User validates the success message as "successMessage"
    And User clicks on Manage Tasks button
    And Verify that user able to enter invalid field length data in Tasks page
    Then User Validates the error messages of Invalid field length data of all the feilds
    Then User clicks on Clear button
    And User enters Task Name as "taskName"
    And User entesr Task Description as "taskDescription"
    And User selects Checkpoint as "checkpoint" from Checkpoint dropdown
    And User selects Required as "required" from Required dropdown
    Then User clicks on Add button
    And User clicks on Edit symbol
    And User enters Task Name as "taskName"
    And User clicks on Update button

  Scenario: Verify the Bulk Upload functionality
    Given User clicks on Job Card and Tasks in the menu
    And User clicks on Bulk Upload button
    And User clicks on Select File button
    And User double clicks on valid data excel file
    And User clicks on Submit button
    Then User validates the success message as"successMessage"
    And User clicks on Bulk Upload button
    And User clicks on Submit button
    And User validates the error message as "errorMessage"
    And User clicks on Bulk Upload button
    And User clicks on selects File button
    And User double clicks on invalid data excel file
    And User clicks on Submit button
    And User validates the error message as "errorMessage"
