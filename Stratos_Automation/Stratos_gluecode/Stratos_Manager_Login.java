package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Manager_Login_PageObjects;
import Stratos_testBase.PageBase;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import Stratos_utilities.Utils;
import io.cucumber.java.en.*;

public class Stratos_Manager_Login {
	
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "LOGIN";
	
	@Given("User enters the URL")
	public void user_enters_the_URL() {
		PageBase.OpenBrowser("Browser");
		String url = Utils.getFileProperty("URL");
		PageBase.driver.get(url);
		
		testBase.RefreshPage();
	}

	@Given("User clicks on Login as Employee button")
	public void user_clicks_on_Login_as_Employee_button() throws Exception {
		testBase.waitForElement(Stratos_Manager_Login_PageObjects.loginAsEmployeeButton, 20);
	    testBase.clickonElement(Stratos_Manager_Login_PageObjects.loginAsEmployeeButton, "Log in as Employee");
	}

	@Given("User enters invalid pin as {string}")
	public void user_enters_invalid_pin_as(String string) throws Exception {
	    String invalidPin=testBase.randomAlphanumeric(5);
	    testBase.waitForElement(Stratos_Manager_Login_PageObjects.pinField, 20);
	    testBase.typeinTextBox(Stratos_Manager_Login_PageObjects.pinField, invalidPin, "PIN");
	}
	
	@Given("User validates login is unsuccessfull")
	public void user_validates_login_is_unsuccessfull() throws Exception {
	    if((testBase.isElementVisible(Stratos_Manager_Login_PageObjects.validateHomepage, "Homepage"))) {
	    	ExceptionHandling.HandleAssertion("User navigated to Homepage");
	    }else
	    	Logs.info("User is not navigated to Homepage");
	}

	@Given("User clicks on Login button to validate null pin")
	public void user_clicks_on_Login_button_to_validate_null_pin() throws Exception {
		testBase.waitForElement(Stratos_Manager_Login_PageObjects.pinField, 20);
		testBase.clearTextbox(Stratos_Manager_Login_PageObjects.pinField, "Pin Field");
		testBase.clickonElement(Stratos_Manager_Login_PageObjects.loginButton, "Login");
		if((testBase.isElementVisible(Stratos_Manager_Login_PageObjects.validateHomepage, "Homepage"))) {
	    	ExceptionHandling.HandleAssertion("User navigated to Homepage");
	    }else
	    	Logs.info("User is not navigated to Homepage");
	}
	
