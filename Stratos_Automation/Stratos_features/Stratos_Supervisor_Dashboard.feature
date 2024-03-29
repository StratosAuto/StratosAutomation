Feature: Supervisor Dashboard

Background: 
   Given User Enter the Stratos application URL
    Then User click on log in as employee
    Then User enter the valid pin as " valid pin " in employee login page
    And User click on login button
    Then User verifies the success message as "Login Successfull"


  Scenario: Verify the dashboard functionality
    Given User clicks on Dashboard in the menu
    And User clicks on All Clients dropdown and selects All clients as "allClients"
    And User clicks on Country dropdown and selects Country as "country
    And User clicks on All Provinces dropdown and selects All Provinces as "allProvinces"
    And User clicks on view dropdown and selects view as "view"
    Then User clicks on filter button
    And User enters valid data in filter field
   