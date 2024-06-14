package Stratos_gluecode;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Stratos_pageObjects.Stratos_Admin_3rdPartyProviders_PageObjects;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.*;

public class Stratos_Admin_3rdPartyProvider {
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "3RD PARTY PROVIDER";
	String updatedVatNumber;
	String updateOtherContact;
	String activeFilterData;
	String inactiveFilterData;

	@Given("User clicks on 3rd Party Provider in the menu")
	public void user_clicks_on_3rd_Party_Provider_in_the_menu() throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.provider, 15);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.provider, "3rd Party Provider");
	}

	@Given("User clicks on Add New Provider button")
	public void user_clicks_on_Add_New_Provider_button() throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.addNewProviderButton, 20);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.addNewProviderButton, "Add New Provider button");
	}

	@Given("Verify that user able to enter invalid data in Add Provider page")
	public void verify_that_user_able_to_enter_invalid_data_in_Add_Provider_page() throws Exception {
		String mobileNumber = testBase.randomAlphanumeric(7);
		String otherContactNumber = testBase.randomAlphanumeric(7);
		String emailAddress = testBase.randomAlphanumeric(5) + "om";
		String faxNumber = testBase.randomAlphanumeric(7);
		String vatNumber = testBase.randomAlphanumeric(7);
		String postalCode = testBase.randomAlphanumeric(3);

//	  Invalid Mobile Number
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.mobileNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.mobileNumber, mobileNumber, "Mobile Number");

//	  Invalid Other Contact Number
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.otherContactNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.otherContactNumber, otherContactNumber,"Other Contact Number");

//	  Invalid Email Address
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.emailAddress, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.emailAddress, emailAddress, "Email Address");
//	  Invalid Fax Number
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.faxNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.faxNumber, faxNumber, "Fax Number");

//	  Invalid Vat Number
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.vatNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.vatNumber, vatNumber, "Vat Number");

