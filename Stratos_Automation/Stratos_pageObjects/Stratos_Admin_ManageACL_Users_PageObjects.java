package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Admin_ManageACL_Users_PageObjects {
	
	public static final By usersMenu=By.xpath("//span[text()='Manage ACL Users']");
	public static final By addNewUserButton=By.xpath("//button[text()=' Add New User ']");
	public static final By firstName=By.xpath("//input[@formcontrolname='firstName']");
	public static final By emailAddress=By.xpath("//input[@formcontrolname='email']");
	public static final By password=By.xpath("//input[@formcontrolname='password']");
	public static final By role=By.xpath("//mat-label[text()='Role']");
	public static final By selectRole=By.xpath("//span[text()='Admin']");
	public static final By lastName=By.xpath("//input[@formcontrolname='lastName']");
	public static final By mobileNumber=By.xpath("//input[@formcontrolname='phoneNumber']");
	public static final By update=By.xpath("//input[@id='mat-input-23']");
	public static final By confirmPassword=By.xpath("//input[@formcontrolname='confirmPassword']");
	public static final By gender=By.xpath("//mat-label[text()='Gender']");
	public static final By selectGender=By.xpath("//span[text()='Male']");
	public static final By addButton=By.xpath("//button[text()=' Add ']");
//	public static final By manageACLUserButton=By.xpath("//button[text()=' Manage ACL User ']");
	public static final By manageACLUserButton=By.xpath("(//button[@class='btn ng-star-inserted'])[1]");
	public static final By invalidName=By.xpath("(//span[text()='Give Correct Name'])[2]");
	public static final By invalidEmailAddress=By.xpath("//span[text()='Invalid Email Format']");
	public static final By invalidMobileNumber=By.xpath("//span[text()='Give Correct Mobile Number']");
	public static final By fieldLengthFirstName=By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
	public static final By minFieldLengthFirstName=By.xpath("//span[text()='Minimum 3 Characters Required.']");
	public static final By minFieldLengthLastName=By.xpath("(//span[text()='Minimum 3 Characters Required.'])[2]");
	public static final By fieldLengthLastName=By.xpath("//span[text()='Maximum 25 characters Allowed.']");
	public static final By fieldLengthMobileNumber=By.xpath("//span[text()='Give Correct Mobile Number']");
	public static final By fieldLengthPassword=By.xpath("//span[text()='Minimum 6 Characters Allowed.']");
	public static final By fieldLengthConfirmPassword=By.xpath("(//span[text()='Minimum 6 Characters Allowed.'])[2]");
	public static final By cancelButton=By.xpath("//button[text()=' Cancel ']");
	public static final By duplicateError=By.xpath("//p[text()='user already exists']");
	public static final By filter=By.xpath("//mat-label[text()='Filter']");
	public static final By updateButton=By.xpath("//button[text()=' Update ']");
	public static final By nullValidate=By.xpath("//h1[text()='Manage ACL Users']");
}