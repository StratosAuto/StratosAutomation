package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_SignUp_PageObjects {
	public static final By signUp=By.xpath("//a[text()='Sign up']");
	public static final By firstName=By.xpath("//input[@formcontrolname='FirstName']");
	public static final By lastName=By.xpath("//input[@placeholder='Enter your last name']");
	public static final By emailAddress=By.xpath("//input[@placeholder='Enter your email']");
	public static final By mobileNumber=By.xpath("//input[@placeholder='Enter your number']");
	public static final By passWord=By.xpath("//input[@placeholder='Enter your password']");
	public static final By confirmPassord=By.xpath("//input[@placeholder='Confirm your password']");
	public static final By roleDropdown=By.xpath("//select[@formcontrolname='Roles']");
	public static final By selectroleDropdown=By.xpath("//option[@value='6576b8813b9019c0ab11d7e6']");
	public static final By gender=By.xpath("//label[@for='dot-2']");
	public static final By registerButton=By.xpath("//input[@type='submit']");
	public static final By goBackButton=By.xpath("//h2[text()='← Go Back']");
	public static final By invalidDataError=By.xpath("//p[text()='*Please Check All Fields']");
	public static final By firstNameFieldLength=By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
	public static final By lastNameFieldLength=By.xpath("//span[text()='Maximum 25 Characters Allowed']");
	public static final By passwordFieldLength=By.xpath("//span[text()='Minimum 6 Characters Allowed.']");
	public static final By firstNameInvalidError=By.xpath("(//mat-error[@aria-atomic='true'])[1]");
	public static final By lastNameInvalidError=By.xpath("(//mat-error[@aria-atomic='true'])[2]");
	public static final By emailAddressInvalidError=By.xpath("//span[text()='Invalid Email Address']");
	public static final By mobileNumberInvaidError=By.xpath("//span[text()='Give valid Mobile Number']");
	
	
	
}
