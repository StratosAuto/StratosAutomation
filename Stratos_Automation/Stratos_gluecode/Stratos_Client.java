package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Client_PageObjects;
import Stratos_pageObjects.Stratos_SitesAndCheckpoints_PageObjects;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stratos_Client {
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "ClientModule";
	public static String ClientName;
	public static String mobileNumber;
	public static String EmailAdress;
	public static String FaxNumber;
	public static String VatNumber;
	public static String AccountManager;
	public static String Status;
	public static String Street;
	public static String Street2;
	public static String PostalCode;
	public static String Comments;

@When("User Click on Clients module")
public void user_Click_on_Clients_module() throws Exception {
    testBase.waitForElement(Stratos_Client_PageObjects.clientModule, 20);
    testBase.clickonElement(Stratos_Client_PageObjects.clientModule, "click on client module");
}

@When("User click on add new client button")
public void user_click_on_add_new_client_button1() throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.addNewclient, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.addNewclient, "click on add new client");
    
}
@When("Verify that user able to enter invalid data in Add new client page")
public void verify_that_user_able_to_enter_invalid_data_in_Add_new_client_page() throws Exception {

  
	mobileNumber = testBase.randomAlphanumeric(10);
	testBase.waitForElement(Stratos_Client_PageObjects.mobileNumber, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.mobileNumber, "Mobile Number");
	testBase.typeinTextBox(Stratos_Client_PageObjects.mobileNumber, String.valueOf(mobileNumber), "Mobile Number");
    
	
	EmailAdress = testBase.randomAlphanumeric(10);
	testBase.waitForElement(Stratos_Client_PageObjects.emailAdress, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.emailAdress, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.emailAdress, EmailAdress, "Email Adress");
	
	testBase.waitForElement(Stratos_Client_PageObjects.faxNumber, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	FaxNumber = Excel_Utility.getCellData_Integer(1, 3);
	testBase.clickonElement(Stratos_Client_PageObjects.faxNumber, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.faxNumber, String.valueOf(FaxNumber), "Fax Number");
    

	VatNumber = testBase.randomAlphanumeric(10);
	testBase.waitForElement(Stratos_Client_PageObjects.vatNumber, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.vatNumber, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.vatNumber, String.valueOf(VatNumber), "Vat Number");


	AccountManager = testBase.randomAlphanumeric(15);
	testBase.waitForElement(Stratos_Client_PageObjects.accountManager, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.accountManager, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.accountManager, AccountManager, "Account manager");
	
	Thread.sleep(5000);
    
	String postalCode = testBase.randomAlphanumeric(7);
	testBase.waitForElement(Stratos_Client_PageObjects.postalCode, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.postalCode, "postalCode");
	testBase.typeinTextBox(Stratos_Client_PageObjects.postalCode, postalCode, "postalCode");
	
	
	testBase.waitForElement(Stratos_Client_PageObjects.saveAndcontinue, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.saveAndcontinue, "save and continue");
	
	
}
	
	@When("Validates the error messages of Invalid data of add new client all the feilds")
	public void validates_the_error_messages_of_Invalid_data_of_add_new_client_all_the_feilds() throws Exception {
	    
		if (!(testBase.isElementVisible(Stratos_Client_PageObjects.inavlidMobileNumberError, "mobile number"))) {
			ExceptionHandling.HandleAssertion("give wrong mobile number");
		} else
			Logs.info("give correct mobile number");
		
		if (!(testBase.isElementVisible(Stratos_Client_PageObjects.invalidEmailAddress, "email address"))) {
			ExceptionHandling.HandleAssertion("give wrong email address");
		} else
			Logs.info("give correct email address");
		
		
		
		if (!(testBase.isElementVisible(Stratos_Client_PageObjects.invalidFaxNumber, "fax number"))) {
			ExceptionHandling.HandleAssertion("give wrong fax number");
		} else
			Logs.info("give correct fax number");
		
		
		
		if (!(testBase.isElementVisible(Stratos_Client_PageObjects.invalidVatNumberError, "vat number"))) {
			ExceptionHandling.HandleAssertion("give wrong vat number");
		} else
			Logs.info("give correct vat number");
		
		
		if (!(testBase.isElementVisible(Stratos_Client_PageObjects.invalidAccountManager, "account manager"))) {
			ExceptionHandling.HandleAssertion("give wrong  account manager");
		} else
			Logs.info("give correct account manager");
		
		

		if (!(testBase.isElementVisible(Stratos_Client_PageObjects.inavlidPostalCode, "postal code"))) {
			ExceptionHandling.HandleAssertion("give wrong postal code");
		} else
			Logs.info("give correct postal code");
		
		
		
		testBase.RefreshPage();
		Thread.sleep(2000);
		
	}

	@When("Verify that user able to enter invalid field length data in add new client page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_add_new_client_page() throws Exception {
		

		ClientName = testBase.randomAlphanumeric(26);
		testBase.waitForElement(Stratos_Client_PageObjects.clientName, 20);
		testBase.clickonElement(Stratos_Client_PageObjects.clientName, "client name");
		testBase.typeinTextBox(Stratos_Client_PageObjects.clientName, ClientName, "Client Name");
	   

		String Street = testBase.randomAlphanumeric(101);
		testBase.waitForElement(Stratos_Client_PageObjects.street, 20);
		testBase.clickonElement(Stratos_Client_PageObjects.street, "street");
		testBase.typeinTextBox(Stratos_Client_PageObjects.street, Street, "Street");
		
		
		String Street2 = testBase.randomAlphanumeric(101);
		testBase.waitForElement(Stratos_Client_PageObjects.street2, 20);
		testBase.clickonElement(Stratos_Client_PageObjects.street2, "street");
		testBase.typeinTextBox(Stratos_Client_PageObjects.street2, Street2, "Street");
		
		

		String comments = testBase.randomAlphanumeric(251);
		testBase.waitForElement(Stratos_Client_PageObjects.comments, 20);
		testBase.clickonElement(Stratos_Client_PageObjects.comments, "street");
		testBase.typeinTextBox(Stratos_Client_PageObjects.comments, comments, "Street");
		
		
		testBase.waitForElement(Stratos_Client_PageObjects.saveAndcontinue, 20);
		testBase.clickonElement(Stratos_Client_PageObjects.saveAndcontinue, "save and continue");
		
	}

	@Then("User Validates the error messages of Invalid field length data of add new client all the feilds")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_add_new_client_all_the_feilds() throws Exception {
	    
		
		if (!(testBase.isElementVisible(Stratos_Client_PageObjects.fieldLengthErrorForClientName, "Client Name"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 Characters not Allowed.");
		} else
			Logs.info("Maximum 25 Characters Allowed.");
		
		
		
		if (!(testBase.isElementVisible(Stratos_Client_PageObjects.fieldValiErrorforStreet, "street"))) {
			ExceptionHandling.HandleAssertion("Max length is not 100 characters");
		} else
			Logs.info("Max length is 100 characters");
		
		
		
		if (!(testBase.isElementVisible(Stratos_Client_PageObjects.filedValiErrorForStreet2, "street2"))) {
			ExceptionHandling.HandleAssertion("Max length is not 100 characters");
		} else
			Logs.info("Max length is 100 characters");
		
		
		
		if (!(testBase.isElementVisible(Stratos_Client_PageObjects.comments, "comments"))) {
			ExceptionHandling.HandleAssertion("Max length is 250 characters");
		} else
			Logs.info("Max length is 250 characters");
		
		
		
		
		
		
		
//@Then("User select invalid city {string} in add client page")
//public void user_select_invalid_city_in_add_client_page(String string) {
//    
//}
//
//@Then("User select invalid province {string} in add client page")
//public void user_select_invalid_province_in_add_client_page(String string) {
//    
//}
//
//@Then("User select invalid country {string} in add client page")
//public void user_select_invalid_country_in_add_client_page(String string) {
//    
//}
//
//@Then("User enter invalid postal code {string} in add client page")
//public void user_enter_invalid_postal_code_in_add_client_page(String string) {
//    
//}
//
//@Then("User enter invalid comments {string} in add client page")
//public void user_enter_invalid_comments_in_add_client_page(String string) {
//   
//}

	testBase.waitForElement(Stratos_Client_PageObjects.cancelButton, 20);
    testBase.clickonElement(Stratos_Client_PageObjects.cancelButton, "click on client module");
    
 }
 @Then("User click client add new client button")
 public void user_click_client_add_new_client_button() throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.addNewclient, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.addNewclient, "click on add new client");
    
}
@Then("User Enter Client Name {string} in add client page")
public void user_Enter_Client_Name_in_add_client_page(String string) throws Exception {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	ClientName = Excel_Utility.getCellData(2, 0);
	testBase.waitForElement(Stratos_Client_PageObjects.clientName, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.clientName, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.clientName, ClientName, "Client Name");
    
}

@Then("User Enter Mobile Number {string} in add client page")
public void user_Enter_Mobile_Number_in_add_client_page(String string) throws Exception {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	mobileNumber = Excel_Utility.getCellData_Integer(2, 1);
	testBase.waitForElement(Stratos_Client_PageObjects.mobileNumber, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.mobileNumber, "Mobile Number");
	testBase.typeinTextBox(Stratos_Client_PageObjects.mobileNumber, String.valueOf(mobileNumber), "Mobile Number");
}

@Then("User Enter Email Address {string} in add client page")
public void user_Enter_Email_Address_in_add_client_page(String string) throws Exception {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	EmailAdress = Excel_Utility.getCellData(2, 2);
	testBase.waitForElement(Stratos_Client_PageObjects.emailAdress, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.emailAdress, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.emailAdress, EmailAdress, "Email Adress");
}

@Then("User Enter Fax Number {string} in add client page")
public void user_Enter_Fax_Number_in_add_client_page(String string) throws Exception {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	FaxNumber = Excel_Utility.getCellData_Integer(2, 3);
	testBase.waitForElement(Stratos_Client_PageObjects.faxNumber, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.faxNumber, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.faxNumber, String.valueOf(FaxNumber), "Fax Number");
}

@Then("User Enter Vat Number {string} in add client page")
public void user_Enter_Vat_Number_in_add_client_page(String string) throws Exception {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	VatNumber = Excel_Utility.getCellData_Integer(2, 4);
	testBase.waitForElement(Stratos_Client_PageObjects.vatNumber, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.vatNumber, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.vatNumber, String.valueOf(VatNumber), "Vat Number");
}

@Then("User Enter Account Manager {string} in add client page")
public void user_Enter_Account_Manager_in_add_client_page(String string) throws Exception {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	AccountManager = Excel_Utility.getCellData(2, 6);
	testBase.waitForElement(Stratos_Client_PageObjects.accountManager, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.accountManager, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.accountManager, AccountManager, "Account Manager");
}

//@Then("User Select Status {string} in add client page")
//public void user_Select_Status_in_add_client_page(String status) throws Throwable {
//	Thread.sleep(10000);
//	testBase.clickonElement(Stratos_Client_PageObjects.clickStatus, "status dropdown");
//	testBase.waitForElement(Stratos_Client_PageObjects.clickStatus, 20);
//	testBase.clickonElement(Stratos_Client_PageObjects.status, "inactive");
////	testBase.dropdownSelectElement(Stratos_Client_PageObjects.clickStatus, Status);
//}

@Then("User Enter street {string} in add client page")
public void user_Enter_street_in_add_client_page(String string) throws Throwable {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	Street = Excel_Utility.getCellData(2, 7);
	testBase.waitForElement(Stratos_Client_PageObjects.street, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.street, "Street");
	testBase.typeinTextBox(Stratos_Client_PageObjects.street, Street, "Street");
}

@Then("User Enter street1 {string} in add client page")
public void user_Enter_street1_in_add_client_page(String string) throws Throwable {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	Street2 = Excel_Utility.getCellData(2, 8);
	testBase.waitForElement(Stratos_Client_PageObjects.street, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.street2, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.street2, Street2, "Street1");
    
}

@Then("User Select city {string} in add client page")
public void user_Select_city_in_add_client_page(String string) throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.city, 20);
	testBase.ClickViaMouse(Stratos_Client_PageObjects.city, "City dropdown");
