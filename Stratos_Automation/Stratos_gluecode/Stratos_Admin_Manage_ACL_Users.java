package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Admin_3rdPartyProviders_PageObjects;
import Stratos_pageObjects.Stratos_Admin_ManageACL_Users_PageObjects;
import Stratos_pageObjects.Stratos_Admin_Manage_ACL_Roles_PageObjects;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.*;

public class Stratos_Admin_Manage_ACL_Users {
	
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "Manage ACL Users";
	String updateMobileNumber;
	
	@Given("User clicks on Manage ACL Users in the menu")
	public void user_clicks_on_Manage_ACL_Users_in_the_menu() throws Exception {
	    testBase.clickonElement(Stratos_Admin_ManageACL_Users_PageObjects.usersMenu, "Manage ACL Users");  
	}

	@Given("User clicks on Add New User button")
	public void user_clicks_on_Add_New_User_button() throws Exception {
	    testBase.clickonElement(Stratos_Admin_ManageACL_Users_PageObjects.addNewUserButton, "Add New User"); 
	}

	@Given("Verify that user able to enter invalid data in Create user page")
	public void verify_that_user_able_to_enter_invalid_data_in_Create_user_page() throws Exception {
	   String firstName=testBase.randomAlphanumeric(6)+"#!@";
	   String emailAddress=testBase.randomAlphanumeric(5)+"-_-++"+"@gmail.com";
	   String lastName=testBase.randomAlphanumeric(6)+"@#$";
	   String mobileNumber=testBase.randomAlphanumeric(7)+"&@#";
	   
	   testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.firstName, 20);
	   testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.firstName, firstName, "First Name");
	   
	   testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.emailAddress, 20);
	   testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.emailAddress, emailAddress, "Email Address");
	   
	   testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.lastName, 20);
	   testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.lastName, lastName, "Last Name");
	   
	   testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.mobileNumber, 20);
	   testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.mobileNumber, mobileNumber, "Mobile Number");
	   testBase.clickonElement(Stratos_Admin_ManageACL_Users_PageObjects.firstName, "First Name");
	}

	@Then("User Validates the error messages of Invalid data of all the feilds in")
	public void user_Validates_the_error_messages_of_Invalid_data_of_all_the_feilds_in() throws Exception {
		
		if(!(testBase.isElementVisible(Stratos_Admin_ManageACL_Users_PageObjects.invalidName, "First Name"))) {
			ExceptionHandling.HandleAssertion("Give correct name element is not visible");
		}else
	    Logs.info("Give correct name element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_ManageACL_Users_PageObjects.invalidEmailAddress, "Email Address"))) {
			ExceptionHandling.HandleAssertion("Invalid Email Format element is not visible");
		}else
	    Logs.info("Invalid Email Format element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_ManageACL_Users_PageObjects.invalidName, "Last Name"))) {
			ExceptionHandling.HandleAssertion("Give correct name element is not visible");
		}else
	    Logs.info("Give correct name element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_ManageACL_Users_PageObjects.invalidMobileNumber, "Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		}else
	    Logs.info("Give Correct Mobile Number element is visible");
	}

	@Then("Verify that user able to enter invalid field length data in Create User page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_Create_User_page() throws Exception {
		   String firstName=testBase.randomAlphanumeric(26);
		   String password=testBase.randomAlphanumeric(3);
		   String lastName=testBase.randomAlphanumeric(26);
		   String mobileNumber=testBase.randomAlphanumeric(7);
		   String confirmPassword=testBase.randomAlphanumeric(3);
		  
		   testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.firstName, 20);
		   testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.firstName, firstName, "First Name");
		   
		   testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.password, 20);
		   testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.password, password, "Password");
		   
		   testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.lastName, 20);
		   testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.lastName, lastName, "Last Name");
		   
		   testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.mobileNumber, 20);
		   testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.mobileNumber, mobileNumber, "Mobile Number");
		   
		   testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.confirmPassword, 20);
		   testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.confirmPassword, confirmPassword, "Confirm Password");
		   testBase.clickonElement(Stratos_Admin_ManageACL_Users_PageObjects.firstName, "First Name");
	}

	@And ("User clicks on Cancel button on Users")
	public void user_clicks_on_Cancel_button_on_Users() throws Exception {
		testBase.clickonElement(Stratos_Admin_ManageACL_Users_PageObjects.cancelButton, "Cancel Button");
	}
	
	@Then("User Validates the error messages of Invalid field length data of all the feilds in Create User page")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_all_the_feilds_in_Create_User_page() throws Exception {
		if(!(testBase.isElementVisible(Stratos_Admin_ManageACL_Users_PageObjects.fieldLengthFirstName, "First Name"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 characters allowed element is not visible");
		}else
	    Logs.info("Maximum 25 characters allowed is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_ManageACL_Users_PageObjects.fieldLengthPassword, "Password"))) {
			ExceptionHandling.HandleAssertion("Minimum 6 Characters Allowed element is not visible");
		}else
	    Logs.info("Minimum 6 Characters Allowed is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_ManageACL_Users_PageObjects.fieldLengthLastName, "Last Name"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 characters allowed element is not visible");
		}else
	    Logs.info("Maximum 25 characters allowed is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_ManageACL_Users_PageObjects.fieldLengthMobileNumber, "Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		}else
	    Logs.info("Give Correct Mobile Number is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_ManageACL_Users_PageObjects.fieldLengthConfirmPassword, "Confirm Password"))) {
			ExceptionHandling.HandleAssertion("Minimum 6 characters allowed element is not visible");
		}else
	    Logs.info("Minimum 6 characters allowed is visible");
	}
	
	@Then("User clicks on Add button to validate mandatory fields")
	public void user_clicks_on_Add_button_to_validate_mandatory_fields() throws Exception {
	   testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.addButton, 20);
	   testBase.clickonElement(Stratos_Admin_ManageACL_Users_PageObjects.addButton, "Add");
	}

	@Then("User enters First Name as {string} in Create User page")
	public void user_enters_First_Name_as_in_Create_User_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String firstName=Excel_Utility.getCellData(1, 0);
		testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.firstName, 20);
	    testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.firstName, firstName, "First Name");
	}

	@Then("User enters Email Address as {string} in Create User page")
	public void user_enters_Email_Address_as_in_Create_User_page(String string) throws Exception {
		String emailAddress=Excel_Utility.getCellData(1, 1);
		testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.emailAddress, 20);
	    testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.emailAddress, emailAddress, "Email Address");
	}

	@Then("User enters password as {string} in Create User page")
	public void user_enters_password_as_in_Create_User_page(String string) throws Exception {
		String password=Excel_Utility.getCellData_Integer(1, 2);
		testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.password, 20);
	    testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.password, String.valueOf(password), "Password");
	}

	@Then("User selects Role as {string} from Role dropdown in Create User page")
	public void user_selects_Role_as_from_Role_dropdown_in_Create_User_page(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.role, 20);
		testBase.ClickViaMouse(Stratos_Admin_ManageACL_Users_PageObjects.role, "Role");
		testBase.clickonElement(Stratos_Admin_ManageACL_Users_PageObjects.selectRole, "Admin");
	}

	@Then("User enters Last Name as {string} in Create User page")
	public void user_enters_Last_Name_as_in_Create_User_page(String string) throws Exception {
		String lastName=Excel_Utility.getCellData(1, 3);
		testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.lastName, 20);
	    testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.lastName, lastName, "Last Name");
	}

	@Then("User enters Mobile Number as {string} in Create User page")
	public void user_enters_Mobile_Number_as_in_Create_User_page(String string) throws Exception {
		String mobileNumber=Excel_Utility.getCellData_Integer(1, 4);
		testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.mobileNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.mobileNumber, String.valueOf(mobileNumber), "Mobile Number");
	}

	@Then("User enters Confirm Password as {string} in Create User page")
	public void user_enters_Confirm_Password_as_in_Create_User_page(String string) throws Exception {
		String confirmPassword=Excel_Utility.getCellData_Integer(1, 5);
		testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.confirmPassword, 20);
	    testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.confirmPassword, String.valueOf(confirmPassword), "Confirm Password");
	}

	@Then("User selects Gender as {string} from Gender dropdown in Create User page")
	public void user_selects_Gender_as_from_Gender_dropdown_in_Create_User_page(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.gender, 20);
		testBase.ClickViaMouse(Stratos_Admin_ManageACL_Users_PageObjects.gender, "Gender");
	    testBase.ClickViaMouse(Stratos_Admin_ManageACL_Users_PageObjects.selectGender, "Male");
	}

	@Then("User clicks on Add button")
	public void user_clicks_on_Add_button() throws Exception {
		testBase.waitForElement(Stratos_Admin_ManageACL_Users_PageObjects.addButton, 20);
	    testBase.clickonElement(Stratos_Admin_ManageACL_Users_PageObjects.addButton, "Add");
	}

	@Then("User verifies the created user to validate user is created")
	public void user_verifies_the_created_user_to_validate_user_is_created() throws Exception {
		String firstName=Excel_Utility.getCellData(1, 0);
	    Thread.sleep(5000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, firstName, "Filter");
	    String data=testBase.getElementText(Stratos_Admin_3rdPartyProviders_PageObjects.filterValidates, "Filter data");
	    System.out.println(data);
	    if(!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.filterValidates, "Filtered Data"))) {
	    	ExceptionHandling.HandleAssertion("New User is not created");
	    }else
	    	Logs.info("New User is created");
	}

	@Given("User clicks on Manage ACL User button")
	public void user_clicks_on_Manage_ACL_User_button() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String firstName=Excel_Utility.getCellData(1, 0);
	    Thread.sleep(3000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, firstName, "First Name");
	    Thread.sleep(3000);
	    testBase.clickonElement(Stratos_Admin_ManageACL_Users_PageObjects.manageACLUserButton, "Manage ACL User");
	}

	@Given("User enters Mobile Number as {string} in Edit User page")
	public void user_enters_Mobile_Number_as_in_Edit_User_page(String string) throws Exception {
		updateMobileNumber=testBase.randomNumeric(10);
	    Thread.sleep(3000);
	    testBase.clearTextbox(Stratos_Admin_ManageACL_Users_PageObjects.mobileNumber, "Mobile Number");
	    testBase.typeinTextBox(Stratos_Admin_ManageACL_Users_PageObjects.mobileNumber, updateMobileNumber, "Mobile Number");
	}

	@Given("User validates the updates")
	public void user_validates_the_updates() throws Exception {
		String firstName=Excel_Utility.getCellData(1, 0);
	    Thread.sleep(3000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, firstName, "First Name");  
	    testBase.clickonElement(Stratos_Admin_ManageACL_Users_PageObjects.manageACLUserButton, "Manage ACL User");
	    String data=testBase.getElementText(Stratos_Admin_ManageACL_Users_PageObjects.mobileNumber, "Mobile Number");
	    System.out.println(data);
	    if(!(updateMobileNumber.contains(data))) {
	    	ExceptionHandling.HandleAssertion("Mobile Number is not updated");
	    }else
	    	Logs.info("Mobile Number is updated");
	}

	@Given("User enters valid ACL User Ref as {string}")
	public void user_enters_valid_ACL_User_Ref_as(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String firstName=Excel_Utility.getCellData(1, 0);
	    Thread.sleep(3000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, firstName, "First Name");  
	}

	@Then("User validates the filtered data of valid ACL User Ref")
	public void user_validates_the_filtered_data_of_valid_ACL_User_Ref() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String firstName=Excel_Utility.getCellData(1, 0);
		Thread.sleep(3000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, firstName, "Filter");
		String data=testBase.getElementText(Stratos_Admin_3rdPartyProviders_PageObjects.filterValidates, "Filter data");
	    if(!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.filterValidates, "Filtered Data"))) {
	    	ExceptionHandling.HandleAssertion("New User is not created");
	    }else
	    	Logs.info("New User is created");
	}
	
	@Then("User enters invalid ACL User Ref as {string}")
	public void user_enters_invalid_ACL_User_Ref_as(String string) throws Exception {
	    String invalidUserRef=testBase.randomAlphanumeric(10);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, invalidUserRef, "Filter");
	}

	@Then("User validates the error message as {string} of invalid ACL User Ref")
	public void user_validates_the_error_message_as_of_invalid_ACL_User_Ref(String string) {
	    
	    
	}
}