	@Given("User enters Pin as {string}")
	public void user_enters_Pin_as(String string)throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String pin=Excel_Utility.getCellData(1, 2);
	    testBase.waitForElement(Stratos_Manager_Login_PageObjects.pinField, 20);
	    testBase.typeinTextBox(Stratos_Manager_Login_PageObjects.pinField, pin, "PIN");
	}

	@Given("User clicks on Login button")
	public void user_clicks_on_Login_button()throws Exception {
	    testBase.waitForElement(Stratos_Manager_Login_PageObjects.loginButton, 20);
	    testBase.clickonElement(Stratos_Manager_Login_PageObjects.loginButton, "Login");
	}
	
	@Given("User validates logged in successfull and navigated to Homepage")
	public void user_validates_logged_in_successfull_and_navigated_to_Homepage() throws Exception {
		if((testBase.isElementVisible(Stratos_Manager_Login_PageObjects.validateHomepage, "Homepage"))) {
	    	ExceptionHandling.HandleAssertion("User is not navigated to Homepage");
	    }else
	    	Logs.info("User is navigated to Homepage");
	}

	@Given("User clicks on Logout button")
	public void user_clicks_on_Logout_button() throws Exception {
	   testBase.waitForElement(Stratos_Manager_Login_PageObjects.settingsButton, 20);
	   Thread.sleep(5000);
	   testBase.clickonElement(Stratos_Manager_Login_PageObjects.settingsButton, "Settings");
	   testBase.clickonElement(Stratos_Manager_Login_PageObjects.logout, "Logout");
	}

	@Then("User validates navigated to login page")
	public void user_validates_navigated_to_login_page() throws Exception {
	   testBase.waitForElement(Stratos_Manager_Login_PageObjects.validateLogin, 20);
	   if(!(testBase.isElementVisible(Stratos_Manager_Login_PageObjects.validateLogin, "Login Page"))) {
		   ExceptionHandling.HandleAssertion("User is not navigated to Login page");
	   }else
		   Logs.info("User is navigated to Login page");
	}
	
	@Given("User clicks on Forgin PIN link and navigate to Forgot Your Pin page")
	public void user_clicks_on_Forgin_PIN_link_and_navigate_to_Forgot_Your_Pin_page() throws Exception {
	    testBase.waitForElement(Stratos_Manager_Login_PageObjects.forgotPin, 20);
	    testBase.clickonElement(Stratos_Manager_Login_PageObjects.forgotPin, "Forgot PIN");
	}

	@Given("User enter invalid Employee ID as {string}")
	public void user_enter_invalid_Employee_ID_as(String string) throws Exception {
	    String invalidEmployeeID=testBase.randomAlphanumeric(10);
	    testBase.typeinTextBox(Stratos_Manager_Login_PageObjects.employeeID, invalidEmployeeID, "Invalid Employee ID");

	}

	@Then("User clicks on Request New PIN button on Forgot Your Pin page")
	public void user_clicks_on_Request_New_PIN_button_on_Forgot_Your_Pin_page() throws Exception {
		testBase.waitForElement(Stratos_Manager_Login_PageObjects.requestNewPin, 20);
	    testBase.clickonElement(Stratos_Manager_Login_PageObjects.requestNewPin, "Request New Pin");
	}

	@Then("User validates the error message as {string} of invalid Employee ID")
	public void user_validates_the_error_message_as_of_invalid_Employee_ID(String string) throws Exception {
		Thread.sleep(4000);
	   if (!(testBase.isElementVisible(Stratos_Manager_Login_PageObjects.invalidEmployeeIDError, "Invalid Employee ID"))) {
		   	ExceptionHandling.HandleAssertion("Error message not displayed");
	} else
			Logs.info("Error message displayed");   
	}

	@Then("User clicks on Go To Login link and navigate to Manager Login page")
	public void user_clicks_on_Go_To_Login_link_and_navigate_to_Manager_Login_page() throws Exception {
	    testBase.waitForElement(Stratos_Manager_Login_PageObjects.goToLogin, 20);
	    testBase.clickonElement(Stratos_Manager_Login_PageObjects.goToLogin, "Go To Login");
	}

	@Then("User clicks on Request New PIN button on Forgot Your Pin page to validate null Employee ID")
	public void user_clicks_on_Request_New_PIN_button_on_Forgot_Your_Pin_page_to_validate_null_Employee_ID() throws Exception {
		testBase.waitForElement(Stratos_Manager_Login_PageObjects.requestNewPin, 20);
	    testBase.clickonElement(Stratos_Manager_Login_PageObjects.requestNewPin, "Request New Pin");
	}

	@Then("User validates the error message as {string} of null Employee ID")
	public void user_validates_the_error_message_as_of_null_Employee_ID(String string) throws Exception {
		if (!(testBase.isElementVisible(Stratos_Manager_Login_PageObjects.invalidEmployeeIDError, "Invalid Employee ID"))) {
		   	ExceptionHandling.HandleAssertion("Error message not displayed");
	} else
			Logs.info("Error message displayed");
	}

	@Then("User enters valid Employee ID as {string}")
	public void user_enters_valid_Employee_ID_as(String string) throws Exception {
	   testBase.waitForElement(Stratos_Manager_Login_PageObjects.employeeID, 20);
	   testBase.typeinTextBox(Stratos_Manager_Login_PageObjects.employeeID, Stratos_Admin_Employees.employeeID, "Employee ID");
	}

	@Then("User validates the success message as {string} of valid Employee ID")
	public void user_validates_the_success_message_as_of_valid_Employee_ID(String string) throws Exception {
		if (!(testBase.isElementVisible(Stratos_Manager_Login_PageObjects.validEmployeeIDSuccess, "Valid Employee ID"))) {
		   	ExceptionHandling.HandleAssertion("Success message not displayed");
	} else
			Logs.info("Success message displayed");
	    
	}
	
}