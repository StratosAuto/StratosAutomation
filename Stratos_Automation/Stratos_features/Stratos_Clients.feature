Feature: Clients functionality

  Background: 
    Given Admin User Enter the Stratos application URL
    Then Admin User enter the valid username
    Then Admin User enter the valid password
    Then Admin User click on Submit button

    Then Admin User navigates to home page

    When User Click on Clients module
  
  Scenario: Verify add new Clients functionality with in valid data and valid data
    When User Click on Clients module
    And User click on add new client button
    And Verify that user able to enter invalid data in Add new client page
    And Validates the error messages of Invalid data of add new client all the feilds
    And Verify that user able to enter invalid field length data in add new client page
    Then User Validates the error messages of Invalid field length data of add new client all the feilds 
    And User click client add new client button
    Then User Enter Client Name "Client Name" in add client page
    Then User Enter Mobile Number "Mobilr Number" in add client page
    Then User Enter Email Address "Email Adress" in add client page
    Then User Enter Fax Number "Fax Number" in add client page
    And User Enter Vat Number "Vat Number" in add client page
    Then User Enter Account Manager "Account Manager" in add client page
    And User Enter street "Street" in add client page
    Then User Enter street1 "Street1" in add client page
    Then User Select city "City" in add client page
    Then User Select province "Province" in add client page
    Then User Select country "Country" in add client page
    Then User Enter postal code "Postal Code" in add client page
    Then User Enter comments "Comments" in add client page
    And User Click on Save and Continue Button in add client page
    Then User Verifies the client Success Message as "Client added successfully"

  Scenario: Verify update client info in manage client functionality with update and deactivate
    When User Click on Clients module
    Then User click on manage client
    Then User click on client info edit button
    Then User change valid client name "Client Name" in manage clients
    Then User change street "Street" When in manage clients
    Then User change street1 "Street1" in manage client page
    Then User click on update button
    Then User verifies the success message
    Then User click on manage client
    Then User click on client info edit button
    Then User change valid client name "Client Name" in manage clients
    Then User change street "Street" When in manage clients
    Then User change street1 "Street1" in manage client page
    Then User click on deactivate button
    Then User click on inactive button
    Then User verifies the success message
    Then User click on inactive button
    Then User verifies the success message
    Then User click on manage client
    Then User click on client info edit button
    Then User clicks on activate button
    
  Scenario: Verify the Bulk Upload functionality
    When User Click on Clients module
    And User clicks on Bulk Upload button in clients page
    And User clicks on Select File button and upload file in clients page
    And User clicks on Submit button in clients page
    Then User validates the success message as "successMessage" in clients page
    And User clicks on Bulk Upload button in clients page
    And User clicks on Submit button in clients page
    And User validates the error message as "errorMessage" of invalid Bulk Upload in clients page
    And User clicks on cancel button in clients page
    And User clicks on Bulk Upload button in clients page
    And User clicks on Submit button in clients page
    And User validates the error message as "errorMessage" of null Bulk Upload in clients page
    Then User click on cancel button in clients bulk upload