package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Login_PageObjects;
import Stratos_testBase.PageBase;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.Utils;
import io.cucumber.java.en.*;

public class Stratos_Home {
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "LOGIN";
	public static String sheetName1="Sheet1";
	public static int valid_Password;
	public static String valid_Username;
	public static int invalid_Password;
	public static String invalid_Username;
	public static int CurrentPassword;
	public static int NewPassword;
	public static int ConfirmPassword;
	

	@Given("Admin User  click on Themes")
	public void admin_User_click_on_Themes() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.themes, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.themes, "click on themes");
	    
	}

	@Then("Admin User Select a theme")
	public void admin_User_Select_a_theme() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.lightTheme, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.lightTheme, "click on light theme");
	    
	}

	@Then("Admin User verifies the theme")
	public void admin_User_verifies_the_theme() {
		System.out.println("theme changed");
	    
	}

	@Given("Admin User click on settings")
	public void admin_User_click_on_settings1() throws Throwable {
		testBase.waitForElement(Stratos_Login_PageObjects.settings, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.settings, "click on settings");
	   
	}

	@Then("Admin User click on change password Button")
	public void admin_User_click_on_change_password_Button() throws Throwable  {
		testBase.waitForElement(Stratos_Login_PageObjects.changePassword, 20);
		Thread.sleep(7000);
		testBase.clickonElement(Stratos_Login_PageObjects.changePassword, "click on change password");
	   
	}

	@Then("Admin User enter current password by using Excelsheetdata {string} and row number {string}")
	public void admin_User_enter_current_password_by_using_Excelsheetdata_and_row_number(String string, String string2) throws Exception {
	 //   Thread.sleep(5000);
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName1);
	    CurrentPassword = Excel_Utility.getNumericCellData(1, 0);
	    NewPassword = Excel_Utility.getNumericCellData(1, 1);
	    ConfirmPassword = Excel_Utility.getNumericCellData(1, 2);
		testBase.waitForElement(Stratos_Login_PageObjects.currentPassword, 20);
	    testBase.clickonElement(Stratos_Login_PageObjects.currentPassword, "currenrt password");
	    testBase.typeinTextBox(Stratos_Login_PageObjects.currentPassword, String.valueOf(CurrentPassword), "string2");
	}

	@Then("Admin User enter new password by using Excelsheetdata {string} and row number {string}")
	public void admin_User_enter_new_password_by_using_Excelsheetdata_and_row_number(String string, String string2) throws Exception {
	    testBase.waitForElement(Stratos_Login_PageObjects.newPassword, 20);
	    testBase.clickonElement(Stratos_Login_PageObjects.newPassword, "new password");
	    testBase.typeinTextBox(Stratos_Login_PageObjects.newPassword, String.valueOf(NewPassword), "string2");
	}

	@Then("Admin User enter confirm password by using Excelsheetdata {string} and row number {string}")
	public void admin_User_enter_confirm_password_by_using_Excelsheetdata_and_row_number(String string, String string2) throws Exception {
	    testBase.waitForElement(Stratos_Login_PageObjects.confirmPassword, 20);
	    testBase.clickonElement(Stratos_Login_PageObjects.confirmPassword, "confirm password");
	    testBase.typeinTextBox(Stratos_Login_PageObjects.confirmPassword, String.valueOf(ConfirmPassword), "string2");
	}

	@Then("Admin User click update button")
	public void admin_User_click_update_button() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.updateButton, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.updateButton, "click");
	   
	}

	@Then("Admin User  verify user navigates to homepage")
	public void admin_User_verify_user_navigates_to_homepage() {
		
	    
	}


	@Then("Admin User click on logout")
	public void admin_User_click_on_logout() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.logOut, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.logOut, "logout");
	   
	}

	@Then("Admin User navigates to Login Page")
	public void admin_User_navigates_to_Login_Page() {
		
	   
	}




}
