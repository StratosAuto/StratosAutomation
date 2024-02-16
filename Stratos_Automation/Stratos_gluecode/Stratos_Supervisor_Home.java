package Stratos_gluecode;

import Stratos_testBase.testBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stratos_Supervisor_Home {
	
	@Given("User clicks on Themes Button")
	public void user_clicks_on_Themes_Button() throws Exception {
		testBase.waitForElement(Stratos_pageObjects.Stratos_Supervisor_Home.themesButton, 20);
		Thread.sleep(8000);
		testBase.ClickViaMouse(Stratos_pageObjects.Stratos_Supervisor_Home.themesButton, "themes button");
	}

	@Then("User selects the theme from options")
	public void user_selects_the_theme_from_options() throws Exception {
		testBase.waitForElement(Stratos_pageObjects.Stratos_Supervisor_Home.pinkBlueTheme, 20);
		Thread.sleep(3000);
		testBase.clickonElement(Stratos_pageObjects.Stratos_Supervisor_Home.pinkBlueTheme, "pink blue theme");	    
	}

	@Then("User can verify the theme should update")
	public void user_can_verify_the_theme_should_update() throws InterruptedException {
		testBase.takeScreenshot("pink blue theme updated");
		Thread.sleep(8000);
	}

	@Given("User click on settings button")
	public void user_click_on_settings_button() throws Exception {
		testBase.waitForElement(Stratos_pageObjects.Stratos_Supervisor_Home.settingsButton, 20);
		Thread.sleep(8000);
		testBase.clickonElement(Stratos_pageObjects.Stratos_Supervisor_Home.settingsButton, "settingsButton");
		Thread.sleep(2000);
	    
	}

	@Then("User select the logout button")
	public void user_select_the_logout_button() throws Exception {
		testBase.waitForElement(Stratos_pageObjects.Stratos_Supervisor_Home.logOutButton, 20);
		Thread.sleep(3000);
		testBase.clickonElement(Stratos_pageObjects.Stratos_Supervisor_Home.logOutButton, "logOutButton");
		Thread.sleep(2000);
	   
	}

	@Then("User can navigates to login page")
	public void user_can_navigates_to_login_page() throws Exception {
		testBase.waitForElement(Stratos_pageObjects.Stratos_Supervisor_Home.loginPage, 20);
		String s=testBase.getElementText(Stratos_pageObjects.Stratos_Supervisor_Home.loginPage, "loginPage");
		System.out.println(s);
		testBase.takeScreenshot("login page");
		Thread.sleep(2000);
	    
	}
}