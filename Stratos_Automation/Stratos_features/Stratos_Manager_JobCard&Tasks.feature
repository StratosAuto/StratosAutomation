Feature: Manager Job Card & Tasks
  
  Background:
  	Given User enters the URL
    And User clicks on Login as Employee button
    And User enters Pin as "pin"
    And User clicks on Login button
    And User validates logged in successfull and navigated to Homepage

  Scenario: Verify Add New Job Card functionality
    Given User clicks on Job Card & Tasks in the menu
    And User clicks on Add New Job Card button
    And Verify that user able to enter invalid field length data in Add Job Card page
    Then User Validates the error messages of Invalid field length data of all the feilds of Job Cards
    Then User clicks on Cancel button on Job Cards
    And User clicks on Add New Job Card button
    Then User clicks on Save and Continue button and validates mandatory fileds
    Then User clicks on Cancel button on Job Cards
    And User clicks on Add New Job Card button
    And User enters Job Card Name as "jobCardName"
    And User enters Job Card Description as "jobCardDescription"
    And User enters Client Name as "clientName"
    And User enters Site Name as "Site Name"
    Then User clicks on Save and Continue button
    And User verifies the created Job Card to validate Job Card is created

  Scenario: Verify the Active Job Cards and Inactive Job Cards filter functionality
    Given User clicks on Job Card & Tasks in the menu
    And User enters valid Job Card Name as "jobCardName" on Active Job Cards
    Then User validates the filtered data of Active Job Cards
    And User enters invalid Job Card Name as "jobCardName" on Active Job Cards
    Then User validates the error message as "errorMessage" of Active Job Cards
    And User clicks on Inactive Job Cards
    And User enters valid Job Card Name as "jobCardName" on Inactive Job Cards
    Then User validates the filtered data of Inactive Job Cards
    And User enters invalid Job Card Name  as "jobCardName" on Inactive Job Cards
    Then User validates the error message as "errorMessage" of Inactive Job Cards
    And User clicks on Items per page dropdown to display items
    And Users selects the desired number from items per page dropdown
    
  #Scenario: Verify the Manage Job Card and Manage Tasks functionality
    #Given User clicks on Job Card & Tasks in the menu
    #And User clicks on Manage Job Card button
    #And User enters Job Card Description as "jobCardDescription" on Manage Job Card page
    #And User clicks on Update button on Manage Job Card page
    #Then User validates the updates of Job Cards
    #Then User clicks on Deactivate button on Manage Job Card page
    #And User validates the Deactivated Job Card
    #And User clicks on Inactive Job Cards
    #And User clicks on Manage Job Card button
    #Then User clicks on Activate button on Manage Job Card page
    #And User validates the Activated Job Card
    #And User clicks on Manage Tasks button
    #And Verify that user able to enter invalid field length data in Tasks page
    #Then User Validates the error messages of Invalid field length data of all the feilds of Tasks
    #Then User clicks on Clear button on Tasks page
    #And User enters Task Name as "taskName"
    #And User entesr Task Description as "taskDescription"
    #And User selects Checkpoint as "checkpoint" from Checkpoint dropdown
    #And User selects Required as "required" from Required dropdown
    #Then User clicks on Add button on tasks page
    #And User validates the created Task
    #And User clicks on Edit symbol
    #And User enters Task Description as "taskDescription" on tasks page
    #And User clicks on Update button on Tasks page
    #Then User validates the tasks updates
#
  #Scenario: Verify the Bulk Upload functionality
    #Given User clicks on Job Card & Tasks in the menu
    #And User clicks on Bulk Upload button
    #And User clicks on Select File button and upload valid Job Card & Tasks file
    #And User clicks on Submit button
    #Then User validates the success message as "successMessage" of valid Bulk Upload of Job Cards
    #And User clicks on Bulk Upload button
    #And User clicks on Select File button to upload invalid Job Cards bulk file
    #And User clicks on Submit button
    #And User validates the error message as "errorMessage" of invalid Bulk Upload of Job Cards
    #And User clicks on Cancel button bulk upload
    #And User clicks on Bulk Upload button
    #And User clicks on Select File button to upload empty Job Cards bulk file
    #And User clicks on Submit button
    #And User validates the error message as "errorMessage" of empty Bulk Upload file of Job Cards