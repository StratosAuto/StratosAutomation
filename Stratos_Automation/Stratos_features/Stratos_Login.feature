Feature: Login

Scenario: Login with valid credentials
    Given Enter the Url
    And Enter Email Address
    And Enter Password
    When Click on Log In button
    Then Verify Success message

<<<<<<< HEAD

  #Scenario: Login with invalid credentials
    #Given Enter the Url
    #And Enter invalid Email Address
    #And Enter invalid Password
    #When Click on Log In button
    #Then Verify Error message
=======
  Scenario: Verify the login functionality with invalid credentials
    Given User Enter the Stratos application URL
    Then User enter the invalid username
    Then User enter the invalid passsword
    Then user click on login button
    Then User verifies the error message "Please fill in all required fields."
    #/Then User click on login button
    #/Then User verifies the error message "Please fill in all required fields"
    
    
    Scenario: Verify the forgot pin functionality
    Given User Enter the Stratos application URL
    Then User click on the forgot pin link
    Then User enter the valid email address as "email address" in forgot password page
    Then User click on the submit button
    Then User verify the success message and user navigates to forgot password page
    Then User enter the create new passowrd as "create new password" in forgot password page
    Then User enter the confirm new password as "confirm new passowrd" in confirm password page
    Then User Click on the submit button
    Then User verifies the success message as"Password Updated Successfully"
    
    
>>>>>>> b8fa17dd6ed3b98ebf4580ee720f571d10b5c29c
