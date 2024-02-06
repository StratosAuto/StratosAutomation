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
	@Given("User Enter the Stratos application URL")
	public void admin_User_Enter_the_Stratos_application_URL() throws InterruptedException {
			PageBase.OpenBrowser("Browser");
			Thread.sleep(5000);
			String url = Utils.getFileProperty("URL");
			PageBase.driver.get(url);
			Thread.sleep(5000);			
			testBase.RefreshPage();
	}
 
	@Then("User enter the valid username")
	public void admin_User_enter_the_valid_username() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		valid_Username = Excel_Utility.getCellData(1, 0);
		valid_Password = Excel_Utility.getNumericCellData(1, 1);
		testBase.waitForElement(Stratos_Login_PageObjects.email, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.email, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.email, valid_Username, "Enter Email id");
		
	}
 
	@Then("User enter the valid passsword")
	public void admin_User_enter_the_valid_passsword() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.password, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.password, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.password, String.valueOf(valid_Password),
				"Enter password");
	}
 
	@Then("user click on login button")
	public void admin_user_click_on_login_button() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.login_button, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.login_button, "Login");
		Thread.sleep(20000);
	}
 
	@Then("User navigates to home page")
	public void Admin_User_navigates_to_home_page() throws Exception {
		Thread.sleep(10000);
			if (!(testBase.isElementVisible(Stratos_Login_PageObjects.validateLogin, "Login successfull"))) {
				ExceptionHandling.HandleAssertion("User not Login into the application");
			} else {
				Logs.info("User navigated to Homepage");
			}
		}

	@Given("User Enter the Stratos app URL")
	public void admin_User_Enter_the_Stratos_application_URL1() throws InterruptedException {
		PageBase.OpenBrowser("Browser");
		Thread.sleep(5000);
		String url = Utils.getFileProperty("URL");
		PageBase.driver.get(url);
		Thread.sleep(5000);			
		testBase.RefreshPage();
	}
	@Then("User enter the invalid username")
	public void admin_User_enter_the_invalid_username() throws Exception {
		invalid_Username = Excel_Utility.getCellData(2, 0);
		testBase.waitForElement(Stratos_Login_PageObjects.email, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.email, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.email, invalid_Username, "Enter Email id");
	}
 
	@Then("User enter the invalid passsword")
	public void admin_User_enter_the_invalid_passsword() throws Exception {
		invalid_Password = Excel_Utility.getCellData_Integer(2, 1);
		testBase.waitForElement(Stratos_Login_PageObjects.password, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.password, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.password, String.valueOf(invalid_Password),
				"Enter password");
	}
	
	@Then("user click  login button")
	public void admin_user_click_on_login_button1() throws Throwable {
		testBase.waitForElement(Stratos_Login_PageObjects.login_button, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.login_button, "Login");
		Thread.sleep(10000);
	}

 
	@Then("User verifies the error message {string}")
	public void admin_User_verifies_the_error_message(String string) throws Exception {
		if ((testBase.isElementVisible(Stratos_Login_PageObjects.errorMessage, "Login successfully"))) {
			ExceptionHandling.HandleAssertion("Login not successfull");
		}else
			Logs.info("Login successful");		   
   }

//	@Then("Admin User give the empty username")
//	public void admin_User_give_the_empty_username() throws Throwable {
//		invalid_Username = Excel_Utility.getCellData(1, 0);
//		invalid_Password = Excel_Utility.getNumericCellData(1, 1);
//		testBase.waitForElement(Stratos_Login_PageObjects.email, 20);
//		testBase.clickonElement(Stratos_Login_PageObjects.email, "clicked");
//	}
// 
//	@Then("Admin User give the empty passsword")
//	public void admin_User_give_the_empty_passsword() throws Exception {
//		testBase.waitForElement(Stratos_Login_PageObjects.password, 20);
//		testBase.clickonElement(Stratos_Login_PageObjects.password, "clicked");
//		testBase.typeinTextBox(Stratos_Login_PageObjects.password, String.valueOf(valid_Password),
//				"Enter password");
//	}
 
	@Then("User click on login button")
	public void admin_User_click_on_login_button() throws Exception {
		testBase.RefreshPage();
		testBase.waitForElement(Stratos_Login_PageObjects.login_button, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.login_button, "Login");
		Thread.sleep(10000);
	}
	@Then("User verifies the error message {string}")
	public void admin_User_verifies_the_error_message1(String string) throws Exception {
		testBase.getElementText(Stratos_Login_PageObjects.emptyLoginerrormessage, "error message");
		if (!(testBase.isElementVisible(Stratos_Login_PageObjects.emptyLoginerrormessageForEmpltyFileds, "Login successfully"))) {
			ExceptionHandling.HandleAssertion("Login not successfull");
		}else
			Logs.info("Login successful");		
	}

}
