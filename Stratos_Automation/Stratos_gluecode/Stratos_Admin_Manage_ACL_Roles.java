package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Admin_3rdPartyProviders_PageObjects;
import Stratos_pageObjects.Stratos_Admin_Manage_ACL_Roles_PageObjects;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.*;

public class Stratos_Admin_Manage_ACL_Roles {
	
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "MANAGE ACL ROLES";
	
	@Given("user clicks on Manage ACL Roles in the menu")
	public void user_clicks_on_Manage_ACL_Roles_in_the_menu() throws Exception {
	    testBase.waitForElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.manageACLRolesMenu, 20);
	    testBase.clickonElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.manageACLRolesMenu, "Manage ACL Roles");
	}

	@Given("User clicks on Add Role button")
	public void user_clicks_on_Add_Role_button() throws Exception{
	    testBase.waitForElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.addRolebutton, 20);
	    testBase.clickonElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.addRolebutton, "Add Role");
	}

	@Given("User clicks on Add button to validate mandatory fields of Roles")
	public void user_clicks_on_Add_button_to_validate_mandatory_fields_of_Roles() throws Exception {
	    testBase.clickonElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.addButton, "Add");
	    if(( testBase.isElementVisible(Stratos_Admin_Manage_ACL_Roles_PageObjects.validateRoles, "Roles"))) {
	    	ExceptionHandling.HandleAssertion("New Role is created");
	    }else
	    	Logs.info("New Role is not created");
	}

	
	@Given("User clicks on close button")
	public void user_clicks_on_close_button()throws Exception {
	    testBase.waitForElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.closeButton, 20);
	    testBase.clickonElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.closeButton, "Close");
	}

	@Given("User enters Name as {string} in Add Roles page")
	public void user_enters_Name_as_in_Add_Roles_page(String string)throws Exception {
	    Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	    String name=Excel_Utility.getCellData(1, 0);
	    testBase.waitForElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.name, 20);
	    testBase.typeinTextBox(Stratos_Admin_Manage_ACL_Roles_PageObjects.name, name, "Name");
	}

	@Given("User selects the checkboxes to assign permissions")
	public void user_selects_the_checkboxes_to_assign_permissions() throws Exception{
	    testBase.waitForElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.checkBoxaddNewProvider, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Manage_ACL_Roles_PageObjects.checkBoxaddNewProvider, "Add New Providers");
	    testBase.ClickViaMouse(Stratos_Admin_Manage_ACL_Roles_PageObjects.checkBoxProviderListView, excelFileLocation);
	    testBase.ClickViaMouse(Stratos_Admin_Manage_ACL_Roles_PageObjects.checkBoxProvidersBulkUpload,"Providers Bulk Upload");
	    testBase.ClickViaMouse(Stratos_Admin_Manage_ACL_Roles_PageObjects.checkBoxUpdateProviders, "Update Providers");
	    testBase.ClickViaMouse(Stratos_Admin_Manage_ACL_Roles_PageObjects.checkBoxActicateProviders, "Activate Providers");
	    testBase.ClickViaMouse(Stratos_Admin_Manage_ACL_Roles_PageObjects.checkBoxDeactivateProviders, "Deactivate Providers");
	}

	@Then("User clicks on Add button on Add Role page")
	public void user_clicks_on_Add_button_on_Add_Role_page() throws Exception {
		testBase.waitForElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.addButton, 20);
	    testBase.clickonElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.addButton, "Add");
	}
	
	@Then("User validates the created Role")
	public void user_validates_the_created_Role() throws Exception{
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	    String name=Excel_Utility.getCellData(1, 0);
	    testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
	    Thread.sleep(5000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, name, "Filter");
	    String data=testBase.getElementText(Stratos_Admin_Manage_ACL_Roles_PageObjects.roleValidate, "Filtered Data");
	    System.out.println(data);
	    if(!(data.contains(name))) {
	    	ExceptionHandling.HandleAssertion("New role is not created");
	    }else
	    	Logs.info("New role is created");
	
	}

	@Then("User clicks on Manage Role button")
	public void user_clicks_on_Manage_Role_button()throws Exception {
	    testBase.waitForElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.manageRoleButton, 20);
	    testBase.clickonElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.manageRoleButton, "Manage Role");
	}

	@Then("User enters Name as {string} in Add Roles page to update name")
	public void user_enters_Name_as_in_Add_Roles_page_to_update_name(String string)throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	    String name=Excel_Utility.getCellData(1, 1);
	    Thread.sleep(3000);
	    testBase.clearTextbox(Stratos_Admin_Manage_ACL_Roles_PageObjects.name, name);
	    testBase.waitForElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.name, 20);
	    testBase.typeinTextBox(Stratos_Admin_Manage_ACL_Roles_PageObjects.name, name, "Name");
	}

	@Then("User cliks on Update button")
	public void user_cliks_on_Update_button()throws Exception {
	    testBase.waitForElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.updateButton, 20);
	    testBase.clickonElement(Stratos_Admin_Manage_ACL_Roles_PageObjects.updateButton, "Update");
	}

	@Then("User validates changes made")
	public void User_validates_changes_made()throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	    String name=Excel_Utility.getCellData(1, 1);
	    testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
	    Thread.sleep(5000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, name, "Filter");
	    if(!(testBase.isElementVisible(Stratos_Admin_Manage_ACL_Roles_PageObjects.validateRoles, "Role"))) {
	    	ExceptionHandling.HandleAssertion("Name is not updated");
	    }else
	    	Logs.info("Name is updated");
	}
}