Feature: Clients functionality

  Scenario: Verify add new Clients functionality with valid data
    Given Admin User able to Login into  Stratos application
    When Admin User Clicks on Clients module
    And Admin User Clicks on Add New Client Button
    Then Admin User Enter Client Name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter Mobile Number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter Email Address by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter Fax Number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User Enter Vat Number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter Account Manager by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Select Status by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User Enter street by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter street1 by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Select city by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Select province by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Select country by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter postal code by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter comments by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User Click on Save and Continue Button
    Then Admin User Verifies the Success Message as "Client added successfully"

  Scenario: Verify add new client functionality with invalid data
    Given Admin User able to Login into  Stratos Application
    When Admin User Click on Clients module
    And Admin User click on add new client button
    Then Admin User Enter Client Name with alphanumeric by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter Mobile Number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter Email Address by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter Fax Number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User Enter Vat Number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter Account Manager by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select status by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User enter street by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter street1 by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select city by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select province by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select country by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter postal code  more than 4 digits by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter comments by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User click save and continue button
    Then Admin User Verifies the Error Message "incorrect data"

  Scenario: Verify update client info in manage client functionality
    Given Admin User able to Login into  Stratos Application
    When Admin User click on Clients module
    Then Admin User  click manage client
    Then Admin User  click client info edit button
    Then Admin User  change  valid client name  by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User  change  street  by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User  select city by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User  clicks on update button
    Then Admin User Verifies the Error Message as "incorrect data"

  Scenario: Verify update all sites in cient functionality
    Given Admin User able to Login into  Stratos Application
    When Admin User  click Clients module
    Then Admin User  enter  site name  by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User  enter  client name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User  enter  site manager by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User  click on update button
    Then Admin User Verifies the Success Message as "site added successfully""

  Scenario: Verify and update inactive client info in manage client
    Given Admin User able to Login into  Stratos Application
    When Admin User  click Clients module
    Then Admin User  click inactive clients
    Then Admin User  click manage client
    Then Admin User  click client info edit button
    Then Admin User  enter  valid client name  by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User  enter  street  by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User  select city by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User  click on update button
    Then Admin User Verifies the Success Message as "Client added successfully"
