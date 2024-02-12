package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Login_PageObjects {

	public static final By email = By.xpath("//input[@type='email'][@name='email']");
	public static final By password = By.xpath("//input[@type='password']");
	public static final By login_button = By.xpath("//input[@type='submit'] [@name='login']");
	public static final By errorMessage = By.xpath("//p[text()='Error']");
	public static final By validateLogin = By.xpath("//span[text()='Home']");
	public static final By loginPage=By.xpath("//span[text()='Sign in to your account']");
	public static final By themes=By.xpath(" //button[text()=' Themes ']");
	public static final By lightTheme=By.xpath("//button[@class=\"mat-mdc-menu-item mat-mdc-focus-indicator mdc-list-item btn_yellow\"]");
//			("//span[text()=' Light Theme ']");
	public static final By settings=By.xpath("//i[@class='mat-mdc-menu-trigger settings fa-solid fa-gear']");
	public static final By changePassword=By.xpath("//span[text()='Change password']");
	public static final By currentPassword=By.xpath("///input[@formcontrolname='currentPassword']");
	public static final By newPassword=By.xpath("//input[@formcontrolname='currentPassword']");
	public static final By updateButton=By.xpath("//button[@class='btn btn-outline-success m-1']");
	public static final By confirmPassword=By.xpath("//input[@class='mat-mdc-input-element ng-tns-c20-5 mat-mdc-form-field-input-control mdc-text-field__input ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored']");
	public static final By logOut=By.xpath("//*[@id='mat-menu-panel-1']/div/button[2]");
	public static final By emptyLoginerrormessage=By.xpath("//div[@class='container-2']");
	public static final By emptyLoginerrormessageForEmpltyFileds=By.xpath("//p[text()='Please fill in all required fields.']");
}
