package Stratos_gluecode;

import Stratos_testBase.PageBase;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import Stratos_utilities.Utils;
import io.cucumber.java.en.*;
import Stratos_pageObjects.Stratos_Login_PageObjects;

public class Stratos_Login {
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "LOGIN";
	public static int valid_Password;
	public static String valid_Username;
	public static String invalid_Password;
	public static String invalid_Username;
	
	@Given("Admin User Enter the Stratos application URL")
	public void Admin_User_Enter_the_Stratos_application_URL() throws InterruptedException {
			PageBase.OpenBrowser("Browser");
			String url = Utils.getFileProperty("URL");
			PageBase.driver.get(url);			
			testBase.RefreshPage();
	}
 
	@Then("Admin User enter the valid username")
	public void Admin_User_enter_the_valid_username() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		valid_Username = Excel_Utility.getCellData(1, 0);
		valid_Password = Excel_Utility.getNumericCellData(1, 1);
		testBase.waitForElement(Stratos_Login_PageObjects.email, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.email, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.email, valid_Username, "Enter Email id");
	}
 
	@Then("Admin User enter the valid password")
	public void Admin_User_enter_the_valid_passsword() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.password, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.password, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.password, String.valueOf(valid_Password),
				"Enter password");
	}
 
	@Then("Admin User click on Login button")
	public void Admin_User_click_on_Login_button() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.loginSubmitutton, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.loginSubmitutton, "Login");
		Thread.sleep(20000);
	}
 
	@Then("Admin User navigates to home page")
	public void Admin_User_navigates_to_home_page() throws Exception {
			Thread.sleep(5000);
			if (!(testBase.isElementVisible(Stratos_Login_PageObjects.validateLogin, "Login successfull"))) {
				ExceptionHandling.HandleAssertion("User not Login into the application");
			} else {
				Logs.info("User navigated to Homepage");
			}
			Thread.sleep(3000);
		
	}
	@Then("Admin User enter the invalid username")
	public void Admin_User_enter_the_invalid_username() throws Exception {
		invalid_Username = Excel_Utility.getCellData(2, 0);
		testBase.waitForElement(Stratos_Login_PageObjects.email, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.email, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.email, invalid_Username, "Enter Email id");
	}
 
	@Then("Admin User enter the invalid passsword")
	public void Admin_User_enter_the_invalid_passsword() throws Exception {
		invalid_Password = Excel_Utility.getCellData_Integer(2, 1);
		testBase.waitForElement(Stratos_Login_PageObjects.password, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.password, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.password, String.valueOf(invalid_Password),
				"Enter password");
	}

	@Then("Admin User verifies the error message {string}")
	public void Admin_User_verifies_the_error_message(String string) throws Exception {
		Thread.sleep(2000);
		if (!(testBase.isElementVisible(Stratos_Login_PageObjects.errorMessage, "Login unsuccesfull"))) {
			ExceptionHandling.HandleAssertion("Login successfull");
		}else
			Logs.info("Login unsuccessfull");	   
   }
	
	@Then("Admin User click on the forgot pin link")
	public void Admin_User_click_on_the_forgot_pin_link() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.forgotPasswordLink, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.forgotPasswordLink, "forgot password");
	   
	}

	@Then("Admin User enter the valid email address as {string} in forgot password page")
	public void Admin_User_enter_the_valid_email_address_as_in_forgot_password_page(String string) throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.forgotPinEmailAddress, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		valid_Username = Excel_Utility.getCellData(1, 0);
		testBase.clickonElement(Stratos_Login_PageObjects.forgotPinEmailAddress, "email address");
		testBase.typeinTextBox(Stratos_Login_PageObjects.forgotPinEmailAddress, valid_Username, "valid_Username");
	    
	}

	@Then("Admin User click on the submit button")
	public void Admin_User_click_on_the_submit_button() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.forgotPinSubmitButton, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.forgotPinSubmitButton, "submt button");
	    }

	@Then("Admin User verify the success message and user navigates to forgot password page")
	public void Admin_User_verify_the_success_message_and_user_navigates_to_forgot_password_page() throws Exception {
		if (!(testBase.isElementVisible(Stratos_Login_PageObjects.forgotpinemailSuccessMessage, "successmesage"))) {
			ExceptionHandling.HandleAssertion("updatded not successfully");
	}else
		Logs.info("updatded successfully");		
		Thread.sleep(2000);
	}

	@Then("Admin User enter the create new passowrd as {string} in forgot password page")
	public void Admin_User_enter_the_create_new_passowrd_as_in_forgot_password_page(String string) throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.forgotPinCreatPasswordfield, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String valid_Password = Excel_Utility.getCellData_Integer(1, 1);
		testBase.typeinTextBox(Stratos_Login_PageObjects.forgotPinCreatPasswordfield, valid_Password, "password");
		
	    
	}

	@Then("Admin User enter the confirm new password as {string} in confirm password page")
	public void Admin_User_enter_the_confirm_new_password_as_in_confirm_password_page(String string) throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.forgotPinConfirmPAssword, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		 String valid_Password = Excel_Utility.getCellData_Integer(1, 1);
		testBase.typeinTextBox(Stratos_Login_PageObjects.forgotPinConfirmPAssword, valid_Password, "forgotPinConfirmPAssword");
		
	    
	}

	@Then("Admin User Click on the submit button")
	public void Admin_User_Click_on_the_submit_button() throws Exception {
	   testBase.waitForElement(Stratos_Login_PageObjects.forgotPinSubmitButton, 20);
	   testBase.clickonElement(Stratos_Login_PageObjects.forgotPinSubmitButton, "submit button");
	}

	@Then("Admin User verifies the success message as\"Password Updated Successfully\"")
	public void Admin_User_verifies_the_success_message_as_Password_Updated_Successfully() throws Exception {
		 testBase.waitForElement(Stratos_Login_PageObjects.passwordUpdatedSucesfullyMessage, 20);
		if (!(testBase.isElementVisible(Stratos_Login_PageObjects.passwordUpdatedSucesfullyMessage, "successmesage"))) {
			ExceptionHandling.HandleAssertion("password not changed");
	}else
		Logs.info("password not changed successfully");		     
	}
	


}

