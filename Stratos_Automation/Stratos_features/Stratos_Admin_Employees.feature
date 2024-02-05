Feature: Employees module functionality

  Background: 
    Given Enter the Url
    And Enter Email Address
    And Enter Password
    When Click on Log In button
    Then Verify Success message

  Scenario: Verify Add New Employee functionality
    Given User clicks on Employees in the menu
    And User clicks on Add New Employee button
    And Verify that user able to enter invalid data in Add Employee page
    Then User Validates the error messages of Invalid data of all the feilds in Add Employee page
    #And User clicks on Cancel button
    #And User clicks on Add New Employee button
    #And Verify that user able to enter invalid field length data in Add Employee page
    #Then User Validates the error messages of Invalid field length data of all the feilds in Add Employee page
    #Then User clicks on Cancel button
    #And User clicks on Add New Employee button
    #Then User clicks on Save and Continue button to validate mandatory fields of Add Employee page
    #Then User clicks on Cancel button
    #And User clicks on Add New Employee button
    #And User enters First Name as "firstName" in Employee Details
    #And User enters Last Name as "lastName" in Employee Details
    #And User enters Mobile Number "mobileNumber" in Employee Details
    #And User enters Other Contact Number as "otherContactNumber" in Employee Details
    #And User enters Email Address in Employee Details
    #And User enters Job Title as "jobTitle" in Employee Details
    #And User selects Gender as "gender" from Gender dropdown in Employee Details
    #And User clicks on Birthday date picker button and selects Birthday as "burthday" in Employee Details
    #And User selects Role as "role" from Role dropdown in Employee Details
    #And User selects Department as "department" from Select Department dropdown in Employee Details
    #And User clicks on Passport radio button in Employee Details
    #And User enters Passport Number as "passportNumber" in Employee Details
    #And User clicks on Passport Expiry Date date picker button and selects Passport Expiry Date as "passportExpiryDate" in Employee Details
    #And User clicks on ID Number radio button in Employee Details
    #And User enters SA ID as "saID" in Employee Details
    #******************************************************************************************************************************************
    #And User clicks on Employee Residential Address Details
    #And User enters Street 1 as "street1" in Employee Residential Address Details
    #And User enters Street 2 as "street2" in Employee Residential Address Details
    #And User selects City as "city" from City dropdown in Employee Residential Address Details
    #And User validates valid province is auto-populated when city is selected
    #And User enters Postal Code as "postalCode" in Employee Residential Address Details
    #And User selects Country as "country" from Select Country dropdown in Employee Residential Address Details
    #******************************************************************************************************************************************
    #And User clicks on Postal Address Details
    #And User enters Street 1 as "street1" in Postal Address Details
    #And User enters Street 2 as "street2" in Postal Address Details
    #And User selects City as "city" from City dropdown in Postal Address Details
    #And User validates valid province is auto-populated when city is selected in Postal Address Details
    #And User enter Postal Code as "postalCode" in Postal Address Details
    #And User selects Country as "country" from Select Country dropdown in Postal Address Details
    #******************************************************************************************************************************************
    #And User clicks on Emergency Contact Details
    #And And User enters First Name as "firstName" in Emergency Contact Details
    #And User enters Last Name as "lastName" in Emergency Contact Details
    #And User enters Mobile Number "mobileNumber" in Emergency Contact Details
    #And User enters Other Contact Number as "otherContactNumber" in Emergency Contact Details
    #And User enters Street 1 as "street1" in Emergency Contact Details
    #And User enters Street 2 as "street2" in Emergency Contact Details
    #And User selects City as "city" from City dropdown in Emergency Contact Details
    #And User validates valid province is auto-populated when city is selected in Emergency Contact Details
    #And User enter Postal Code as "postalCode" in Emergency Contact Details
    #And User selects Country as "country" from Select Country dropdown in Emergency Contact Details
    #******************************************************************************************************************************************
    #And User clicks on Next Of Kin Details
    #And And User enters First Name as "firstName" in Next Of Kin Details
    #And User enters Last Name as "lastName" in Next Of Kin Details
    #And User enters Mobile Number "mobileNumber" in Next Of Kin Details
    #And User enters Relationship as "relationship" in Next Of Kin Details
    #******************************************************************************************************************************************
    #And User clicks on Security Details
    #And User enters Security Licence Number as "securityLicenceNumber" in Security Details
    #And User clicks on Security Licence Expiry Date date picker button and selects Security Licence Expiry Date as "securityLicencetExpiryDate" in Security Details
    #******************************************************************************************************************************************
    #And User clicks on First Aid Details
    #And User enters First Aid/CPR as "firstAidCPR" in First Aid Details
    #And User clicks on First Aid/CPR Expiry Date date picker button and selects First Aid/CPR Expiry Date as "firstAid/CPRExpiryDate" in First Aid Details
    #******************************************************************************************************************************************
    #And User clicks on Compliance / Training / Certification Details
    #And User enters Drivers Licence as "driversLicence" in Compliance / Training / Certification Details
    #And User clicks on Drivers Licence Expiry date picker button and selects Drivers Licence Expiry date as "driversLicenceExpiryDate" in Compliance / Training / Certification Details
    #******************************************************************************************************************************************
    #And User clicks on Equipment Details
    #And User selects Use Force as " useForce" from Use Force dropdown in Equipment Details
    #And User selects Traffic Control as "trafficControl" from Traffic Control dropdown in Equipment Details
    #And User selects Use Handcuffs as " useHandcuffs" from Use Handcuffs dropdown in Equipment Details
    #And User selects Use Baton as " useBaton" from Use Baton dropdown in Equipment Details
    #And User selects Use Gun as " useGun" from Use Gun dropdown in Equipment Details
    #******************************************************************************************************************************************
    #And User clicks on Contract Details
    #And User selects Contract Type as "contractType" from Contract Type dropdown in Contract Details
    #And User clicks on Contract Start Date date picker button and selects Contract Start Date as "contractStartDate" in Contract Details
    #And User clicks on Contract End Date date picker button and selects Contract End Date as "contractEndDate" in Contract Details
    #******************************************************************************************************************************************
    #And User clicks on Parent Employee Deatils
    #And User selects Parent Contact Name as "parentContactName" from Parent Contact Name dropdown in Parent Employees Details
    #And User validates the Parent Employee Details are auto-populated
    #And User selects 3rd Party Provider as "3rdPartyProvider" from 3rd Party Provider dropdown
