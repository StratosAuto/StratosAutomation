package Stratos_gluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Stratos_pageObjects.Stratos_Admin_Equipment_PageObject;
import Stratos_pageObjects.Stratos_SitesAndCheckpoints_PageObjects;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.*;

public class stratos_SitesAndCheckpoints {
	String siteName;
	String siteDescription;
	String mobileNumber;
	String otherContactNumber;
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "SitesAndCheckpoints";
	public static String SiteName;	
	public static String sheetNameForClientName= "ClientModule";

	@When("User Click on Sites & Checkpoints module")
	public void user_Click_on_Sites_Checkpoints_module() throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.siteAndcheckpoints, 20);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.siteAndcheckpoints, "site and checkpoints");
	}

	@Given("User click on add new site button")
	public void user_click_on_add_new_site_button() throws Exception {
	    testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.addnewSiteButton, 20);
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.addnewSiteButton, "Add new site");
	    testBase.RefreshPage();
	}

	@Given("Verify that user able to enter invalid data in Add new site page")
	public void verify_that_user_able_to_enter_invalid_data_in_Add_new_site_page() throws Exception {
		
		
		String postalCode=testBase.randomAlphanumeric(3);
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.postalCode, 20);
//     	testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.postalCode, "postal code");
//		Thread.sleep(2000);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.postalCode, "postal code");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.postalCode, postalCode, "postal code");
		
		
		String mobile=testBase.randomAlphanumeric(6);
		Thread.sleep(2000);
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.mobile, 20);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.mobile, "mobile");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.mobile, mobile , "mobile");
		
		
		
		String email=testBase.randomAlphanumeric(3)+"@#1";
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.email, 20);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.email, "email");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.email, email , "email");
		
		
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.mobile, "mobile");
	    
	
	}
	
	@Given("User Validates the error messages of Invalid data of add new site all the feilds")
	public void user_Validates_the_error_messages_of_Invalid_data_of_add_new_site_all_the_feilds() throws Exception {
	    
		if (!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.inavalidPostalCodeError, "postal code"))) {
			ExceptionHandling.HandleAssertion("Give wrong postal code");
		} else
			Logs.info("Give Correct postal code");
		
		if (!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.invalidMobileNumber, "postal code"))) {
			ExceptionHandling.HandleAssertion("Give wrong mobile number");
		} else
			Logs.info("Give Correct mobile number");

		if (!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.invalidEmailAdressError, "postal code"))) {
			ExceptionHandling.HandleAssertion("Give wrong email address");
		} else
			Logs.info("Give Correct email address");
		
		
	}

	@Given("Verify that user able to enter invalid field length data in add new site page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_add_new_site_page() throws Exception {
		
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.siteName, 20);
		siteName=testBase.randomAplhabet(26);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.siteName, "site name");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.siteNameInput, siteName, "site name");
		
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.siteDescription, 20);
		siteDescription=testBase.randomAplhabet(252);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.siteDescription, "siteDescription");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.siteDescription, siteDescription, "site name");
		
		
	
		    String completeAdress=testBase.randomAlphanumeric(101);
//		    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.completeAdress, "complete adress");
		    testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.completeAdress, 20);
		    testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.completeAdress, completeAdress, "completeAdress");
		   
		    
			String firstName=testBase.randomAlphanumeric(26);
			testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.firstName, 20);
//			testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.firstName, "first name");
			testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.firstName, firstName, "firstName");
			
			
			
			Excel_Utility.setExcelFile(excelFileLocation, sheetName);
			String lastname=testBase.randomAlphanumeric(26);
			testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.lastName, 20);
//			testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.lastName, "first name");
			testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.lastName, lastname, "lastname");
			
			testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.firstName, "first name");
			Thread.sleep(2000);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.cancelButton, "cancelButton");
		
	}

	@Then("User Validates the error messages of Invalid field length data of add new site all the feilds")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_add_new_site_all_the_feilds() throws Throwable {
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.CancelButtonForInvalid, "cancelbutton");
		Thread.sleep(3000);
	}

