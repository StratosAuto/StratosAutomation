package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Manager_Dashboard_Pageobjects;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.*;

public class Stratos_Manager_Dashboard {
	
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "Manager Data";
	public String data;
	 
	@Given("User clicks on manager Dashboard in the menu")
	public void user_clicks_on_manager_Dashboard_in_the_menu() throws Exception {
	 Thread.sleep(6000);
	 testBase.clickonElement(Stratos_Manager_Dashboard_Pageobjects.dashboardMenu, "Dashboard");
	 
	}

	@Given("User clicks on All Clients dropdown and selects All clients as {string} on manager dashboard")
	public void user_clicks_on_All_Clients_dropdown_and_selects_All_clients_as_on_manager_dashboard(String string) throws Exception {
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.allClients, "All Clients");
	 testBase.waitForElement(Stratos_Manager_Dashboard_Pageobjects.selectClient, 20);
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.selectClient, "John Third");
	}

	@Given("User clicks on Country dropdown and selects Country as {string} on manager dashboard")
	public void user_clicks_on_Country_dropdown_and_selects_Country_as_on_manager_dashboard() throws Exception {
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.country, "Country");
	 Thread.sleep(3000);
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.selectCountry, "South Africa");
	}

	@Given("User clicks on All Provinces dropdown and selects All Provinces as {string} on manager dashboard")
	public void user_clicks_on_All_Provinces_dropdown_and_selects_All_Provinces_as_on_manager_dashboard(String string) throws Exception {
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.allProvinces, "All Provinces");
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.selectProvince, "Gauteng");
	}

	@Given("User clicks on view dropdown and selects view as {string} to view list")
	public void user_clicks_on_view_dropdown_and_selects_view_as_to_view_list(String string) throws Exception {
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.view, "View dropdown");
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.listView, "List View");
	}

	@Then("User clicks on filter button on manager dashboard")
	public void user_clicks_on_filter_button_on_manager_dashboard() throws Exception {
	 testBase.clickonElement(Stratos_Manager_Dashboard_Pageobjects.filter, "Filter");
	}

	@Then("User enters valid data in filter field on manager dashboard")
	public void user_enters_valid_data_in_filter_field_on_manager_dashboard() throws Exception {
	 Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	 data=Excel_Utility.getCellData(1, 0);
	 testBase.typeinTextBox(Stratos_Manager_Dashboard_Pageobjects.filterdata, data, "Filter Data");
	}

	@Then("User validates the filtered data on dashboard page")
	public void user_validates_the_filtered_data_on_dashboard_page() throws Exception {
		String siteName=testBase.getElementText(Stratos_Manager_Dashboard_Pageobjects.filterValidates, "Site Name");
	 if(!(data.contains(siteName))) {
		 ExceptionHandling.HandleAssertion("Valid filtered details are not displayed");
	 }else
		 Logs.info("Valid filtered details are displayed");
	}

	@Then("User enters invalid data in filter field on manager dashboard")
	public void user_enters_invalid_data_in_filetr_field_on_manager_dashboard() throws Exception {
	 testBase.clearTextbox(Stratos_Manager_Dashboard_Pageobjects.filterdata, "Filter");
	 String invalidfilterdata=testBase.randomAlphanumeric(10);
	 testBase.typeinTextBox(Stratos_Manager_Dashboard_Pageobjects.filterdata, invalidfilterdata, "Filter Data");
	}

	@Then("User validates the error message on manager dashboard")
	public void user_validates_the_error_message_on_manager_dashboard() throws Exception {
	 if(!(testBase.isElementVisible(Stratos_Manager_Dashboard_Pageobjects.filterValidates, "Filter error"))) {
		 ExceptionHandling.HandleAssertion("Invalid filter error is not displayed");
	 }else
		 Logs.info("Invalid filter error message is displayed");
	}

	@Then("User clicks on view dropdown and selects view as {string} to view map")
	public void user_clicks_on_view_dropdown_and_selects_view_as_to_view_map(String string) throws Exception {
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.view, "View");
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.mapView, "Map View");
	}

	@Then("User clicks on map tag in dashboard")
	public void user_clicks_on_map_tag_in_dashboard() throws Exception {
	 testBase.waitForElement(Stratos_Manager_Dashboard_Pageobjects.mapTag, 20);
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.mapTag, "Map Tag");
	}

	@Then("User clicks on view sites in dashboard")
	public void user_clicks_on_view_sites_in_dashboard() throws Exception {
	 testBase.waitForElement(Stratos_Manager_Dashboard_Pageobjects.viewSites, 20);
	 testBase.ClickViaMouse(Stratos_Manager_Dashboard_Pageobjects.viewSites, "View Sites");
	}

	@Then("User clicks on More Info")
	public void user_clicks_on_More_Info() throws Exception {
	 testBase.waitForElement(Stratos_Manager_Dashboard_Pageobjects.moreInfo, 20);
	 testBase.clickonElement(Stratos_Manager_Dashboard_Pageobjects.moreInfo, "More Info");
	}
	
	
	
}