//	testBase.waitForElement(Stratos_Client_PageObjects.selectCity, 20);
	Thread.sleep(2000);
	testBase.clickonElement(Stratos_Client_PageObjects.selectCity, "Johannesburg");

   
}

@Then("User Select province {string} in add client page")
public void user_Select_province_in_add_client_page(String string) throws Exception {
	String s=testBase.getElementText(Stratos_Client_PageObjects.provinceText, "Province selected");
	System.out.println(s);
}

@Then("User Select country {string} in add client page")
public void user_Select_country_in_add_client_page(String string) throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.country, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.country, "country selected");
	testBase.clickonElement(Stratos_Client_PageObjects.selectCountry, "South Africa");
}

@Then("User Enter postal code {string} in add client page")
public void user_Enter_postal_code_in_add_client_page(String string) throws Exception {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	PostalCode = Excel_Utility.getCellData_Integer(2, 11);
	testBase.waitForElement(Stratos_Client_PageObjects.postalCode, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.postalCode, "postal code");
	testBase.typeinTextBox(Stratos_Client_PageObjects.postalCode, String.valueOf(PostalCode), "PostalCode");
   
}

@Then("User Enter comments {string} in add client page")
public void user_Enter_comments_in_add_client_page(String string) throws Exception {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	Comments = Excel_Utility.getCellData(2, 12);
	testBase.waitForElement(Stratos_Client_PageObjects.comments, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.comments, "comments");
	testBase.typeinTextBox(Stratos_Client_PageObjects.comments, Comments, "PostalCode");
    
}

