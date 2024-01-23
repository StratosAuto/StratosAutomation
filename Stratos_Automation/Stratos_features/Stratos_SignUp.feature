Feature: Signu Up functionality

  Scenario: Verify the Sign Up functionality with valid data
    Given Admin user Enters URL
    When Admin User clicks on Sign Up link
    And Admnin User enters First Name
    And Admin User enters Last Name
    And Admin User enters Email address
    And Admin User enters Mobile number
    And Admin User enters Password on Sign Up page
    And Admin User enters Confirm Password
    And Admin User select Role from the dropdown
    And Admin User select Gender
    Then Admin User clicks on Register button
    And Admin User navigates to Login Page

  Scenario: Verify the Sign Up functionality with invalid data
    Given Admin user Enters URL
    When Admin User clicks on Sign Up link
    And Admnin User enters First Name
    And Admin User enters Last Name
    And Admin User enters in valid Email address
    And Admin User enters Mobile number
    And Admin User enters Password on Sign Up page
    And Admin User enters Confirm Password
    And Admin User select Role from the dropdown
    And Admin User select Gender
    Then Admin User clicks on Register button
    And Admin User verifies the error message
    Then Admin User Clicks on Go Back Button
    And Admin User navigates to Login Page
    
