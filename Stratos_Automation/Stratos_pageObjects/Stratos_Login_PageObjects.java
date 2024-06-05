package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Login_PageObjects {

	public static final By email = By.xpath("//input[@type='email'][@name='email']");
	public static final By password = By.xpath("//input[@type='password']");
	public static final By loginSubmitutton = By.xpath("//button[@type='submit']");
	public static final By errorMessage = By.xpath("//p[text()='Entered Email/Password is Incorrect']");
	public static final By validateLogin = By.xpath("//span[text()='Home']");
	public static final By loginPage=By.xpath("//span[text()='Sign in to your account']");
	public static final By themes=By.xpath("//button[@id='themes_btn']");
	public static final By lightTheme=By.xpath("//button[@class='mat-mdc-menu-item mat-mdc-focus-indicator mdc-list-item btn_yellow']");
	public static final By settings=By.xpath("//i[@aria-haspopup='menu']");
	public static final By changePassword=By.xpath("//span[text()='Change password']");
	public static final By currentPassword=By.xpath("//input[@formcontrolname='currentPassword']");
	public static final By newPassword=By.xpath("//input[@formcontrolname='newPassword']");
	public static final By updateButton=By.xpath("//button[@class='btn btn-outline-success m-1']");
	public static final By confirmPassword=By.xpath("//input[@class='mat-mdc-input-element ng-tns-c20-5 mat-mdc-form-field-input-control mdc-text-field__input ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored']");
	public static final By logOut=By.xpath("//span[text()='Logout']");
	public static final By emptyLoginerrormessage=By.xpath("//div[@class='container-2']");
	public static final By emptyLoginerrormessageForEmpltyFileds=By.xpath("//p[text()='Please fill in all required fields.']");
	public static final By forgotPasswordLink=By.xpath("//a[text()='Forgot your password?']");
	public static final By forgotPinEmailAddress=By.xpath("//input[@formcontrolname='email']");
	public static final By forgotPinSubmitButton=By.xpath("//button[text()='Submit']");
	public static final By forgotPinCreatPasswordfield=By.xpath("//input[@formcontrolname='password']");
	public static final By forgotPinConfirmPAssword=By.xpath("//input[@formcontrolname='confirmPassword']");
	public static final By forgotpinemailSuccessMessage=By.xpath("//p[text()='Please wait, your request is processing']");
	public static final By passwordUpdatedSucesfullyMessage=By.xpath("//p[text()='Password Updated Successfully']");
	public static final By updatedPasswordSuccessMessage=By.xpath("//p[text()='Password updated successfully']");
		
}
