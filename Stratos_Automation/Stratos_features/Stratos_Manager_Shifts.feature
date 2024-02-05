Feature: Manager Shifts
  
  Given User enters the URL
    And User clicks on Login as Employee button
    And User enters Pin as "pin"
    And User clicks on Login button
    And Verify the success message as "successMessage"

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
    And User clicks on Add button
    Then User validates the success message as "successMessage"
    And User clicks on Add New Shift button
    And User clicks on Add button to validate mandatory fileds
    Then User validates error message as "errorMessage"
    And User clicks on cancel button
    And User clicks on Add New Shift button
    And User selects Supervisor Name & Surname as "supervisorName" from Supervisor Name & Surname dropdown
    And User selects clients as "clients" from Clients dropdown
    And User selects Site Name & Address as "siteName" from Site Name & Address dropdown
    Then User clicks on Clear button
    And User validates the fields were cleared

  Scenario: Verify the Future Schedules and Past Schedules filter functionality
    Given User clicks on Shifts in the menu
    And User enters valid Shifts Ref as "ShiftsRef" on Future Schedules
    Then User validates the filtered data
    And User enters invalid Shifts Ref as "ShiftsRef" on Future Schedules
    Then User validates the error message as "errorMessage"
    And User clicks on Past Schedules
    And User enters valid Shifts Ref as "ShiftsRef" on Past Schedules
    Then User validates the filtered data
    And User enters invalid Shifts Ref as "ShiftsRef" on Past Schedules
    Then User validates the error message as "errorMessage"
    And User clicks on Items per page dropdown
    And Users selects the desired number from items per page dropdown
    Then User validates the displayed Shifts

  Scenario: Verify the Edit Shifts and Assign button functionality
    Given User clicks on Shifts in the menu
    And User clicks on Edit Shifts button
    And User enters check-in time as "checkInTime"
    Then User clicks on Update button
    And User validates the success message as "successMessage"
    And User clicks on Assign button
    And User selects Employee Name & Surname as "employeeName" from Employee Name & Surname
    And User selects Job Card Name as "jobCardName" from Job Card Name
    Then User clicks on Assign button
    And User validates the success message as "successMessage"
    Then User clicks on Assign button
    Then User clicks on Assign button to validate mandatory fileds
    Then User validates the error message as "errorMessage"

  Scenario: Verify the Bulk Upload functionality
    Given User clicks on Shifts in the menu
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
