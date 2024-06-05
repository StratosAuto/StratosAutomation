package Stratos_gluecode;

import org.junit.Assert;
import Stratos_pageObjects.Stratos_SignUp_PageObjects;
import Stratos_testBase.PageBase;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import Stratos_utilities.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stratos_SignUp {

	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "Registration";

	@Given("User Enters URL")
	public void user_Enters_URL() throws InterruptedException {
		PageBase.OpenBrowser("Browser");
		Thread.sleep(5000);
		String url = Utils.getFileProperty("URL");
		PageBase.driver.get(url);
		Thread.sleep(5000);
		testBase.RefreshPage();
	}

	@When("User clicks on Sign Up link")
	public void user_clicks_on_Sign_Up_link() throws Throwable {
		testBase.RefreshPage();
		testBase.ScrollDownBottom();
		testBase.waitForElement(Stratos_SignUp_PageObjects.signUp, 20);
		Thread.sleep(10000);
		testBase.clickonElement(Stratos_SignUp_PageObjects.signUp, "Sign Up link");
	}

	@When("User Verify that able to enter invalid data in registration page")
	public void user_Verify_that_able_to_enter_invalid_data_in_registration_page() throws Exception {
		Thread.sleep(3000);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String firstName = testBase.randomAlphanumeric(10)+"76";
		testBase.waitForElement(Stratos_SignUp_PageObjects.firstName, 20);
		testBase.clickonElement(Stratos_SignUp_PageObjects.firstName, "first name");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.firstName, firstName, "first name");

		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String lastName = testBase.randomAlphanumeric(10)+"98";
		testBase.waitForElement(Stratos_SignUp_PageObjects.lastName, 20);
		testBase.clickonElement(Stratos_SignUp_PageObjects.lastName, "Last Name");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.lastName, lastName, "Last Name");

		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String emailAdress = testBase.randomAlphanumeric(20);
		testBase.waitForElement(Stratos_SignUp_PageObjects.emailAddress, 20);
		testBase.clickonElement(Stratos_SignUp_PageObjects.emailAddress, "Email Address");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.emailAddress, emailAdress, "Email Address");
		
		String mobileNumber=testBase.randomAlphanumeric(7)+"%$@";
		testBase.waitForElement(Stratos_SignUp_PageObjects.mobileNumber, 20);
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.mobileNumber, mobileNumber, "Mobile Number");
		testBase.waitForElement(Stratos_SignUp_PageObjects.registerButton, 20);
		testBase.ClickViaMouse(Stratos_SignUp_PageObjects.registerButton, "register button");

//		String s=testBase.getElementText(Stratos_SignUp_PageObjects.invalidDataError, "error");
//		System.out.println(s);
//		String data=testBase.getElementText(Stratos_SignUp_PageObjects.invalidDataError, "Error");
//	    System.out.println(data);
	}

	@Then("User Validates the error messages of Invalid data of all the feilds on sign up page")
	public void user_Validates_the_error_messages_of_Invalid_data_of_all_the_feilds_on_sign_up_page() throws Exception {

		String expectederrormsg ="No Numbers Allowed.";
		String Actualmsg= testBase.getElementText(Stratos_SignUp_PageObjects.firstNameInvalidError, "firsterror");
		Assert.assertEquals(expectederrormsg, Actualmsg);
		
		if (!(testBase.isElementVisible(Stratos_SignUp_PageObjects.firstNameInvalidError, "First Name"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 Characters Allowed. element is not visible");
		} else
			Logs.info("Maximum 25 Characters Allowed. element is visible");

		if (!(testBase.isElementVisible(Stratos_SignUp_PageObjects.lastNameInvalidError, "Last Name"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 Characters Allowed. element is not visible");
		} else
			Logs.info("Maximum 25 Characters Allowed. element is visible");

		if (!(testBase.isElementVisible(Stratos_SignUp_PageObjects.emailAddressInvalidError, "Email Address"))) {
			ExceptionHandling.HandleAssertion("Invalid Valid Email Address element is nor visible");
		} else
			Logs.info("Invalid Valid Email Address element is visible");

		if (!(testBase.isElementVisible(Stratos_SignUp_PageObjects.mobileNumberInvaidError, "Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		} else
			Logs.info("Give Correct Mobile Number element is visible");

	}

	@Then("User click on goback button")
	public void user_click_on_goback_button() throws Exception {
		testBase.waitForElement(Stratos_SignUp_PageObjects.goBackButton, 20);
		testBase.ClickViaMouse(Stratos_SignUp_PageObjects.goBackButton, "goa back button");

	}

	@Then("Verify that user able to enter invalid field length data in Registration page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_Registration_page() throws Exception {

		String firstName = testBase.randomAlphanumeric(26);
		testBase.waitForElement(Stratos_SignUp_PageObjects.firstName, 20);
		testBase.clickonElement(Stratos_SignUp_PageObjects.firstName, "first name");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.firstName, firstName, "first name");

		String lastName = testBase.randomAplhabet(26);
		testBase.waitForElement(Stratos_SignUp_PageObjects.lastName, 20);
		testBase.clickonElement(Stratos_SignUp_PageObjects.lastName, "click on first name");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.lastName, lastName, "enter first name");

		String password = testBase.randomAlphanumeric(4);
		testBase.waitForElement(Stratos_SignUp_PageObjects.passWord, 20);
		testBase.clickonElement(Stratos_SignUp_PageObjects.passWord, "click on first name");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.passWord, password, "password");

		String confirmPassword = testBase.randomAlphanumeric(4);
		testBase.waitForElement(Stratos_SignUp_PageObjects.confirmPassord, 20);
		testBase.clickonElement(Stratos_SignUp_PageObjects.confirmPassord, "click on first name");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.confirmPassord, confirmPassword, "confirmPassord");

	}

	@Then("User Validates the error messages of Invalid field length data of all the feilds on sign up page")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_all_the_feilds_on_sign_up_page() throws Exception {

		if (!(testBase.isElementVisible(Stratos_SignUp_PageObjects.firstNameFieldLength, "error message"))) {
			ExceptionHandling.HandleAssertion("error message not displayed");
		} else
			Logs.info("error message displayed");

		if (!(testBase.isElementVisible(Stratos_SignUp_PageObjects.lastNameFieldLength, "error message"))) {
			ExceptionHandling.HandleAssertion("error message not displayed");
		} else
			Logs.info("error message displayed");

		if (!(testBase.isElementVisible(Stratos_SignUp_PageObjects.passwordFieldLength, "error message"))) {
			ExceptionHandling.HandleAssertion("error message not displayed");
		} else
			Logs.info("error message displayed");
	}

	@When("User enters First Name as {string} in registrtion page")
	public void user_enters_First_Name_as_in_registrtion_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String firstName = Excel_Utility.getCellData(1, 0);
		testBase.waitForElement(Stratos_SignUp_PageObjects.firstName, 20);
		testBase.clickonElement(Stratos_SignUp_PageObjects.firstName, "first name");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.firstName, firstName, "first name");

	}

	@When("User enters Last Name as {string} in registrtion page")
	public void user_enters_Last_Name_as_in_registrtion_page(String string) throws Exception {

		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String lastName = Excel_Utility.getCellData(1, 1);
		testBase.waitForElement(Stratos_SignUp_PageObjects.lastName, 20);
//		testBase.clickonElement(Stratos_SignUp_PageObjects.lastName, "click on first name");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.lastName, lastName, "enter last name");

	}

	@When("User enters Email address as {string} in registrtion page")
	public void user_enters_Email_address_as_in_registrtion_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String emailAdress = Excel_Utility.getCellData(1, 2);
		testBase.waitForElement(Stratos_SignUp_PageObjects.emailAddress, 20);
//		testBase.clickonElement(Stratos_SignUp_PageObjects.emailAddress, "click on first name");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.emailAddress, emailAdress, "enter amaila adress");

	}

	@When("User enters Mobile number as {string} in registrtion page")
	public void user_enters_Mobile_number_as_in_registrtion_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String mobileNumber = Excel_Utility.getCellData_Integer(1, 3);
		testBase.waitForElement(Stratos_SignUp_PageObjects.mobileNumber, 20);
