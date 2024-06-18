Feature: Equipment functionality

  Background: 
   Given Admin User Enter the Stratos application URL
    Then Admin User enter the valid username
    Then Admin User enter the valid password
    Then Admin User click on Submit button
    
  
  Scenario: Verify add new equipemt functionality
    When User Click on Equipment module
    Given User click on add new equipment button
    Given Verify that user able to enter invalid data in Add new equipment page
    And User Validates the error messages of Invalid data of add new equipment all the feilds
    And Verify that user able to enter invalid field length data in add new equipment page
    Then User Validates the error messages of Invalid field length data of add new equipment all the feilds 
    Given User click on add new equipment button
    Then Admin User Enter Equipment Description
    Then Admin User Enter Equipment Name
    Then Admin User Select Client Name from Drop Down
    Then Admin User Select the Site Name from Drop Down
    Then Admin User Select the Equipment Category
    Then Admin User Enter Equipment License Number
    Then Admin User Enter Equipment Serial Number
    Then Admin User Select Auto Allocate from Drop Down
    Then Admin User Select Equipment Type from drop down
    Then Admin User Select the Expiry Date from Drop Down
    And Admin User Click on Save and Continue Button
    Then Admin User Clicks on Inactive Equipments
    Then User Verifies the created equipment to validate equipment is created

    Scenario: Verify the manage equipment functionality
    When User Click on Equipment module
    Then admin User click on manage equipment
    Then Admin User enter Equipement name as "equipment name" in Active equipment
    And Admin User click on update Button
    Then Admin User validates the updated manage equipment
    Then Click on inactive page in equipment
    Then admin User click on manage equipment
    Then Admin User enter Equipement name as "equipment name" in Active equipment
    And Admin User click on update Button
    Then Click on inactive page in equipment
    Then Admin User validates the deactivate manage equipment
    Then Click on faulty page in equipment
    Then admin User click on manage equipment
    Then Admin User enter Equipement name as "equipment name" in Active equipment
    And Admin User click on update Button
    Then Click on faulty page in equipment
    Then Admin User validates the faulty manage equipment
   
  Scenario: Verify the equipment bulk functionality
    When User Click on Equipment module
    When User clicks on Bulk Upload button in equpment page
    When User clicks on Select File button and upload file in equipment page
    When User clicks on Submit button in equipment page
    Then User Verifies the success message in bulk upload
    When User clicks on Bulk Upload button in equpment page
    When User clicks on Submit button in equipment page
    And User validates the error message as "errorMessage" of invalid Bulk Upload in equipment page
    And User clicks on cancel button in equipment page
    When User clicks on Bulk Upload button in equpment page
    When User clicks on Select File button and upload file in equipment page
    When User clicks on Submit button in equipment page
    And User validates the error message as "errorMessage" of null Bulk Upload in equipment page
    And User clicks on cancel button in equipment page
    
  Scenario: Verify the Assign Equipment and Return equipment functionality
    When User Click on Equipment module
    Given User click on add new equipment button
    Then Admin User Enter the Equipment Description
    Then Admin User Enter the Equipment Name
    Then Admin User Select the Client Name from Drop Down
    Then Admin User Select Site Name from Drop Down
    Then Admin User Select Equipment Category
    Then Admin User Enter the Equipment License Number
    Then Admin User Enter the Equipment Serial Number
    Then Admin User Select the Auto Allocate from Drop Down
    Then Admin User Select the Equipment Type from drop down
    Then Admin User Select Expiry Date from Drop Down
    And Admin User Click on Save and Continue Button
    Then Admin User Clicks on Inactive Equipments
    Then Admin User Search the created Working equipment in filter
    Then Admin User Clicks Manage equipment button in Inactive equipment
    Then Admin User Clicks on Assign Employee
    Then Admin User Select the employee name
    Then Admin User Select the Return date
    Then Admin User Clicks on submit button
    Then Admin User capture the success message
    Then Admin User Search the created Working equipment in filter
    Then Admin User Clicks on manage equipment in Active equipment
    Then Admin User Clicks on Return Equipment
    Then Admin User Enters the Return comments
    Then Admin User Select the Return State as Faulty
    Then Admin User Clicks on Submit button
    Then Admin User Captures the Return state success message
    Then Click on faulty page in equipment
    Then Admin User Validates the Return state Working equipment 
    Then Click on Manage Equipment in Faulty equipment
    Then Click on Deactivate button in Faulty Equipment
    Then Admin User Clicks on Inactive Equipments
    Then Admin User Search the created Working equipment in filter
    Then Admin User Clicks Manage equipment button in Inactive equipment
    Then Admin User Clicks on Assign Employee
    Then Admin User Select the employee name
    Then Admin User Select the Return date
    Then Admin User Clicks on submit button
    Then Admin User capture the success message
    Then Admin User Search the created Working equipment in filter
    Then Admin User Clicks on manage equipment in Active equipment
    Then Admin User Clicks on Return Equipment
    Then Admin User Enters the Return comments
    Then Admin User Select the Return State as Working
    Then Admin User Clicks on Submit button
    Then Admin User Captures the Return state success message
    Then Admin User Clicks on Inactive Equipments
    Then Admin User Search the created Working equipment in filter