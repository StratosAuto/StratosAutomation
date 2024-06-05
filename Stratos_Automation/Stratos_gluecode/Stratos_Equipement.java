package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Admin_Equipment_PageObject;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stratos_Equipement {
	
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "EquipmentModule";
	public static String sheetName1 = "ClientModule";
	public static String SiteAndCheckointsSheet = "SitesAndCheckpoints";
	public static String EquipmentDescription;	
	public static String EquipmentName;
	//public static String ClientName;
	public static String SiteName;
	public static String EquipmentCategory;
	public static String EquipmentLicenseNumber;
	public static String EquipmentSerialNumber;
	public static String Comments;
	String equipmentDescription;
	String equipmentName;
	String equipmentLicenceNumber;
	String equipmentserialNumber;
	
	
	
	@When("User Click on Equipment module")
	public void user_Click_on_Equipment_module() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentModule, 20);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentModule, "Equipment Module");
		
	}

	@Given("User click on add new equipment button")
	public void user_click_on_add_new_equipment_button() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.addNewEquipment, 20);
		Thread.sleep(3000);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.addNewEquipment, "Add new Equipment Module");   
	}

	@Given("Verify that user able to enter invalid data in Add new equipment page")
	public void verify_that_user_able_to_enter_invalid_data_in_Add_new_equipment_page() throws Exception {
	
        
    	equipmentName=testBase.randomAlphanumeric(8)+"%$@";
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentName, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentName, "Equipment name");
		testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentName, equipmentName, "equipment name");
	
		
		String equipmentLicenseNumber=testBase.randomAlphanumeric(5)+"%$@";
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentLicenceNumber, "equipment license number");
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, String.valueOf(equipmentLicenseNumber), "Equipemnt");
	
	    
	    String EquipmentSerialNumber =testBase.randomAlphanumeric(6)+"%$@";
	    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, 20);
	  	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, "equipment serial number");
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, String.valueOf(EquipmentSerialNumber), "serial number");
	    Thread.sleep(2000);
	    
	    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.saveAndContinueButton, 20);
	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.saveAndContinueButton, "saveAndContinueButton");
	    Thread.sleep(2000);
	    
	    
//	    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.clearButton, 20);
//	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.clearButton, "clear button");
//	    Thread.sleep(2000);
	
	}
	
	@Given("User Validates the error messages of Invalid data of add new equipment all the feilds")
	public void user_Validates_the_error_messages_of_Invalid_data_of_add_new_equipment_all_the_feilds() throws Exception {
	   
		if (!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.inavalidEquipmentNameError, "equipment name"))) {
			ExceptionHandling.HandleAssertion("Give wrong Name");
		} else
			Logs.info("Give Correct Name");
		
		if (!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.invalidLicenseNumberError, "equipment license number"))) {
			ExceptionHandling.HandleAssertion("special Characters Allowed.");
		} else
			Logs.info("No special Characters Allowed.");
		
		
		if (!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.invalidSerialNumberError, "equipment serial number"))) {
			ExceptionHandling.HandleAssertion("special Characters Allowed.");
		} else
			Logs.info("No special Characters Allowed.");
		
		
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.clearButton, 20);
	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.clearButton, "clear button");
	    Thread.sleep(2000);
		
	}

	@Given("Verify that user able to enter invalid field length data in add new equipment page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_add_new_equipment_page() throws Exception {
		equipmentDescription=testBase.randomAlphanumeric(256);
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentDescription, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentDescription, "Equipment Description");
		testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentDescription, equipmentDescription, "equipment description");
        
		equipmentName=testBase.randomAlphanumeric(26);
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentName, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentName, "Equipment name");
		testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentName, equipmentName, "equipment name");
		String s=testBase.getElementText(Stratos_Admin_Equipment_PageObject.equipmentDescriptionerror, "Descroption error message");	   
		System.out.println(s);
		
		String equipmentLicenseNumber=testBase.randomAlphanumeric(51);
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentLicenceNumber, "equipment license number");
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, String.valueOf(equipmentLicenseNumber), "Equipemnt");
	
	    
	    String EquipmentSerialNumber =testBase.randomAlphanumeric(26);
	    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, 20);
	  	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, "equipment serial number");
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, String.valueOf(EquipmentSerialNumber), "serial number");
	    Thread.sleep(2000);
	    
	    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.saveAndContinueButton, 20);
	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.saveAndContinueButton, "saveAndContinueButton");
	    Thread.sleep(2000);
		
	    
	}

	@Then("User Validates the error messages of Invalid field length data of add new equipment all the feilds")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_add_new_equipment_all_the_feilds() throws Exception {
	    
		if (!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.equipmentDescriptionFieldvalidationError, "equipment description"))) {
			ExceptionHandling.HandleAssertion("Maximum 250 Characters are not Allowed");
		} else
			Logs.info("Maximum 250 Characters Allowed.");
		
		if (!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.equipmentNameFieldValidation, "equipment license number"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 Characters are not Allowed");
		} else
			Logs.info("Maximum 25 Characters Allowed.");
		
		
		if (!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberFieldValidation, "equipment description"))) {
			ExceptionHandling.HandleAssertion("Maximum 50 Characters are not Allowed");
		} else
			Logs.info("Maximum 50 Characters Allowed.");
		
		if (!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.equipmentSerialNumberFieldValidation, "equipment serial number"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 Characters are not Allowed");
		} else
			Logs.info("Maximum 25 Characters Allowed.");
		
		
		
	

		
		
