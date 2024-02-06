Feature: Equipment functionality

  Scenario: Verify add new equipemt functionality with valid data
    Given Admin User Login into the Stratos application
    When Admin User Click on Equipment module
    Then Admin User Click on Add New Euipment button
    Then Admin User Enter Equipment Description by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter Equipment Name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Select Client Name from Drop Down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Select the Site Name from Drop Down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Select the Equipment Category by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter Equipment License Number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter Equipment Serial Number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Select Auto Allocate from Drop Down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Select Equipment Type from drop down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Select auto allocate from Drop Down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Select the Expiry Date from Drop Down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User Click on Save and Continue Button
    Then Admin User Verifies the Success Message

  Scenario: Verify add new equipment functionality with invalid data
    Given Admin user login into the Stratos application
    When Admin User on click equipment module
    Then Admin User on click add new euipment button
    Then Admin User enter empty equipment description by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter empty equipment name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select client name from drop down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select the site name from drop down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select the equipment category by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter equipment license number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin Use enter equipment serial number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select auto allocate from drop down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select equipment type from drop down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select auto allocate from drop down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select the expiry date from drop down by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User click on save and continue Button
   Then Admin User Verifies the error Message

    
    Scenario: Verify the active equipment manage equipment functionality
    Given Admin User login into the Stratos application
    When Admin User click on equipment module
    Then admin User click on manage equipment 
    Then Admin User enter Equipement name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter equipment license number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter equipment serial number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User click on  save and continue Button
    Then Admin User verifies the success message
    
    Scenario: Verify the faulty equipment manage functionality
    Given Admin User login into the Stratos application
    When Admin User click on equipment module
    Then Admin User click on faulty equipment
    Then admin User click on manage equipment 
    Then Admin User enter Equipement name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter equipment license number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter equipment serial number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User click on save and continue Button
    Then Admin User verifies the success message
    
    Scenario: Verify the inactive equipment manage functionality
    Given Admin User login into the Stratos application
    When Admin User click on equipment module
    Then Admin User click on inactive equipment
    Then admin User click on manage equipment 
    Then Admin User enter Equipement name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter equipment license number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter equipment serial number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User click on save and continue Button
    Then Admin User verifies the success message
    
    Scenario: Verify the equipment bulk functionality
    Given Admin User login into the Stratos application
    When Admin User click on equipment module
    Then Admin User click on bulk upload Button
    Then Admin User Select the bulk upload file
    Then Admin User click on submit button.
    Then Admin User Verifies the success message