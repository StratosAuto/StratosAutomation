package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Admin_3rdPartyProviders_PageObjects;
import Stratos_pageObjects.Stratos_Manager_JobCards_Pageobjects;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.*;

public class Stratos_Manager_JobCards_tasks {

	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "Manager Data";
	public String jobCardName;
	public String updateJobCardDescription;
	public String taskName;
	public String taskDescription;
	
	@Given("User clicks on Job Card & Tasks in the menu")
	public void user_clicks_on_Job_Card_Tasks_in_the_menu() throws Exception {
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.jobCardMenu, 20);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.jobCardMenu, "Job Cards&Tasks");
	}

	@Given("User clicks on Add New Job Card button")
	public void user_clicks_on_Add_New_Job_Card_button() throws Exception {
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.addNewJobCardButton, 20);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.addNewJobCardButton, "Add New Job Card");
	}

	@Then("Verify that user able to enter invalid field length data in Add Job Card page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_Add_Job_Card_page() throws Exception {
		String lengthJobCardName = testBase.randomAlphanumeric(30);
		String lengthJobcardDescription = testBase.randomAlphanumeric(260);
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.jobCardName, 20);
		testBase.typeinTextBox(Stratos_Manager_JobCards_Pageobjects.jobCardName, lengthJobCardName, "Job Card Name");
		testBase.typeinTextBox(Stratos_Manager_JobCards_Pageobjects.jobCardDescription, lengthJobcardDescription,
				"Job Card Description");
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.jobCardName, "Job Card Name");
	}

	@Then("User Validates the error messages of Invalid field length data of all the feilds of Job Cards")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_all_the_feilds_of_Job_Cards()
			throws Exception {
		if (!(testBase.isElementVisible(Stratos_Manager_JobCards_Pageobjects.lengthJobCardName, "Job Card Name"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 Characters Allowed. element is not visible");
		} else
			Logs.info("Maximum 25 Characters Allowed. element is visible");

		if (!(testBase.isElementVisible(Stratos_Manager_JobCards_Pageobjects.lengthJobCardDescription,
				"Job Card Description"))) {
			ExceptionHandling.HandleAssertion("Maximum 250 Characters Allowed. element is not visible");
		} else
			Logs.info("Maximum 250 Characters Allowed. element is visible");

	}
	
	@Then("User clicks on Cancel button on Job Cards")
	public static void user_clicks_on_Cancel_button_on_Job_Cards() throws Exception {
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.cancelButton, 20);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.cancelButton, "Cancel Button");
	}

	@Then("User clicks on Save and Continue button and validates mandatory fileds")
	public void user_clicks_on_Save_and_Continue_button_and_validates_mandatory_fileds() throws Exception {
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.saveAndContinueButton, "Save And Continue");
		if (testBase.isElementVisible(Stratos_Manager_JobCards_Pageobjects.validateNull, "Job Cards And Tasks")) {
			ExceptionHandling.HandleAssertion("New Job Card is created");
		} else
			Logs.info("New Job Card is not created");
	}

	@Then("User enters Job Card Name as {string}")
	public void user_enters_Job_Card_Name_as(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String jobCardName = Excel_Utility.getCellData(1, 1);
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.jobCardName, 20);
		testBase.typeinTextBox(Stratos_Manager_JobCards_Pageobjects.jobCardName, jobCardName, "Job Card Name");
	}

	@Then("User enters Job Card Description as {string}")
	public void user_enters_Job_Card_Description_as(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String jobCardDescription = Excel_Utility.getCellData(1, 2);
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.jobCardDescription, 20);
		testBase.typeinTextBox(Stratos_Manager_JobCards_Pageobjects.jobCardDescription, jobCardDescription, "Job Card Description");
	}

	@Then("User enters Client Name as {string}")
	public void user_enters_Client_Name_as(String string) throws Exception {
		Thread.sleep(5000);
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.clientName, 20);
		testBase.ClickViaMouse(Stratos_Manager_JobCards_Pageobjects.clientName, "Client Name");
		Thread.sleep(2000);
		testBase.ClickViaMouse(Stratos_Manager_JobCards_Pageobjects.selectClientName, "Client Name");
	}

	@Then("User enters Site Name as {string}")
	public void user_enters_Site_Name_as(String string) throws Exception {
		Thread.sleep(5000);
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.siteName, 20);
		testBase.ClickViaMouse(Stratos_Manager_JobCards_Pageobjects.siteName, "Site Name");
		Thread.sleep(2000);
		testBase.ClickViaMouse(Stratos_Manager_JobCards_Pageobjects.selectSiteName, "Site Name");
	}

	@Then("User verifies the created Job Card to validate Job Card is created")
	public void user_verifies_the_created_Job_Card_to_validate_Job_Card_is_created() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String jobCardName = Excel_Utility.getCellData(1, 1);
		Thread.sleep(6000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, jobCardName, "Filter");
		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorFilter,"Validate Job Card"))) {
			ExceptionHandling.HandleAssertion("New Job Card is not created");
		} else
			Logs.info("New Job Card is created");
	}

