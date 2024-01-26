Feature: Manager Dashboard

  Scenario: Verify the Filter functionality
    Given User clicks on Dashboard in the menu
    And User clicks on All Clients dropdown and selects All clients as "allClients"
    And User clicks on Country dropdown and selects Country as "country
    And User clicks on All Provinces dropdown and selects All Provinces as "allProvinces"
    And User clicks on view dropdown and selects view as "view"
    Then User clicks on filter button
    And User enters valid data in filter field
    And User validates the filtered data
    And User enters invalid data in filetr field
    And User validates the error message
    And User clicks on Items per page dropdown
    And Users selects the desired number from items per page dropdown
    Then User validates the displayed sites
