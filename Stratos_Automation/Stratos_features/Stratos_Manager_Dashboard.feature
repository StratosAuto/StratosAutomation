Feature: Manager Dashboard
Background: 
    Given User enters the URL
    And User clicks on Login as Employee button
    And User enters Pin as "pin"
    And User clicks on Login button
    And User validates logged in successfull and navigated to Homepage
    
  Scenario: Verify the Dashboard functionality
    Given User clicks on manager Dashboard in the menu
    And User clicks on All Clients dropdown and selects All clients as "clients" on manager dashboard
    And User clicks on Country dropdown and selects Country as "country" on manager dashboard
    And User clicks on All Provinces dropdown and selects All Provinces as "provinces" on manager dashboard
    And User clicks on view dropdown and selects view as "list" to view list
    Then User clicks on filter button on manager dashboard
    And User clicks on Items per page dropdown to display items
    And Users selects the desired number from items per page dropdown
    And User enters valid data in filter field on manager dashboard
    And User validates the filtered data on dashboard page
    And User enters invalid data in filter field on manager dashboard
    And User validates the error message on manager dashboard
    And User clicks on view dropdown and selects view as "map" to view map
    Then User clicks on filter button on manager dashboard
    Then User clicks on map tag on manager dashboard
    And User clicks on view sites on manager dashboard
    And User clicks on More Info button on Dashboard / Site Details page
    And User clicks on Active Employee on Dashboard / Site Details page
    And User validates the displayed employee details on Dashboard / Site Details page
    And User clicks on Back button on Dashboard / Site Details page
    Then User clicks on Active Shifts More Info on Dashboard / Site Details page
    And User clicks on Active Employee on Dashboard / Site Details page
    And User validates Assigned Tasklist on Dashboard / Site Details page