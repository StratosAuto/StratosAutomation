package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Admin_Manage_ACL_Roles_PageObjects {
	public static final By manageACLRolesMenu=By.xpath("//span[text()='Manage ACL Roles']");
	public static final By addRolebutton=By.xpath("//button[text()=' Add Role ']");
	public static final By name=By.xpath("//input[@formcontrolname='Name']");
	public static final By checkBoxaddNewProvider=By.xpath("//mat-checkbox[@formcontrolname='addNewProviders']");
	public static final By checkBoxProviderListView=By.xpath("//mat-checkbox[@formcontrolname='providersListView']");
	public static final By checkBoxProvidersBulkUpload=By.xpath("//mat-checkbox[@formcontrolname='providersBulkUpload']");
	public static final By checkBoxUpdateProviders=By.xpath("//mat-checkbox[@formcontrolname='updateProviders']");
	public static final By checkBoxActicateProviders=By.xpath("//mat-checkbox[@formcontrolname='providersReactivate']");
	public static final By checkBoxDeactivateProviders=By.xpath("//mat-checkbox[@formcontrolname='providersDeactivate']");
	public static final By addButton=By.xpath("//span[text()='Add']");
	public static final By closeButton=By.xpath("//span[text()='Close']");
	public static final By manageRoleButton=By.xpath("//button[text()=' Manage Role ']");
	public static final By updateButton=By.xpath("//span[text()=' Update ']");
	public static final By validateRoles=By.xpath("//h1[text()='Roles']");
	public static final By roleValidate=By.xpath("(//input[@placeholder='Ex. Mia']/../../../../following-sibling::div/table/tbody/tr/td)[1]");
	public static final By userButton=By.xpath("//button[text()=' Users ']");
	public static final By settingsButton=By.xpath("//i[@aria-haspopup='menu']");
	public static final By logoutOption=By.xpath("//span[text()='Logout']");
	public static final By selectRole=By.xpath("//span[text()='Provider Role-01']");
	public static final By role=By.xpath("//mat-label[text()='Role']");
//	public static final By 
//	public static final By 
//	public static final By 
//	public static final By 
//	public static final By 
//	public static final By 
//	public static final By 
//	public static final By 
}