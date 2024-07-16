package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Manager_Dashboard_Pageobjects;
import Stratos_pageObjects.Stratos_Manager_JobCards_Pageobjects;
import Stratos_pageObjects.Stratos_Manager_Login_PageObjects;
import Stratos_pageObjects.Stratos_Manager_Shifts_Pageobjects;
import Stratos_testBase.testBase;
import io.cucumber.java.en.*;

public class Stratos_Manager_Home {

	@Given("Manager clicks on Dashboard tab")
	public void manager_clicks_on_Dashboard_tab() throws Exception {
		Thread.sleep(5000);
		testBase.waitForElement(Stratos_Manager_Dashboard_Pageobjects.dashboardMenu, 20);
	    testBase.clickonElement(Stratos_Manager_Dashboard_Pageobjects.dashboardMenu, "Dashboard tab");
	}

	@Given("Manager click on Shifts tab")
	public void manager_click_on_Shifts_tab() throws Exception {
		testBase.waitForElement(Stratos_Manager_Shifts_Pageobjects.shiftsMenu, 20);
	    testBase.clickonElement(Stratos_Manager_Shifts_Pageobjects.shiftsMenu, "Shifts tab");
	}

	@Given("Manager clicks on Job Cards & Tasks tab")
	public void manager_clicks_on_Job_Cards_Tasks_tab() throws Exception {
		testBase.waitForElement(Stratos_Manager_JobCards_Pageobjects.jobCardMenu, 20);
	    testBase.clickonElement(Stratos_Manager_JobCards_Pageobjects.jobCardMenu, "Job Cards & Tasks tab");
	}

	@Given("Manager clicks on Themes button")
	public void manager_clicks_on_Themes_button() throws Exception {
		testBase.waitForElement(Stratos_Manager_Login_PageObjects.themesButton, 20);
	    testBase.clickonElement(Stratos_Manager_Login_PageObjects.themesButton, "Themes");
	}

	@Given("Manager clicks on Green Theme")
	public void manager_clicks_on_Green_Theme() throws Exception {
		testBase.waitForElement(Stratos_Manager_Login_PageObjects.greenTheme, 20);
	    testBase.clickonElement(Stratos_Manager_Login_PageObjects.greenTheme, "Green Theme");
	}

	@Given("Manager clicks on settings button")
	public void manager_clicks_on_settings_button() throws Exception {
	    testBase.waitForElement(Stratos_Manager_Login_PageObjects.settingsButton, 20);
	    testBase.clickonElement(Stratos_Manager_Login_PageObjects.settingsButton, "Settings Button");
	}

	@Then("Manager clicks on logout")
	public void manager_clicks_on_logout() throws Exception {
		testBase.waitForElement(Stratos_Manager_Login_PageObjects.logout, 20);
	    testBase.clickonElement(Stratos_Manager_Login_PageObjects.logout, "Logout");
	}
}