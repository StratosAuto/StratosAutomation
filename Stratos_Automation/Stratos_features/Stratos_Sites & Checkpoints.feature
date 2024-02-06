Feature: Sites & Checkpoints functionality

  Background: 
    Given User Enter the Stratos application URL
    Then User enter the valid username
    Then User enter the valid passsword
    Then user click on login button
    When User Click on Sites & Checkpoints module

  Scenario: Verify add new site functionality with valid data
    Given User click on add new site button
    And Verify that user able to enter invalid data in Add new site page
    Given User click on add new site button
    Then User Enter site Name as "site name" in add new site
    Then User Enter site description as"site description" in add new site
    Then User Enter complete Address "complete address" in add new site
    Then User select city as "city" in add new site" in add new site
    Then Uesr can validate the country field as "country field" in add new site
    Then User select postal code as "postal code" in add new site
    Then User enter mobile number as "mobile number" in add new site
    Then User enter email address as "email adress" in add new site
    Then Uesr enter site manager as "site manager" in add new site
    Then User select client name as "client name" in add new site
    Then User enter contact first name as "contact first name" in add new site
    Then User enter contact last name as "last first name" in add new site
    Then User enter site contact information mobile number as "mobile number" in add new site
    Then User enter site contact information email address as "email adress" in add new site
    #Then User Enter complete Address "complete address" in add new site
    #Then User select city as "city" in add new site" in add new site
    And User Click on Save and Continue Button
    Then User Verifies the created site to validate site is created
    

  Scenario: Verify manage checkpoints functionality
    And User Click on Manage check points button
    And Verify that user able to enter invalid data in manage checkpoints page
    And User Click on Manage check points button
    Then User Enter Checkpoint name as "name" in manage checkpoints
    Then User Enter Adress as "adress" in manage checkpoints
    Then User Click Add button
    Then User Click on Done

  Scenario: Verify manage site functionality
  And User clicks on Manage Site button
  And User enters Mobile Number as "MobileNumber" in Edit Site page
  And User clicks on Update button
  Then User validates the updates of Active Site
  And User clicks on Deactivate button
  Then User validates the deactivated site
  And User clicks on Manage Site button
  And User enters Other Contact Number as "otherContactNumber" in Edit Site page
  And User clicks on Update button
  Then User validates the updates of Inactive Site
  And User clicks on Activate button
  Then User validates the activated provider
  
    Scenario: Verify the Bulk Upload functionality
    And User clicks on Bulk Upload button
    And User clicks on Select File button and upload file
    And User clicks on Submit button
    Then User validates the success message as "successMessage"
    And User clicks on Bulk Upload button
    And User clicks on Submit button
    And User validates the error message as "errorMessage" of invalid Bulk Upload
    And User clicks on cancel button
    And User clicks on Bulk Upload button
    And User clicks on Submit button
    And User validates the error message as "errorMessage" of null Bulk Upload
