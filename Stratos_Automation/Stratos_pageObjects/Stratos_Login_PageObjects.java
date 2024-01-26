package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Login_PageObjects {

	public static final By email = By.xpath("//input[@type='email'][@name='email']");
	public static final By password = By.xpath("//input[@type='password']");
	public static final By login_button = By.xpath("//input[@type='submit'] [@name='login']");
	public static final By errorMessage = By.xpath("//p[text()='Entered Email/Password is Incorrect']");
	public static final By successMessage = By.xpath("//p[contains(text(),'Login Successful')]");
	
	
	
}
