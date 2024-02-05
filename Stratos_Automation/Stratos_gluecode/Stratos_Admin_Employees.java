package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Admin_Employees_PageObjects;
import Stratos_testBase.testBase;
import io.cucumber.java.en.*;

public class Stratos_Admin_Employees {
	
	@Given("User clicks on Employees in the menu")
	public void user_clicks_on_Employees_in_the_menu() throws Exception {
	   testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeesMenu, "Employees");
	}

	@Given("User clicks on Add New Employee button")
	public void user_clicks_on_Add_New_Employee_button() throws Exception {
	   testBase.clickonElement(Stratos_Admin_Employees_PageObjects.addNewEmployeeButton, "Add New Employee");
	}

	@Given("Verify that user able to enter invalid data in Add Employee page")
	public void verify_that_user_able_to_enter_invalid_data_in_Add_Employee_page() throws Exception {
	    String firstName=testBase.randomAlphanumeric(7)+"@!";
	    String lastName=testBase.randomAlphanumeric(7)+"*%";
	    String mobileNumber=testBase.randomAlphanumeric(8)+"@#";
	    String otherContactNumber=testBase.randomAlphanumeric(8)+"@!";
	    String emailAddress="!*"+testBase.randomAlphanumeric(6)+"@gmail.com";
	    String jobTitle="%$"+testBase.randomAlphanumeric(7);
	    String passportNumber="@!"+testBase.randomAlphanumeric(7);
	    String saId="*@"+testBase.randomAlphanumeric(11);
	    String postalCode=testBase.randomAlphanumeric(3)+"@";
	    String relationship=testBase.randomAlphanumeric(10)+"#@!";
	    String securityLicenceNumber=testBase.randomAlphanumeric(10)+"@!";
	    String firstAidCPR=testBase.randomAlphanumeric(10)+"#$!";
	    String driverLicence=testBase.randomAlphanumeric(10)+"&*";
	    String gunLicence=testBase.randomAlphanumeric(11)+"@#";
	    
// Employee Details	    
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.firstName, firstName, "First Name");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.lastName, lastName, "Last Name");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.mobileNumber, mobileNumber, "Mobile Number");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.otherContactNumber, otherContactNumber, "other Contact Number");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emailAddress, emailAddress, "Email Address");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.jobTitle, jobTitle, "job Title");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.calenderButton, "Birthday");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.calenderArrow, "Birthday");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthYear, "Year");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthMonth, "Month");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthDate, "Date");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.passportRadioButton, "Passport Radio Button");
	    Thread.sleep(3000);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.passportNumber, passportNumber, "Passport Number");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, "SA ID radio button");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.saID, saId, "SA ID");
	    
// Emergency Residential Address Details
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.emergencyResidentialDetails, "Emergency Residential Address Details");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialPostalCode, postalCode, "Postal Code");
	    
// Postal Address Details
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.postalAddressDetails, "Postal Address Details");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalCode, postalCode, "Postal Code");
	    
// Emergency Contact Details
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.emergencyContactDetails, "Emergency Contact Details");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyFirstName, firstName, "First Name");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyLastName, lastName, "Last Name");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyMobileNumber, mobileNumber, "Mobile Number");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyOtherContactNumber, otherContactNumber, "Other Contact Number");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyEmailAddress, emailAddress, "Email Address");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyPostalCode, postalCode, "Postal Code");
	
// Next of Kin Details
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.kinDetails, "Next of Kin Details");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinFirstName, firstName, "First Name");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinLastName, lastName, "Last Name");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinMobileNumber, mobileNumber, "Mobile Number");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinRelationship, relationship, "Relationship");
	    
// Security Details
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityDetails, "Security Details");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.securityLicenceNumber, securityLicenceNumber, "Security Licence Number");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.calenderButton, "Birthday");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.calenderArrow, "Birthday");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryYear, "Year");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryMonth, "Month");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryDate, "Date");
	
// First Aid Details
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidDetails, "First Aid Details");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.firstAidCPR, firstAidCPR, "First Aid CPR");
	