//	@Given("User Click on Add New site Button")
//	public void user_Click_on_Add_New_site_Button() {
//	    
//	}

	@Then("User Enter site Name as {string} in add new site")
	public void user_Enter_site_Name_as_in_add_new_site(String string) throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.siteName, 20);
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		siteName = Excel_Utility.getCellData(1, 0);
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.siteName, "equipment name");
	    testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.siteNameInput, siteName, "Equipmentname");
	}

	@Then("User Enter site description as\"site description\" in add new site")
	public void user_Enter_site_description_as_site_description_in_add_new_site() throws Exception {
	    testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.siteDescription, 20);
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		siteDescription = Excel_Utility.getCellData(1, 1);
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.siteDescription, "equipment description");
	    testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.siteDescription, siteDescription, "EquipmentDescription");
	}

	@Then("User Enter complete Address {string} in add new site")
	public void user_Enter_complete_Address_in_add_new_site(String string) throws Throwable {
	    testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.completeAdress, 20);
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	    String completeAdress= Excel_Utility.getCellData(1, 2);
//	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.completeAdress, "complete adress");
	    testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.completeAdress, completeAdress, "completeAdress");
	    Thread.sleep(15000);
	    testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.completeAdressOption, 30);
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.completeAdressOption, "completeAdress");
	    Thread.sleep(5000);
	   
	}

	@Then("User select city as {string} in add new site\" in add new site")
	public void user_select_city_as_in_add_new_site_in_add_new_site(String string) throws Throwable {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.city, 20);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.city, "city");
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.selectCity, "select city");
		Thread.sleep(7000);
//        testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.longitudeVAlidate, 40);
        testBase.waitForElementToBevisible(Stratos_SitesAndCheckpoints_PageObjects.longitudeVAlidate, 40);
        testBase.ScrollDownBottom();

	}

	@Then("User select postal code as {string} in add new site")
	public void user_select_postal_code_as_in_add_new_site(String string) throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.postalCode, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String postalCode=Excel_Utility.getCellData(1, 3);
//     	testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.postalCode, "postal code");
//		Thread.sleep(2000);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.postalCode, "postal code");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.postalCode, "2314" , "postal code");
	    
	}

	@Then("Uesr can validate the country field as {string} in add new site")
	public void uesr_can_validate_the_country_field_as_in_add_new_site(String string) throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.country, 20);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.country, "country");
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.selectCountry, "country");
	    
	}

	@Then("User enter mobile number as {string} in add new site")
	public void user_enter_mobile_number_as_in_add_new_site(String string) throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.mobile, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String mobile=Excel_Utility.getCellData(1, 5);
		Thread.sleep(2000);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.mobile, "mobile");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.mobile, "1234567890" , "mobile");
	    
	}

	@Then("User enter email address as {string} in add new site")
	public void user_enter_email_address_as_in_add_new_site(String string) throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.email, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String email=Excel_Utility.getCellData(1, 6);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.email, "email");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.email, email , "email");
	    
	}

	@Then("Uesr enter site manager as {string} in add new site")
	public void uesr_enter_site_manager_as_in_add_new_site(String string) throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.siteManager, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String siteManager=Excel_Utility.getCellData(1, 7);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.siteManager, "siteManager");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.siteManager, siteManager , "siteManager");
	    
	}

	@Then("User select client name as {string} in add new site")
	public void user_select_client_name_as_in_add_new_site(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetNameForClientName);
		String ClientNamedropdown=Excel_Utility.getCellData(2, 0);
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.clientName, 20);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.clientName, "client name");
		
		Thread.sleep(2000);
		testBase.ClickViaMouse(Stratos_SitesAndCheckpoints_PageObjects.dropdownSelect(ClientNamedropdown), "clientname");
	}

	@Then("User enter contact first name as {string} in add new site")
	public void user_enter_contact_first_name_as_in_add_new_site(String string) throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.firstName, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String firstName=Excel_Utility.getCellData(1, 8);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.firstName, "first name");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.firstName, firstName, "firstName");
	    
	}

	@Then("User enter contact last name as {string} in add new site")
	public void user_enter_contact_last_name_as_in_add_new_site(String string) throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.lastName, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String lastname=Excel_Utility.getCellData(1, 9);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.lastName, "first name");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.lastName, lastname, "lastname");
	    
	}

	@Then("User enter site contact information mobile number as {string} in add new site")
	public void user_enter_site_contact_information_mobile_number_as_in_add_new_site(String string) throws Exception {
	    testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.siteMobile, 20);
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String siteMobile=Excel_Utility.getCellData(1, 5);
//	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.siteMobile, "site mobile");
	    testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.siteMobile, "1234567890", "sitemobile");
	}

	@Then("User enter site contact information email address as {string} in add new site")
	public void user_enter_site_contact_information_email_address_as_in_add_new_site(String string) throws Throwable {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.siteEmail, 20);
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String siteEmail=Excel_Utility.getCellData(1, 11);
//	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.siteEmail, "site mobile");
	    testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.siteEmail, siteEmail, "sitemobile");
	    Thread.sleep(2000);
	    testBase.ScrollUp();
	    
	}

	@Then("User Click on Save and Continue Button")
	public void user_Click_on_Save_and_Continue_Button() throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.addnewsiteSaveButton, 20);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.addnewsiteSaveButton, "save and continue button");
	}

	@Then("User Verifies the created site to validate site is created")
	public void user_Verifies_the_created_site_to_validate_site_is_created() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		siteName = Excel_Utility.getCellData(1, 0);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.filterButton, SiteName);
		
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.filterButton, siteName, "siteName");
		Thread.sleep(5000);
		if(!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.cellData, "Validate Deactivate"))) {
	    	ExceptionHandling.HandleAssertion("Site is not activated");
	    }else
	    	Logs.info("Site is activated");
	    testBase.RefreshPage();
		
	    
	}

	@When("User Click on Manage check points button")
	public void user_Click_on_Manage_check_points_button() throws Exception {
	    testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.manageCheckpointsButton, 20);
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.manageCheckpointsButton, "manageCheckpoints");
	    testBase.RefreshPage();
	}

	@When("Verify that user able to enter invalid data in manage checkpoints page")
	public void verify_that_user_able_to_enter_invalid_data_in_manage_checkpoints_page() throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.checkPointName, 20);
		String checkpoints=testBase.randomAplhabet(26);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.checkPointName, "checkPointName");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.checkPointName, checkpoints, "checkpoint name");
		
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.checkpointsAdress, 20);
		String checkpointAdress=testBase.randomAlphanumeric(250);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.checkpointsAdress, "checkPointName");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.checkpointsAdress, checkpointAdress, "checkpoint adress");
		
		String s=testBase.getElementText(Stratos_SitesAndCheckpoints_PageObjects.invalidDataErrorMessage, "error message");
		System.out.println(s);
		
		
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.siteCancelButton, "cancel button");
		
	}
	
	@Then("User Enter Checkpoint name as {string} in manage checkpoints")
	public void user_Enter_Checkpoint_name_as_in_manage_checkpoints(String string) throws Exception {
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.checkPointName, "checkpointname");
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String checkpoints = Excel_Utility.getCellData(1, 0);
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.checkPointName, string, string);
//		String checkpoints=testBase.randomAplhabet(5);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.checkPointName, "checkPointName");
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.checkPointName, checkpoints, "checkpoint name");
	}

	@Then("User Enter Adress as {string} in manage checkpoints")
	public void user_Enter_Adress_as_in_manage_checkpoints(String string) throws Throwable {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.checkpointsAdress, 20);
		   testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.checkpointsAdress, "checkpoints");
		   Excel_Utility.setExcelFile(excelFileLocation, sheetName);
			String checkPointAdress=Excel_Utility.getCellData(1, 2);
			testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.checkpointsAdress, checkPointAdress, "checkpointsAdress");
			Thread.sleep(10000);
			
			testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.checkPointName, "checkpointname");
			Thread.sleep(2000);
			testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.checkpointsAdress, "checkpoints");
			Thread.sleep(2000);
			testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.AdressdropDown, 20);
			testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.AdressdropDown, "Address drop down");
