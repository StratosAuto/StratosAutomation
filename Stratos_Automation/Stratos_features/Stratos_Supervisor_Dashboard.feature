Feature: Supervisor Dashboard

Background: 
    Given Admin User Enter the Stratos application URL
    Then User click on log in as employee
    Then User enter the valid pin as " valid pin " in employee login page
    And User click on login button
    
  Scenario: Verify the dashboard functionality
    Given User clicks on Dashboard in the menu in Supervisor dashboard
    And User clicks on All Clients dropdown and selects All clients as "allClients" in Supervisor dashboard
    And User clicks on Country dropdown and selects Country as "country" in Supervisor dashboard
    And User clicks on All Provinces dropdown and selects All Provinces as "allProvinces" in Supervisor dashboard
    And User clicks on view dropdown and selects view as "view" in Supervisor dashboard
    Then User clicks on filter button in Supervisor dashboard
    Then User clicks on view dropdown and select view as "map" in Supervisor dashboard
    Then User clicks on filter button in Supervisor dashboard
    Then User clicks on map tag in dashboard in Supervisor dashboard
    Then User clicks on view sites in dashboard in Supervisor dashboard
    Then User clicks on more info button in Supervisor dashboard
    Then User clicks on emplyee under all employees in Supervisor dashboard
    Then User verifies the shift details in Supervisor dashboard
    Then User clicks on Back button in Supervisor dashboard
    Then User clicks on more info button in Active shift info in Supervisor dashboard
    Then User clicks on emplyee under all employees in Supervisor dashboard
    Then User verifies the assigned task list in Supervisor dashboard
    Then User clicks on back button in Supervisor dashboard
    
    