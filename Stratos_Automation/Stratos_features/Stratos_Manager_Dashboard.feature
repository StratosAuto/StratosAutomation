Feature: Manager Dashboard
Background: 
    Given User enters the URL
    And User clicks on Login as Employee button
    And User enters Pin as "pin"
    And User clicks on Login button
    And User validates logged in successfull and navigated to Homepage
    
  Scenario: Verify the Dashboard functionality
    Given User clicks on Dashboard in the menu
    And User clicks on All Clients dropdown and selects All clients as "clients"
    And User clicks on Country dropdown and selects Country as "country
    And User clicks on All Provinces dropdown and selects All Provinces as "provinces"
    And User clicks on view dropdown and selects view as "list" to view list
    Then User clicks on filter button
    And User clicks on Items per page dropdown
    And Users selects the desired number from items per page dropdown
    And User enters valid data in filter field
    And User validates the filtered data on dashboard page
    And User enters invalid data in filter field
    And User validates the error message
    And User clicks on view dropdown and selects view as "map" to view map
    Then User clicks on filter button
    Then User clicks on map tag
    And User clicks on view sites
    And User validates the site details
    And User clicks on More Info
    Then User validates the displayed sites