//		String s1=testBase.getElementText(Stratos_Admin_Equipment_PageObject.equipmentTypeError, "type error message");	   
//		System.out.println(s1);
//	   
//		equipmentLicenceNumber=testBase.randomNumeric(10);
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentLicenceNumber, 20);
//		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentLicenceNumber, "Equipment name");
//		testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentLicenceNumber, equipmentLicenceNumber, "equipment license number");
//	   
//		equipmentserialNumber=testBase.randomNumeric(10);
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, 20);
//		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, "Equipment name");
//		testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, equipmentserialNumber, "equipment name");
	   
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.cancelButton, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.cancelButton, "cancel button");
	}

//	@Then("Admin User Click on Add New Euipment button")
//	public void admin_User_Click_on_Add_New_Euipment_button() throws Exception {
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentModule, 20);
//		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentModule, "Equipment Module");
//	}

	@Then("Admin User Enter Equipment Description")
	public void admin_User_Enter_Equipment_Description() throws Exception {
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		EquipmentDescription = Excel_Utility.getCellData(1, 0);
	    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentDescription, 20);
//	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentDescription, "equipment description");
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentDescription, EquipmentDescription, "EquipmentDescription");
	}

	@Then("Admin User Enter Equipment Name")
	public void admin_User_Enter_Equipment_Name() throws Exception {
		    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
			EquipmentName = Excel_Utility.getCellData(1, 1);
			testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentName, 20);
		    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentName, "equipment description");
		    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentName, EquipmentName, "EquipmentDescription");
		    Thread.sleep(4000);
		}

	@Then("Admin User Select Client Name from Drop Down")
	public void admin_User_Select_Client_Name_from_Drop_Down() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName1);
		String ClientName = Excel_Utility.getCellData(2, 0);
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.clientNameDropdown, 20);
		testBase.ClickViaMouse(Stratos_Admin_Equipment_PageObject.clientNameDropdown, "client name selected");
		Thread.sleep(2000);
		testBase.ClickViaMouse(Stratos_Admin_Equipment_PageObject.dropdownSelect(ClientName), "ClientName");
	}

	@Then("Admin User Select the Site Name from Drop Down")
	public void admin_User_Select_the_Site_Name_from_Drop_Down() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, SiteAndCheckointsSheet);
		String siteName = Excel_Utility.getCellData(1, 0);
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.siteNameDropdown, 20);
		Thread.sleep(4000);
		testBase.ClickViaMouse(Stratos_Admin_Equipment_PageObject.siteNameDropdown, "Site Name");
		testBase.ClickViaMouse(Stratos_Admin_Equipment_PageObject.dropdownSelect(siteName), "SiteName");
		

		}

	@Then("Admin User Select the Equipment Category")
	public void admin_User_Select_the_Equipment_Category() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentCategory, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentCategory, "equipment type name selected");
//		Thread.sleep(2000);
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.selectSiteName, 20);
		testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.selectEquipmentType, "Electronic Device");
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectEquipmentType, "Electronic Device");
		Thread.sleep(2000);
	}

	@Then("Admin User Enter Equipment License Number")
	public void admin_User_Enter_Equipment_License_Number() throws Exception {
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	    EquipmentLicenseNumber = Excel_Utility.getCellData_Integer(1, 2);
	    System.out.println(EquipmentLicenseNumber);
	    Thread.sleep(3000);
	    
	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentLicenceNumber, "equipment license number");
	    Thread.sleep(5000);