#
  #Scenario: Verify the Active Employees and Inactive Employees filter functionality
    #Given User clicks on Employees in the menu
    #And User enters valid Employee Ref as "EmployeerRef" on Active Employees
    #Then User validates the filtered data
    #And User enters invalid Employee Ref as "EmployeeRef" on Active Employees
    #Then User validates the error message as "errorMessage" of invalid Employee Ref
    #And User clicks on Inactive Employees
    #And User enters valid Employee Ref as "EmployeeRef" on Inactive Employees
    #Then User validates the filtered data
    #And User enters invalid Employee Ref as "EmployeeRef" in Add Employee page
    #Then User validates the error message as "errorMessage" of invalid Employee Ref
    #And User clicks on Items per page dropdown
    #And Users selects the desired number from items per page dropdown
    #Then User validates the displayed Employee
#
  #Scenario: Verify the Manage Employees functionality of Active Employees and Inactive Employees
    #Then User clicks on Employees in the menu
    #And User clicks on Manage Employee button
    #And User enters Mobile Number as "mobileNumber" in Employee Details
    #And User clicks on Update button
    #Then User validates the updates of Active Employees
    #And User clicks on Manage Employee button
    #And User clicks on Deactivate button
    #Then User validates the success message as"successMessage"
    #And User clicks on Inactive Employees
    #And User clicks on Manage Employee button
    #And User enters Other Contact Number as "otherContactNumber" in Employee Details
    #And User clicks on update button
    #Then User validates the success message as"successMessage"
    #And User clicks on Inactive Employees
    #And User clicks on Manage Employee button
    #And User clicks on Activate button
    #Then User validates the success message as"successMessage"
#
  #Scenario: Verify the Bulk Upload functionality
    #Then User clicks on Employees in the menu
    #And User clicks on Bulk Upload button
    #And User clicks on Select File button
    #And User double clicks on valid data excel file
    #And User clicks on Submit button
    #Then User validates the success message as"successMessage"
    #And User clicks on Bulk Upload button
    #And User clicks on Submit button
    #And User validates the error message as "errorMessage"
    #And User clicks on Bulk Upload button
    #And User clicks on selects File button
    #And User double clicks on invalid data excel file
    #And User clicks on Submit button
    #And User validates the error message as "errorMessage"
