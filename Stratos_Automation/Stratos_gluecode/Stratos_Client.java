package Stratos_gluecode;

import org.openqa.selenium.WebElement;

import Stratos_pageObjects.Stratos_Client_PageObjects;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import io.cucumber.java.en.*;

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
	testBase.waitForElement(Stratos_Client_PageObjects.clientName, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	ClientName = Excel_Utility.getCellData(1, 0);
	testBase.clickonElement(Stratos_Client_PageObjects.clientName, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.clientName, ClientName, "string");
   
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	mobileNumber = Excel_Utility.getCellData_Integer(1, 1);
	testBase.waitForElement(Stratos_Client_PageObjects.mobileNumber, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.mobileNumber, "Mobile Number");
	testBase.typeinTextBox(Stratos_Client_PageObjects.mobileNumber, String.valueOf(mobileNumber), "Mobile Number");
    
	testBase.waitForElement(Stratos_Client_PageObjects.emailAdress, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	EmailAdress = Excel_Utility.getCellData(1, 2);
	testBase.clickonElement(Stratos_Client_PageObjects.emailAdress, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.emailAdress, EmailAdress, "string");
	
	testBase.waitForElement(Stratos_Client_PageObjects.faxNumber, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	FaxNumber = Excel_Utility.getCellData_Integer(1, 3);
	testBase.clickonElement(Stratos_Client_PageObjects.faxNumber, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.faxNumber, String.valueOf(FaxNumber), "string");
    
	testBase.waitForElement(Stratos_Client_PageObjects.vatNumber, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	VatNumber = Excel_Utility.getCellData_Integer(1, 4);
	testBase.clickonElement(Stratos_Client_PageObjects.vatNumber, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.vatNumber, String.valueOf(VatNumber), "string");

	testBase.waitForElement(Stratos_Client_PageObjects.accountManager, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	AccountManager = Excel_Utility.getCellData(1, 6);
	testBase.clickonElement(Stratos_Client_PageObjects.accountManager, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.accountManager, AccountManager, "string");
    
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	Status = Excel_Utility.getCellData(1, 5);
	testBase.clickonElement(Stratos_Client_PageObjects.clickStatus, "status dropdown");
	testBase.waitForElement(Stratos_Client_PageObjects.clickStatus, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.status, "inactive");
//	testBase.dropdownSelectElement(Stratos_Client_PageObjects.clickStatus, Status);

	testBase.waitForElement(Stratos_Client_PageObjects.street, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	Street = Excel_Utility.getCellData(1, 7);
	testBase.clickonElement(Stratos_Client_PageObjects.street, "Street");
	testBase.typeinTextBox(Stratos_Client_PageObjects.street, Street, "Street");
    

	testBase.waitForElement(Stratos_Client_PageObjects.street, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	Street2 = Excel_Utility.getCellData(1, 8);
	testBase.clickonElement(Stratos_Client_PageObjects.street2, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.street2, Street2, "string");
   

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
	testBase.waitForElement(Stratos_Client_PageObjects.clientName, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	ClientName = Excel_Utility.getCellData(2, 0);
	testBase.clickonElement(Stratos_Client_PageObjects.clientName, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.clientName, ClientName, "string");
    
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
	testBase.waitForElement(Stratos_Client_PageObjects.emailAdress, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	EmailAdress = Excel_Utility.getCellData(2, 2);
	testBase.clickonElement(Stratos_Client_PageObjects.emailAdress, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.emailAdress, EmailAdress, "string");
}

@Then("User Enter Fax Number {string} in add client page")
public void user_Enter_Fax_Number_in_add_client_page(String string) throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.faxNumber, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	FaxNumber = Excel_Utility.getCellData_Integer(2, 3);
	testBase.clickonElement(Stratos_Client_PageObjects.faxNumber, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.faxNumber, String.valueOf(FaxNumber), "string");
}

@Then("User Enter Vat Number {string} in add client page")
public void user_Enter_Vat_Number_in_add_client_page(String string) throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.vatNumber, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	VatNumber = Excel_Utility.getCellData_Integer(2, 4);
	testBase.clickonElement(Stratos_Client_PageObjects.vatNumber, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.vatNumber, String.valueOf(VatNumber), "string");
}

@Then("User Enter Account Manager {string} in add client page")
public void user_Enter_Account_Manager_in_add_client_page(String string) throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.accountManager, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	AccountManager = Excel_Utility.getCellData(2, 6);
	testBase.clickonElement(Stratos_Client_PageObjects.accountManager, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.accountManager, AccountManager, "string");
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
	testBase.waitForElement(Stratos_Client_PageObjects.street, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	Street = Excel_Utility.getCellData(2, 7);
	testBase.clickonElement(Stratos_Client_PageObjects.street, "Street");
	testBase.typeinTextBox(Stratos_Client_PageObjects.street, Street, "Street");
}

@Then("User Enter street1 {string} in add client page")
public void user_Enter_street1_in_add_client_page(String string) throws Throwable {
	testBase.waitForElement(Stratos_Client_PageObjects.street, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	Street2 = Excel_Utility.getCellData(2, 8);
	testBase.clickonElement(Stratos_Client_PageObjects.street2, "client name");
	testBase.typeinTextBox(Stratos_Client_PageObjects.street2, Street2, "string");
    
}

@Then("User Select city {string} in add client page")
public void user_Select_city_in_add_client_page(String string) throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.city, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.city, "City dropdown");
	testBase.clickonElement(Stratos_Client_PageObjects.selectCity, "Pretoria");

   
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
	testBase.clickonElement(Stratos_Client_PageObjects.selectCountry, "Pretoria");
}

@Then("User Enter postal code {string} in add client page")
public void user_Enter_postal_code_in_add_client_page(String string) throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.postalCode, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	PostalCode = Excel_Utility.getCellData(2, 11);
	testBase.clickonElement(Stratos_Client_PageObjects.postalCode, " postal code");
	testBase.typeinTextBox(Stratos_Client_PageObjects.postalCode, PostalCode, "PostalCode");
   
}

@Then("User Enter comments {string} in add client page")
public void user_Enter_comments_in_add_client_page(String string) throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.comments, 20);
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	Comments = Excel_Utility.getCellData(2, 12);
	testBase.clickonElement(Stratos_Client_PageObjects.comments, " postal code");
	testBase.typeinTextBox(Stratos_Client_PageObjects.comments, Comments, "PostalCode");
    
}

@Then("User Click on Save and Continue Button in add client page")
public void user_Click_on_Save_and_Continue_Button_in_add_client_page() throws Exception {
	testBase.waitForElement(Stratos_Client_PageObjects.saveAndcontinue, 20);
	testBase.clickonElement(Stratos_Client_PageObjects.saveAndcontinue, " save and continue");
  
}

@Then("User Verifies the client Success Message as {string}")
public void user_Verifies_the_client_Success_Message_as(String string) throws Exception {
   String s =testBase.getElementText(Stratos_Client_PageObjects.addclientSuccessMessage, "success message");
   System.out.println(s);
}}
