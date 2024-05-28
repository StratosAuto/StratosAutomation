package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Admin_3rdPartyProviders_PageObjects;
import Stratos_pageObjects.Stratos_Manager_Shifts_Pageobjects;
import Stratos_testBase.PageBase;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.*;

public class Stratos_Manager_Shifts {
	
	public static String excelFileLocation ="./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName ="EMPLOYEES";
	public static String sheetName1="Manager Data";
	public String parentName;

	@Given("User clicks on Shifts in the menu")
	public void user_clicks_on_Shifts_in_the_menu() throws Exception {
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.shiftsMenu, 20);
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.shiftsMenu, "Shifts Menu");
	}

	@Given("User clicks on Add New Shifts button")
	public void user_clicks_on_Add_New_Shifts_button() throws Exception {
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.addNewShiftsButton, 20);
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.addNewShiftsButton, "Add New Shift");
	}

	@Given("User selects Supervisor Name & Surname as {string} from Supervisor Name & Surname dropdown")
	public void user_selects_Supervisor_Name_Surname_as_from_Supervisor_Name_Surname_dropdown(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String parentName1 = Excel_Utility.getCellData(3, 0);
		String parentName2= Excel_Utility.getCellData(3, 1);
		String parentName =parentName1+" "+parentName2;
		System.out.println(parentName);
		testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.supervisorName, 20);
		Thread.sleep(7000);
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.supervisorName, "Supervisor Name & Surname");
	    Thread.sleep(2000);
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.shiftsDropdown(parentName), "Supervisor Name & Surname");
	}

	@Given("User selects clients as {string} from Clients dropdown")
	public void user_selects_clients_as_from_Clients_dropdown(String string) throws Exception {
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.clientName, 20);
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.clientName, "Client Name");
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.selectClientName, "John Fred");
	}

	@Given("User selects Site Name & Address as {string} from Site Name & Address dropdown")
	public void user_selects_Site_Name_Address_as_from_Site_Name_Address_dropdown(String string) throws Exception {
		Thread.sleep(5000);
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.siteName, 20);
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.siteName, "Site Name & Address");
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.selectSiteName, "Site Name & Address");
	}

	@Given("User clicks on Check-in Date picker button and selects Check-in date as {string}")
	public void user_clicks_on_Check_in_Date_picker_button_and_selects_Check_in_date_as(String string) throws Exception {
		testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.checkInDateCalendarButton, 20);
	    Thread.sleep(5000);
		testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.checkInDateCalendarButton, "Calendar Button");
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.calendarArrow, "Calendar");
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.checkInYear, "Year");
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.checkInMonth, "Month");
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.checkInDate, "Date");
	}

	@Given("User enters check-in time as {string}")
	public void user_enters_check_in_time_as(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName1);
	    String checkInTime=Excel_Utility.getCellData_Integer(1, 5);
	    String checkInMinutes=Excel_Utility.getCellData_Integer(1, 6);
		testBase.typeinTextBox(Stratos_Manager_Shifts_Pageobjects.checkInTime, checkInTime, "Check In Time");
		testBase.typeinTextBox(Stratos_Manager_Shifts_Pageobjects.checkInTime, checkInMinutes, "Check In Minutes");
	}

	@Given("User clicks on Check-out Date picker button and selects Check-out date as {string}")
	public void user_clicks_on_Check_out_Date_picker_button_and_selects_Check_out_date_as(String string) throws Exception {
		testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.checkOutdateCalendarButton, 20);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.checkOutdateCalendarButton, "Calendar Button");
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.calendarArrow, "Calendar");
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.checkOutYear, "Year");
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.checkOutMonth, "Month");
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.checkOutDate, "Date");
	}

	@Given("User enters check-out time as {string}")
	public void user_enters_check_out_time_as(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName1);
	    String checkOutTime=Excel_Utility.getCellData_Integer(1, 7);
	    String checkOutMinutes=Excel_Utility.getCellData_Integer(1, 8);
		testBase.typeinTextBox(Stratos_Manager_Shifts_Pageobjects.checkOutTime, checkOutTime, "Check Out Time");
		testBase.typeinTextBox(Stratos_Manager_Shifts_Pageobjects.checkOutTime, checkOutMinutes, "Check Out Minutes");   
	}

	@And("User clicks on Add button on Add New Shift page")
	public void user_clicks_on_Add_button_on_Add_New_Shift_page() throws Exception {
		testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.addButton, 20);
		testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.addButton, "Add Button");
	}
	
	@Then("User verifies the created Shift to validate Shift is created")
	public void user_verifies_the_created_Shift_to_validate_Shift_is_created() throws Exception   {
	    Thread.sleep(5000);
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String supervisorName = Excel_Utility.getCellData(3, 0);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, supervisorName, "Filter");
	    if(!(testBase.isElementVisible(Stratos_Manager_Shifts_Pageobjects.validatedCreatedShift, "Supervisor Name"))) {
	    	ExceptionHandling.HandleAssertion("New Shift is not created");
	    }else
	    	Logs.info("New Shift is created");
	    Thread.sleep(3000);
	}

	@Then("User clicks on Clear button on Add New Shift page")
	public void user_clicks_on_Clear_button_on_Add_New_Shift_page() throws Exception {
		testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.clearButton, 20);
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.clearButton, "Clear Button");
	}

	@Then("User clicks on Add button to validate mandatory fileds")
	public void user_clicks_on_Add_button_to_validate_mandatory_fileds() throws Exception {
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.addButton, 20);
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.addButton, "Add Button");
	    if((testBase.isElementVisible(Stratos_Manager_Shifts_Pageobjects.addNewShiftsButton, "Add New Shifts Button"))) {
	    	ExceptionHandling.HandleAssertion("New Shift with null data is created");
	    }else
	    	Logs.info("New Shift with null data is not created");
	}

	@Then("User clicks on Cancel button on Add New Shift page")
	public void user_clicks_on_cancel_button_on_Add_New_Shift_page() throws Exception {
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.cancelButton, 20);
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.cancelButton, "Cancel Button");
	}
	
	@Given("User enters valid Supervisor Name as {string} on Future Schedules")
	public void user_enters_valid_Supervisor_Name_as_on_Future_Schedules(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String filterdata = Excel_Utility.getCellData(3, 0);
		System.out.println(filterdata);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
		Thread.sleep(5000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, filterdata, "Supervisor Name");
	}

	@Then("User validates the filtered data of Future Schedules")
	public void user_validates_the_filtered_data_of_Future_Schedules() throws Exception {
	    if(!(testBase.isElementVisible(Stratos_Manager_Shifts_Pageobjects.validatedCreatedShift, "Filtered Data"))) {
	    	ExceptionHandling.HandleAssertion("Filtered Shift details are not displayed");
	    }else
	    	Logs.info("Filtered Shift details are  displayed");
	}

	@Then("User enters invalid Supervisor Name as {string} on Future Schedules")
	public void user_enters_invalid_Supervisor_Name_as_on_Future_Schedules(String string) throws Exception {
	    String invalidShiftdata=testBase.randomAlphanumeric(12);
	    testBase.clearTextbox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, "Filter");
	    testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
	    Thread.sleep(3000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, invalidShiftdata, "invalid Shift Data");
	}

	@Then("User validates the error message as {string} on Future Schedules")
	public void user_validates_the_error_message_as_on_Future_Schedules(String string) throws Exception {
	    if(!(testBase.isElementVisible(Stratos_Admin_3rdPartyProviders_PageObjects.errorFilter, "Filter error message"))) {
	    	ExceptionHandling.HandleAssertion("Invalid Shit error message is not displayed");
	    }else
	    Logs.info("Invalid Shit error message is displayed");
	}

	@Given("User clicks on Edit Shifts button")
	public void user_clicks_on_Edit_Shifts_button() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String supervisorName = Excel_Utility.getCellData(3, 0);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
		Thread.sleep(5000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, supervisorName, "filterData");
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.editShiftsButton, 20);
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.editShiftsButton, "Edit Shift");
	}

	@Given("User enters check-in time as {string} on Edit Shifts page")
	public void user_enters_check_in_time_as_on_Edit_Shifts_page(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName1);
	    String updatedCheckInTime=Excel_Utility.getCellData_Integer(1, 9);
	    String updatedCheckInMinutes=Excel_Utility.getCellData_Integer(1, 10);
	    System.out.println(updatedCheckInTime);
	    System.out.println(updatedCheckInMinutes);
	    System.out.println();
	    Thread.sleep(5000);
	    testBase.clearTextbox(Stratos_Manager_Shifts_Pageobjects.checkInTime, "Check In Time");
		testBase.typeinTextBox(Stratos_Manager_Shifts_Pageobjects.checkInTime, updatedCheckInTime, "Check In Time");
		testBase.typeinTextBox(Stratos_Manager_Shifts_Pageobjects.checkInTime, updatedCheckInMinutes, "Check In Minutes");
	}

	@Then("User clicks on Update button on Edit Shifts page")
	public void user_clicks_on_Update_button_on_Edit_Shifts_page() throws Exception {
		testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.updateButton, 20);
		testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.updateButton, "Update Button");
	}
	
	@Then("User clicks on Assign button on My Team Shifts page")
	public void user_clicks_on_Assign_button_on_My_Team_Shifts_page() throws Exception{
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String supervisorName = Excel_Utility.getCellData(3, 0);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
		Thread.sleep(5000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, supervisorName, "filterData");
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.assignButton, 20);
	    Thread.sleep(5000);
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.assignButton, "Assign Button");
	}

	@Then("User selects Employee Name & Surname as {string} from Employee Name & Surname dropdown")
	public void user_selects_Employee_Name_Surname_as_from_Employee_Name_Surname_dropdown(String string)throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String employeeFirstName = Excel_Utility.getCellData(4, 0);
		String employeeLastName= Excel_Utility.getCellData(4, 1);
		String employeeName =employeeFirstName+" "+employeeLastName;
		System.out.println(employeeName);
		testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.employeeName, 20);
		Thread.sleep(7000);
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.employeeName, "Employee Name & Surname");
	    Thread.sleep(2000);
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.shiftsDropdown(employeeName), "Employee Name & Surname");
	    
	}

	@Then("User selects Job Card Name as {string} from Job Card Name dropdown")
	public void user_selects_Job_Card_Name_as_from_Job_Card_Name_dropdown(String string) throws Exception{
		Excel_Utility.setExcelFile(excelFileLocation, sheetName1);
		String jobCardName = Excel_Utility.getCellData(1, 1);
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.jobCard, 20);
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.jobCard, "Job Card Name");
	    Thread.sleep(3000);
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.shiftsDropdown(jobCardName), "Job Card Name");
	}

	@Then("User validates the job card is assigned to Employee")
	public void user_validates_the_job_card_is_assigned_to_Employee() throws Exception{
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String supervisorName = Excel_Utility.getCellData(4, 0);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
		Thread.sleep(5000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, supervisorName, "filterData");
	    if(!(testBase.isElementVisible(Stratos_Manager_Shifts_Pageobjects.validateAssignedEmployee, "Assigned Employee Name"))) {
	    	ExceptionHandling.HandleAssertion("Job is not assigned to the Employee");
	    }else
	    	Logs.info("Job is assigned to the Employee");
	}

	@Then("User clicks on Assign button on My Teams Shift page")
	public void user_clicks_on_Assign_button_on_My_Teams_Shift_page() throws Exception{
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.assignButton, 20);
	    Thread.sleep(5000);
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.assignButton, "Assign Button");
	}
	
	@Then("User clicks on Assign button to validate mandatory fileds")
	public void user_clicks_on_Assign_button_to_validate_mandatory_fileds() throws Exception{
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.assignButton, 20);
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.assignButton, "Assign Button");
	}

	@And("User clicks on Cancel Button on Assign Job Card Page")
	public void user_clicks_on_Cancel_Button_on_Assign_Job_Card_Page() throws Exception {
		testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.assignCancelButton, 20);
		testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.assignCancelButton, "Cancel Button");
	}
	
	@Then("Verify user able to assign multiple shifts to the same Employee with same shift timings")
	public void verify_user_able_to_assign_multiple_shifts_to_the_same_Employee_with_same_shift_timings()throws Exception {
		Thread.sleep(5000);
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String supervisorName = Excel_Utility.getCellData(3, 0);
		testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, supervisorName, "Filter");
	    
	    testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.duplicateAssignButton, 20);
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.duplicateAssignButton, "Second Assign Button");
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String employeeFirstName = Excel_Utility.getCellData(4, 0);
		String employeeLastName= Excel_Utility.getCellData(4, 1);
		String employeeName =employeeFirstName+" "+employeeLastName;
		System.out.println(employeeName);
		testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.employeeName, 20);
		Thread.sleep(7000);
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.employeeName, "Employee Name & Surname");
	    Thread.sleep(2000);
	    testBase.ClickViaMouse(Stratos_Manager_Shifts_Pageobjects.shiftsDropdown(employeeName), "Employee Name & Surname");
	    
	    if(!(testBase.isElementVisible(Stratos_Manager_Shifts_Pageobjects.duplicateShift, "Employee is alreay assigned"))) {
	    	ExceptionHandling.HandleAssertion("Employee is alreay assigned error message is not displayed");
	    }else
	    	Logs.info("Employee is alreay assigned error message is displayed");
	}

	@Given("User clicks on Select File button and upload Shifts bulk file")
	public void user_clicks_on_Select_File_button_and_upload_Shifts_bulk_file() throws Exception {
		Thread.sleep(3000);
		String CSVFile = "Auto-IT/Bulk-Shifts-Stable.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);
	}

	@Then("User clicks on Select File button to upload invalid Shifts bulk file")
	public void user_clicks_on_Select_File_button_to_upload_invalid_Shifts_bulk_file()throws Exception  {
		Thread.sleep(3000);
		String CSVFile = "Auto-IT/Bulk-Shifts-Unstable.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);	    
	}
	
	@Then("User validates the error message as {string} of invalid Shifts Bulk Upload")
	public void user_validates_the_error_message_as_of_invalid_Shifts_Bulk_Upload(String string) throws Exception {
		if (!(testBase.isElementVisible(Stratos_Manager_Shifts_Pageobjects.bulkError, "Invalid file upload error"))) {
			ExceptionHandling.HandleAssertion("Inavlid bulk upload file is uploaded");
		} else
			Logs.info("Invalid bulk upload file is not uploaded");
	}

	@Then("User clicks on Select File button to upload empty Shifts bulk file")
	public void user_clicks_on_Select_File_button_to_upload_empty_Shifts_bulk_file()throws Exception  {
		Thread.sleep(3000);
		String CSVFile = "Auto-IT/Bulk-Shifts-Null.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);
	}

	@And("User validates the error message as {string} of empty Shifts Bulk Upload file")
	public void user_validates_the_error_message_as_of_empty_Shifts_Bulk_Upload_file() throws Exception {
		testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.nullBulkError, 20);
		Thread.sleep(3000);
		if(!(testBase.isElementVisible(Stratos_Manager_Shifts_Pageobjects.nullBulkError, "Null bulk file error"))) {
			ExceptionHandling.HandleAssertion("Null bulk file is uploaded");
		}else
			Logs.info("Null bulk file is not uploaded");
	}
}