//	  Invalid Postal Code
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.postalCode, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.postalCode, postalCode, "Postal Code");
		
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.mobileNumber, "Mobile Number");
	}

	@Then("User Validates the error messages of Invalid data of all the feilds")
	public void user_Validates_the_error_messages_of_Invalid_data_of_all_the_feilds() throws Exception {
		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorMobileNumber,
				"Give Correct Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		} else
			Logs.info("Give Correct Mobile Number element is visible");

		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorOtherContactNumber,
				"Give Correct Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		} else
			Logs.info("Give Correct Mobile Number element is visible");

		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorEmailAddress,
				"Enter valid Email Address"))) {
			ExceptionHandling.HandleAssertion("Enter valid Email Address element is not visible");
		} else
			Logs.info("Enter valid Email Address element is visible");

		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorFaxNumber,
				"Give Correct Fax Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Fax Number element is not visible");
		} else
			Logs.info("Give Correct Fax Number element is visible");

		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorVatNumber,
				"Give Correct Vat Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Vat Number element is not visible");
		} else
			Logs.info("Give Correct Vat Number element is visible");

		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorPostalCode,
				"Give Correct Postal Code"))) {
			ExceptionHandling.HandleAssertion("Give Correct Postal Code element is not visible");
		} else
			Logs.info("Give Correct Postal Code element is visible");
	}

	@Then("User clicks on Cancel button on Add Provider page")
	public void user_clicks_on_Cancel_button_on_Add_Provider_page() throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.cancelButton, 20);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.cancelButton, "Cancel button");
	}

	@Then("Verify that user able to enter invalid field length data in Add Provider page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_Add_Provider_page() throws Exception {

		// Provider Name invalid field length
		String lengthProviderName = testBase.randomAplhabet(26);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.providerName, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.providerName, lengthProviderName, "Provider Name");

		// Mobile Number invalid field length
		String lengthMobileNumber = testBase.randomNumeric(11);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.mobileNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.mobileNumber, lengthMobileNumber, "Mobile Number");

		// Other Contact Number invalid field length
		String lengthOtherContactNumber = testBase.randomNumeric(9);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.otherContactNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.otherContactNumber, lengthOtherContactNumber, "Other Contact Number");

		// Fax Number invalid field length
		String lengthFaxNumber = testBase.randomNumeric(11);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.faxNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.faxNumber, lengthFaxNumber, "Fax Number");

		// Vat Number invalid field length
		String lengthVatNumber = testBase.randomNumeric(11);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.vatNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.vatNumber, lengthVatNumber, "Vat Number");

		// Street invalid field length
		String lengthStreet = testBase.randomAplhabet(101);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.street, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.street, lengthStreet, "Street");

		// Street2 invalid field length
		String lengthStreet2 = testBase.randomAplhabet(101);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.street2, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.street2, lengthStreet2, "Street2");

		// Postal Code invalid field length
		String lengthPostalCode = testBase.randomNumeric(5);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.postalCode, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.postalCode, lengthPostalCode, "Postal Code");

		// Comments invalid field length
		String lengthComments = testBase.randomAplhabet(251);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.comments, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.comments, lengthComments, "Comments");
		
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.mobileNumber, "Mobile Number");
	}

	@Then("User Validates the error messages of Invalid field length data of all the feilds in Add Provider page")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_all_the_feilds_in_Add_Provider_page() throws Exception {

		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.lengthProviderName, "Maximum 25 Characters Allowed."))) {
			ExceptionHandling.HandleAssertion("Maximum 25 Characters Allowed element is not visible");
		} else
			Logs.info("Maximum 25 Characters Allowed element is visible");
		
		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorMobileNumber, "Give Correct Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		} else
			Logs.info("Give Correct Mobile Number element is visible");

		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorOtherContactNumber,"Give Correct Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		} else
			Logs.info("Give Correct Mobile Number element is visible");

		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorFaxNumber, "Give Correct Fax Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Fax Number element is not visible");
		} else
			Logs.info("Give Correct Fax Number element is visible");

		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorVatNumber, "Give Correct Vat Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Vat Number element is not visible");
		} else
			Logs.info("Give Correct Vat Number element is visible");

		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.lengthStreet, "Maximum 100 Characters Allowed."))) {
			ExceptionHandling.HandleAssertion("Maximum 100 Characters Allowed element is not visible");
		} else
			Logs.info("Maximum 100 Characters Allowed element is visible");
		
		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.lengthStreet2, "Maximum 100 characters Allowed."))) {
			ExceptionHandling.HandleAssertion("Maximum 100 characters Allowed element is not visible");
		} else
			Logs.info("Maximum 100 characters Allowed element is visible");

		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorPostalCode, "Give Correct Postal Code"))) {
			ExceptionHandling.HandleAssertion("Give Correct Postal Code element is not visible");
		} else
			Logs.info("Give Correct Postal Code element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.lengthComments, "Maximum 250 characters allowed."))) {
			ExceptionHandling.HandleAssertion("Maximum 250 characters allowed. element is not visible");
		}else
			Logs.info("Maximum 250 characters allowed. element is visible");
	}

	@Then("User clicks on Save and Continue button to validate mandatory fields of Providers")
	public void user_clicks_on_Save_and_Continue_button_to_validate_mandatory_fields_of_Providers() throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.saveAndContinueButton, 20);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.saveAndContinueButton, "Save and Continue");
		if (testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.nullValidate, "Validate Mandatory fields")) {
			ExceptionHandling.HandleAssertion("New provider is created");
		} else
			Logs.info("New provider is not created");
	}

