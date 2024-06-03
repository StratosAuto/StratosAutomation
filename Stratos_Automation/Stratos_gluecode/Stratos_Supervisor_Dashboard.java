package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Supervisor_Dashboard_PageObject;
import Stratos_testBase.testBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stratos_Supervisor_Dashboard {

	@Given("User clicks on Dashboard in the menu")
	public void user_clicks_on_Dashboard_in_the_menu() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.dashboardMenu, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.dashboardMenu, "dashboard");
		Thread.sleep(10000);

	}

	@Given("User clicks on All Clients dropdown and selects All clients as {string}")
	public void user_clicks_on_All_Clients_dropdown_and_selects_All_clients_as(String string) throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.clickAllClients, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.clickAllClients, "select all clients");
		Thread.sleep(4000);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.seleclAllClicents, "select all clients");
		Thread.sleep(4000);
	    
	}

	@Given("User clicks on Country dropdown and selects Country as \"country")
	public void user_clicks_on_Country_dropdown_and_selects_Country_as_country() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.clickCountry, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.clickCountry, "select all clients");
		Thread.sleep(4000);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.selectCountry, "select all clients");
		Thread.sleep(4000);
	   
	}

	@Given("User clicks on All Provinces dropdown and selects All Provinces as {string}")
	public void user_clicks_on_All_Provinces_dropdown_and_selects_All_Provinces_as(String string) throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.clickonProvnce, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.clickonProvnce, "select all clients");
		Thread.sleep(4000);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.selectProvince, "select all clients");
		Thread.sleep(5000);
	   
	}

	@Given("User clicks on view dropdown and selects view as {string}")
	public void user_clicks_on_view_dropdown_and_selects_view_as(String string) throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.clickView, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.clickView, "select all clients");
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.selectView, "select all clients");
		Thread.sleep(6000);
		
		
	}

	@Then("User clicks on filter button")
	public void user_clicks_on_filter_button() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.filterButton, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.filterButton, "filterButton");
	    testBase.takeScreenshot("list view");
	    Thread.sleep(9000);
	    
	}
	@Then("User clicks on view dropdown and select view as {string}")
	public void user_clicks_on_view_dropdown_and_select_view_as(String string) throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.clickView, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.clickView, "select all clients");
	    testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.selectMApView, 20);
	    testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.selectMApView, "map view");
	    Thread.sleep(6000);
	}


	@Then("User enters valid data in filter field")
	public void user_enters_valid_data_in_filter_field() throws Exception {
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.map, "map");
	   
	}
	@Then("User clicks on map tag")
	public void user_clicks_on_map_tag() throws Exception {
	 testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.mapTag, 20);
	 testBase.ClickViaMouse(Stratos_Supervisor_Dashboard_PageObject.mapTag, "Map Tag");
	 testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.mapPopup, 20);
	 testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.mapPopup, "Ok button");
   	}
 
	@Then("User clicks on view sites")
	public void user_clicks_on_view_sites() throws Exception {
	 testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.viewSites, 20);
	 testBase.ClickViaMouse(Stratos_Supervisor_Dashboard_PageObject.viewSites, "View Sites");
	 Thread.sleep(4000);
	 
	 
	 
	}
	@Then("User clicks on more info button")
	public void user_clicks_on_more_info_button() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.moreInfo, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.moreInfo, "more info button");
	    Thread.sleep(4000);
	}

	@Then("User clicks on emplyee under all employees")
	public void user_clicks_on_emplyee_under_all_employees() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.firstEmployee, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.firstEmployee, "first employee");
		Thread.sleep(4000);
	}
	
	@Then("User verifies the shift details")
	public void user_verifies_the_shift_details() throws Throwable {
		testBase.ScrollDownBottom();
		testBase.takeScreenshot("Employee details");
	   
	}

	@Then("User clicks on Back button")
	public void user_clicks_on_Back_button() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.backButton, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.backButton, "back button");
	   
	}

	@Then("User clicks on more info button in Active shift info")
	public void user_clicks_on_more_info_button_in_Active_shift_info() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.moreInfoButtonInActiveShift, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.moreInfoButtonInActiveShift, "more info button");
		Thread.sleep(4000);
	}

	@Then("User verifies the assigned task list")
	public void user_verifies_the_assigned_task_list() throws Throwable {
		testBase.ScrollDownBottom();
		testBase.takeScreenshot("assigned task list");
	    
	}

	@Then("User clicks on back button")
	public void user_clicks_on_back_button() throws Exception {
	    testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.backButton2, 20);
	    testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.backButton2, "back button");
	}


	@Then("User validates the error message")
	public void user_validates_the_error_message() {
		
	}
}
