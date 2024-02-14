package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Manager_Homepage_Pageobjects;
import Stratos_testBase.testBase;
import io.cucumber.java.en.*;

public class Stratos_Manager_Homepage {
	@Given("User clicks on Themes button")
	public void user_clicks_on_Themes_button() throws Exception {
	    testBase.waitForElement(Stratos_Manager_Homepage_Pageobjects.themes, 20);
	    Thread.sleep(6000);
	    testBase.clickonElement(Stratos_Manager_Homepage_Pageobjects.themes, "Themes");
	}

	@Given("User selects Theme as {string}")
	public void user_selects_Theme_as(String string) throws Exception {
	    testBase.waitForElement(Stratos_Manager_Homepage_Pageobjects.selectTheme, 20);
	    testBase.clickonElement(Stratos_Manager_Homepage_Pageobjects.selectTheme, "Green Theme");
	}
}
