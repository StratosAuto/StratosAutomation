package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Login_PageObjects;
import Stratos_testBase.PageBase;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.Utils;
import io.cucumber.java.en.*;

public class Stratos_Home {
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName="Sheet1";
	public static int valid_Password;
	public static String valid_Username;
	public static int invalid_Password;
	public static String invalid_Username;
	public static String CurrentPassword;
	public static String NewPassword;
	public static String ConfirmPassword;
	

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
	@Then("Admin User enter the current password as {string} in change password")
	public void admin_User_enter_the_current_password_as_in_change_password(String string) throws Exception {
		 Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		 CurrentPassword = Excel_Utility.getCellData_Integer(1, 0);
//		    NewPassword = Excel_Utility.getNumericCellData(1, 1);
//		    ConfirmPassword = Excel_Utility.getNumericCellData(1, 2);
		    Thread.sleep(5000);
			testBase.waitForElement(Stratos_Login_PageObjects.currentPassword, 20);
//		    testBase.clickonElement(Stratos_Login_PageObjects.currentPassword, "currenrt password");
		    testBase.typeinTextBox(Stratos_Login_PageObjects.currentPassword, String.valueOf(CurrentPassword), "current password");
		}
	
	@Then("Admin User enter new password as {string} in change password")
	public void admin_User_enter_new_password_as_in_change_password(String string) throws Exception {
		 Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		 NewPassword = Excel_Utility.getCellData_Integer(1, 1);
		 testBase.waitForElement(Stratos_Login_PageObjects.newPassword, 20);
		    testBase.clickonElement(Stratos_Login_PageObjects.newPassword, "new password");
		    testBase.typeinTextBox(Stratos_Login_PageObjects.newPassword, String.valueOf(NewPassword), "new password");
		}
	@Then("Admin User enter confirm password as {string} in change password")
	public void admin_User_enter_confirm_password_as_in_change_password(String string) throws Exception {
		 Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		 ConfirmPassword = Excel_Utility.getCellData_Integer(1, 2);
		testBase.waitForElement(Stratos_Login_PageObjects.confirmPassword, 20);
	    testBase.clickonElement(Stratos_Login_PageObjects.confirmPassword, "confirm password");
	    testBase.typeinTextBox(Stratos_Login_PageObjects.confirmPassword, String.valueOf(ConfirmPassword), "confirm password");
	}


	@Then("Admin User click update button")
	public void admin_User_click_update_button() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.updateButton, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.updateButton, "click");
	   
	}
	@Then("Admin User verifies the success message")
	public void admin_User_verifies_the_success_message() {
	    
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