//	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, "1234567890", "License Number");
	    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, 20);
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, String.valueOf(EquipmentLicenseNumber), "Equipemnt");
	}

	@Then("Admin User Enter Equipment Serial Number")
	public void admin_User_Enter_Equipment_Serial_Number() throws Exception {
		
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		EquipmentSerialNumber=Excel_Utility.getCellData_Integer(1, 3);
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, 20);
	  	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, "equipment serial number");
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, String.valueOf(EquipmentSerialNumber), "serial number");
	    Thread.sleep(2000);
	}


	@Then("Admin User Select Auto Allocate from Drop Down")
	public void admin_User_Select_Auto_Allocate_from_Drop_Down() throws Throwable {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, "equipment type name selected");
		Thread.sleep(2000);
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.selectSiteName, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, "YES");
//		testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, "YES");
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectAutoAllocate, "YES");
	}

	@Then("Admin User Select Equipment Type from drop down")
	public void admin_User_Select_Equipment_Type_from_drop_down() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentType, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentType, "equipment type name selected");
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectEquipmentType1, "Doubel Barrel");
	//	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentType, "equipment type name selected");
		testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.selectEquipmentType1, "Doubel Barrel");
//		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectEquipmentType, "Pistol");
	}

	@Then("Admin User Select auto allocate from Drop Down")
	public void admin_User_Select_auto_allocate_from_Drop_Down() throws Exception {
	   testBase.waitForElement(Stratos_Admin_Equipment_PageObject.licenseExpirydateButton, 20);
	   testBase.clickonElement(Stratos_Admin_Equipment_PageObject.licenseExpirydateButton, "expiry date");
	   Thread.sleep(2000);
	}

	@Then("Admin User Select the Expiry Date from Drop Down")
	public void admin_User_Select_the_Expiry_Date_from_Drop_Down() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentCalendarButton, 20);
		//Thread.sleep(3000);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentCalendarButton, "select the expiry date");
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentCalendarArrow, 20);
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentCalendarArrow, "select the expiry date");
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentExpiryYear, 20);
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentExpiryYear, "select the expiry date");
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentExpiryMonth, 20);
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentExpiryMonth, "select the expiry date");
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentExpiryDate, 20);
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentExpiryDate, "select the expiry date");
		
	}

	@Then("Admin User Click on Save and Continue Button")
	public void admin_User_Click_on_Save_and_Continue_Button() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.saveAndContinueButton, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.saveAndContinueButton, "save and continue button");
	   Thread.sleep(2000);
	}

	@Then("User Verifies the created equipment to validate equipment is created")
	public void user_Verifies_the_created_equipment_to_validate_equipment_is_created() throws Exception {
		
		
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		EquipmentName = Excel_Utility.getCellData(1, 1);
		Thread.sleep(5000);
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, "filter");
		Thread.sleep(10000);
		testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.EquipmentFilter, EquipmentName, "equipment name");
		Thread.sleep(10000);
		if(!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.filterValidates, EquipmentName))){
			ExceptionHandling.HandleAssertion("New Equipment is not created");
		}
		else
			Logs.info("New Equipment is created");
	   
	}
	
	
	@Then("admin User click on manage equipment")
	public void admin_User_click_on_manage_equipment() throws Exception {
		 testBase.waitForElement(Stratos_Admin_Equipment_PageObject.manageEquipment, 20);
	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.manageEquipment, "manage equipment");
	    Thread.sleep(5000);
	}

	@Then("Admin User enter Equipement name as {string} in Active equipment")
	public void admin_User_enter_Equipement_name_as_in_Active_equipment(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentName, 20);
		testBase.clearTextbox(Stratos_Admin_Equipment_PageObject.equipmentName, "EquipmentName");
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		EquipmentName = Excel_Utility.getCellData(2, 1);
	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentName, "equipment description");
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentName, EquipmentName, "EquipmentDescription");
	    Thread.sleep(5000);	
	    }

	@Then("Admin User enter equipment license number as {string} in manage equipment")
	public void admin_User_enter_equipment_license_number_as_in_manage_equipment(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentLicenceNumber, 20);
		testBase.clearTextbox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, "EquipmentName");
		EquipmentLicenseNumber = Excel_Utility.getCellData_Integer(1, 2);
	    System.out.println(EquipmentLicenseNumber);
	    Thread.sleep(3000);
	    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, 20);
	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentLicenceNumber, "equipment license number");
	    Thread.sleep(5000);
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, "1234567890", "License Number");
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, String.valueOf(EquipmentLicenseNumber), "Equipemnt");
	    Thread.sleep(5000);
	}
	@Then("Admin User select the clent name in manage equipment")
	public void admin_User_select_the_clent_name_in_manage_equipment() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.clientNameDropdown, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.clientNameDropdown, "client name selected");
		testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.selectClientName, "John Fred");
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectClientName, "John Fred");
		Thread.sleep(5000);
	}
	
	@Then("Admin User select the site name in manage equipment")
	public void admin_User_select_the_site_name_in_manage_equipment() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.siteNameDropdown, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.siteNameDropdown, "site name selected");