@Then("User Click on Save and Continue Button in add client page")
public void user_Click_on_Save_and_Continue_Button_in_add_client_page() throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.saveAndcontinue, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.saveAndcontinue, " save and continue");
	Thread.sleep(5000);
}

@Then("User Verifies the client Success Message as {string}")
public void user_Verifies_the_client_Success_Message_as(String string) throws Exception {
//   String s =testBase.getElementText(Stratos_Client_PageObjects.addclientSuccessMessage, "success message");
//   System.out.println(s);
   testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.filter, ClientName, "mobile number in filters");
   Thread.sleep(5000);
   if(!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.cellData, "Validate Deactivate"))) {
   	ExceptionHandling.HandleAssertion("client is not created");
   }else
   	Logs.info("client is created");
}
  @Then("User click on manage client")
  public void user_click_on_manage_client() throws Throwable {
	testBase.waitForElement(Stratos_Client_PageObjects.manageClient, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.manageClient, "manage client");
	testBase.ScrollDownBottom();
	
}

@Then("User click on client info edit button")
public void user_click_on_client_info_edit_button() throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.editManageClientDetails, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.editManageClientDetails, "edit button");
    
}
@Then("User clicks on activate button")
public void user_clicks_on_activate_button() throws Throwable {
   testBase.waitForElement(Stratos_Client_PageObjects.activateButton, 20);
   testBase.clickonElement(Stratos_Client_PageObjects.activateButton, "Activate client");
}

