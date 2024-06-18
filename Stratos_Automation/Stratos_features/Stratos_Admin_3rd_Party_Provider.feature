Feature: 3rd Party Provider functionality

  Background: 
    Given Admin User Enter the Stratos application URL
    Then Admin User enter the valid username
    Then Admin User enter the valid password
    Then Admin User click on Submit button
    Then Admin User navigates to home page

  Scenario: Verify Add New Provider functionality status as Active
    Given User clicks on 3rd Party Provider in the menu
    And User clicks on Add New Provider button
    And Verify that user able to enter invalid data in Add Provider page
    Then User Validates the error messages of Invalid data of all the feilds
    And User clicks on Cancel button on Add Provider page
    And User clicks on Add New Provider button
    And Verify that user able to enter invalid field length data in Add Provider page
    Then User Validates the error messages of Invalid field length data of all the feilds in Add Provider page
    Then User clicks on Cancel button on Add Provider page
    And User clicks on Add New Provider button
    Then User clicks on Save and Continue button to validate mandatory fields of Providers
    Then User clicks on Cancel button on Add Provider page
    And User clicks on Add New Provider button
    And User enters Provider Name as "providerName" in Add Provider page
    And User enters Mobile Number as "mobileNumber" in Add Provider page
    And User enters Other Contact as "otherContactNumber" in Add Provider page
    And User enters Email Address as "emailAddress" in Add Provider page
    And User enters Fax Number as "faxNumber" in Add Provider page
    And User enters Vat Number as "vatNumber" in Add Provider page
    And User selects status as "status" from status dropdown in Add Provider page
    And User enters street as "street" in Add Provider page
    And User enters street2 as "street2" in Add Provider page
    And User selects City as "city" from City dropdown in Add Provider page
    And User validates valid Province is auto-populated when city is selected
    And User selects Country as "country" from country dropdown in Add Provider page
    And User enters Postal Code as "postalCode" in Add Provider page
    And User enters Comments as "comments" in Add Provider page
    Then User clicks on Save and Continue button
    And User verifies the created Active Provider to validate provider is created
    
	Scenario: Verify Add New Provider functionality status as Inactive
    Given User clicks on 3rd Party Provider in the menu
    And User clicks on Add New Provider button
    And User enters Provider Name as "providerName" in Add Provider page of Inactive
    And User enters Mobile Number as "mobileNumber" in Add Provider page of Inactive
    And User enters Other Contact as "otherContactNumber" in Add Provider page of Inactive
    And User enters Email Address as "emailAddress" in Add Provider page of Inactive
    And User enters Fax Number as "faxNumber" in Add Provider page of Inactive
    And User enters Vat Number as "vatNumber" in Add Provider page of Inactive
    And User selects status as "Inactive" from status dropdown in Add Provider page of Inactive
    And User enters street as "street" in Add Provider page of Inactive
    And User enters street2 as "street2" in Add Provider page of Inactive
    And User selects City as "city" from City dropdown in Add Provider page
    And User validates valid Province is auto-populated when city is selected
    And User selects Country as "country" from country dropdown in Add Provider page
    And User enters Postal Code as "postalCode" in Add Provider page of Inactive
    And User enters Comments as "comments" in Add Provider page of Inactive
    Then User clicks on Save and Continue button
    And User verifies the created Inactive Provider to validate provider is created
    
  Scenario: Verify the Active Providers and Inactive Providers filter functionality
    Given User clicks on 3rd Party Provider in the menu
    And User enters valid Provider Name as "providerName" on Active Providers
    Then User validates the filtered data of Active Provider
    And User enters invalid Provider Name as "providerName" on Active Providers
    Then User validates the error message as "errorMessage" of invalid provider Name
    And User clicks on Inactive Providers
    And User enters valid Provider Name as "providerName" on Inactive Providers
    Then User validates the filtered data of Inactive Provider
    And User enters invalid Provider Name as "providerName" on Inactive Providers
    Then User validates the error message as "errorMessage" of invalid provider Name
    And User clicks on Items per page dropdown to display items
    And Users selects the desired number from items per page dropdown

  Scenario: Verify the Manage Provider functionality of Active Providers and Inactive Providers
    Given User clicks on 3rd Party Provider in the menu
    And User clicks on Manage Provider button
    And User enters Vat Number as "vatNumber" in Edit Provider page
    And User clicks on Update button on Edit Provider page
    Then User validates the updates of Active Providers
    And User clicks on Deactivate button of Providers
    Then User validates the deactivated provider
    And User clicks on Inactive Providers
    And User clicks on Manage Provider button
    And User enters Other Contact Number as "otherContactNumber" in Edit Provider page
    And User clicks on Update button on Edit Provider page
    Then User validates the updates of Inactive Providers
    And User clicks on Activate button of Providers
    Then User validates the activated provider

  Scenario: Verify the Bulk Upload functionality
    Given User clicks on 3rd Party Provider in the menu
    And User clicks on Bulk Upload button
    And User clicks on Select File button and upload 3rd Party Provider bulk file
    And User clicks on Submit button of 3rd Party Provider
    Then User validates the success message as "successMessage" of 3rd Party Provider bulk file
    And User clicks on Bulk Upload button
    And User clicks on Select File button and not upload invalid 3rd Party Provider bulk file
    And User clicks on Submit button of 3rd Party Provider
    And User validates the error message as "errorMessage" of invalid Bulk Upload of 3rd Party Provider
    And User clicks on Cancel button bulk upload
    And User clicks on Bulk Upload button
    And User clicks on Select File button and not upload null 3rd Party Provider bulk file
    And User clicks on Submit button of 3rd Party Provider
    And User validates the error message as "errorMessage" of empty Bulk Upload file