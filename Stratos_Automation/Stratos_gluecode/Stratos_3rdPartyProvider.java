package Stratos_gluecode;

import Stratos_pageObjects.Stratos_3rdPartyProviders_PageObjects;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.*;

public class Stratos_3rdPartyProvider {
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "3RD PARTY PROVIDER";
	
	
	
	@Given("User clicks on 3rd Party Provider in the menu")
	public void user_clicks_on_3rd_Party_Provider_in_the_menu() throws Exception {
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.provider, 15);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.provider, "3rd Party Provider");
	}

	@Given("User clicks on Add New Provider button")
	public void user_clicks_on_Add_New_Provider_button() throws Exception {
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.addNewProviderButton, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.addNewProviderButton, "Add New Provider");
	}

	@Given("Verify that user able to enter invalid data in Add Provider page")
	public void verify_that_user_able_to_enter_invalid_data_in_Add_Provider_page() throws Exception {
		String mobileNumber = "@!#" + testBase.randomAlphanumeric(7);
		String otherContactNumber = "!*%" + testBase.randomAlphanumeric(7);
		String emailAddress = testBase.randomAlphanumeric(5) + ".com";
		String faxNumber = "*@%" + testBase.randomAlphanumeric(7);
		String vatNumber = "!%$" + testBase.randomAlphanumeric(7);
		String postalCode = "#" + testBase.randomAlphanumeric(3);

//	  Invalid Mobile Number
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.mobileNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.mobileNumber, "Mobile Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.mobileNumber, mobileNumber, "Mobile Number");

//	  Invalid Other Contact Number
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, "Other Contact Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, otherContactNumber,
				"Other Contact Number");

//	  Invalid Email Address
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.emailAddress, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.emailAddress, "Email Address");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.emailAddress, emailAddress, "Email Address");
//	  Invalid Fax Number
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.faxNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.faxNumber, "Fax Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.faxNumber, faxNumber, "Fax Number");

//	  Invalid Vat Number
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.vatNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.vatNumber, "Vat Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.vatNumber, vatNumber, "Vat Number");

//	  Invalid Postal Code
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.postalCode, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.postalCode, "Postal Code");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.postalCode, postalCode, "Postal Code");
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.mobileNumber, "");
	}

	@Then("User Validates the error messages of Invalid data of all the feilds")
	public void user_Validates_the_error_messages_of_Invalid_data_of_all_the_feilds() throws Exception {
		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.errorMobileNumber,
				"Give Correct Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		} else
			Logs.info("Give Correct Mobile Number element is visible");

		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.errorOtherContactNumber,
				"Give Correct Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		} else
			Logs.info("Give Correct Mobile Number element is visible");

		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.errorEmailAddress,
				"Enter valid Email Address"))) {
			ExceptionHandling.HandleAssertion("Enter valid Email Address element is not visible");
		} else
			Logs.info("Enter valid Email Address element is visible");

		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.errorFaxNumber,
				"Give Correct Fax Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Fax Number element is not visible");
		} else
			Logs.info("Give Correct Fax Number element is visible");

		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.errorVatNumber,
				"Give Correct Vat Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Vat Number element is not visible");
		} else
			Logs.info("Give Correct Vat Number element is visible");

		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.errorPostalCode,
				"Give Correct Postal Code"))) {
			ExceptionHandling.HandleAssertion("Give Correct Postal Code element is not visible");
		} else
			Logs.info("Give Correct Postal Code element is visible");
	}

	@Then("User clicks on Cancel button")
	public void user_clicks_on_Cancel_button() throws Exception {
		Thread.sleep(10000);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.cancelButton, "Cancel");
	}

	@Then("Verify that user able to enter invalid field length data in Add Provider page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_Add_Provider_page() throws Exception {
// Provider Name invalid field length
		String lengthProviderName = testBase.randomAplhabet(26);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.providerName, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.providerName, "Provider Name");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.providerName, lengthProviderName, "Provider Name");
// Mobile Number invalid field length
		String lengthMobileNumber = testBase.randomNumeric(11);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.mobileNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.mobileNumber, "Mobile Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.mobileNumber, lengthMobileNumber, "Mobile Number");
// Other Contact Number invalid field length
		String lengthOtherContactNumber = testBase.randomNumeric(9);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, "Other Contact Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, lengthOtherContactNumber,
				"Other Contact Number");
// Fax Number invalid field length
		String lengthFaxNumber = testBase.randomNumeric(11);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.faxNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.faxNumber, "Fax Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.faxNumber, lengthFaxNumber, "Fax Number");
// Vat Number invalid field length
		String lengthVatNumber = testBase.randomNumeric(11);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.vatNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.vatNumber, "Vat Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.vatNumber, lengthVatNumber, "Vat Number");
// Street invalid field length
		String lengthStreet = testBase.randomAplhabet(101);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.street, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.street, "Street");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.street, lengthStreet, "Street");
// Street2 invalid field length
		String lengthStreet2 = testBase.randomAplhabet(101);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.street2, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.street2, "Street2");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.street2, lengthStreet2, "Street2");
