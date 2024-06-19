package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Admin_3rdPartyProviders_PageObjects;
import Stratos_pageObjects.Stratos_Supervisor_SHifts_PageObjects;
import Stratos_testBase.testBase;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stratos_Supervisor_Shifts {
	
	@Given("User click on shifts")
	public void user_click_on_shifts() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.shiftsModule, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.shiftsModule, "shifts module");
	    Thread.sleep(3000);
	}

	@Given("User click on assign")
	public void user_click_on_assign() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.assignAction, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.assignAction, "assignAction");
		 Thread.sleep(6000);
	}

	@Then("User clic on employee name")
	public void user_clic_on_employee_name() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.assignEmployee, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.assignEmployee, "assignEmployee");
		 Thread.sleep(6000);
	}

	@Then("User select the employee name")
	public void user_select_the_employee_name() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.assignEmployee, 20);
		 Thread.sleep(6000);
		 testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.selectEmployee, "select employee");
	}

	@Then("User click on job card name")
	public void user_click_on_job_card_name() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.jobCard, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.jobCard, "jobCard");
		 Thread.sleep(3000);
	}

	@Then("User select the job card")
	public void user_select_the_job_card() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.selectJobCard, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.selectJobCard, "selectJobCard");
		 Thread.sleep(6000);
	}

	@Then("User click on assign button")
	public void user_click_on_assign_button() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.assignButton, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.assignButton, "assignButton");
		 Thread.sleep(2000);
	}

	@Then("User vaidates the invalid employee")
	public void user_vaidates_the_invalid_employee() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.errormessageForAlreayAssignShift, 20);
//		testBase.isElementVisible(Stratos_Supervisor_SHifts_PageObjects.errormessageForAlreayAssignShift, "error message");
		if(!(testBase.isElementVisible(Stratos_Supervisor_SHifts_PageObjects.errormessageForAlreayAssignShift, "error message"))){
			ExceptionHandling.HandleAssertion("New shift is not assigned");
		}
		else
			Logs.info("New shift is assigned"); 
	}
	@Then("User click on cancel button")
	public void user_click_on_cancel_button() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.cancelButton, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.cancelButton, "cancel button");
		Thread.sleep(6000);
	   testBase.ScrollDownBottom();
	   Thread.sleep(2000);
	}
	
	@Then("User click on unassigned employee button")
	public void user_click_on_unassigned_employee_button() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.assignButton2, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.assignButton2, "assign button");
		Thread.sleep(2000);
	}

	@Then("User select the valid employee name")
	public void user_select_the_valid_employee_name() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.assignEmployee, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.assignEmployee, "assignEmployee");
		 Thread.sleep(6000);
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.validAssignEmployee, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.validAssignEmployee, "assign button");
		Thread.sleep(2000);
	}

	@Then("User select the valid job card")
	public void user_select_the_valid_job_card() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.jobCard, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.jobCard, "jobCard");
		Thread.sleep(3000);
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.selectJobCard, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.selectJobCard, "selectJobCard");
		Thread.sleep(6000);
		  
	}
	@Then("User validates the success message.")
	public void user_validates_the_success_message() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.assignEmployeeSuccessMessage, 20);
		if(!(testBase.isElementVisible(Stratos_Supervisor_SHifts_PageObjects.assignEmployeeSuccessMessage, "error message"))){
			ExceptionHandling.HandleAssertion("New shift is not assigned");
		}
		else
			Logs.info("New shift is assigned"); 	
	}

	@Given("User enters valid employee name in filter and validate")
	public void user_enters_valid_employee_name_in_filter_and_validate() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.employeeNameForValidatiob, 20);
//		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.employeeNameForValidatiob, "employee name");
		String Emp=testBase.getElementText(Stratos_Supervisor_SHifts_PageObjects.employeeNameForValidatiob, "employee Name");
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.filterButton, 20);
		testBase.typeinTextBox(Stratos_Supervisor_SHifts_PageObjects.filterButton, Emp, "employee name");
	   Thread.sleep(2000);
	}

	@Then("User enters the invalid employee name")
	public void user_enters_the_invalid_employee_name() throws Throwable {
		String invalidEmp=testBase.randomAplhabet(5);
	    testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.employeeNameForValidatiob, 20);
	    testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.filterButton, 20);
	    testBase.typeinTextBox(Stratos_Supervisor_SHifts_PageObjects.filterButton, invalidEmp, "Invalid employee name");
		 
	}

	@Then("User validates the error message")
	public void user_validates_the_error_message() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.invalidemployeeName, 20);
		if(!(testBase.isElementVisible(Stratos_Supervisor_SHifts_PageObjects.invalidemployeeName, "error message"))){
			ExceptionHandling.HandleAssertion("employee name should not diaplay");
		}
		else
			Logs.info("employee name should display"); 
	    
	}

	@Then("User clicks on Items per page drop down in supervisor login")
	public void user_clicks_on_Items_per_page_drop_down_in_supervisor_login() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.itemsDropdownSup, 20);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.itemsDropdownSup, "Items Dropdown");
	}

	@Then("User selects the desired number from items per page dropdown")
	public void user_selects_the_desired_number_from_items_per_page_dropdown() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_SHifts_PageObjects.itemsDropdownOptionsup, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Supervisor_SHifts_PageObjects.itemsDropdownOptionsup, "Items Dropdown Option");
	   
	}
}