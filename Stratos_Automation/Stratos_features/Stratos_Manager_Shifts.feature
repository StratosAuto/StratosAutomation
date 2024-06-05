Feature: Manager Shifts
  Background:
  	Given User enters the URL
    And User clicks on Login as Employee button
    And User enters Pin as "pin"
    And User clicks on Login button
    And User validates logged in successfull and navigated to Homepage

  Scenario: Verify the Add New Shifts functionality
    Given User clicks on Shifts in the menu
    And User clicks on Add New Shifts button
    And User selects Supervisor Name & Surname as "supervisorName" from Supervisor Name & Surname dropdown
    And User selects clients as "clients" from Clients dropdown
    And User selects Site Name & Address as "siteName" from Site Name & Address dropdown
    And User clicks on Check-in Date picker button and selects Check-in date as "checkInDate"
    And User enters check-in time as "checkInTime"
    And User clicks on Check-out Date picker button and selects Check-out date as "checkOutDate"
    And User enters check-out time as "checkOutTime"
    And User clicks on Add button on Add New Shift page
    Then User verifies the created Shift to validate Shift is created
    And User clicks on Add New Shifts button
    And User selects Supervisor Name & Surname as "supervisorName" from Supervisor Name & Surname dropdown
    And User selects clients as "clients" from Clients dropdown
    And User selects Site Name & Address as "siteName" from Site Name & Address dropdown
    And User clicks on Check-in Date picker button and selects Check-in date as "checkInDate"
    And User enters check-in time as "checkInTime"
    And User clicks on Check-out Date picker button and selects Check-out date as "checkOutDate"
    And User enters check-out time as "checkOutTime"
    And User clicks on Add button on Add New Shift page
    Then User verifies the created Shift to validate Shift is created
    And User clicks on Add New Shifts button
    And User selects Supervisor Name & Surname as "supervisorName" from Supervisor Name & Surname dropdown
    And User selects clients as "clients" from Clients dropdown
    And User selects Site Name & Address as "siteName" from Site Name & Address dropdown
    Then User clicks on Clear button on Add New Shift page
    And User clicks on Add button to validate mandatory fileds
    And User clicks on Cancel button on Add New Shift page

  Scenario: Verify the filter functionality
    Given User clicks on Shifts in the menu
    And User enters valid Supervisor Name as "ShiftsRef" on Future Schedules
    Then User validates the filtered data of Future Schedules
    And User enters invalid Supervisor Name as "ShiftsRef" on Future Schedules
    Then User validates the error message as "errorMessage" on Future Schedules 
    And User clicks on Items per page dropdown to display items
    And Users selects the desired number from items per page dropdown

  Scenario: Verify the Edit Shifts and Assign button functionality
    Given User clicks on Shifts in the menu
    And User clicks on Edit Shifts button
    And User enters check-in time as "checkInTime" on Edit Shifts page
    Then User clicks on Update button on Edit Shifts page
    And User clicks on Assign button on My Team Shifts page
    And User selects Employee Name & Surname as "employeeName" from Employee Name & Surname dropdown
    And User selects Job Card Name as "jobCardName" from Job Card Name dropdown
    Then User clicks on Assign button on My Teams Shift page
    And User validates the job card is assigned to Employee
    Then User clicks on Assign button on My Teams Shift page
    And User clicks on Assign button to validate mandatory fileds
    And User clicks on Cancel Button on Assign Job Card Page
	  And Verify user able to assign multiple shifts to the same Employee with same shift timings  
	  
  #Scenario: Verify the Bulk Upload functionality
    #Given User clicks on Shifts in the menu
    #And User clicks on Bulk Upload button
    #And User clicks on Select File button and upload valid Shifts bulk file
    #And User clicks on Submit button
    #Then User validates the success message as "successMessage" of valid Shifts Bulk Upload
    #And User clicks on Bulk Upload button
    #And User clicks on Select File button to upload invalid Shifts bulk file
    #And User clicks on Submit button
    #And User validates the error message as "errorMessage" of invalid Shifts Bulk Upload
    #And User clicks on Cancel button bulk upload
    #And User clicks on Bulk Upload button
    #And User clicks on Select File button to upload empty Shifts bulk file
    #And User clicks on Submit button
    #And User validates the error message as "errorMessage" of empty Shifts Bulk Upload file