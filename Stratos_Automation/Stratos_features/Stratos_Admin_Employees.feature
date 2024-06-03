Feature: Employees module functionality

  Background: 
    Given User Enter the Stratos application URL
    Then User enter the valid username
    Then User enter the valid password
    Then user click on login button


  Scenario: Verify Add New Employee functionality as Manager
    Given User clicks on Employees in the menu
    And User clicks on Add New Employee button
    And Verify that user able to enter invalid data in Add Employee page
    Then User Validates the error messages of Invalid data of all the feilds in Add Employee page
    And User clicks on Cancel button on Add Employees page
    And User clicks on Add New Employee button
    And Verify that user able to enter invalid field length data in Add Employee page
    Then User Validates the error messages of Invalid field length data of all the feilds in Add Employee page
    Then User clicks on Cancel button on Add Employees page
    And User clicks on Add New Employee button
    Then User clicks on Save button to validate mandatory fields of Add Employee page
    Then User clicks on Cancel button on Add Employees page
    
    And User clicks on Add New Employee button
    And User enters First Name as "firstName" in Employee Details
    And User enters Last Name as "lastName" in Employee Details
    And User enters Mobile Number as "mobileNumber" in Employee Details
    And User enters Other Contact Number as "otherContactNumber" in Employee Details
    And User enters Email Address as "emailAddress" in Employee Details
    And User enters Job Title as "jobTitle" in Employee Details
    And User selects Gender as "gender" from Gender dropdown in Employee Details
    And User clicks on Birthday date picker button and selects Birthday as "birthday" in Employee Details
    And User selects Role as "role" from Role dropdown in Employee Details
    And User selects Department as "department" from Select Department dropdown in Employee Details
    And User clicks on Passport radio button in Employee Details
    And User enters Passport Number as "passportNumber" in Employee Details
    And User clicks on Passport Expiry Date date picker button and selects Passport Expiry Date as "passportExpiryDate" in Employee Details
    And User clicks on ID Number radio button in Employee Details
    And User enters SA ID as "saID" in Employee Details
   
    And User clicks on Employee Residential Address Details
    And User enters Street1  as "street1" in Employee Residential Address Details
    And User enters Street2  as "street2" in Employee Residential Address Details
    And User selects City as "city" from City dropdown in Employee Residential Address Details
    And User validates valid province is auto-populated when city is selected
    And User enters Postal Code as "postalCode" in Employee Residential Address Details
    And User selects Country as "country" from Select Country dropdown in Employee Residential Address Details
   
    And User clicks on Postal Address Details
    And User enters Street1 as "street1" in Postal Address Details
    And User enters Street2 as "street2" in Postal Address Details
    And User selects City as "city" from City dropdown in Postal Address Details
    And User validates valid province is auto-populated when city is selected in Postal Address Details
    And User enter Postal Code as "postalCode" in Postal Address Details
    And User selects Country as "country" from Select Country dropdown in Postal Address Details
   
    And User clicks on Next Of Kin Details
    And And User enters First Name as "firstName" in Next Of Kin Details
    And User enters Last Name as "lastName" in Next Of Kin Details
    And User enters Mobile Number "mobileNumber" in Next Of Kin Details
    And User enters Relationship as "relationship" in Next Of Kin Details
   
    And User clicks on Emergency Contact Details
    And And User enters First Name as "firstName" in Emergency Contact Details
    And User enters Last Name as "lastName" in Emergency Contact Details
    And User enters Mobile Number "mobileNumber" in Emergency Contact Details
    And User enters Other Contact Number as "otherContactNumber" in Emergency Contact Details
    And User enters Email Address as "emailAddress" in Emergency Contact Details
    And User enters Street1 as "street1" in Emergency Contact Details
    And User enters Street2 as "street2" in Emergency Contact Details
    And User selects City as "city" from City dropdown in Emergency Contact Details
    And User validates valid province is auto-populated when city is selected in Emergency Contact Details
    And User enter Postal Code as "postalCode" in Emergency Contact Details
    And User selects Country as "country" from Select Country dropdown in Emergency Contact Details
   
    And User clicks on Security Details
    And User enters Security Licence Number as "securityLicenceNumber" in Security Details
    And User clicks on Security Licence Expiry Date date picker button and selects Security Licence Expiry Date as "securityLicencetExpiryDate" in Security Details
   
    And User clicks on First Aid Details
    And User enters First Aid/CPR as "firstAidCPR" in First Aid Details
    And User clicks on First Aid/CPR Expiry Date date picker button and selects First Aid/CPR Expiry Date as "firstAid/CPRExpiryDate" in First Aid Details
   
    And User clicks on Compliance / Training / Certification Details
    And User enters Drivers Licence as "driversLicence" in Compliance / Training / Certification Details
    And User clicks on Drivers Licence Expiry date picker button and selects Drivers Licence Expiry date as "driversLicenceExpiryDate" in Compliance / Training / Certification Details
    And User enters Gun Licence as "gunLicence" in Compliance / Training / Certification Details
    And User clicks on Gun Licence Expiry date picker button and selects Gun Licence Expiry date as "gunLicence" in Compliance / Training / Certification Details
   
    And User clicks on Equipment Details
    And User selects Use Force as " useForce" from Use Force dropdown in Equipment Details
    And User selects Traffic Control as "trafficControl" from Traffic Control dropdown in Equipment Details
    And User selects Use Handcuffs as " useHandcuffs" from Use Handcuffs dropdown in Equipment Details
    And User selects Use Baton as " useBaton" from Use Baton dropdown in Equipment Details
    And User selects Use Gun as " useGun" from Use Gun dropdown in Equipment Details
   
    And User clicks on Contract Details
    And User selects Contract Type as "contractType" from Contract Type dropdown in Contract Details
    And User clicks on Contract Start Date date picker button and selects Contract Start Date as "contractStartDate" in Contract Details
    And User clicks on Contract End Date date picker button and selects Contract End Date as "contractEndDate" in Contract Details
   
    And User selects 3rd Party Provider as "3rdPartyProvider" from 3rd Party Provider dropdown
    Then User clicks on Save button
    And User verifies the created Manager to validate Manager is created

  Scenario: Verify Add New Employee functionality as Supervisor
    Given User clicks on Employees in the menu
    And User clicks on Add New Employee button
		And User enters First Name as "firstName" in Employee Details of Supervisor
    And User enters Last Name as "lastName" in Employee Details of Supervisor
    And User enters Mobile Number as "mobileNumber" in Employee Details of Supervisor
    And User enters Other Contact Number as "otherContactNumber" in Employee Details of Supervisor
    And User enters Email Address as "emailAddress" in Employee Details of Supervisor
    And User enters Job Title as "jobTitle" in Employee Details of Supervisor
    And User selects Gender as "gender" from Gender dropdown in Employee Details of Supervisor
    And User clicks on Birthday date picker button and selects Birthday as "birthday" in Employee Details of Supervisor
    And User selects Role as "role" from Role dropdown in Employee Details of Supervisor
    And User selects Department as "department" from Select Department dropdown in Employee Details of Supervisor
    And User clicks on Passport radio button in Employee Details of Supervisor
    And User enters Passport Number as "passportNumber" in Employee Details of Supervisor
    And User clicks on Passport Expiry Date date picker button and selects Passport Expiry Date as "passportExpiryDate" in Employee Details of Supervisor
    And User clicks on ID Number radio button in Employee Details of Supervisor
    And User enters SA ID as "saID" in Employee Details of Supervisor
  
    And User clicks on Employee Residential Address Details of Supervisor
    And User enters Street1  as "street1" in Employee Residential Address Details of Supervisor
    And User enters Street2  as "street2" in Employee Residential Address Details of Supervisor
    And User selects City as "city" from City dropdown in Employee Residential Address Details of Supervisor
    And User validates valid province is auto-populated when city is selected of Supervisor
    And User enters Postal Code as "postalCode" in Employee Residential Address Details of Supervisor
    And User selects Country as "country" from Select Country dropdown in Employee Residential Address Details of Supervisor
   
    And User clicks on Postal Address Details of Supervisor
    And User enters Street1 as "street1" in Postal Address Details of Supervisor
    And User enters Street2 as "street2" in Postal Address Details of Supervisor
    And User selects City as "city" from City dropdown in Postal Address Details of Supervisor
    And User validates valid province is auto-populated when city is selected in Postal Address Details of Supervisor
    And User enter Postal Code as "postalCode" in Postal Address Details of Supervisor
    And User selects Country as "country" from Select Country dropdown in Postal Address Details of Supervisor
   
    And User clicks on Next Of Kin Details of Supervisor
    And And User enters First Name as "firstName" in Next Of Kin Details of Supervisor
    And User enters Last Name as "lastName" in Next Of Kin Details of Supervisor
    And User enters Mobile Number "mobileNumber" in Next Of Kin Details of Supervisor
    And User enters Relationship as "relationship" in Next Of Kin Details of Supervisor
   
    And User clicks on Emergency Contact Details of Supervisor
    And And User enters First Name as "firstName" in Emergency Contact Details of Supervisor
    And User enters Last Name as "lastName" in Emergency Contact Details of Supervisor
    And User enters Mobile Number "mobileNumber" in Emergency Contact Details of Supervisor
    And User enters Other Contact Number as "otherContactNumber" in Emergency Contact Details of Supervisor
    And User enters Email Address as "emailAddress" in Emergency Contact Details of Supervisor
    And User enters Street1 as "street1" in Emergency Contact Details of Supervisor
    And User enters Street2 as "street2" in Emergency Contact Details of Supervisor
    And User selects City as "city" from City dropdown in Emergency Contact Details of Supervisor
    And User validates valid province is auto-populated when city is selected in Emergency Contact Details of Supervisor
    And User enter Postal Code as "postalCode" in Emergency Contact Details of Supervisor
    And User selects Country as "country" from Select Country dropdown in Emergency Contact Details of Supervisor
    
    And User clicks on Security Details of Supervisor
    And User enters Security Licence Number as "securityLicenceNumber" in Security Details of Supervisor
    And User clicks on Security Licence Expiry Date date picker button and selects Security Licence Expiry Date as "securityLicencetExpiryDate" in Security Details of Supervisor
   
    And User clicks on First Aid Details of Supervisor
    And User enters First Aid/CPR as "firstAidCPR" in First Aid Details of Supervisor
    And User clicks on First Aid/CPR Expiry Date date picker button and selects First Aid/CPR Expiry Date as "firstAid/CPRExpiryDate" in First Aid Details of Supervisor
   
    And User clicks on Compliance / Training / Certification Details of Supervisor
    And User enters Drivers Licence as "driversLicence" in Compliance / Training / Certification Details of Supervisor
    And User clicks on Drivers Licence Expiry date picker button and selects Drivers Licence Expiry date as "driversLicenceExpiryDate" in Compliance / Training / Certification Details of Supervisor
    And User enters Gun Licence as "gunLicence" in Compliance / Training / Certification Details of Supervisor
    And User clicks on Gun Licence Expiry date picker button and selects Gun Licence Expiry date as "gunLicence" in Compliance / Training / Certification Details of Supervisor
   
    And User clicks on Equipment Details of Supervisor
    And User selects Use Force as " useForce" from Use Force dropdown in Equipment Details of Supervisor
    And User selects Traffic Control as "trafficControl" from Traffic Control dropdown in Equipment Details of Supervisor
    And User selects Use Handcuffs as " useHandcuffs" from Use Handcuffs dropdown in Equipment Details of Supervisor
    And User selects Use Baton as " useBaton" from Use Baton dropdown in Equipment Details of Supervisor
    And User selects Use Gun as " useGun" from Use Gun dropdown in Equipment Details of Supervisor
   
    And User clicks on Contract Details of Supervisor
    And User selects Contract Type as "contractType" from Contract Type dropdown in Contract Details of Supervisor
    And User clicks on Contract Start Date date picker button and selects Contract Start Date as "contractStartDate" in Contract Details of Supervisor
   
    And User clicks on Parent Employee Details of Supervisor
    And User selects Parent Contact Name as "parentContactName" from Parent Contact Name dropdown in Parent Employees Details of Supervisor
		Then User clicks on Save button
    And User verifies the created Supervisor to validate Supervisor is created
 
    Scenario: Verify Add New Employee functionality as Employee
    Given User clicks on Employees in the menu
    And User clicks on Add New Employee button
		And User enters First Name as "firstName" in Employee Details of Employee
    And User enters Last Name as "lastName" in Employee Details of Employee
    And User enters Mobile Number as "mobileNumber" in Employee Details of Employee
    And User enters Other Contact Number as "otherContactNumber" in Employee Detail of Employees
    And User enters Email Address as "emailAddress" in Employee Details of Employee
    And User enters Job Title as "jobTitle" in Employee Details of Employee
    And User selects Gender as "gender" from Gender dropdown in Employee Details of Employee
    And User clicks on Birthday date picker button and selects Birthday as "birthday" in Employee Details of Employee
    And User selects Role as "role" from Role dropdown in Employee Details of Employee
    And User selects Department as "department" from Select Department dropdown in Employee Details of Employee
    And User clicks on Passport radio button in Employee Details of Employee
    And User enters Passport Number as "passportNumber" in Employee Details of Employee
    And User clicks on Passport Expiry Date date picker button and selects Passport Expiry Date as "passportExpiryDate" in Employee Details of Employee
    And User clicks on ID Number radio button in Employee Details of Employee
    And User enters SA ID as "saID" in Employee Details of Employee
   
    And User clicks on Employee Residential Address Details
    And User enters Street1  as "street1" in Employee Residential Address Details of Employee
    And User enters Street2  as "street2" in Employee Residential Address Details of Employee
    And User selects City as "city" from City dropdown in Employee Residential Address Details of Employee
    And User validates valid province is auto-populated when city is selected of Employee
    And User enters Postal Code as "postalCode" in Employee Residential Address Details of Employee
    And User selects Country as "country" from Select Country dropdown in Employee Residential Address Details of Employee
   
    And User clicks on Postal Address Details
    And User enters Street1 as "street1" in Postal Address Details of Employee
    And User enters Street2 as "street2" in Postal Address Details of Employee
    And User selects City as "city" from City dropdown in Postal Address Details of Employee
    And User validates valid province is auto-populated when city is selected in Postal Address Details of Employee
    And User enter Postal Code as "postalCode" in Postal Address Details of Employee
    And User selects Country as "country" from Select Country dropdown in Postal Address Details of Employee
   
    And User clicks on Next Of Kin Details of Employee
    And And User enters First Name as "firstName" in Next Of Kin Details of Employee
    And User enters Last Name as "lastName" in Next Of Kin Details of Employee
    And User enters Mobile Number "mobileNumber" in Next Of Kin Details of Employee
    And User enters Relationship as "relationship" in Next Of Kin Details of Employee
   
    And User clicks on Emergency Contact Details of Employee
    And And User enters First Name as "firstName" in Emergency Contact Details of Employee
    And User enters Last Name as "lastName" in Emergency Contact Details of Employee
    And User enters Mobile Number "mobileNumber" in Emergency Contact Details of Employee
    And User enters Other Contact Number as "otherContactNumber" in Emergency Contact Details of Employee
    And User enters Email Address as "emailAddress" in Emergency Contact Details of Employee
    And User enters Street1 as "street1" in Emergency Contact Details of Employee
    And User enters Street2 as "street2" in Emergency Contact Details of Employee
    And User selects City as "city" from City dropdown in Emergency Contact Details of Employee
    And User validates valid province is auto-populated when city is selected in Emergency Contact Details of Employee
    And User enter Postal Code as "postalCode" in Emergency Contact Details of Employee
    And User selects Country as "country" from Select Country dropdown in Emergency Contact Details of Employee
   
    And User clicks on Security Details of Employee
    And User enters Security Licence Number as "securityLicenceNumber" in Security Details of Employee
    And User clicks on Security Licence Expiry Date date picker button and selects Security Licence Expiry Date as "securityLicencetExpiryDate" in Security Details of Employee
   
    And User clicks on First Aid Details of Employee
    And User enters First Aid/CPR as "firstAidCPR" in First Aid Details of Employee
    And User clicks on First Aid/CPR Expiry Date date picker button and selects First Aid/CPR Expiry Date as "firstAid/CPRExpiryDate" in First Aid Details of Employee
   
    And User clicks on Compliance / Training / Certification Details of Employee
    And User enters Drivers Licence as "driversLicence" in Compliance / Training / Certification Details of Employee
    And User clicks on Drivers Licence Expiry date picker button and selects Drivers Licence Expiry date as "driversLicenceExpiryDate" in Compliance / Training / Certification Details of Employee
    And User enters Gun Licence as "gunLicence" in Compliance / Training / Certification Details of Employee
    And User clicks on Gun Licence Expiry date picker button and selects Gun Licence Expiry date as "gunLicence" in Compliance / Training / Certification Details of Employee
   
    And User clicks on Equipment Details of Employee
    And User selects Use Force as " useForce" from Use Force dropdown in Equipment Details of Employee
    And User selects Traffic Control as "trafficControl" from Traffic Control dropdown in Equipment Details of Employee
    And User selects Use Handcuffs as " useHandcuffs" from Use Handcuffs dropdown in Equipment Details of Employee
    And User selects Use Baton as " useBaton" from Use Baton dropdown in Equipment Details of Employee
    And User selects Use Gun as " useGun" from Use Gun dropdown in Equipment Details of Employee
   
    And User clicks on Contract Details of Employee
    And User selects Contract Type as "contractType" from Contract Type dropdown in Contract Details of Employee
    And User clicks on Contract Start Date date picker button and selects Contract Start Date as "contractStartDate" in Contract Details of Employee
   
    And User clicks on Parent Employee Deatils of Employee
    And User selects Parent Contact Name as "parentContactName" from Parent Contact Name dropdown in Parent Employees Details of Employee
    Then User clicks on Save button
    And User verifies the created Employee to validate Employee is created
    
  Scenario: Verify the Active Employees and Inactive Employees filter functionality
    Given User clicks on Employees in the menu
    And User enters valid Employee Name as "EmployeerName" on Active Employees
    Then User validates the filtered data of Active Employees
    And User enters invalid Employee Name as "EmployeeName" on Active Employees
    Then User validates the error message as "errorMessage" on Active Employees
    And User clicks on Inactive Employees
    And User enters valid Employee Name as "EmployeeName" on Inactive Employees
    Then User validates the filtered data on Inactive Employees
    And User enters invalid Employee Name as "EmployeeName" on Inactive Employees
    Then User validates the error message as "errorMessage" on Inactive Employees
    And User clicks on Items per page dropdown to display items
    And Users selects the desired number from items per page dropdown