@Then("User change valid client name {string} in manage clients")
public void user_change_valid_client_name_in_manage_clients(String string) throws Exception {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	ClientName = Excel_Utility.getCellData(2, 0);
	testBase.waitForElement(Stratos_Client_PageObjects.clientName, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.clientName, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.clientName, ClientName, "Client Name");
}

@Then("User change street {string} When in manage clients")
public void user_change_street_When_in_manage_clients(String string) throws Exception {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	Street = Excel_Utility.getCellData(2, 7);
	testBase.waitForElement(Stratos_Client_PageObjects.street, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.street, "Street");
	testBase.typeinTextBox(Stratos_Client_PageObjects.street, Street, "Street");
}
	@Then("User change street1 {string} in manage client page")
	public void user_change_street1_in_manage_client_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		Street2 = Excel_Utility.getCellData(2, 8);
		testBase.waitForElement(Stratos_Client_PageObjects.street, 20);
		testBase.clickonElement(Stratos_Client_PageObjects.street2, "client name");
		testBase.typeinTextBox(Stratos_Client_PageObjects.street2, Street2, "Street1");
	    
	}

//	@Then("User select city {string} in manage clients")
//	public void user_select_city_in_manage_clients(String string) throws Exception {
//		testBase.waitForElement(Stratos_Client_PageObjects.city, 20);
//		testBase.clickonElement(Stratos_Client_PageObjects.city, "City dropdown");
//		testBase.clickonElement(Stratos_Client_PageObjects.selectCity, "Vereeniging");
//	}