//		Thread.sleep(2000);
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.selectSiteName, 20);
		testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.selectSiteName, "Elisa estate gate 23");
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectSiteName, "Elisa estate gate 23");

	}
	@Then("Admin User click on update Button")
	public void admin_User_click_on_update_Button() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.updateButton, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.updateButton, "update Button");
		Thread.sleep(5000);
	}

	@Then("Admin User validates the updated manage equipment")
	public void admin_User_validates_the_updated_manage_equipment() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		EquipmentName = Excel_Utility.getCellData(2, 1);
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, "filter");
		Thread.sleep(6000);
		testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.EquipmentFilter, EquipmentName, "equipment name");
		Thread.sleep(10000);
		if(!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.filterValidates, EquipmentName))){
			ExceptionHandling.HandleAssertion("New Equipment is not updated");
		}
		else
			Logs.info("New Equipment is updated");
	}

	@Then("Admin User click on  deactivate Button")
	public void admin_User_click_on_deactivate_Button() throws Exception {
		Thread.sleep(4000);
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.deactivateButton, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.deactivateButton, EquipmentName);
		Thread.sleep(5000);
	}
	@Then("Click on inactive page in equipment")
	public void click_on_inactive_page_in_equipment() throws Exception {
		Thread.sleep(4000);
	    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.inactiveEquipment, 20);
	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.inactiveEquipment, "inactive equipment");
	    Thread.sleep(5000);
	}

	@Then("Admin User validates the deactivate manage equipment")
	public void admin_User_validates_the_deactivate_manage_equipment() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		EquipmentName = Excel_Utility.getCellData(2, 1);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, "filter");
		Thread.sleep(10000);
		testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.EquipmentFilter, EquipmentName, "equipment name");
		Thread.sleep(10000);
		if(!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.filterValidates, EquipmentName))){
			ExceptionHandling.HandleAssertion("New Equipment is not deactivated");
		}
		else
			Logs.info("New Equipment is deactivated");
	}

	@Then("Admin User click on  faulty Button")
	public void admin_User_click_on_faulty_Button() throws Exception {
		Thread.sleep(4000);
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.markFaultyButton, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.markFaultyButton, EquipmentName);
		Thread.sleep(10000);
		testBase.RefreshPage();
		
	}
	@Then("Click on faulty page in equipment")
	public void click_on_faulty_page_in_equipment() throws Exception {
	  testBase.waitForElement(Stratos_Admin_Equipment_PageObject.faultyEquipment, 20);
	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.faultyEquipment, "faulty");
	    Thread.sleep(40000);
	}
	
	@Then("Admin User validates the faulty manage equipment")
	public void admin_User_validates_the_faulty_manage_equipment() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, 20);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		EquipmentName = Excel_Utility.getCellData(2, 1);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, "filter");
		Thread.sleep(10000);
		testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.EquipmentFilter, EquipmentName, "equipment name");
		Thread.sleep(10000);
		if(!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.filterValidates, EquipmentName))){
			ExceptionHandling.HandleAssertion("New Equipment is not mark faulty");
		}
		else
			Logs.info("New Equipment is mark faulty");
	}
	
	@When("User clicks on Bulk Upload button in equpment page")
	public void user_clicks_on_Bulk_Upload_button_in_equpment_page() throws Exception {
	   testBase.waitForElement(Stratos_Admin_Equipment_PageObject.bulkUploadBUtton, 20);
	   testBase.clickonElement(Stratos_Admin_Equipment_PageObject.bulkUploadBUtton, "bulk upload button");
	   
	}

	@When("User clicks on Select File button and upload file in equipment page")
	public void user_clicks_on_Select_File_button_and_upload_file_in_equipment_page() throws Exception {
		Thread.sleep(5000);
		String CSVFile = "Auto-IT/bulk_equipments.xlsx";
		testBase.FileUpload(Stratos_Admin_Equipment_PageObject.file, CSVFile);
	}

	@When("User clicks on Submit button in equipment page")
	public void user_clicks_on_Submit_button_in_equipment_page() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.bulkSubmitButton, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.bulkSubmitButton, "bulk submit button");
	}

	@Then("User Verifies the success message in bulk upload")
	public void user_Verifies_the_success_message_in_bulk_upload() throws InterruptedException {
		
		Thread.sleep(20000);
	   
	}

	@Then("User validates the error message as {string} of invalid Bulk Upload in equipment page")
	public void user_validates_the_error_message_as_of_invalid_Bulk_Upload_in_equipment_page(String string) throws InterruptedException {
		Thread.sleep(5000);
	}
	@When("User clicks on cancel button in equipment page")
	public void user_clicks_on_cancel_button_in_equipment_page() throws Exception {
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.bulkUploadCancelButton, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.bulkUploadCancelButton, "cancel button");
	}

	

	@Then("User validates the error message as {string} of null Bulk Upload in equipment page")
	public void user_validates_the_error_message_as_of_null_Bulk_Upload_in_equipment_page(String string) throws InterruptedException {
		Thread.sleep(5000);
	}


