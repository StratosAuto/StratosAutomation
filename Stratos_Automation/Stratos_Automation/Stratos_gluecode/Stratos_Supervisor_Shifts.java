package Stratos_gluecode;

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
		 Thread.sleep(6000);
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
}