@Then("User click on update button")
public void user_click_on_update_button() throws Exception {
    testBase.waitForElement(Stratos_Client_PageObjects.updateButton, 20);
    testBase.clickonElement(Stratos_Client_PageObjects.updateButton, "update button");
    Thread.sleep(5000);
}

@Then("User verifies the success message")
public void user_verifies_the_success_message() throws Exception {
//	testBase.waitForElement(Stratos_Client_PageObjects.succcessMessageForUpdate, 20);
//	String s = testBase.getElementText(Stratos_Client_PageObjects.succcessMessageForUpdate, "success message");
//	System.out.println(s);
	testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.filter, ClientName, "mobile number in filters");
	   Thread.sleep(5000);
	   if(!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.cellData, "Validate Deactivate"))) {
	   	ExceptionHandling.HandleAssertion("client is not created");
	   }else
	   	Logs.info("client is created");
    
}

@Then("User click on deactivate button")
public void user_click_on_deactivate_button() throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.deActivateButton, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.deActivateButton, "deactivate button");
	Thread.sleep(5000);
	
}
@Then("User click on inactive button")
public void user_click_on_inactive_button() throws Exception {
   testBase.RefreshPage();
   testBase.waitForElement(Stratos_Client_PageObjects.inactiveClients, 20);
   testBase.clickonElement(Stratos_Client_PageObjects.inactiveClients, "inactive clients");
   Thread.sleep(10000);
}

@When("User clicks on Bulk Upload button in clients page")
public void user_clicks_on_Bulk_Upload_button_in_clients_page() throws Exception {
    testBase.waitForElement(Stratos_Client_PageObjects.bulkUploadButton, 20);
    testBase.clickonElement(Stratos_Client_PageObjects.bulkUploadButton, "bulk upload button");
}

@When("User clicks on Select File button and upload file in clients page")
public void user_clicks_on_Select_File_button_and_upload_file_in_clients_page() throws Exception {
	Thread.sleep(5000);
	String CSVFile = "Auto-IT/bulk_clients.xlsx";
	testBase.FileUpload(Stratos_SitesAndCheckpoints_PageObjects.file, CSVFile);
   
}

@When("User clicks on Submit button in clients page")
public void user_clicks_on_Submit_button_in_clients_page() throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.bulkUploadSubmitButton, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.bulkUploadSubmitButton, "submit button");
   Thread.sleep(2000);
}

@Then("User validates the success message as {string} in clients page")
public void user_validates_the_success_message_as_in_clients_page(String string) throws InterruptedException {
	Thread.sleep(6000);
	}

@Then("User validates the error message as {string} of invalid Bulk Upload in clients page")
public void user_validates_the_error_message_as_of_invalid_Bulk_Upload_in_clients_page(String string) throws InterruptedException {
	Thread.sleep(6000);
	
}

@Then("User clicks on cancel button in clients page")
public void user_clicks_on_cancel_button_in_clients_page() throws Exception {
   testBase.waitForElement(Stratos_Client_PageObjects.bulkUploadCancelButton, 20);
   testBase.clickonElement(Stratos_Client_PageObjects.bulkUploadCancelButton, "cancel button");
   
}

@Then("User validates the error message as {string} of null Bulk Upload in clients page")
public void user_validates_the_error_message_as_of_null_Bulk_Upload_in_clients_page(String string) {
    
}



}
