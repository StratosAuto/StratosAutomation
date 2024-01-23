Feature: Sites & Checkpoints functionality

  Scenario: Verify add new site functionality with valid data
    Given Admin User Login into the Strtos application
    When Admin User Click on Sites & Checkpoints module
    And Admin User Click on Add New site Button
    Then Admin User Enter site Name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter site description by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter complete Address by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select city by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select postal code by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin Uesr can validate the country field
    Then Admin User enter mobile number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter email address by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin Uesr enter site manager by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select client name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter contact first name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter contact last name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter site contact information mobile number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter site contact information email address by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
  	And Admin User Click on Save and Continue Button
    Then Admin User Verifies the Success Message "Site added  successfully"
    
     
    Scenario: Verify add new site functionality with in valid data
    Given Admin User Login into the Strtos application
    When Admin User Click on Sites & Checkpoints module
    And Admin User Click on Add New site Button
    Then Admin User Enter site Name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter site description by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User Enter invalid complete Address by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select city by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select postal code by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter mobile number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter email address by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin Uesr enter site manager by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User select client name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter contact first name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter contact last name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter invalid site contact information mobile number by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User enter site contact information email address by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
		And Admin User Click on Save and Continue Button
    Then Admin User Verifies the Error Message "Fields should display the error"
    
   Scenario: Verify manage checkpoints functionality with valid data
   Given Admin User Login into the Stratos application
   When Admin User Click on Sites & Checkpoints module
   And Admin Use Click Manage checkpointsbutton
   Then Admin User Enter Checkpoint name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
   Then Admin User Enter Adress by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
   Then Admin User Click Add button
  Then Admin User Click on Done
 
   
   
   Scenario: Verify manage checkpoints functionality with invalid data
   Given Admin User Login into the Stratos application
   When Admin User Click on Sites & Checkpoints module
   And Admin Use Clicks Manage checkpointsbutton
   Then Admin User Enter Checkpoint name by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
   Then Admin User Enter Invalid Adress by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
   Then Admin User Click Add button
   And Admin User Click on Add Button
   Then Admin User verifies the error message "Fill All The Required Fields"
   
   
   Scenario: Verify manage site functionality
   Given Admin User Login into the Stratos application
   When Admin User Click on Sites & Checkpoints module
   And Admon User Click on manage site
   Then Admin User enter the Client Name
   And Admin User Click on Save and Continue Button
    Then Admin User Verifies the Success Message "Site added  successfully"
    
    

    Scenario: Verify deactivate manage site functionality 
   Given Admin User Login into the Stratos application
   When Admin User Click on Sites & Checkpoints module
   And Admon User Click on manage site
   Then Admin User enter the Client Name
   And Admin User Click on Deactivate Button
    Then Admin User Verifies the Success Message  "Site deactivated successfully"
   
   

    
    
    
    
    