// Creating Active Provider
	
	@Then("User enters Provider Name as {string} in Add Provider page")
	public void user_enters_Provider_Name_as_in_Add_Provider_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String providerName = Excel_Utility.getCellData(1, 0);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.providerName, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.providerName, providerName, "Provider Name");
	}

	@Then("User enters Mobile Number as {string} in Add Provider page")
	public void user_enters_Mobile_Number_as_in_Add_Provider_page(String string) throws Exception {
		String mobileNumber = Excel_Utility.getCellData_Integer(1, 1);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.mobileNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.mobileNumber, String.valueOf(mobileNumber), "Mobile Number");
	}

	@Then("User enters Other Contact as {string} in Add Provider page")
	public void user_enters_Other_Contact_as_in_Add_Provider_page(String string) throws Exception {
		String otherContactNumber = Excel_Utility.getCellData_Integer(1, 2);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.otherContactNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.otherContactNumber, String.valueOf(otherContactNumber), "Other Contact Number");
	}

	@Then("User enters Email Address as {string} in Add Provider page")
	public void user_enters_Email_Address_as_in_Add_Provider_page(String string) throws Exception {
		String emailAddress = Excel_Utility.getCellData(1, 3);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.emailAddress, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.emailAddress, emailAddress, "Email Address");
	}

	@Then("User enters Fax Number as {string} in Add Provider page")
	public void user_enters_Fax_Number_as_in_Add_Provider_page(String string) throws Exception {
		String faxNumber = Excel_Utility.getCellData_Integer(1, 4);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.faxNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.faxNumber, String.valueOf(faxNumber), "Fax Number");
	}

	@Then("User enters Vat Number as {string} in Add Provider page")
	public void user_enters_Vat_Number_as_in_Add_Provider_page(String string) throws Exception {
		String vatNumber = Excel_Utility.getCellData_Integer(1, 5);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.vatNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.vatNumber, String.valueOf(vatNumber), "Vat Number");
	}

	@Then("User selects status as {string} from status dropdown in Add Provider page")
	public void user_selects_status_as_from_status_dropdown_in_Add_Provider_page(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.status, 20);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.status, "Status");
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.active, 20);
		Thread.sleep(3000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.active, "Active");
	}

	@Then("User enters street as {string} in Add Provider page")
	public void user_enters_street_as_in_Add_Provider_page(String string) throws Exception {
		Thread.sleep(3000);
		String street = Excel_Utility.getCellData(1, 6);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.street, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.street, street, "Street");
	}

	@Then("User enters street2 as {string} in Add Provider page")
	public void user_enters_street2_as_in_Add_Provider_page(String string) throws Exception {
		String street2 = Excel_Utility.getCellData(1, 7);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.street2, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.street2, street2, "Street2");
	}

	@Then("User selects City as {string} from City dropdown in Add Provider page")
	public void user_selects_City_as_from_City_dropdown_in_Add_Provider_page(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.city, 20);
		testBase.ClickViaMouse(Stratos_Admin_3rdPartyProviders_PageObjects.city, "City");
		Thread.sleep(2000);
		testBase.ClickViaMouse(Stratos_Admin_3rdPartyProviders_PageObjects.selectCity, "City");
	}

	@Then("User validates valid Province is auto-populated when city is selected")
	public void user_validates_valid_Province_is_auto_populated_when_city_is_selected() throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.province, 20);
		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.province, "Province"))) {
			ExceptionHandling.HandleAssertion("Province is not auto-populated");
		} else
			Logs.info("Province is auto-populated");
	}

	@Then("User selects Country as {string} from country dropdown in Add Provider page")
	public void user_selects_Country_as_from_country_dropdown_in_Add_Provider_page(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.country, 20);
		testBase.ClickViaMouse(Stratos_Admin_3rdPartyProviders_PageObjects.country, "Country");
		Thread.sleep(3000);
		testBase.ClickViaMouse(Stratos_Admin_3rdPartyProviders_PageObjects.selectCountry, "Country");
	}

	@Then("User enters Postal Code as {string} in Add Provider page")
	public void user_enters_Postal_Code_as_in_Add_Provider_page(String string) throws Exception {
		String postalCode = Excel_Utility.getCellData(1, 8);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.postalCode, 20);
		Thread.sleep(3000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.postalCode, String.valueOf(postalCode),"Postal Code");
	}

	@Then("User enters Comments as {string} in Add Provider page")
	public void user_enters_Comments_as_in_Add_Provider_page(String string) throws Exception {
		String comments = Excel_Utility.getCellData(1, 9);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.comments, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.comments, comments, "Comments");
	}

	@Then("User clicks on Save and Continue button")
	public void user_clicks_on_Save_and_Continue_button() throws Exception {
		Thread.sleep(3000);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.saveAndContinueButton, 20);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.saveAndContinueButton, "Save and Continue");
	}

	@Then("User verifies the created Active Provider to validate provider is created")
	public void user_verifies_the_created_provider_to_validate_provider_is_created() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String providerName = Excel_Utility.getCellData(1, 0);
		Thread.sleep(7000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, providerName, "Filter");
		String data=testBase.getElementText(Stratos_Admin_3rdPartyProviders_PageObjects.filterValidates, "Filtered Data");
		if (!(data.contains(providerName))) {
			ExceptionHandling.HandleAssertion("New Active Provider is not created");
		} else
			Logs.info("New Active Provider is created successfully");
	}
	
