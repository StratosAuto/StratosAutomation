package Stratos_gluecode;

import Stratos_pageObjects.Stratos_3rdPartyProviders_PageObjects;
import Stratos_testBase.testBase;
import io.cucumber.java.en.*;

public class Stratos_3rdPartyProvider {
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
		String postalCode = "#" + testBase.randomAplhabet(3);

//	  Mobile Number
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.mobileNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.mobileNumber, "Mobile Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.mobileNumber, mobileNumber, "Mobile Number");

//	  Other Contact Number
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, "Other Contact Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.otherContactNumber, otherContactNumber,
				"Other Contact Number");

//	  Email Address
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.emailAddress, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.emailAddress, "Email Address");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.emailAddress, emailAddress, "Email Address");
//	  Fax Number
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.faxNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.faxNumber, "Fax Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.faxNumber, faxNumber, "Fax Number");

//	  Vat Number
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.vatNumber, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.vatNumber, "Vat Number");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.vatNumber, vatNumber, "Vat Number");

//	  Postal Code
		testBase.waitForElement(Stratos_3rdPartyProviders_PageObjects.postalCode, 20);
		testBase.clickonElement(Stratos_3rdPartyProviders_PageObjects.postalCode, "Postal Code");
		testBase.typeinTextBox(Stratos_3rdPartyProviders_PageObjects.postalCode, faxNumber, "Postal Code");
	}

	@Then("User Validates the error messages of Invalid data of all the feilds")
	public void user_Validates_the_error_messages_of_Invalid_data_of_all_the_feilds() {

	}

	@Then("User clicks on Cancel button")
	public void user_clicks_on_Cancel_button() {

	}

	@Then("Verify that user able to enter invalid field length data in Add Provider page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_Add_Provider_page() {

	}

	@Then("User Validates the error messages of Invalid field length data of all the feilds")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_all_the_feilds() {

	}

	@Then("User clicks on Save and Continue button to validate mandatory fields")
	public void user_clicks_on_Save_and_Continue_button_to_validate_mandatory_fields() {

	}

	@Then("User validates the error message as {string}")
	public void user_validates_the_error_message_as(String string) {

	}

	@Then("User enters Provider Name as {string} in Add Provider page")
	public void user_enters_Provider_Name_as_in_Add_Provider_page(String string) {

	}

	@Then("User enters Mobile Number as {string} in Add Provider page")
	public void user_enters_Mobile_Number_as_in_Add_Provider_page(String string) {

	}

	@Then("User enters Other Contact as {string} in Add Provider page")
	public void user_enters_Other_Contact_as_in_Add_Provider_page(String string) {

	}

	@Then("User enters Email Address as {string} in Add Provider page")
	public void user_enters_Email_Address_as_in_Add_Provider_page(String string) {

	}

	@Then("User enters Fax Number as {string} in Add Provider page")
	public void user_enters_Fax_Number_as_in_Add_Provider_page(String string) {

	}

	@Then("User enters Vat Number as {string} in Add Provider page")
	public void user_enters_Vat_Number_as_in_Add_Provider_page(String string) {

	}

	@Then("User selects status as {string} from status dropdown in Add Provider page")
	public void user_selects_status_as_from_status_dropdown_in_Add_Provider_page(String string) {

	}

	@Then("User enters street as {string} in Add Provider page")
	public void user_enters_street_as_in_Add_Provider_page(String string) {

	}

	@Then("User enters street2 as {string} in Add Provider page")
	public void user_enters_street2_as_in_Add_Provider_page(String string) {

	}

	@Then("User selects City as {string} from City dropdown in Add Provider page")
	public void user_selects_City_as_from_City_dropdown_in_Add_Provider_page(String string) {

	}

	@Then("User validates valid Province is auto-populated when city is selectsed")
	public void user_validates_valid_Province_is_auto_populated_when_city_is_selectsed() {

	}

	@Then("User selects Country as {string} from country dropdown in Add Provider page")
	public void user_selects_Country_as_from_country_dropdown_in_Add_Provider_page(String string) {

	}

	@Then("User enters Postal Code as {string} in Add Provider page")
	public void user_enters_Postal_Code_as_in_Add_Provider_page(String string) {

	}

	@Then("User enters Comments as {string} in Add Provider page")
	public void user_enters_Comments_as_in_Add_Provider_page(String string) {

	}

	@Then("User clicks on Save and Continue button")
	public void user_clicks_on_Save_and_Continue_button() {

	}

	@Then("User validates the success message as {string}")
	public void user_validates_the_success_message_as(String string) {

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