// Active Job Cards Filter
	
	@Given("User enters valid Job Card Name as {string} on Active Job Cards")
	public void user_enters_valid_Job_Card_Name_as_on_Active_Job_Cards(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		jobCardName = Excel_Utility.getCellData(1, 1);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, jobCardName, "Filter");
	}

	@Then("User validates the filtered data of Active Job Cards")
	public void user_validates_the_filtered_data_of_Active_Job_Cards() throws Exception {
		String data = testBase.getElementText(Stratos_Admin_3rdPartyProviders_PageObjects.errorFilter, "Filter validate");
		if (!(data.contains(jobCardName))) {
			ExceptionHandling.HandleAssertion("Filtered Job Card is not displayed");
		} else
			Logs.info("Filtered Job Card is displayed");
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.manageJobCardsButton, "Manage Job Card");
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.deactivate, "Deactivate");
	}

	@Then("User enters invalid Job Card Name as {string} on Active Job Cards")
	public void user_enters_invalid_Job_Card_Name_as_on_Active_Job_Cards(String string) throws Exception {
		String invalidJobCard = testBase.randomAplhabet(10);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, invalidJobCard, "Filter");
	//	testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, invalidJobCard, "Filter");
	}

	@Then("User validates the error message as {string} of Active Job Cards")
	public void user_validates_the_error_message_as_of_Active_Job_Cards(String string) throws Exception {
		if (!(testBase.isElementVisible(Stratos_Manager_JobCards_Pageobjects.filterError, "Invalid Filter"))) {
			ExceptionHandling.HandleAssertion("No data matching the filter element is not visible");
		} else
			Logs.info("No data matching the filter element is visible");
	}

	@Then("User clicks on Inactive Job Cards")
	public void user_clicks_on_Inactive_Job_Cards() throws Exception {
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.inactiveJobCards, 20);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.inactiveJobCards, "Inactive Job Cards");
	}

	@Then("User enters valid Job Card Name as {string} on Inactive Job Cards")
	public void user_enters_valid_Job_Card_Name_as_on_Inactive_Job_Cards(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		jobCardName = Excel_Utility.getCellData(1, 1);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, jobCardName, "Filter");
		
	}

	@Then("User validates the filtered data of Inactive Job Cards")
	public void user_validates_the_filtered_data_of_Inactive_Job_Cards() throws Exception {
		String data = testBase.getElementText(Stratos_Admin_3rdPartyProviders_PageObjects.errorFilter,
				"Filter validate");
		if (!(data.contains(jobCardName))) {
			ExceptionHandling.HandleAssertion("Filterd Job Card is not displayed");
		} else
			Logs.info("Filterd Job Card is displayed");
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.manageJobCardsButton, "Manage Job Card");
		Thread.sleep(6000);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.activate, "Activate");
	}

	@Then("User enters invalid Job Card Name  as {string} on Inactive Job Cards")
	public void user_enters_invalid_Job_Card_Name_as_on_Inactive_Job_Cards(String string) throws Exception {
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.inactiveJobCards, "Inactive Job Cards");
		String invalidInactiveJobCard = testBase.randomAplhabet(12);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, invalidInactiveJobCard, "Filter");
	}

	@Then("User validates the error message as {string} of Inactive Job Cards")
	public void user_validates_the_error_message_as_of_Inactive_Job_Cards(String string) throws Exception {
		if (!(testBase.isElementVisible(Stratos_Manager_JobCards_Pageobjects.filterError, "Invalid Filter"))) {
			ExceptionHandling.HandleAssertion("No data matching the filter element is not visible");
		} else
			Logs.info("No data matching the filter element is visible");
	}	
