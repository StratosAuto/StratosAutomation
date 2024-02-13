package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_SignUp_PageObjects {
	public static final By signUp=By.xpath("//a[text()='Sign up']");
	public static final By firstName=By.xpath("//input[@placeholder='Enter your name']");
	public static final By lastName=By.xpath("//input[@placeholder='Enter your last name']");
	public static final By emailAddress=By.xpath("//input[@placeholder='Enter your email']");
	public static final By mobileNumber=By.xpath("//input[@placeholder='Enter your number']");
	public static final By passWord=By.xpath("//input[@placeholder='Enter your password']");
	public static final By confirmPassord=By.xpath("//input[@placeholder='Confirm your password']");
	public static final By roleDropdown=By.xpath("//select[@placeholder='select Role']");
	public static final By gender=By.xpath("//label[@for='dot-2']");
	public static final By registerButton=By.xpath("//input[@type='submit']");
	public static final By goBackButton=By.xpath("//h2[text()='← Go Back']");
	public static final By invalidDataError=By.xpath("//p[text()='*Please Check All Fields']");
//	public static final By emptyDataError=By.xpath("");
	

}
