Feature: Login

Scenario: Login with valid credentials
    Given Enter the Url
    And Enter Email Address
    And Enter Password
    When Click on Log In button
    Then Verify Success message

  #Scenario: Login with invalid credentials
    #Given Enter the Url
    #And Enter invalid Email Address
    #And Enter invalid Password
    #When Click on Log In button
    #Then Verify Error message