// Manage Job Card
	
	@Given("User clicks on Manage Job Card button")
	public void user_clicks_on_Manage_Job_Card_button() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String jobCardName = Excel_Utility.getCellData(1, 1);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, jobCardName, "Job Card Name");
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.manageJobCardsButton, 20);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.manageJobCardsButton, "Manage Job Cards");
	}
	
	@Then("User enters Job Card Description as {string} on Manage Job Card page")
	public void user_enters_Job_Card_Description_as_on_Manage_Job_Card_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		updateJobCardDescription = Excel_Utility.getCellData(1, 2)+"001";
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.jobCardDescription, 20);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Manager_JobCards_Pageobjects.jobCardDescription, updateJobCardDescription, "Job Card Description");
	}
	
	@Given("User clicks on Update button on Manage Job Card page")
	public void user_clicks_on_Update_button_on_Manage_Job_Card_page() throws Exception {
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.updateButton, "Update");
	}
	
	@Then("User validates the updates of Job Cards")
	public void user_validates_the_updates_of_Job_Cards() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String jobCardName = Excel_Utility.getCellData(1, 1);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, jobCardName, "Job Card Name");
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.manageJobCardsButton, "Manage Job Cards");
		String data=testBase.getElementText(Stratos_Manager_JobCards_Pageobjects.jobCardDescription, "Updated Job Card Description");
		Thread.sleep(3000);
		if(!(updateJobCardDescription.contains(data))) {
			ExceptionHandling.HandleAssertion("Job Card Description is not updated");
		}else
			Logs.info("Job Card Description is updated");
	}

	@Then("User clicks on Deactivate button on Manage Job Card page")
	public void user_clicks_on_Deactivate_button_on_Manage_Job_Card_page() throws Exception {
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.deactivate, "Deactivate Button");
	}
	
	@Then("User validates the Deactivated Job Card")
	public void user_validates_the_Deactivated_Job_Card() throws Exception {
		Thread.sleep(5000);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String jobCardName = Excel_Utility.getCellData(1, 1);
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.inactiveJobCards, 20);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.inactiveJobCards, "Inactive Job Cards");
		Thread.sleep(5000);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, jobCardName, "Job Card Name");
		if(!(testBase.isElementVisible(Stratos_Manager_JobCards_Pageobjects.filterError, jobCardName))) {
			ExceptionHandling.HandleAssertion("Job Card is not Deactivated");
		}else
			Logs.info("Job Card is Deactivated");
	}

	@Then("User clicks on Activate button on Manage Job Card page")
	public void user_clicks_on_Activate_button_on_Manage_Job_Card_page() throws Exception {
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.activate, "Activate");
	}
	
	@Then("User validates the Activated Job Card")
	public void user_validates_the_Activated_Job_Card() throws Exception {
		Thread.sleep(5000);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String jobCardName = Excel_Utility.getCellData(1, 1);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, jobCardName, "Job Card Name");
		if(!(testBase.isElementVisible(Stratos_Manager_JobCards_Pageobjects.filterError, jobCardName))) {
			ExceptionHandling.HandleAssertion("Job Card is not Activated");
		}else
			Logs.info("Job Card is Activated");
	}

	@Then("User clicks on Manage Tasks button")
	public void user_clicks_on_Manage_Tasks_button() throws Exception {
//		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
//		String jobCardName = Excel_Utility.getCellData(1, 1);
//		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
//		Thread.sleep(5000);
//		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, jobCardName, "Job Card Name");
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.manageTasksButton, 20);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.manageTasksButton, "Manage Tasks Button");
	}

	@Then("Verify that user able to enter invalid field length data in Tasks page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_Tasks_page() throws Exception {
		String invalidTaskName=testBase.randomAlphanumeric(30);
		String invalidTaskDescription=testBase.randomAlphanumeric(251);
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.taskName, 20);
		testBase.typeinTextBox(Stratos_Manager_JobCards_Pageobjects.taskName, invalidTaskName, "Task Name");
		testBase.typeinTextBox(Stratos_Manager_JobCards_Pageobjects.taskDescription, invalidTaskDescription, "Task Description");
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.taskName, "Task Name");
	}

	@Then("User Validates the error messages of Invalid field length data of all the feilds of Tasks")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_all_the_feilds_of_Tasks() throws Exception {
		if(!(testBase.isElementVisible(Stratos_Manager_JobCards_Pageobjects.lengthTaskName, "Maximum 25 Characters Allowed."))) {
			ExceptionHandling.HandleAssertion("Maximum 25 Characters Allowed. element is not visible");
		}else
			Logs.info("Maximum 25 Characters Allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Manager_JobCards_Pageobjects.lengthTaskDescription, "Maximum 250 characters allowed."))) {
			ExceptionHandling.HandleAssertion("Maximum 250 characters allowed. element is not visible");
		}else
			Logs.info("Maximum 250 characters allowed. element is visible");
	}
	
	@Then("User clicks on Clear button on Tasks page")
	public void user_clicks_on_Clear_button_on_Tasks_page() throws Exception {
	    testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.clearButton, 20);
	    testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.clearButton, "Clear Button");
	}

	@Then("User enters Task Name as {string}")
	public void user_enters_Task_Name_as(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		taskName = Excel_Utility.getCellData(1, 3);
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.taskName, 20);
		testBase.typeinTextBox(Stratos_Manager_JobCards_Pageobjects.taskName, taskName, "Task Name");
	}

	@Then("User entesr Task Description as {string}")
	public void user_entesr_Task_Description_as(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String taskDescription = Excel_Utility.getCellData(1, 4);
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.taskDescription, 20);
		testBase.typeinTextBox(Stratos_Manager_JobCards_Pageobjects.taskDescription, taskDescription, "Task Description");
	}

	@Then("User selects Checkpoint as {string} from Checkpoint dropdown")
	public void user_selects_Checkpoint_as_from_Checkpoint_dropdown(String string) throws Exception {
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.checkpoint, 20);
		Thread.sleep(5000);
		testBase.ClickViaMouse(Stratos_Manager_JobCards_Pageobjects.checkpoint, "Checkpoint");
		testBase.ClickViaMouse(Stratos_Manager_JobCards_Pageobjects.selectCheckpoint, "Checkpoint");
	}

	@Then("User selects Required as {string} from Required dropdown")
	public void user_selects_Required_as_from_Required_dropdown(String string) throws Exception {
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.required, 20);
		Thread.sleep(2000);
		testBase.ClickViaMouse(Stratos_Manager_JobCards_Pageobjects.required, "Required");
		testBase.ClickViaMouse(Stratos_Manager_JobCards_Pageobjects.selectRequired, "YES");
	}

	@Then("User clicks on Add button on tasks page")
	public void user_clicks_on_Add_button_on_tasks_page() throws Exception {
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.addButton, 20);
	    testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.addButton, "Add");
	}
	
	@And ("User validates the created Task")
	public void user_validates_the_created_Tasks()throws Exception {
		Thread.sleep(5000);
		if(!(testBase.isElementVisible(Stratos_Manager_JobCards_Pageobjects.validateTask, "Task"))) {
			ExceptionHandling.HandleAssertion("New Task is not created");
		}else
			Logs.info("New Task is created");
	}
			
	@Then("User clicks on Edit symbol")
	public void user_clicks_on_Edit_symbol() throws Exception {
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.editSymbol, 20);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.editSymbol, "Edit Symbol");
	}
	
	@Then("User enters Task Description as {string} on tasks page")
	public void user_enters_Task_Description_as_on_tasks_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		taskDescription = Excel_Utility.getCellData(1, 4)+"001";
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.taskDescription, 20);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Manager_JobCards_Pageobjects.taskDescription, taskDescription, "Task Description");
	}

	@And ("User clicks on Update button on Tasks page")
	public void user_clicks_on_Update_button_on_tasks_page() throws Exception {
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.updateButton, 20);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.updateButton, "Update");
	}
	
	@Then("User validates the tasks updates")
	public void user_validates_the_tasks_updates() throws Exception {
		Thread.sleep(5000);
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.editSymbol, 20);
		testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.editSymbol, "Edit Symbol");
		Thread.sleep(5000);
		String data=testBase.getElementText(Stratos_Manager_JobCards_Pageobjects.taskDescription, "task Name");
		if(!(taskDescription.contains(data))) {
			ExceptionHandling.HandleAssertion("Task Description is not updated");
		}else
			Logs.info("Task Description is updated");
	}

	@Given("User clicks on Select File button and upload Job Card & Tasks file")
	public void user_clicks_on_Select_File_button_and_upload_Job_Card_Tasks_file() throws Exception {
		Thread.sleep(3000);
		String CSVFile = "Auto-IT/Bulk-Jobs-Stable.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);
	}

	@Then("User clicks on Select File button to upload invalid Job Cards bulk file")
	public void user_clicks_on_Select_File_button_to_upload_invalid_Job_Cards_bulk_file() throws Exception {
		Thread.sleep(3000);
		String CSVFile = "Auto-IT/Bulk-Jobs-Unstable.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);
	}
	
	@Then("User validates the error message as {string} of invalid Bulk Upload of Job Cards")
	public void user_validates_the_error_message_as_of_invalid_Bulk_Upload_of_Job_Cards(String string) throws Exception {
		if (!(testBase.isElementVisible(Stratos_Manager_JobCards_Pageobjects.invalidFileError, "File Upload"))) {
			ExceptionHandling.HandleAssertion("Inavlid bulk upload file is uploaded");
		} else
			Logs.info("Invalid bulk upload file is not uploaded");
	}

	@Then("User clicks on Select File button to upload empty Job Cards bulk file")
	public void user_clicks_on_Select_File_button_to_upload_empty_Job_Cards_bulk_file() throws Exception {
		Thread.sleep(3000);
		String CSVFile = "Auto-IT/Bulk-Jobs-Null.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);
	}
	
	@Given("User validates the error message as {string} of empty Bulk Upload file of Job Cards")
	public void user_validates_the_error_message_as_of_empty_Bulk_Upload_file_of_Job_Cards(String string) throws Exception {
		if (!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.nullFileUpload, "File Upload"))) {
			ExceptionHandling.HandleAssertion("Null bulk upload file is uploaded");
		} else
			Logs.info("Null file upload file is not uploaded");
	}
}