//	@Then("admin User click on manage equipment")
//	public void admin_User_click_on_manage_equipment() throws Exception {
//    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.manageEquipment, 20);
//    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.manageEquipment, "manage equipment");
//    Thread.sleep(2000);
//
//	}
//
//	@Then("Admin User enter Equipement name as {string} in Active equipment")
//	public void admin_User_enter_Equipement_name_as_in_Active_equipment(String string) throws Exception {
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentName, 20);
//		testBase.clearTextbox(Stratos_Admin_Equipment_PageObject.equipmentName, "EquipmentName");
//		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
//		EquipmentName = Excel_Utility.getCellData(1, 1);
//	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentName, "equipment description");
//	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentName, EquipmentName, "EquipmentDescription");
//		
//	}
//
//	@Then("Admin User enter equipment license number as {string} in manage equipment")
//	public void admin_User_enter_equipment_license_number_as_in_manage_equipment(String string) throws Exception {
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentLicenceNumber, 20);
//		testBase.clearTextbox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, "EquipmentName");
//		EquipmentLicenseNumber = Excel_Utility.getCellData_Integer(1, 2);
//	    System.out.println(EquipmentLicenseNumber);
//	    Thread.sleep(3000);
//    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, 20);
//	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentLicenceNumber, "equipment license number");
//    Thread.sleep(5000);
////	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, "1234567890", "License Number");
//	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, String.valueOf(EquipmentLicenseNumber), "Equipemnt");
//	
//	}
//
//	@Then("Admin User validates the updated manage equipment")
//	public void admin_User_validates_the_updated_manage_equipment() throws Exception {
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.updateButton, 20);
//		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.updateButton, "updateButton");
//	    
//	}
//
//	@Then("Admin User validates the updated manage equipment")
//	public void admin_User_validates_the_updated_manage_equipment() {
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, 20);
//		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
//		EquipmentName = Excel_Utility.getCellData(1, 1);
//		Thread.sleep(5000);
//		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, "filter");
//		testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.EquipmentFilter, EquipmentName, "equipment name");
//		if(!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.equipmentNameValidate, EquipmentName))){
//			ExceptionHandling.HandleAssertion("New Equipment is not created");
//		}
//		else
//			Logs.info("New Equipment is created");
//	}
//
//	@Then("Admin User click on faulty equipment")
//	public void admin_User_click_on_faulty_equipment() throws Exception {
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.faultyEquipment, 20);
//		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.faultyEquipment, "faultyEquipment");
//		
//	}
//
//	@Then("Admin User click on update Button")
//	public void admin_User_click_on_save_and_continue_Button() throws Exception {
//		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.updateButton, 20);
//		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.updateButton, "update Button");
//		
//	    
//	}
//
//	@Then("Admin User click on inactive equipment")
//	public void admin_User_click_on_inactive_equipment() {
//		
//	    
//	}
//
//	@Given("Admin User login into the Stratos application")
//	public void admin_User_login_into_the_Stratos_application() {
//	    
//	}
//
//	@When("Admin User click on equipment module")
//	public void admin_User_click_on_equipment_module() {
//	    
//	}
//
//	@Then("Admin User click on bulk upload Button")
//	public void admin_User_click_on_bulk_upload_Button() {
//	   
//	}
//
//	@Then("Admin User Select the bulk upload file")
//	public void admin_User_Select_the_bulk_upload_file() {
//	    
//	}
//
//	@Then("Admin User click on submit button.")
//	public void admin_User_click_on_submit_button() {
//	    
//	}
//
//	@Then("Admin User Verifies the success message")
//	public void admin_User_Verifies_the_success_message() {
//	    
//	}
//}



   @Then("Admin User Enter the Equipment Description")
   public void admin_User_Enter_the_Equipment_Description() throws Throwable {
	   Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		EquipmentDescription = Excel_Utility.getCellData(3, 0);
	    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentDescription, 20);