//			testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.clickonCheckpoints, 20);
//			testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.clickonCheckpoints, "checkpoints");
//			testBase.waitForElementToBevisible(Stratos_SitesAndCheckpoints_PageObjects.checkpointsLAtitude, 20);
			testBase.ScrollDownBottom();
			Thread.sleep(5000);
	}

	@Then("User Click Add button")
	public void user_Click_Add_button() throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.addButton, 20);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.addButton, "addbutton");
	    Thread.sleep(5000);
	   WebElement s=testBase.getListElementsText(Stratos_SitesAndCheckpoints_PageObjects.checkPointName);
	   System.out.println(s);
	}

	@Then("User Click on Done")
	public void user_Click_on_Done() throws Exception {
		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.doneButton, 20);
		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.doneButton, "addbutton");
	}
	
	@When("User clicks on Manage Site button")
	public void user_clicks_on_Manage_Site_button() throws Exception {
		Thread.sleep(5000);
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.manageSite, "Manage Site");
	}

	@When("User enters Mobile Number as {string} in Edit Site page")
	public void user_enters_Mobile_Number_as_in_Edit_Site_page(String string) throws Exception {
	   mobileNumber=testBase.randomNumeric(10);
	   Thread.sleep(2000);
	   testBase.clearTextbox(Stratos_SitesAndCheckpoints_PageObjects.siteMobile, "Mobile Number");
	   Thread.sleep(2000);
	   testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.siteMobile, mobileNumber, "Mobile Number");
	   Thread.sleep(2000);
	}

	@Then("User clicks on Update button")
	public void user_clicks_on_Update_button() throws Exception {
	   testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.updateButton, "Update Button");
	   Thread.sleep(10000);
	   testBase.RefreshPage();
	   
	}
	
	@Then("User validates the updates of Active Site")
	public void user_validates_the_updates_of_Active_Site() throws Exception {
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.filter, mobileNumber, "mobile number in filters");
	    Thread.sleep(5000);
	    if(!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.cellData, "Validate Deactivate"))) {
	    	ExceptionHandling.HandleAssertion("Site is not activated");
	    }else
	    	Logs.info("Site is activated");
	    testBase.RefreshPage();
	    