//		testBase.clickonElement(Stratos_SignUp_PageObjects.mobileNumber, "mobile number");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.mobileNumber, String.valueOf(mobileNumber), "mobile number");

	}

	@When("User enters Password on Sign Up page as {string} in registrtion page")
	public void user_enters_Password_on_Sign_Up_page_as_in_registrtion_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String password = Excel_Utility.getCellData_Integer(1, 4);
		testBase.waitForElement(Stratos_SignUp_PageObjects.passWord, 20);
//		testBase.clickonElement(Stratos_SignUp_PageObjects.passWord, "passWord");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.passWord, String.valueOf(password), "pasWord");
	}

	@When("User enters Confirm Password as {string} in registrtion page")
	public void user_enters_Confirm_Password_as_in_registrtion_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String Confirmpassword = Excel_Utility.getCellData_Integer(1, 5);
		testBase.waitForElement(Stratos_SignUp_PageObjects.confirmPassord, 20);
//		testBase.clickonElement(Stratos_SignUp_PageObjects.confirmPassord, "Confirmpassword");
		testBase.typeinTextBox(Stratos_SignUp_PageObjects.confirmPassord, String.valueOf(Confirmpassword),
				"Confirmpassword");
		Thread.sleep(5000);

	}

	@When("User select Role from the dropdown")
	public void user_select_Role_from_the_dropdown() throws Throwable {
//		testBase.waitForElement(Stratos_SignUp_PageObjects.roleDropdown, 20);
//		testBase.ClickViaMouse(Stratos_SignUp_PageObjects.roleDropdown, "role dropdown");
//		Thread.sleep(5000);
////		testBase.dropdownSelectElement(Stratos_SignUp_PageObjects.roleDropdown, " Clients ");			
////		testBase.isElementVisible(Stratos_SignUp_PageObjects.roleDropdown, "6576b8813b9019c0ab11d7e6");
//		testBase.waitForElement(Stratos_SignUp_PageObjects.selectroleDropdown, 20);
//		testBase.ClickViaMouse(Stratos_SignUp_PageObjects.selectroleDropdown, "role dropdown");
		String role="Admin";
		testBase.dropdownSelectElement(Stratos_SignUp_PageObjects.roleDropdown,  role );
	}

	@When("User select Gender as {string} in registrtion page")
	public void user_select_Gender_as_in_registrtion_page(String string) throws Exception {
		testBase.waitForElement(Stratos_SignUp_PageObjects.gender, 20);
//		testBase.clickonElement(Stratos_SignUp_PageObjects.gender, "gender");
		testBase.clickonElement(Stratos_SignUp_PageObjects.gender, "gender");

	}

	@Then("User clicks on Register button")
	public void user_clicks_on_Register_button() throws Exception {
		testBase.waitForElement(Stratos_SignUp_PageObjects.registerButton, 20);
		testBase.clickonElement(Stratos_SignUp_PageObjects.registerButton, "registration button");

	}

	@Then("User  navigates to Login Page")
	public void user_navigates_to_Login_Page() throws Exception {
		testBase.takeScreenshot("login page");

	}
}