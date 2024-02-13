Feature: Signu Up functionality

  Scenario: Verify the Sign Up functionality 
    Given User Enters URL
    When User clicks on Sign Up link
    When User Verify the Sign Up functionality with invalid data
    Then User click on goback button
   ##---------empty data  ---------  
    When User clicks on Sign Up link
    Then User clicks on Register button
    Then User click on goback button
    ##----------- valid data----------
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
    
#
  #Scenario: Verify the Sign Up functionality with invalid data
    #Given User Enters URL
    #When User clicks on Sign Up link
    #And User enters First Name as "First name" in registrtion page
    #And User enters Last Name
    #And User enters in valid Email address
    #And User enters Mobile number
    #And User enters Password on Sign Up page
    #And User enters Confirm Password
    #And User select Role from the dropdown
    #And User select Gender
    #Then User clicks on Register button
    #And User verifies the error message
    #Then User clicks on Go Back Button
    #And User  navigates to Login Page
