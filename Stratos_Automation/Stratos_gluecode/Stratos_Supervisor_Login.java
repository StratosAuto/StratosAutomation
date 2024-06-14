package Stratos_gluecode;

import Stratos_pageObjects.Stratos_supervisor_login;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import io.cucumber.java.en.*;

public class Stratos_Supervisor_Login {
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "SupervisorLogin";
	public static String validemployeePin;
	public static String invalidemployeePin;
	public static String invalidEmployeeId;
	public static String ValidEmployeeId;
	public static String FiveDigitPin;
	
	
	@Then("User click on log in as employee")
	public void user_click_on_log_in_as_employee() throws Exception {
		testBase.waitForElement(Stratos_supervisor_login.loginAsemoloyeeBuuton, 20);
		testBase.clickonElement(Stratos_supervisor_login.loginAsemoloyeeBuuton, "login as employee button");
		
	}

	@Then("User enter the valid pin as {string} in employee login page")
	public void user_enter_the_valid_pin_as_in_employee_login_page(String string) throws Exception {
		testBase.waitForElement(Stratos_supervisor_login.enter5DigitPinField, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		validemployeePin = Excel_Utility.getCellData(1, 0);
		testBase.typeinTextBox(Stratos_supervisor_login.enter5DigitPinField, validemployeePin, "employeePin");
		
		
	}

	@Then("User click on login button")
	public void user_click_on_login_button() throws Exception {
		testBase.waitForElement(Stratos_supervisor_login.loginButton, 20);
		testBase.clickonElement(Stratos_supervisor_login.loginButton, "login button");
//		Thread.sleep(8000);
	    
	}
	
	@Then("User verifies the success message as {string}")
	public void user_verifies_the_success_message_as(String string) throws Exception {
	    testBase.waitForElement(Stratos_supervisor_login.successMessage, 20);
	    String s=testBase.getElementText(Stratos_supervisor_login.successMessage, "successmessage");
	    System.out.println(s);
	    Thread.sleep(2000);
//	    testBase.takeScreenshot(s);
	    
	}
	
	@Then("User verifies the error message as {string}")
	public void user_verifies_the_error_message_as(String string) throws Exception {
//		testBase.waitForElement(Stratos_supervisor_login.errorMessageForEmpty, 20);
	    String s=testBase.getElementText(Stratos_supervisor_login.errorMessageForEmpty, "errorMessageForEmpty");
	    System.out.println(s);
	    Thread.sleep(6000);
	   
	}
	
	@Then("User verifies the invalid data error message as {string}")
	public void user_verifies_the_invalid_data_error_message_as(String string) throws Exception {
		testBase.waitForElement(Stratos_supervisor_login.invalidDataErrorMessage, 20);
	    String s=testBase.getElementText(Stratos_supervisor_login.invalidDataErrorMessage, "errorMessageForEmpty");
	    System.out.println(s);
	     
	}
	
	@Then("User enter the invalid pin as {string} in employee login page")
	public void user_enter_the_invalid_pin_as_in_employee_login_page(String string) throws Exception {
		testBase.waitForElement(Stratos_supervisor_login.enter5DigitPinField, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		invalidemployeePin = Excel_Utility.getCellData_Integer(1, 1);
		testBase.typeinTextBox(Stratos_supervisor_login.enter5DigitPinField, String.valueOf(invalidemployeePin), "employeePin");
		Thread.sleep(4000);
	}
	
	@Then("User click on forgot pin button")
	public void user_click_on_forgot_pin_button() throws Exception {
		testBase.waitForElement(Stratos_supervisor_login.forgotPin, 20);
		testBase.clickonElement(Stratos_supervisor_login.forgotPin, "forgotPin");
		Thread.sleep(4000);
	}

	@Then("User enter the invalid employee id as {string} in request new pin page")
	public void user_enter_the_invalid_employee_id_as_in_request_new_pin_page(String string) throws Exception {
		testBase.waitForElement(Stratos_supervisor_login.enterEmployeeIdField, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		invalidEmployeeId = Excel_Utility.getCellData(1, 0);
		testBase.typeinTextBox(Stratos_supervisor_login.enterEmployeeIdField, invalidEmployeeId, "employeeId");
		Thread.sleep(4000);
	    
	}

	@Then("User click on request new pin button")
	public void user_click_on_request_new_pin_button() throws Exception {
		testBase.waitForElement(Stratos_supervisor_login.requestNewPinButton, 20);
		testBase.clickonElement(Stratos_supervisor_login.requestNewPinButton, "requestNewPinButton");
		 Thread.sleep(5000);
	}

	@Then("User verifies the error message")
	public void user_verifies_the_error_message() throws Exception {
		//testBase.waitForElement(Stratos_supervisor_login.inavlidEmployeeIDError, 20);
		String s=testBase.getElementText(Stratos_supervisor_login.inavlidEmployeeIDError, "invalidDataErrorMessage");
		System.out.println(s);
	   Thread.sleep(2000);
	}

	@Then("User enter the valid employee id")
	public void user_enter_the_valid_employee_id() throws Exception {
		testBase.waitForElement(Stratos_supervisor_login.enterEmployeeIdField, 20);
	    testBase.clearTextbox(Stratos_supervisor_login.enterEmployeeIdField, "enterEmployeeIdField");
	    Thread.sleep(6000);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		ValidEmployeeId = Excel_Utility.getCellData(1, 2);
		testBase.typeinTextBox(Stratos_supervisor_login.enterEmployeeIdField, ValidEmployeeId, "employeeId");
		Thread.sleep(4000);
	}

	@Then("User verifies the success message and navigates to request new pin page")
	public void user_verifies_the_success_message_and_navigates_to_request_new_pin_page() throws Exception {
		testBase.waitForElement(Stratos_supervisor_login.employeeIdSuccessmessage, 20);
		String s=testBase.getElementText(Stratos_supervisor_login.employeeIdSuccessmessage, "employeeIdSuccessmessage");
		System.out.println(s);
	    Thread.sleep(2000);
	   
	}

	@Then("User enter the {int} didgit pin as {string} in request new pin page")
	public void user_enter_the_didgit_pin_as_in_request_new_pin_page(Integer int1, String string) throws Exception {
	    testBase.waitForElement(Stratos_supervisor_login.enter5DigitPinField, 20);
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	    FiveDigitPin = Excel_Utility.getCellData(1, 0);
		testBase.typeinTextBox(Stratos_supervisor_login.enterEmployeeIdField, FiveDigitPin, "employeeId");
		Thread.sleep(4000);
	}

	@Then("User capture the error message")
	public void user_capture_the_error_message() {
		
	   
	}


}
