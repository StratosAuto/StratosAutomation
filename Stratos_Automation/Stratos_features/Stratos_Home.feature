Feature: Home functionality

  Background: 
    Given Admin User Enter the Stratos application URL
    Then Admin User enter the valid username
    Then Admin User enter the valid passsword
    Then Admin user click on login button
    Then Admin User verifies the success message "Login Successfull"
    Then Admin User navigates to home page

  Scenario: Verify the Home module Theme functionality
    And Admin User  click on Themes
    Then Admin User Select a theme
    Then Admin User verifies the theme

  Scenario: Verify the Home module Settings change password functionality
    And Admin User click on settings
    Then Admin User click on change password Button
    Then Admin User enter current password by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User enter new password by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    And Admin User enter confirm password by using Excelsheetdata "<SheetName>" and row number "<rowNumber>"
    Then Admin User click update button
    Then Admin User verifies the success message ""

  Scenario: Verify the Home module logout functionality
    Then Admin User  verify user navigates to homepage
    And Admin User click on settings
    Then Admin User click on logout
    Then Admin User navigates to Login Page