//	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentDescription, "equipment description");
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentDescription, EquipmentDescription, "EquipmentDescription");
	}


    @Then("Admin User Enter the Equipment Name")
     public void admin_User_Enter_the_Equipment_Name() throws Throwable {
    	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		EquipmentName = Excel_Utility.getCellData(3, 1);
		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentName, 20);
	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentName, "equipment description");
	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentName, EquipmentName, "EquipmentDescription");
}

     @Then("Admin User Select the Client Name from Drop Down")
       public void admin_User_Select_the_Client_Name_from_Drop_Down() throws Throwable {
    	 testBase.waitForElement(Stratos_Admin_Equipment_PageObject.clientNameDropdown, 20);
 		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.clientNameDropdown, "client name selected");
 		testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.clientNameDropdown, "John Fred");
 		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectClientName, "John Fred");
 		Thread.sleep(2000);
}

      @Then("Admin User Select Site Name from Drop Down")
      public void admin_User_Select_Site_Name_from_Drop_Down() throws Throwable {
    	  testBase.waitForElement(Stratos_Admin_Equipment_PageObject.siteNameDropdown, 20);
  		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.siteNameDropdown, "site name selected");
//  		Thread.sleep(2000);
//  		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.selectSiteName, 20);
  		testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.selectSiteName, "sativa");
  		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectSiteName, "sativa");
}

     @Then("Admin User Select Equipment Category")
     public void admin_User_Select_Equipment_Category() throws Throwable {
    	 testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentCategory, 20);
 		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentCategory, "equipment type name selected");
// 		Thread.sleep(2000);
// 		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.selectSiteName, 20);
 		testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.selectEquipmentType, "Electronic Device");
 		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectEquipmentType, "Electronic Device");
 		Thread.sleep(2000);
}

      @Then("Admin User Enter the Equipment License Number")
      public void admin_User_Enter_the_Equipment_License_Number() throws Throwable {
    	  Excel_Utility.setExcelFile(excelFileLocation, sheetName);
  	    EquipmentLicenseNumber = Excel_Utility.getCellData_Integer(3, 2);
  	    System.out.println(EquipmentLicenseNumber);
  	    Thread.sleep(3000);
  	    
  	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentLicenceNumber, "equipment license number");
  	    Thread.sleep(5000);
//  	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, "1234567890", "License Number");
  	    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, 20);
  	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentLicenseNumberInput, String.valueOf(EquipmentLicenseNumber), "Equipemnt");
}

      @Then("Admin User Enter the Equipment Serial Number")
     public void admin_User_Enter_the_Equipment_Serial_Number() throws Throwable {
    	  Excel_Utility.setExcelFile(excelFileLocation, sheetName);
  		EquipmentSerialNumber=Excel_Utility.getCellData_Integer(3, 3);
  		testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, 20);
  	  	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, "equipment serial number");
  	    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.equipmentSerialNumber, String.valueOf(EquipmentSerialNumber), "serial number");
  	    Thread.sleep(2000);	  
    
}

      @Then("Admin User Select the Auto Allocate from Drop Down")
       public void admin_User_Select_the_Auto_Allocate_from_Drop_Down() throws Throwable {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, "equipment type name selected");
	Thread.sleep(2000);