// Creating Inactive Provider
	
	@Then("User enters Provider Name as {string} in Add Provider page of Inactive")
	public void user_enters_Provider_Name_as_in_Add_Provider_page_of_Inactive(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String providerName = Excel_Utility.getCellData(2, 0);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.providerName, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.providerName, providerName, "Provider Name");
	}

	@Then("User enters Mobile Number as {string} in Add Provider page of Inactive")
	public void user_enters_Mobile_Number_as_in_Add_Provider_page_of_Inactive(String string) throws Exception {
		String mobileNumber = Excel_Utility.getCellData_Integer(2, 1);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.mobileNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.mobileNumber, String.valueOf(mobileNumber), "Mobile Number");
	}

	@Then("User enters Other Contact as {string} in Add Provider page of Inactive")
	public void user_enters_Other_Contact_as_in_Add_Provider_page_of_Inactive(String string) throws Exception {
		String otherContactNumber = Excel_Utility.getCellData_Integer(2, 2);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.otherContactNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.otherContactNumber, String.valueOf(otherContactNumber), "Other Contact Number");
	}

	@Then("User enters Email Address as {string} in Add Provider page of Inactive")
	public void user_enters_Email_Address_as_in_Add_Provider_page_of_Inactive(String string) throws Exception {
		String inactiveEmailAddress = Excel_Utility.getCellData(2, 3);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.emailAddress, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.emailAddress, inactiveEmailAddress, "Email Address");
	}

	@Then("User enters Fax Number as {string} in Add Provider page of Inactive")
	public void user_enters_Fax_Number_as_in_Add_Provider_page_of_Inactive(String string) throws Exception {
		String faxNumber = Excel_Utility.getCellData_Integer(2, 4);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.faxNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.faxNumber, String.valueOf(faxNumber), "Fax Number");
	}

	@Then("User enters Vat Number as {string} in Add Provider page of Inactive")
	public void user_enters_Vat_Number_as_in_Add_Provider_page_of_Inactive(String string) throws Exception {
		String vatNumber = Excel_Utility.getCellData_Integer(2, 5);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.vatNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.vatNumber, String.valueOf(vatNumber), "Vat Number");
	}
	
	@Then("User selects status as {string} from status dropdown in Add Provider page of Inactive")
	public void user_selects_status_as_from_status_dropdown_in_Add_Provider_page_of_Inactive(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.status, 20);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.status, "Status");
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.inactive, 20);
		Thread.sleep(3000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.inactive, "Inactive");
	}
	
	@Then("User enters street as {string} in Add Provider page of Inactive")
	public void user_enters_street_as_in_Add_Provider_page_of_Inactive(String string) throws Exception {
		Thread.sleep(3000);
		String street = Excel_Utility.getCellData(2, 6);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.street, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.street, street, "Street");
	}

	@Then("User enters street2 as {string} in Add Provider page of Inactive")
	public void user_enters_street2_as_in_Add_Provider_page_of_Inactive(String string) throws Exception {
		String street2 = Excel_Utility.getCellData(2, 7);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.street2, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.street2, street2, "Street2");
	}


	@Then("User enters Postal Code as {string} in Add Provider page of Inactive")
	public void user_enters_Postal_Code_as_in_Add_Provider_page_of_Inactive(String string) throws Exception {
		String postalCode = Excel_Utility.getCellData(2, 8);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.postalCode, 20);
		Thread.sleep(3000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.postalCode, String.valueOf(postalCode), "Postal Code");
	}

	@Then("User enters Comments as {string} in Add Provider page of Inactive")
	public void user_enters_Comments_as_in_Add_Provider_page_of_Inactive(String string) throws Exception {
		String comments = Excel_Utility.getCellData(2, 9);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.comments, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.comments, comments, "Comments");
	}
	
	@Then("User verifies the created Inactive Provider to validate provider is created")
	public void user_verifies_the_created_Inactive_Provider_to_validate_provider_is_created() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String providerName = Excel_Utility.getCellData(2, 0);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.inactiveProvider, "Inactive Provider");
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, providerName, "Filter");
		String data=testBase.getElementText(Stratos_Admin_3rdPartyProviders_PageObjects.filterValidates, "Filtered Data");
		if (!(data.contains(providerName))) {
			ExceptionHandling.HandleAssertion("New Inactive Provider is not created");
		} else
			Logs.info("New Inactive Provider is created successfully");
	}

