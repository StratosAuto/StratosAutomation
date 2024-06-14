package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Manager_Login_PageObjects {
	
	public static final By loginAsEmployeeButton=By.xpath("//button[text()=' Login as Employee ']");
	public static final By pinField=By.xpath("//input[@formcontrolname='password']");
	public static final By eyeCard=By.xpath("//button[@class='btnvisible']");
	public static final By loginButton=By.xpath("//button[text()=' Login ']");
	public static final By forgotPin=By.xpath("//span[text()='Forgot PIN?']");
	public static final By employeeID=By.xpath("//input[@formcontrolname='password']");
	public static final By requestNewPin=By.xpath("//button[text()=' Request New Pin ']");
	public static final By goToLogin=By.xpath("//p[text()='Go To Login']");
	public static final By validateHomepage=By.xpath("//div[text()=' MANAGER ']");
	public static final By settingsButton=By.xpath("//i[@aria-haspopup='menu']");
	public static final By logout=By.xpath("//span[text()='Logout']");
	public static final By validateLogin=By.xpath("//h2[text()='Sign in']");
	
	public static final By invalidEmployeeIDError=By.xpath("//p[text()='Error']");
	public static final By validEmployeeIDSuccess=By.xpath("//p[text()='Requested for new pin']");
	}