Scenario: Verify the Manage Employees functionality of Active Employees and Inactive Employees
    Then User clicks on Employees in the menu
    And User clicks on Manage Employee button
    And User enters Other Contact Number as "otherContactNumber" in Edit Employees page
    And User clicks on Update button on employee page
    Then User validates the updates of Active Employees
    And User clicks on Deactivate button on Manage Employees page
    Then User validates the Deactivated Employee on employee page
    And User clicks on Manage Employee button
    And User clicks on Activate button on Manage Employees page
    Then User validates the Activated Employee
    
  #Scenario: Verify the Bulk Upload functionality
    #Then User clicks on Employees in the menu
    #And User clicks on Bulk Upload button
    #And User clicks on Select File button and upload employees file
    #And User clicks on Submit button of Employee
    #Then User validates the success message as "successMessage" of employee bulk file
    #And User clicks on Bulk Upload button
    #And User clicks on Select File button to upload invalid Employees bulk file
    #And User clicks on Submit button of Employee
    #And User validates the error message as "errorMessage" of invalid Employees Bulk Upload
    #And User clicks on Cancel button bulk upload
    #And User clicks on Bulk Upload button
    #And User clicks on Select File button to upload empty Employees bulk file
    #And User clicks on Submit button of Employee
    #And User validates the error message as "errorMessage" of empty Employee null Bulk Upload file