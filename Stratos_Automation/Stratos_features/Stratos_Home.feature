Feature: Home functionality

  Scenario: Verify the Home module Theme functionality
   Given Admin User Login into the Stratos application
    And Admin User  click on Themes
    Then Admin User Select a theme
    Then Admin User verifies the theme

  Scenario: Verify the Home module Settings change password functionality
     Given Admin User Login into the Stratos application
    And Admin User click on settings
    Then Admin User click on change password Button
    Then Admin User enter current password by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User enter new password by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User enter confirm password by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User click update button
    Then Admin User verifies the success message ""

  Scenario: Verify the Home module logout functionality
   Given Admin User Login into the Stratos application
    Then Admin User  verify user navigates to homepage
    And Admin User click on settings
    Then Admin User click on logout
    Then Admin User navigates to Login Page
