Feature: Signu Up functionality

  Scenario: Verify the Sign Up functionality 
    Given User Enters URL
    And User clicks on Sign Up link
    When User Verify that able to enter invalid data in registration page
    Then User Validates the error messages of Invalid data of all the feilds on sign up page
    Then User click on goback button
    And User clicks on Sign Up link
    And Verify that user able to enter invalid field length data in Registration page
    Then User Validates the error messages of Invalid field length data of all the feilds on sign up page
    Then User click on goback button
    And User clicks on Sign Up link
    Then User clicks on Register button
    Then User click on goback button
    When User clicks on Sign Up link
    And User enters First Name as "First name" in registrtion page
    And User enters Last Name as "Last name" in registrtion page
    And User enters Email address as "Email adress" in registrtion page
    And User enters Mobile number as "Mobile number" in registrtion page
    And User enters Password on Sign Up page as "Pasword" in registrtion page
    And User enters Confirm Password as "Confirm password" in registrtion page
    And User select Role from the dropdown
    And User select Gender as "" in registrtion page
    Then User clicks on Register button
    And User  navigates to Login Page
    
    
  Scenario: Verify the Sign Up functionality with invalid data
    Given User Enters URL
    When User clicks on Sign Up link
    And User enters First Name as "First name" in registrtion page
    And User enters Last Name as "Last name" in registrtion page
    And User enters in Email address as "Email address" in registrtion page
    And User enters Mobile number
    And User enters Password on Sign Up page
    And User enters Confirm Password
    And User select Role from the dropdown
    And User select Gender
    Then User clicks on Register button
    And User verifies the error message
    Then User clicks on Go Back Button
    And User  navigates to Login Page