// Compliance/Training/Certification Details
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.complianceDetails, "Compliance/Training/Certification Details");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.driverLicence, driverLicence, "Driver Licence");
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.gunLicence, gunLicence, "Gun Licence");
	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	@Then("User Validates the error messages of Invalid data of all the feilds in Add Employee page")
	public void user_Validates_the_error_messages_of_Invalid_data_of_all_the_feilds_in_Add_Employee_page() {
	    
	    
	}

	@Then("Verify that user able to enter invalid field length data in Add Employee page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_Add_Employee_page() {
	    
	    
	}

	@Then("User Validates the error messages of Invalid field length data of all the feilds in Add Employee page")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_all_the_feilds_in_Add_Employee_page() {
	    
	    
	}

	@Then("User clicks on Save and Continue button to validate mandatory fields of Add Employee page")
	public void user_clicks_on_Save_and_Continue_button_to_validate_mandatory_fields_of_Add_Employee_page() {
	    
	    
	}

	@Then("User enters First Name as {string} in Employee Details")
	public void user_enters_First_Name_as_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User enters Last Name as {string} in Employee Details")
	public void user_enters_Last_Name_as_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User enters Mobile Number {string} in Employee Details")
	public void user_enters_Mobile_Number_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User enters Other Contact Number as {string} in Employee Details")
	public void user_enters_Other_Contact_Number_as_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User enters Email Address in Employee Details")
	public void user_enters_Email_Address_in_Employee_Details() {
	    
	    
	}

	@Then("User enters Job Title as {string} in Employee Details")
	public void user_enters_Job_Title_as_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User selects Gender as {string} from Gender dropdown in Employee Details")
	public void user_selects_Gender_as_from_Gender_dropdown_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User clicks on Birthday date picker button and selects Birthday as {string} in Employee Details")
	public void user_clicks_on_Birthday_date_picker_button_and_selects_Birthday_as_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User selects Role as {string} from Role dropdown in Employee Details")
	public void user_selects_Role_as_from_Role_dropdown_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User selects Department as {string} from Select Department dropdown in Employee Details")
	public void user_selects_Department_as_from_Select_Department_dropdown_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User clicks on Passport radio button in Employee Details")
	public void user_clicks_on_Passport_radio_button_in_Employee_Details() {
	    
	    
	}

	@Then("User enters Passport Number as {string} in Employee Details")
	public void user_enters_Passport_Number_as_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User clicks on Passport Expiry Date date picker button and selects Passport Expiry Date as {string} in Employee Details")
	public void user_clicks_on_Passport_Expiry_Date_date_picker_button_and_selects_Passport_Expiry_Date_as_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User clicks on ID Number radio button in Employee Details")
	public void user_clicks_on_ID_Number_radio_button_in_Employee_Details() {
	    
	    
	}

	@Then("User enters SA ID as {string} in Employee Details")
	public void user_enters_SA_ID_as_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User clicks on Employee Residential Address Details")
	public void user_clicks_on_Employee_Residential_Address_Details() {
	    
	    
	}

	@Then("User enters Street {int} as {string} in Employee Residential Address Details")
	public void user_enters_Street_as_in_Employee_Residential_Address_Details(Integer int1, String string) {
	    
	    
	}

	@Then("User selects City as {string} from City dropdown in Employee Residential Address Details")
	public void user_selects_City_as_from_City_dropdown_in_Employee_Residential_Address_Details(String string) {
	    
	    
	}

	@Then("User validates valid province is auto-populated when city is selected")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected() {
	    
	    
	}

	@Then("User enters Postal Code as {string} in Employee Residential Address Details")
	public void user_enters_Postal_Code_as_in_Employee_Residential_Address_Details(String string) {
	    
	    
	}

	@Then("User selects Country as {string} from Select Country dropdown in Employee Residential Address Details")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Employee_Residential_Address_Details(String string) {
	    
	    
	}

	@Then("User clicks on Postal Address Details")
	public void user_clicks_on_Postal_Address_Details() {
	    
	    
	}

	@Then("User enters Street {int} as {string} in Postal Address Details")
	public void user_enters_Street_as_in_Postal_Address_Details(Integer int1, String string) {
	    
	    
	}

	@Then("User selects City as {string} from City dropdown in Postal Address Details")
	public void user_selects_City_as_from_City_dropdown_in_Postal_Address_Details(String string) {
	    
	    
	}

	@Then("User validates valid province is auto-populated when city is selected in Postal Address Details")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected_in_Postal_Address_Details() {
	    
	    
	}

	@Then("User enter Postal Code as {string} in Postal Address Details")
	public void user_enter_Postal_Code_as_in_Postal_Address_Details(String string) {
	    
	    
	}

	@Then("User selects Country as {string} from Select Country dropdown in Postal Address Details")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Postal_Address_Details(String string) {
	    
	    
	}

	@Then("User clicks on Emergency Contact Details")
	public void user_clicks_on_Emergency_Contact_Details() {
	    
	    
	}

	@Then("And User enters First Name as {string} in Emergency Contact Details")
	public void and_User_enters_First_Name_as_in_Emergency_Contact_Details(String string) {
	    
	    
	}

	@Then("User enters Last Name as {string} in Emergency Contact Details")
	public void user_enters_Last_Name_as_in_Emergency_Contact_Details(String string) {
	    
	    
	}

	@Then("User enters Mobile Number {string} in Emergency Contact Details")
	public void user_enters_Mobile_Number_in_Emergency_Contact_Details(String string) {
	    
	    
	}

	@Then("User enters Other Contact Number as {string} in Emergency Contact Details")
	public void user_enters_Other_Contact_Number_as_in_Emergency_Contact_Details(String string) {
	    
	    
	}

	@Then("User enters Street {int} as {string} in Emergency Contact Details")
	public void user_enters_Street_as_in_Emergency_Contact_Details(Integer int1, String string) {
	    
	    
	}

	@Then("User selects City as {string} from City dropdown in Emergency Contact Details")
	public void user_selects_City_as_from_City_dropdown_in_Emergency_Contact_Details(String string) {
	    
	    
	}

	@Then("User validates valid province is auto-populated when city is selected in Emergency Contact Details")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected_in_Emergency_Contact_Details() {
	    
	    
	}

	@Then("User enter Postal Code as {string} in Emergency Contact Details")
	public void user_enter_Postal_Code_as_in_Emergency_Contact_Details(String string) {
	    
	    
	}

	@Then("User selects Country as {string} from Select Country dropdown in Emergency Contact Details")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Emergency_Contact_Details(String string) {
	    
	    
	}

	@Then("User clicks on Next Of Kin Details")
	public void user_clicks_on_Next_Of_Kin_Details() {
	    
	    
	}

	@Then("And User enters First Name as {string} in Next Of Kin Details")
	public void and_User_enters_First_Name_as_in_Next_Of_Kin_Details(String string) {
	    
	    
	}

	@Then("User enters Last Name as {string} in Next Of Kin Details")
	public void user_enters_Last_Name_as_in_Next_Of_Kin_Details(String string) {
	    
	    
	}

	@Then("User enters Mobile Number {string} in Next Of Kin Details")
	public void user_enters_Mobile_Number_in_Next_Of_Kin_Details(String string) {
	    
	    
	}

	@Then("User enters Relationship as {string} in Next Of Kin Details")
	public void user_enters_Relationship_as_in_Next_Of_Kin_Details(String string) {
	    
	    
	}

	@Then("User clicks on Security Details")
	public void user_clicks_on_Security_Details() {
	    
	    
	}

	@Then("User enters Security Licence Number as {string} in Security Details")
	public void user_enters_Security_Licence_Number_as_in_Security_Details(String string) {
	    
	    
	}

	@Then("User clicks on Security Licence Expiry Date date picker button and selects Security Licence Expiry Date as {string} in Security Details")
	public void user_clicks_on_Security_Licence_Expiry_Date_date_picker_button_and_selects_Security_Licence_Expiry_Date_as_in_Security_Details(String string) {
	    
	    
	}

	@Then("User clicks on First Aid Details")
	public void user_clicks_on_First_Aid_Details() {
	    
	    
	}

	@Then("User enters First Aid\\/CPR as {string} in First Aid Details")
	public void user_enters_First_Aid_CPR_as_in_First_Aid_Details(String string) {
	    
	    
	}

	@Then("User clicks on First Aid\\/CPR Expiry Date date picker button and selects First Aid\\/CPR Expiry Date as {string} in First Aid Details")
	public void user_clicks_on_First_Aid_CPR_Expiry_Date_date_picker_button_and_selects_First_Aid_CPR_Expiry_Date_as_in_First_Aid_Details(String string) {
	    
	    
	}

	@Then("User clicks on Compliance / Training / Certification Details")
	public void user_clicks_on_Compliance_Training_Certification_Details() {
	    
	    
	}

	@Then("User enters Drivers Licence as {string} in Compliance / Training / Certification Details")
	public void user_enters_Drivers_Licence_as_in_Compliance_Training_Certification_Details(String string) {
	    
	    
	}

	@Then("User clicks on Drivers Licence Expiry date picker button and selects Drivers Licence Expiry date as {string} in Compliance / Training / Certification Details")
	public void user_clicks_on_Drivers_Licence_Expiry_date_picker_button_and_selects_Drivers_Licence_Expiry_date_as_in_Compliance_Training_Certification_Details(String string) {
	    
	    
	}

	@Then("User clicks on Equipment Details")
	public void user_clicks_on_Equipment_Details() {
	    
	    
	}

	@Then("User selects Use Force as {string} from Use Force dropdown in Equipment Details")
	public void user_selects_Use_Force_as_from_Use_Force_dropdown_in_Equipment_Details(String string) {
	    
	    
	}

	@Then("User selects Traffic Control as {string} from Traffic Control dropdown in Equipment Details")
	public void user_selects_Traffic_Control_as_from_Traffic_Control_dropdown_in_Equipment_Details(String string) {
	    
	    
	}

	@Then("User selects Use Handcuffs as {string} from Use Handcuffs dropdown in Equipment Details")
	public void user_selects_Use_Handcuffs_as_from_Use_Handcuffs_dropdown_in_Equipment_Details(String string) {
	    
	    
	}

	@Then("User selects Use Baton as {string} from Use Baton dropdown in Equipment Details")
	public void user_selects_Use_Baton_as_from_Use_Baton_dropdown_in_Equipment_Details(String string) {
	    
	    
	}

	@Then("User selects Use Gun as {string} from Use Gun dropdown in Equipment Details")
	public void user_selects_Use_Gun_as_from_Use_Gun_dropdown_in_Equipment_Details(String string) {
	    
	    
	}

	@Then("User clicks on Contract Details")
	public void user_clicks_on_Contract_Details() {
	    
	    
	}

	@Then("User selects Contract Type as {string} from Contract Type dropdown in Contract Details")
	public void user_selects_Contract_Type_as_from_Contract_Type_dropdown_in_Contract_Details(String string) {
	    
	    
	}

	@Then("User clicks on Contract Start Date date picker button and selects Contract Start Date as {string} in Contract Details")
	public void user_clicks_on_Contract_Start_Date_date_picker_button_and_selects_Contract_Start_Date_as_in_Contract_Details(String string) {
	    
	    
	}

	@Then("User clicks on Contract End Date date picker button and selects Contract End Date as {string} in Contract Details")
	public void user_clicks_on_Contract_End_Date_date_picker_button_and_selects_Contract_End_Date_as_in_Contract_Details(String string) {
	    
	    
	}

	@Then("User clicks on Parent Employee Deatils")
	public void user_clicks_on_Parent_Employee_Deatils() {
	    
	    
	}

	@Then("User selects Parent Contact Name as {string} from Parent Contact Name dropdown in Parent Employees Details")
	public void user_selects_Parent_Contact_Name_as_from_Parent_Contact_Name_dropdown_in_Parent_Employees_Details(String string) {
	    
	    
	}

	@Then("User validates the Parent Employee Details are auto-populated")
	public void user_validates_the_Parent_Employee_Details_are_auto_populated() {
	    
	    
	}

	@Then("User selects 3rd Party Provider as {string} from 3rd Party Provider dropdown")
	public void user_selects_3rd_Party_Provider_as_from_3rd_Party_Provider_dropdown(String string) {
	    
	    
	}

	@Given("User enters valid Employee Ref as {string} on Active Employees")
	public void user_enters_valid_Employee_Ref_as_on_Active_Employees(String string) {
	    
	    
	}

	@Then("User validates the filtered data")
	public void user_validates_the_filtered_data() {
	    
	    
	}

	@Then("User enters invalid Employee Ref as {string} on Active Employees")
	public void user_enters_invalid_Employee_Ref_as_on_Active_Employees(String string) {
	    
	    
	}

	@Then("User validates the error message as {string} of invalid Employee Ref")
	public void user_validates_the_error_message_as_of_invalid_Employee_Ref(String string) {
	    
	    
	}

	@Then("User clicks on Inactive Employees")
	public void user_clicks_on_Inactive_Employees() {
	    
	    
	}

	@Then("User enters valid Employee Ref as {string} on Inactive Employees")
	public void user_enters_valid_Employee_Ref_as_on_Inactive_Employees(String string) {
	    
	    
	}

	@Then("User enters invalid Employee Ref as {string} in Add Employee page")
	public void user_enters_invalid_Employee_Ref_as_in_Add_Employee_page(String string) {
	    
	    
	}

	@Then("User validates the displayed Employee")
	public void user_validates_the_displayed_Employee() {
	    
	    
	}

	@Then("User clicks on Manage Employee button")
	public void user_clicks_on_Manage_Employee_button() {
	    
	    
	}

	@Then("User enters Mobile Number as {string} in Employee Details")
	public void user_enters_Mobile_Number_as_in_Employee_Details(String string) {
	    
	    
	}

	@Then("User validates the updates of Active Employees")
	public void user_validates_the_updates_of_Active_Employees() {
	    
	    
	}

	@Then("User validates the success message as\"successMessage\"")
	public void user_validates_the_success_message_as_successMessage() {
	    
	    
	}

	@Then("User clicks on update button")
	public void user_clicks_on_update_button() {
	    
	    
	}

	@Then("User clicks on Select File button")
	public void user_clicks_on_Select_File_button() {
	    
	    
	}

	@Then("User double clicks on valid data excel file")
	public void user_double_clicks_on_valid_data_excel_file() {
	    
	    
	}

	@Then("User clicks on selects File button")
	public void user_clicks_on_selects_File_button() {
	    
	    
	}

	@Then("User double clicks on invalid data excel file")
	public void user_double_clicks_on_invalid_data_excel_file() {
	    
	    
	}
}
