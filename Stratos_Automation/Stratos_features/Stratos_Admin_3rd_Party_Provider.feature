Feature: 3rd Party Provider functionality

  Background: 
    Given Enter the Url
    And Enter Email Address
    And Enter Password
    When Click on Log In button
    Then Verify Success message

  Scenario: Verify Add New Provider functionality
    Given User clicks on 3rd Party Provider in the menu
    And User clicks on Add New Provider button
    And Verify that user able to enter invalid data in Add Provider page
    Then User Validates the error messages of Invalid data of all the feilds
    And User clicks on Cancel button
    And User clicks on Add New Provider button
    And Verify that user able to enter invalid field length data in Add Provider page
    Then User Validates the error messages of Invalid field length data of all the feilds
    Then User clicks on Cancel button
    And User clicks on Add New Provider button
    Then User clicks on Save and Continue button to validate mandatory fields
    Then User clicks on Cancel button
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
    And User validates valid Province is auto-populated when city is selectsed
    And User selects Country as "country" from country dropdown in Add Provider page
    And User enters Postal Code as "postalCode" in Add Provider page
    And User enters Comments as "comments" in Add Provider page
    Then User clicks on Save and Continue button
    And User verifies the created provider to validate provider is created

  Scenario: Verify the Active Providers and Inactive Providers filter functionality
    Given User clicks on 3rd Party Provider in the menu
    And User enters valid Provider Ref as "providerRef" on Active Providers
    Then User validates the filtered data of Active Provider
    And User enters invalid Provider Ref as "providerRef" on Active Providers
    Then User validates the error message as "errorMessage" of invalid provider Ref
    And User clicks on Inactive Providers
    And User enters valid Provider Ref as "providerRef" on Inactive Providers
    Then User validates the filtered data of Inactive Provider
    And User enters invalid Provider Ref as "providerRef" on Inactive Providers
    Then User validates the error message as "errorMessage" of invalid provider Ref
    And User clicks on Items per page dropdown
    And Users selects the desired number from items per page dropdown

  Scenario: Verify the Manage Provider functionality of Active Providers and Inactive Providers
    Given User clicks on 3rd Party Provider in the menu
    And User clicks on Manage Provider button
    And User enters Vat Number as "vatNumber" in Edit Provider page
    And User clicks on Update button
    Then User validates the updates of Active Providers
    And User clicks on Deactivate button
    Then User validates the deactivated provider
    And User clicks on Inactive Providers
    And User clicks on Manage Provider button
    And User enters Other Contact Number as "otherContactNumber" in Edit Provider page
    And User clicks on Update button
    Then User validates the updates of Inactive Providers
    And User clicks on Activate button
    Then User validates the activated provider

  Scenario: Verify the Bulk Upload functionality
    Given User clicks on 3rd Party Provider in the menu
    And User clicks on Bulk Upload button
    And User clicks on Select File button and upload file
    And User clicks on Submit button
    Then User validates the success message as "successMessage"
    And User clicks on Bulk Upload button
    And User clicks on Select File button and not upload invalid file
    And User clicks on Submit button
    And User validates the error message as "errorMessage" of invalid Bulk Upload
    And User clicks on Cancel button bulk upload
    And User clicks on Bulk Upload button
    And User clicks on Submit button
    And User clicks on Select File button and not upload null file
    And User validates the error message as "errorMessage" of null Bulk Upload