// Active Providers and Inactive Providers filter functionality
	
	@Given("User enters valid Provider Name as {string} on Active Providers")
	public void user_enters_valid_Provider_Name_as_on_Active_Providers(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		activeFilterData = Excel_Utility.getCellData(1, 0);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, activeFilterData, "Filter");
	}

	@Then("User validates the filtered data of Active Provider")
	public void user_validates_the_filtered_data_of_Active_Provider() throws Exception {
		String data = testBase.getElementText(Stratos_Admin_3rdPartyProviders_PageObjects.filterValidates, "Filtered Data");
		if (!(activeFilterData.contains(data))) {
			ExceptionHandling.HandleAssertion("Active Provider Name is not visible under filter");
		} else
			Logs.info("Active Provider Name is visible under filter");
	}

	@Then("User enters invalid Provider Name as {string} on Active Providers")
	public void user_enters_invalid_Provider_Name_as_on_Active_Providers(String string) throws Exception {
		String data = testBase.randomAplhabet(5);
		testBase.clearTextbox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, "Filter");
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, data, "Filter");
		Thread.sleep(5000);
	}

	@Then("User validates the error message as {string} of invalid provider Name")
	public void user_validates_the_error_message_as_of_invalid_provider_Name(String string) throws Exception {
		if(!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorFilter, "Filter Error"))) {
			ExceptionHandling.HandleAssertion(" No data matching the filter element is not visible");
		}else
			Logs.info(" No data matching the filter element is visible");
	}

	@Then("User clicks on Inactive Providers")
	public void user_clicks_on_Inactive_Providers() throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.inactiveProvider, 20);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.inactiveProvider, "Inactive Provider");
	}

	@Then("User enters valid Provider Name as {string} on Inactive Providers")
	public void user_enters_valid_Provider_Name_as_on_Inactive_Providers(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		inactiveFilterData = Excel_Utility.getCellData(2, 0);
		Thread.sleep(3000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, inactiveFilterData, "Inactive Filter");
	}

	@Then("User validates the filtered data of Inactive Provider")
	public void user_validates_the_filtered_data_of_Inactive_Provider() throws Exception {
		String data = testBase.getElementText(Stratos_Admin_3rdPartyProviders_PageObjects.filterValidates, "Filtered Data");
		if (!(inactiveFilterData.contains(data))) {
			ExceptionHandling.HandleAssertion("Inactive Provider Name is not visible");
		} else
			Logs.info("Inactive Provider Name is visible");
	}

	@Then("User enters invalid Provider Name as {string} on Inactive Providers")
	public void user_enters_invalid_Provider_Name_as_on_Inactive_Providers(String string) throws Exception {
		String data1 = testBase.randomAplhabet(5);
		Thread.sleep(3000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, data1, "Filter");
	}

	@Then("User clicks on Items per page dropdown to display items")
	public void user_clicks_on_Items_per_page_dropdown_to_display_items() throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.itemsDropdown, 20);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.itemsDropdown, "Items Dropdown");
	}

	@Then("Users selects the desired number from items per page dropdown")
	public void users_selects_the_desired_number_from_items_per_page_dropdown() throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.itemsDropdownOption, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.itemsDropdownOption, "Items Dropdown Option");
	}

