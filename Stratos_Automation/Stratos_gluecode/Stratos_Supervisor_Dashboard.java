package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Supervisor_Dashboard_PageObject;
import Stratos_testBase.testBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stratos_Supervisor_Dashboard {

	@Given("User clicks on Dashboard in the menu in Supervisor dashboard")
	public void user_clicks_on_Dashboard_in_the_menu_in_Supervisor_dashboard() throws Exception {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.dashboardMenu, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.dashboardMenu, "dashboard");
		Thread.sleep(10000);

	}
	@Given("User clicks on All Clients dropdown and selects All clients as {string} in Supervisor dashboard")
	public void user_clicks_on_All_Clients_dropdown_and_selects_All_clients_as_in_Supervisor_dashboard(String string) throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.clickAllClients, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.clickAllClients, "select all clients");
		Thread.sleep(4000);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.seleclAllClicents, "select all clients");
		Thread.sleep(4000);
	}

	@Given("User clicks on Country dropdown and selects Country as {string} in Supervisor dashboard")
	public void user_clicks_on_Country_dropdown_and_selects_Country_as_in_Supervisor_dashboard(String string) throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.clickCountry, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.clickCountry, "select all clients");
		Thread.sleep(4000);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.selectCountry, "select all clients");
		Thread.sleep(4000);
	}

	@Given("User clicks on All Provinces dropdown and selects All Provinces as {string} in Supervisor dashboard")
	public void user_clicks_on_All_Provinces_dropdown_and_selects_All_Provinces_as_in_Supervisor_dashboard(String string) throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.clickonProvnce, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.clickonProvnce, "select all clients");
		Thread.sleep(4000);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.selectProvince, "select all clients");
		Thread.sleep(5000);
	}

	@Given("User clicks on view dropdown and selects view as {string} in Supervisor dashboard")
	public void user_clicks_on_view_dropdown_and_selects_view_as_in_Supervisor_dashboard(String string) throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.clickView, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.clickView, "select all clients");
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.selectView, "select all clients");
		Thread.sleep(6000);
	}

	@Then("User clicks on filter button in Supervisor dashboard")
	public void user_clicks_on_filter_button_in_Supervisor_dashboard() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.filterButton, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.filterButton, "filterButton");
	    testBase.takeScreenshot("list view");
	    Thread.sleep(9000);
	}

	@Then("User clicks on view dropdown and select view as {string} in Supervisor dashboard")
	public void user_clicks_on_view_dropdown_and_select_view_as_in_Supervisor_dashboard(String string) throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.clickView, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.clickView, "select all clients");
	    testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.selectMApView, 20);
	    testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.selectMApView, "map view");
	    Thread.sleep(6000);
	}

	@Then("User clicks on map tag in dashboard in Supervisor dashboard")
	public void user_clicks_on_map_tag_in_dashboard_in_Supervisor_dashboard() throws Throwable {
			 testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.mapTag, 20);
			 testBase.ClickViaMouse(Stratos_Supervisor_Dashboard_PageObject.mapTag, "Map Tag");
			 Thread.sleep(2000);
			 testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.mapPopup, 20);
			 testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.mapPopup, "Ok button");
			 Thread.sleep(2000);
	}

	@Then("User clicks on view sites in dashboard in Supervisor dashboard")
	public void user_clicks_on_view_sites_in_dashboard_in_Supervisor_dashboard() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.viewSites, 20);
		 testBase.ClickViaMouse(Stratos_Supervisor_Dashboard_PageObject.viewSites, "View Sites");
		 Thread.sleep(4000);
	}

	@Then("User clicks on more info button in Supervisor dashboard")
	public void user_clicks_on_more_info_button_in_Supervisor_dashboard() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.moreInfo, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.moreInfo, "more info button");
	    Thread.sleep(4000);
	}

	@Then("User clicks on emplyee under all employees in Supervisor dashboard")
	public void user_clicks_on_emplyee_under_all_employees_in_Supervisor_dashboard() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.firstEmployee, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.firstEmployee, "first employee");
		Thread.sleep(4000);
	}

	@Then("User verifies the shift details in Supervisor dashboard")
	public void user_verifies_the_shift_details_in_Supervisor_dashboard() throws Throwable {
		testBase.ScrollDownBottom();
		testBase.takeScreenshot("Employee details");
	}

	@Then("User clicks on Back button in Supervisor dashboard")
	public void user_clicks_on_Back_button_in_Supervisor_dashboard() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.backButton, 20);
    	testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.backButton, "back button");
	}

	@Then("User clicks on more info button in Active shift info in Supervisor dashboard")
	public void user_clicks_on_more_info_button_in_Active_shift_info_in_Supervisor_dashboard() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.moreInfoButtonInActiveShift, 20);
		testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.moreInfoButtonInActiveShift, "more info button");
		Thread.sleep(4000);
	}

	@Then("User verifies the assigned task list in Supervisor dashboard")
	public void user_verifies_the_assigned_task_list_in_Supervisor_dashboard() throws Throwable {
		testBase.ScrollDownBottom();
		testBase.takeScreenshot("assigned task list");
	    
	    }
	@Then("User clicks on back button in Supervisor dashboard")
	public void user_clicks_on_back_button_in_Supervisor_dashboard() throws Throwable {
		testBase.waitForElement(Stratos_Supervisor_Dashboard_PageObject.backButton2, 20);
	    testBase.clickonElement(Stratos_Supervisor_Dashboard_PageObject.backButton2, "back button");
	    }
}
