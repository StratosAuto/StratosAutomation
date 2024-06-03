package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Supervisor_Dashboard_PageObject;
import Stratos_testBase.testBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stratos_Supervisor_Dashboard {

	@Given("User clicks on Dashboard in the menu")
	public void user_clicks_on_Dashboard_in_the_menu() throws Exception {
		
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.dashBoard, 40);
		Thread.sleep(4000);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.dashBoard, " dashboard");
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
	    
	}

	@Then("User enters valid data in filter field")
	public void user_enters_valid_data_in_filter_field() throws Exception {
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.map, "map");
	   
	}

	@Then("User validates the filtered data")
	public void user_validates_the_filtered_data() {
	    
	}

	@Then("User enters invalid data in filetr field")
	public void user_enters_invalid_data_in_filetr_field() {
	    
	}

	@Then("User validates the error message")
	public void user_validates_the_error_message() {
		
	}
}



