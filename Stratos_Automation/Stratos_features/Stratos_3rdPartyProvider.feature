Feature: 3rd Party Provider functionality

  Scenario: Verify Add New Provider functionality with valid data
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User click on Add New Provider button
    And User enter valid Provider Name in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter valid Mobile Number in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter valid Other Contact in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter valid Email Address in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter valid Fax Number in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter valid Vat Number in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User select status from status dropdown in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter valid street in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter valid street2 in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User select City from City dropdown in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User validates valid Province is auto-populated when city is selected
    And User select Country from country dropdown in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter valid Postal Code in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter valid Comments in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then User click on Save and Continue button
    And User validates the success message as "Provider added Successfully"

  Scenario: Verify Add New Provider functionality with alpha numeric and special characters
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User click on Add New Provider button
    And verify that user able to enter Provider Name with alpha numeric and special characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Mobile Number with alpha numeric and special characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Other Contact Number with alpha numeric and special characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Email Address with alpha numeric and special characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Fax Number with alpha numeric and special characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Vat Number with alpha numeric and special characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Street with alpha numeric and special characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Street2 with alpha numeric and special characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Postal Code with alpha numeric and special characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Comments with alpha numeric and special characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then User click on Save and Continue button
    And user validate new provider should not be created

  Scenario: Verify the Add New Employee functionality with elements field length and invalid data
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User click on Add New Provider button
    And verify that user able to enter Provider Name  more than 25 characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Mobile Number  less and more than 10 Numbers in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Other Contact Number with less and more than 10 Numbers in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Fax Number with less and more than 10 Numbers in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Vat Number with less and more than 10 Numbers in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Street with more than 100 characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Street2 with more than 100 characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Postal Code with less and more than 4 Numbers in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And verify that user able to enter Comments with more than 250 characters in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then User click on Save and Continue button
    And validate new provider should not be created

  Scenario: Verify the Add New Employee functionality with null data
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User click on Add New Provider button
    Then User click on Save and Continue button
    And validate new provider should not be created

  Scenario: Verify the Cancel button functionality
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User click on Add New Provider button
    And User enter Provider Name in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter Mobile Number in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter Other Contact in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter Email Address in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter Fax Number in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter Vat Number in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User select status from status dropdown in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter street in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter street2 in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User select City from City dropdown in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User validates valid Province is auto-populated based on city selected
    And User select Country from country dropdown in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter Postal Code in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter Comments in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then User click on Cancel button
    And New provider should not be created

  Scenario: Verify the Active Providers filter functionality with valid data
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User enter valid Provider Ref in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then User validates the filtered data

  Scenario: Verify the Active Providers filter functionality with invalid data
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User enter invalid Provider Ref in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then User validates the filtered data

  Scenario: Verify the Inactive Providers filter functionality with valid data
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User enter valid Provider Ref in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then User validates the filtered data

  Scenario: Verify the Inactive Providers filter functionality with invalid data
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User enter invalid Provider Ref in Add Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then User validates the filtered data

  Scenario: Verify the items per page functionality
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User click on Items per page dropdown
    And Users select the desired number from items per page dropdown by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then User validates the displayed providers

  Scenario: Verify the Manage Provider functionality of Active Providers
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User click on Manage Provider button
    And User enter Mobile Number field in Edit Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User enter Other Contact Number field in Edit Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User click on update button
    Then User validates the success message as""
    And User click on Manage Provider button
    And User click on Deactivate button
    Then User validates the success message as""

  Scenario: Verify the Manage Provider functionality of Inactive Providers
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User click on Inactive Providers
    And User click on Manage Provider button
    And User updates Mobile Number field in Edit Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User updates Other Contact Number field in Edit Provider page by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And User click on update button
    And User click on Inactive Providers
    And User click on Manage Provider button of previously updated provider
    Then User validates the updated fields
    And User click on Activate button
    Then User validates previously Activated provider in Active provider

  Scenario: Verify the Bulk Upload functionality with invalid data excel file
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User click on Bulk Upload button
    And User click on Submit button
    And User validates the error message
    And User click on Bulk Upload button
    And User click on Select File button
    And User double click on invalid data excel file
    And User click on Submit button
    And User validates the error message

  Scenario: Verify the Bulk Upload functionality with valid data excel file
    Given User able to login into stratos application
    Then User click on 3rd Party Provider module
    And User click on Bulk Upload button
    And User click on Submit button
    And User double click on valid data excel file
    And User click on Submit button
    And User validates the bulk uploaded file