//	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.selectSiteName, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, "YES");
//	testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, "YES");
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectAutoAllocate, "YES");
}

    @Then("Admin User Select the Equipment Type from drop down")
       public void admin_User_Select_the_Equipment_Type_from_drop_down() throws Throwable {
    	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentType, 20);
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentType, "equipment type name selected");
		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectEquipmentType1, "Doubel Barrel");
	//	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentType, "equipment type name selected");
		testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.selectEquipmentType1, "Doubel Barrel");
//		testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectEquipmentType, "Pistol");
}

@Then("Admin User Select the auto allocate from Drop Down")
public void admin_User_Select_the_auto_allocate_from_Drop_Down() throws Throwable {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, "equipment type name selected");
	Thread.sleep(4000);
//	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.selectSiteName, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, "YES");
	Thread.sleep(4000);

//	testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.equipmentAutoallocate, "YES");
//	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectAutoAllocate, "YES");
}

@Then("Admin User Select Expiry Date from Drop Down")
public void admin_User_Select_Expiry_Date_from_Drop_Down() throws Throwable {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.licenseExpirydateButton, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.licenseExpirydateButton, "select the expiry date");
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.selectlicenseExpirydate, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectlicenseExpirydate, EquipmentName);
	Thread.sleep(2000);
}

@Then("User Verifies created equipment to validate equipment is created")
public void user_Verifies_created_equipment_to_validate_equipment_is_created() throws Throwable {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	EquipmentName = Excel_Utility.getCellData(3, 1);
	Thread.sleep(5000);
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, "filter");
	Thread.sleep(10000);
	testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.EquipmentFilter, EquipmentName, "equipment name");
	Thread.sleep(10000);
	if(!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.equipmentNameValidate, EquipmentName))){
		ExceptionHandling.HandleAssertion("New Equipment is not created");
	}
	else
		Logs.info("New Equipment is created");
    

  }
@Then("Admin User Clicks on Inactive Equipments")
public void admin_User_Clicks_on_Inactive_Equipments() throws Throwable {
	Thread.sleep(4000);
    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.inactiveEquipment, 20);
    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.inactiveEquipment, "inactive equipment");
    Thread.sleep(5000);
    
}

@Then("Admin User Search the created Working equipment in filter")
public void admin_User_Search_the_created_Working_equipment_in_filter() throws Exception {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	EquipmentName = Excel_Utility.getCellData(3, 1);
	Thread.sleep(5000);
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, "filter");
	Thread.sleep(10000);
	testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.EquipmentFilter, EquipmentName, "equipment name");
	Thread.sleep(10000);
	if(!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.filterValidates, EquipmentName))){
		ExceptionHandling.HandleAssertion("New Equipment is not created");
	}
	else
		Logs.info("New Equipment is created");
    
}

@Then("Admin User Clicks Manage equipment button in Inactive equipment")
public void admin_User_Clicks_Manage_equipment_button_in_Inactive_equipment() throws Throwable  {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.inactiveManageEquipment, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.inactiveManageEquipment, "EquipmentName");
    
}

@Then("Admin User Clicks on Assign Employee")
public void admin_User_Clicks_on_Assign_Employee() throws Throwable {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.assignEquipment, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.assignEquipment, "EquipmentName");
	
   
}

@Then("Admin User Select the employee name")
public void admin_User_Select_the_employee_name() throws Throwable {
    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.employeeNameInAssignEmployee, 20);
    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.employeeNameInAssignEmployee, "EquipmentName");
    
    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.selectEmployeeNameInAssignEmployee, 20);
    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectEmployeeNameInAssignEmployee, "EquipmentName");
}

@Then("Admin User Select the Return date")
public void admin_User_Select_the_Return_date() throws Throwable {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.returnDateInAssignEmployee, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.returnDateInAssignEmployee, "EquipmentName");
	
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.selectreturnDateInAssignEmployee, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectreturnDateInAssignEmployee, "EquipmentName");
    
}