// Postal Code invalid field length
		String lengthPostalCode = testBase.randomNumeric(5);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.postalCode, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.postalCode, "Postal Code");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.postalCode, lengthPostalCode, "Postal Code");
// Comments invalid field length
		String lengthComments = testBase.randomAplhabet(251);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.comments, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.comments, "Comments");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.comments, lengthComments, "Comments");
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.mobileNumber, "");
	}

	@Then("User Validates the error messages of Invalid field length data of all the feilds")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_all_the_feilds() throws Exception {

		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.lengthProviderName,
				"Maximum 25 Characters Allowed."))) {
			ExceptionHandling.HandleAssertion("Maximum 25 Characters Allowed element is not visible");
		} else
			Logs.info("Maximum 25 Characters Allowed element is visible");
		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.errorMobileNumber,
				"Give Correct Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		} else
			Logs.info("Give Correct Mobile Number element is visible");

		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.errorOtherContactNumber,
				"Give Correct Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		} else
			Logs.info("Give Correct Mobile Number element is visible");

		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.errorFaxNumber,
				"Give Correct Fax Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Fax Number element is not visible");
		} else
			Logs.info("Give Correct Fax Number element is visible");

		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.errorVatNumber,
				"Give Correct Vat Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Vat Number element is not visible");
		} else
			Logs.info("Give Correct Vat Number element is visible");

		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.lengthStreet,
				"Maximum 100 Characters Allowed."))) {
			ExceptionHandling.HandleAssertion("Maximum 100 Characters Allowed element is not visible");
		} else
			Logs.info("Maximum 100 Characters Allowed element is visible");
		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.lengthStreet2,
				"Maximum 100 characters Allowed."))) {
			ExceptionHandling.HandleAssertion("Maximum 100 characters Allowed element is not visible");
		} else
			Logs.info("Maximum 100 characters Allowed element is visible");

		if (!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.errorPostalCode,
				"Give Correct Postal Code"))) {
			ExceptionHandling.HandleAssertion("Give Correct Postal Code element is not visible");
		} else
			Logs.info("Give Correct Postal Code element is visible");
	}

	@Then("User clicks on Save and Continue button to validate mandatory fields")
	public void user_clicks_on_Save_and_Continue_button_to_validate_mandatory_fields() throws Exception {
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.saveAndContinueButton, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.saveAndContinueButton, "Save and Continue");
		if (testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.nullValidate,
				"Validate Mandatory fields")) {
			ExceptionHandling.HandleAssertion("New provider Created");
		} else
			Logs.info("New provider not created");
	}

	@Then("User enters Provider Name as {string} in Add Provider page")
	public void user_enters_Provider_Name_as_in_Add_Provider_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String providerName=Excel_Utility.getCellData(1, 0);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.providerName, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.providerName, "Provider Name");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.providerName, providerName, "Provider Name");
	}

	@Then("User enters Mobile Number as {string} in Add Provider page")
	public void user_enters_Mobile_Number_as_in_Add_Provider_page(String string)throws Exception {
		String mobileNumber=Excel_Utility.getCellData_Integer(1, 1);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.mobileNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.mobileNumber, "Mobile Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.mobileNumber, String.valueOf(mobileNumber), "Mobile Number");
	}

	@Then("User enters Other Contact as {string} in Add Provider page")
	public void user_enters_Other_Contact_as_in_Add_Provider_page(String string)throws Exception {
		String otherContactNumber=Excel_Utility.getCellData_Integer(1, 2);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, "Other Contact Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, String.valueOf(otherContactNumber), "Other Contact Number");
	}

	@Then("User enters Email Address as {string} in Add Provider page")
	public void user_enters_Email_Address_as_in_Add_Provider_page(String string)throws Exception {
		String emailAddress=Excel_Utility.getCellData(1, 3);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.emailAddress, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.emailAddress, "Email Address");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.emailAddress, emailAddress, "Email Address");
	}

	@Then("User enters Fax Number as {string} in Add Provider page")
	public void user_enters_Fax_Number_as_in_Add_Provider_page(String string) throws Exception{
		String faxNumber=Excel_Utility.getCellData_Integer(1, 4);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.faxNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.faxNumber, "Fax Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.faxNumber, String.valueOf(faxNumber), "Fax Number");
	}

	@Then("User enters Vat Number as {string} in Add Provider page")
	public void user_enters_Vat_Number_as_in_Add_Provider_page(String string) throws Exception{
		String vatNumber=Excel_Utility.getCellData_Integer(1, 5);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.vatNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.vatNumber, "Vat Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.vatNumber, String.valueOf(vatNumber), "Vat Number");
	}

	@Then("User selects status as {string} from status dropdown in Add Provider page")
	public void user_selects_status_as_from_status_dropdown_in_Add_Provider_page(String string)throws Exception {
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.status, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.status, "Status");
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.inactive, "Inactive");
	}

	@Then("User enters street as {string} in Add Provider page")
	public void user_enters_street_as_in_Add_Provider_page(String string) throws Exception{
		Thread.sleep(10000);
		String street=Excel_Utility.getCellData(1, 7);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.street, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.street, "Street");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.street, street, "Street");
	}

	@Then("User enters street2 as {string} in Add Provider page")
	public void user_enters_street2_as_in_Add_Provider_page(String string) throws Exception{
		String street2=Excel_Utility.getCellData(1, 8);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.street2, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.street2, "Street2");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.street2, street2, "Street2");
	}

	@Then("User selects City as {string} from City dropdown in Add Provider page")
	public void user_selects_City_as_from_City_dropdown_in_Add_Provider_page(String string)throws Exception {
		Thread.sleep(10000);
		//testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.city, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.city, "City");
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.selectCity, "City");
	}

	@Then("User validates valid Province is auto-populated when city is selectsed")
	public void user_validates_valid_Province_is_auto_populated_when_city_is_selectsed() throws Exception{
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.province, 20);
		if(!(testBase.isElementVisible(Stratos_3rdPartyProviders_PageObjects.province, "Province"))) {
			ExceptionHandling.HandleAssertion("Province is not auto-populated");
		}else
			Logs.info("Province is auto-populated");
		
	}

	@Then("User selects Country as {string} from country dropdown in Add Provider page")
	public void user_selects_Country_as_from_country_dropdown_in_Add_Provider_page(String string) throws Exception{
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.country, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.country, "Country");
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.selectCountry, "Country");
	}

	@Then("User enters Postal Code as {string} in Add Provider page")
	public void user_enters_Postal_Code_as_in_Add_Provider_page(String string) throws Exception{
		String postalCode=Excel_Utility.getCellData_Integer(1, 12);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.postalCode, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.postalCode, "Postal Code");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.postalCode, String.valueOf(postalCode), "Postal Code");
	}

	@Then("User enters Comments as {string} in Add Provider page")
	public void user_enters_Comments_as_in_Add_Provider_page(String string) throws Exception{
		String comments=Excel_Utility.getCellData(1, 13);
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.comments, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.comments, "Comments");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.comments,comments, "Comments");
	}

	@Then("User clicks on Save and Continue button")
	public void user_clicks_on_Save_and_Continue_button() throws Exception {
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.saveAndContinueButton, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.saveAndContinueButton, "Save and Continue");
	}

	@Then("User verifies the created provider to validate provider is created")
	public void user_verifies_the_created_provider_to_validate_provider_is_created() {
		
	}

	@Given("User enters valid Provider Ref as {string} on Active Providers")
	public void user_enters_valid_Provider_Ref_as_on_Active_Providers(String string) {

	}

	@Then("User validates the filtered data")
	public void user_validates_the_filtered_data() {

	}

	@Then("User enters invalid Provider Ref as {string} on Active Providers")
	public void user_enters_invalid_Provider_Ref_as_on_Active_Providers(String string) {

	}

	@Then("User clicks on Inactive Providers")
	public void user_clicks_on_Inactive_Providers() {

	}

	@Then("User enters valid Provider Ref as {string} on Inactive Providers")
	public void user_enters_valid_Provider_Ref_as_on_Inactive_Providers(String string) {

	}

	@Then("User enters invalid Provider Ref as {string} in Add Provider page")
	public void user_enters_invalid_Provider_Ref_as_in_Add_Provider_page(String string) {

	}

	@Then("User clicks on Items per page dropdown")
	public void user_clicks_on_Items_per_page_dropdown() {

	}

	@Then("Users selects the desired number from items per page dropdown")
	public void users_selects_the_desired_number_from_items_per_page_dropdown() {

	}

	@Then("User validates the displayed providers")
	public void user_validates_the_displayed_providers() {

	}

	@Given("User clicks on Manage Provider button")
	public void user_clicks_on_Manage_Provider_button() {

	}

	@Given("User enters Mobile Number as {string} in Edit Provider page")
	public void user_enters_Mobile_Number_as_in_Edit_Provider_page(String string) {

	}

	@Given("User clicks on update button")
	public void user_clicks_on_update_button() {

	}

	@Then("User validates the success message as\"successMessage\"")
	public void user_validates_the_success_message_as_successMessage() {

	}

	@Then("User clicks on Deactivate button")
	public void user_clicks_on_Deactivate_button() {

	}

	@Then("User enters Other Contact Number as {string} in Edit Provider page")
	public void user_enters_Other_Contact_Number_as_in_Edit_Provider_page(String string) {

	}

	@Then("User clicks on Activate button")
	public void user_clicks_on_Activate_button() {

	}

	@Given("User clicks on Bulk Upload button")
	public void user_clicks_on_Bulk_Upload_button() {

	}

	@Given("User clicks on Select File button")
	public void user_clicks_on_Select_File_button() {

	}

	@Given("User double clicks on valid data excel file")
	public void user_double_clicks_on_valid_data_excel_file() {

	}

	@Given("User clicks on Submit button")
	public void user_clicks_on_Submit_button() {

	}

	@Then("User clicks on selects File button")
	public void user_clicks_on_selects_File_button() {

	}

	@Then("User double clicks on invalid data excel file")
	public void user_double_clicks_on_invalid_data_excel_file() {

	}
}
