Feature: Manager Home
Background: 
    Given User enters the URL
    And User clicks on Login as Employee button
    And User enters Pin as "pin"
    And User clicks on Login button
    And User validates logged in successfull and navigated to Homepage
    
	Scenario: Verify the Manager Home module functionality
		Given Manager clicks on Dashboard tab
		And Manager click on Shifts tab
		And Manager clicks on Job Cards & Tasks tab
		And Manager clicks on Themes button
		And Manager clicks on Green Theme
		And Manager clicks on settings button
		Then Manager clicks on logout