@Then("Admin User Clicks on submit button")
public void admin_User_Clicks_on_submit_button() throws Throwable {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.submitButtonAssignEmployee, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.submitButtonAssignEmployee, "EquipmentName");
    
}

@Then("Admin User capture the success message")
public void admin_User_capture_the_success_message() throws Throwable  {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.successMessageforAssignEmployee, 20);

	   Thread.sleep(5000);
	   if(!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.successMessageforAssignEmployee, "Validate Employee"))) {
	   	ExceptionHandling.HandleAssertion("Success message not displayed");
	   }else
	   	Logs.info("success message displayed");
	   
	Thread.sleep(2000);
	
    
}

@Then("Admin User Clicks on Active equipment")
public void admin_User_Clicks_on_Active_equipment() {
    
}

@Then("Admin User Clicks on manage equipment in Active equipment")
public void admin_User_Clicks_on_manage_equipment_in_Active_equipment() throws Throwable {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.manageEquipmentInActiveEquipment, 20);
    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.manageEquipmentInActiveEquipment, "EquipmentName"); 
    Thread.sleep(2000);
}

@Then("Admin User Clicks on Return Equipment")
public void admin_User_Clicks_on_Return_Equipment() throws Throwable {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.returnEquipmentButton, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.returnEquipmentButton, "ReturnEquipment");
	
    
}

@Then("Admin User Enters the Return comments")
public void admin_User_Enters_the_Return_comments() throws Throwable {
	
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	Comments = Excel_Utility.getCellData(3, 6);
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.returnComments, 20);
    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.returnComments, "returnComments");
    testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.returnComments, Comments, "returnComments");
    
}

@Then("Admin User Select the Return State as Faulty")
public void admin_User_Select_the_Return_State_as_Faulty() throws Throwable {
    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.returnStateDropDown, 20);
    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.returnStateDropDown, "ReurnState");
    Thread.sleep(2000);
    
    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.selectReturnStateDropDown, 20);
    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.selectReturnStateDropDown, "EquipmentName");
}

@Then("Admin User Clicks on Submit button")
public void admin_User_Clicks_on_Submit_button() throws Throwable {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.SubmitButtonReturnEquipment, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.SubmitButtonReturnEquipment, "SubmitButton");
   
}

@Then("Admin User Captures the Return state success message")
public void admin_User_Captures_the_Return_state_success_message() throws Throwable  {
    Thread.sleep(4000);
}

@Then("Admin User Validates the Return state Working equipment")
public void admin_User_Validates_the_Return_state_Working_equipment() throws Throwable {
	Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	EquipmentName = Excel_Utility.getCellData(3, 1);
	Thread.sleep(5000);
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.EquipmentFilter, "filter");
	Thread.sleep(10000);
	testBase.typeinTextBox(Stratos_Admin_Equipment_PageObject.EquipmentFilter, EquipmentName, "equipment name");
	Thread.sleep(10000);
	if(!(testBase.isElementVisible(Stratos_Admin_Equipment_PageObject.filterValidates, EquipmentName))){
		ExceptionHandling.HandleAssertion("New Equipment is not created");
	}
	else
		Logs.info("New Equipment is created");
    
}
   
@Then("Click on Manage Equipment in Faulty equipment")
public void click_on_Manage_Equipment_in_Faulty_equipment() throws Throwable {
    testBase.waitForElement(Stratos_Admin_Equipment_PageObject.manageEquipmentInFaulty, 20);
    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.manageEquipmentInFaulty, "EquipmentName");
}

@Then("Click on Deactivate button in Faulty Equipment")
public void click_on_Deactivate_button_in_Faulty_Equipment() throws Throwable {
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.dectivateButtonInFaultyEquipment, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.dectivateButtonInFaultyEquipment, "DeactivateButton");
   
}

@Then("Admin User Select the Return State as Working")
public void admin_User_Select_the_Return_State_as_Working() throws Throwable {
	 testBase.waitForElement(Stratos_Admin_Equipment_PageObject.returnStateDropDown, 20);
	    testBase.clickonElement(Stratos_Admin_Equipment_PageObject.returnStateDropDown, "ReurnState");
	    Thread.sleep(2000);
	    
	testBase.waitForElement(Stratos_Admin_Equipment_PageObject.workingStateinReturnEquipment, 20);
	testBase.clickonElement(Stratos_Admin_Equipment_PageObject.workingStateinReturnEquipment, "workingState");
   
}




}