// Manage Provider functionality of Active Providers and Inactive Providers
	
	@Given("User clicks on Manage Provider button")
	public void user_clicks_on_Manage_Provider_button() throws Exception {
		Thread.sleep(5000);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String filterProviderName = Excel_Utility.getCellData(1, 0);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, filterProviderName, "Provider Name");
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.manageProviderButton, 20);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.manageProviderButton, "Manage Provider");
	}

	@Given("User enters Vat Number as {string} in Edit Provider page")
	public void user_enters_Vat_Number_as_in_Edit_Provider_page(String string) throws Exception {
		updatedVatNumber = testBase.randomNumeric(10);
		Thread.sleep(3000);
		testBase.clearTextbox(Stratos_Admin_3rdPartyProviders_PageObjects.vatNumber, "Vat Number");
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.vatNumber, updatedVatNumber, "Vat Number");
	}

	@Given("User clicks on Update button on Edit Provider page")
	public void user_clicks_on_Update_button_on_Edit_Provider_page() throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.updateButton, 20);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.updateButton, "Update");
	}

	@Then("User validates the updates of Active Providers")
	public void user_validates_the_updates_of_Active_Providers() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String filterProviderName = Excel_Utility.getCellData(1, 0);
		Thread.sleep(6000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, filterProviderName, "Provider Name");
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.manageProviderButton, 20);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.manageProviderButton, "Manage Provider");
		Thread.sleep(6000);
		String updatedVatNumber1 = testBase.getTextFromPropertis(Stratos_Admin_3rdPartyProviders_PageObjects.vatNumber);
		if (!(updatedVatNumber.contains(updatedVatNumber1))) {
		    ExceptionHandling.HandleAssertion("Vat Number is not updated");
		} else
		    Logs.info("Vat Number is updated");
	}

	@Then("User clicks on Deactivate button of Providers")
	public void user_clicks_on_Deactivate_button_of_Providers() throws Exception {
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.deactivateButton, "Deactivate Button");
	}

	@Then("User validates the deactivated provider")
	public void user_validates_the_deactivated_provider() throws Exception {
		Thread.sleep(5000);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String filterProviderName = Excel_Utility.getCellData(1, 0);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.inactiveProvider, "Inactive Provider");
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, filterProviderName, "Provider Name");
		String data = testBase.getElementText(Stratos_Admin_3rdPartyProviders_PageObjects.filterValidates, "Filtered Data");
		if (!(filterProviderName.contains(data))) {
			ExceptionHandling.HandleAssertion("Provider is not deactivated");
		} else
			Logs.info("Provider is deactivated");
	}

	@Then("User enters Other Contact Number as {string} in Edit Provider page")
	public void user_enters_Other_Contact_Number_as_in_Edit_Provider_page(String string) throws Exception {
		updateOtherContact = testBase.randomNumeric(10);
		Thread.sleep(5000);
		testBase.clearTextbox(Stratos_Admin_3rdPartyProviders_PageObjects.otherContactNumber, "Other Contact Number");
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.otherContactNumber, updateOtherContact,
				"Other Contact Number");
	}

	@Then("User validates the updates of Inactive Providers")
	public void user_validates_the_updates_of_Inactive_Providers() throws Exception {
		Thread.sleep(5000);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String filterProviderName = Excel_Utility.getCellData(1, 0);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.inactiveProvider, "Inactive Provider");
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, filterProviderName, "Filtered Data");
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.manageProviderButton, "Manage Provider");
		String updateOtherContact1 = testBase.driver.findElement(By.xpath("//input[@formcontrolname='otherNumber']"))
				.getText();
		if (!(updateOtherContact.contains(updateOtherContact1))) {
			ExceptionHandling.HandleAssertion("Other Contact Number is not updated");
		} else
			Logs.info("Other Contact Number is updated");
	}

	@Then("User clicks on Activate button of Providers")
	public void user_clicks_on_Activate_button_of_Providers() throws Exception {
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.activate, "Activate");
	}

	@Then("User validates the activated provider")
	public void user_validates_the_activated_provider() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String filterProviderName = Excel_Utility.getCellData(1, 0);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, "Filter");
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, filterProviderName,
				"Filtered Provider Name");
		String data = testBase.getElementText(Stratos_Admin_3rdPartyProviders_PageObjects.filterValidates, "Filtered Data");
		if (!(filterProviderName.contains(data))) {
			ExceptionHandling.HandleAssertion("Provider is not activated");
		} else
			Logs.info("Provider is activated");
	}

	@Given("User clicks on Bulk Upload button")
	public void user_clicks_on_Bulk_Upload_button() throws Exception {
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.bulkUploadButton, 20);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.bulkUploadButton, "Bulk Upload");
	}

	@Given("User clicks on Select File button and upload 3rd Party Provider bulk file")
	public void user_clicks_on_Select_File_button_and_upload_3rd_Party_Provider_bulk_file() throws Exception {
		Thread.sleep(3000);
//		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.selectFile, "Select File");
		String CSVFile = "Auto-IT/Bulk-Provider-Stable.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);
	}

	@Given("User clicks on Submit button of 3rd Party Provider")
	public void user_clicks_on_Submit_button_of_3rd_Party_Provider() throws Exception {
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.submitButton, "Submit");
	}

	@Then("User validates the success message as {string} of 3rd Party Provider bulk file")
	public void user_validates_the_success_message_as_of_3rd_Party_Provider_bulk_file(String string) throws Exception {
		Thread.sleep(2000);
		if(!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.successFileUpload, "Bulk File Upload"))) {
			ExceptionHandling.HandleAssertion("Bulk upload file is not uploaded");
		}else
			Logs.info("Bulk upload file is uploaded");
		}
	@Then("User clicks on Select File button and not upload invalid 3rd Party Provider bulk file")
	public void user_clicks_on_Select_File_button_and_not_upload_invalid_3rd_Party_Provider_bulk_file() throws Exception {
		String CSVFile = "Auto-IT/Bulk-Provider-Unstable.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);
	}

	@Then("User validates the error message as {string} of invalid Bulk Upload of 3rd Party Provider")
	public void user_validates_the_error_message_as_of_invalid_Bulk_Upload_of_3rd_Party_Provider(String string) throws Exception {
		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorFileUpload, "File Upload"))) {
			ExceptionHandling.HandleAssertion("Invalid bulk upload file is uploaded");
		} else
			Logs.info("Invalid bulk upload file is not uploaded");
	}

	@Then("User clicks on Cancel button bulk upload")
	public void user_clicks_on_Cancel_button_bulk_upload() throws Exception {
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.cancelBulkUpload, "Cancel");
	}

	@Then("User clicks on Select File button and not upload null 3rd Party Provider bulk file")
	public void user_clicks_on_Select_File_button_and_not_upload_null_3rd_Party_Provider_bulk_file() throws Exception {
		Thread.sleep(3000);
		String CSVFile = "Auto-IT/Bulk-Provider-Null.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);
	}

	@Given("User validates the error message as {string} of empty Bulk Upload file")
	public void user_validates_the_error_message_as_of_empty_Bulk_Upload_file(String string) throws Exception {
		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.nullFileUpload, "File Upload"))) {
			ExceptionHandling.HandleAssertion("Null bulk upload file is uploaded");
		} else
			Logs.info("Null file upload file is not uploaded");
	}
}