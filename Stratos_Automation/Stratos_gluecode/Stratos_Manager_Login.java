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
		String pin=Excel_Utility.getCellData_Integer(1, 2);
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
	
}