//	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.manageSite, "Manage Site");
//	    String data=testBase.driver.findElement(By.xpath("//input[@formcontrolname='siteMobile']")).getText();
//	    System.out.println(data);
//	    if(!(mobileNumber.contains(data))) {
//	    	ExceptionHandling.HandleAssertion("Mobile Number is not updated");
//	    }else
//	    	Logs.info("Mobile Number is updated");
	}
	@Then("User click on Inactive site tab")
	public void user_click_on_Inactive_site_tab() throws Exception {
		Thread.sleep(3000);
		testBase.RefreshPage();
		Thread.sleep(2000);
	    testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.inactiveSite, 20);
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.inactiveSite, "inactive site");
	    Thread.sleep(20000);
	}
	
	@Then("User clicks on Deactivate button")
	public void user_clicks_on_Deactivate_button() throws Exception {
		Thread.sleep(3000);
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.deactivateButton, "Deactivate");
	    
	}

	@Then("User validates the deactivated site")
	public void user_validates_the_deactivated_site() throws Exception {
	    Thread.sleep(5000);
//	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
//		siteName = Excel_Utility.getCellData(1, 0);
//	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.inactiveSite, "Inctive Sites");
//	    
//	    testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.filterButton, siteName, "Filter");
//	    if(!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.validateResults, "Validate Deactivate"))) {
//	    	ExceptionHandling.HandleAssertion("Site is not Deactivated");
//	    }else
//	    	Logs.info("Site is Deactivated");
		
//		testBase.ClickViaMouse(Stratos_SitesAndCheckpoints_PageObjects.inactiveSite, "Inctive Sites");
	    Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.filter, mobileNumber, "mobile number in filters");
	    Thread.sleep(5000);
	    if(!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.cellData, "Validate Deactivate"))) {
	    	ExceptionHandling.HandleAssertion("Site is not deactivated");
	    }else
	    	Logs.info("Site is deactivated");
		
	}

	@Then("User enters Other Contact Number as {string} in Edit Site page")
	public void user_enters_Other_Contact_Number_as_in_Edit_Site_page(String string) throws Exception {
		otherContactNumber=testBase.randomNumeric(10);
		Thread.sleep(10000);
		testBase.clearTextbox(Stratos_SitesAndCheckpoints_PageObjects.otherContactNumber, "Other Contact Number");
		Thread.sleep(2000);
		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.otherContactNumber, otherContactNumber, "Other Contact Number");
	}

	@Then("User validates the updates of Inactive Site")
	public void user_validates_the_updates_of_Inactive_Site() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		siteName = Excel_Utility.getCellData(1, 0);
		Thread.sleep(7000);
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.inactiveSite, "Inctive Sites");
	    testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.filterButton, siteName, "Filter");
	    Thread.sleep(3000);
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.manageSite, "Manage Site");
	    String data=testBase.driver.findElement(By.xpath("//input[@formcontrolname='othernumber']")).getText();	
	    if(!(otherContactNumber.contains(data))) {
	    	ExceptionHandling.HandleAssertion("Other Contact Number is not updated");
	    }else
	    	Logs.info("Other Contact Number is updated");
	}

	@Then("User clicks on Activate button")
	public void user_clicks_on_Activate_button() throws Exception {
		Thread.sleep(5000);
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.activateButton, "Activate");
	}

	@Then("User validates the activated site")
	public void user_validates_the_activated_site() throws Exception {
//		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
//		siteName = Excel_Utility.getCellData(1, 0);
//	    testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.filterButton, siteName, "Filter");
		Thread.sleep(5000);
	    if(!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.validateResults, "Validate Activated"))) {
	    	ExceptionHandling.HandleAssertion("Site is not Activated");
	    }else
	    	Logs.info("Site is Activated");
	}
	
	@Then("User click on bulk Upload button")
	public void user_click_on_bulk_upload_Button() throws Exception {
	   testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.bulkUpload, "Bulk Upload");
	   Thread.sleep(5000);
	}

	@Then("User clicks on Select File button and upload file")
	public void user_Select_the_bulk_upload_file() throws Exception {
		Thread.sleep(5000);
		String CSVFile = "Auto-IT/bulk_sites.xlsx";
		testBase.FileUpload(Stratos_SitesAndCheckpoints_PageObjects.file, CSVFile);
		Thread.sleep(5000);
	}

	@Then("User clicks on Submit button")
	public void user_click_on_submit_button() throws Exception {
	    testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.submitButton, "Submit Button");
	    Thread.sleep(5000);
	}
	@Then("User validates the success message as {string}")
	public void user_validates_the_success_message_as(String string) throws Throwable {
		Thread.sleep(2000);
	   if (!testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.BulkUploadSuccessMessage, "validates success message")) {
		ExceptionHandling.HandleAssertion("file not uploaded");
	   }else
	   Logs.info("Successfully uploaded");
	   
	}
	@Then("User Verifies the success message")
	public void user_Verifies_the_success_message() throws InterruptedException {
//	   Thread.sleep(10000);
	}

	@Then("User validates the error message as {string} of invalid Bulk Upload")
	public void user_validates_the_error_message_as_of_invalid_Bulk_Upload(String string) throws Exception {
		if (!testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.EmptyBulkFileErrorMessage, "validates error message")) {
			ExceptionHandling.HandleAssertion("file uploaded");
		   }else
		   Logs.info("File not uploaded");
	   
	}
	
	@Then("User clicks on cancel button")
	public void user_clicks_on_cancel_button() throws Throwable {
		Thread.sleep(2000);
	   testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.cancelButton, 20);
	   testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.cancelButton, "Cancel Button");
	   Thread.sleep(2000);
	}

	@Then("User validates the error message as {string} of null Bulk Upload")
	public void user_validates_the_error_message_as_of_null_Bulk_Upload(String string) throws Exception {
		if (!testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.DuplicateBulkfileUploadErrrorMessage, "validates error message")) {
			ExceptionHandling.HandleAssertion("file uploaded");
		   }else
		   Logs.info("File not uploaded");
	
	  
	}
	
