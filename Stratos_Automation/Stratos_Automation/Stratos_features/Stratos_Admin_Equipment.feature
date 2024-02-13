Feature: Equipment functionality

  Background: 
   Given User Enter the Stratos application URL
    Then User enter the valid username
    Then User enter the valid passsword
    Then user click on login button
    When User Click on Equipment module
    
##--add new equipment for valid in valid data-----

  Scenario: Verify add new equipemt functionality
    When User Click on Equipment module
    Given User click on add new equipment button
    Given Verify that user able to enter invalid data in Add new equipment page
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
    Then Admin User Select auto allocate from Drop Down
    Then Admin User Select the Expiry Date from Drop Down
    And Admin User Click on Save and Continue Button
    Then User Verifies the created equipment to validate equipment is created
   
   #---manage equipment for active inactive deativate functionality
   
    Scenario: Verify the manage equipment functionality
    Then admin User click on manage equipment
    Then Admin User enter Equipement name as "equipment name" in Active equipment
    #//Then Admin User enter equipment license number as "license number" in manage equipment
    #//Then Admin User select the clent name in manage equipment
    Then Admin User select the site name in manage equipment
    And Admin User click on update Button
    Then Admin User validates the updated manage equipment
    Then Click on inactive page in equipment
    Then admin User click on manage equipment
    Then Admin User enter Equipement name as "equipment name" in Active equipment
    #//Then Admin User enter equipment license number as "license number" in manage equipment
    #//Then Admin User select the clent name in manage equipment
    Then Admin User select the site name in manage equipment
    And Admin User click on update Button
    Then Click on inactive page in equipment
    #//And Admin User click on  deactivate Button
    Then Admin User validates the deactivate manage equipment
    Then Click on faulty page in equipment
    Then admin User click on manage equipment
    Then Admin User enter Equipement name as "equipment name" in Active equipment
    #//Then Admin User enter equipment license number as "license number" in manage equipment
    #//Then Admin User select the clent name in manage equipment
    Then Admin User select the site name in manage equipment
    #//And Admin User click on  faulty Button
    And Admin User click on update Button
    Then Click on faulty page in equipment
    Then Admin User validates the faulty manage equipment
   
   
  #Scenario: Verify the equipment bulk functionality
    #Given Admin User login into the Stratos application
    #When Admin User click on equipment module
    #Then Admin User click on bulk upload Button
    #Then Admin User Select the bulk upload file
    #Then Admin User click on submit button.
    #Then Admin User Verifies the success message
    
    
    
     #Scenario: Verify the Bulk Upload functionality
    #And User clicks on Bulk Upload button in equpment page
    #And User clicks on Select File button and upload file in equipment page
    #And User clicks on Submit button in equipment page
    #Then User validates the success message as "successMessage" in bulk upload
    #And User clicks on Bulk Upload button in equpment page
    #And User clicks on Submit button in equipment page
    #And User validates the error message as "errorMessage" of invalid Bulk Upload in equipment page
    #And User clicks on cancel button in bulk upload equipment page
    #And User clicks on Bulk Upload button in equpment page
     #And User clicks on Submit button in equipment page
    #And User validates the error message as "errorMessage" of null Bulk Upload in equipment page
    #
