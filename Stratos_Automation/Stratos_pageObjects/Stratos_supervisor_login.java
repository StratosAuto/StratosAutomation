package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_supervisor_login {
	public static final By loginAsemoloyeeBuuton=By.xpath("//button[text()=' Login as Employee ']");
	public static final By enter5DigitPinField=By.xpath("//input[@formcontrolname='password']");
	public static final By loginButton=By.xpath("//button[text()=' Login ']");
	public static final By forgotPin=By.xpath("//span[text()='Forgot PIN?']");
	public static final By enterEmployeeIdField=By.xpath("//input[@formcontrolname='password']");
	public static final By requestNewPinButton=By.xpath("//button[text()=' Request New Pin ']");
	public static final By successMessage=By.xpath("//p[text()='Login Successful']");
	public static final By errorMessageForEmpty=By.xpath("//p[text()='Please fill in all required fields.']");
	public static final By invalidDataErrorMessage=By.xpath("//p[text()='Incorrect Pin. 4 attempts remaining.']");
	public static final By inavlidEmployeeIDError=By.xpath("//p[text()='No employee with entered Id']");
	public static final By employeeIdSuccessmessage=By.xpath("//p[text()='success']");
	
	
}