//	@When("User Click on manage site")
//	public void user_Click_on_manage_site1() throws Exception {
//		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.manageSite, 20);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.manageSite, "manage site");
//		
//	    
//	}
//
//	@Then("User enter Site Name as {string} in Active Site")
//	public void user_enter_Site_Name_as_in_Active_Site() throws Exception {
//		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.clientName, 20);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.clientName, "client name");
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.selectClientName1, "client name");
//		Thread.sleep(2000);
//	}
//	@Then("User Click update Button")
//	public void user_Click_update_Button() throws Exception {
//		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.updateButton, 20);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.updateButton, "update button");
//		Thread.sleep(2000);
//	}
//
//	@Then("User Verifies the Success Message {string}")
//	public void user_Verifies_the_Success_Message1(String string) throws Exception {
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.filterButton, "filter");
//		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
//		siteName = Excel_Utility.getCellData(1, 0);
//		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.filterButton, siteName, "sitename");
//		if (!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.filterButton, "filetr"))) {
//			ExceptionHandling.HandleAssertion("data should not vissible");
//		}
//	else
//		Logs.info("data should be vissible");
//}
//
//	@Then("User enter Site Name as {string} in Inactive Site")
//	public void user_enter_Site_Name_as_in_Inactive_Site(String string) throws Exception {
//		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.clientName, 20);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.clientName, "client name");
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.selectClientName1, "client name");
//	}
//
//	@Then("User Click on Deactivate Button")
//	public void user_Click_on_Deactivate_Button() throws Exception {
//		testBase.waitForElement(Stratos_SitesAndCheckpoints_PageObjects.deactivateButton, 20);
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.deactivateButton, "deactivate Button");
//	    Thread.sleep(2000);
//	}
//
//	@Then("User Verifies the Success Message  {string}")
//	public void user_Verifies_the_Success_Message(String string) throws Exception {
//		testBase.clickonElement(Stratos_SitesAndCheckpoints_PageObjects.filterButton, "filter");
//		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
//		siteName = Excel_Utility.getCellData(1, 0);
//		testBase.typeinTextBox(Stratos_SitesAndCheckpoints_PageObjects.filterButton, siteName, "sitename");
//		testBase.takeScreenshot(string);
//		if (!(testBase.isElementVisible(Stratos_SitesAndCheckpoints_PageObjects.filterButton, "filetr"))) {
//			ExceptionHandling.HandleAssertion("data should vissible");
//		}
//	else
//		Logs.info("data should not vissible");
//	    
	}

