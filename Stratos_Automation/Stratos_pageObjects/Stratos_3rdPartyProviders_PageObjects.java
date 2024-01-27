package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_3rdPartyProviders_PageObjects {
	public static final By provider =By.xpath("//span[text()='3rd Party Provider']");
	public static final By addNewProviderButton =By.xpath("//button[text()=' Add New Provider ']");
	public static final By providerName =By.xpath("//input[@formcontrolname='providerName']");
	public static final By mobileNumber =By.xpath("//input[@formcontrolname='mobileNumber']");
	public static final By otherContactNumber =By.xpath("//input[@formcontrolname='otherNumber']");
	public static final By emailAddress =By.xpath("//input[@formcontrolname='email']");
	public static final By faxNumber =By.xpath("//input[@formcontrolname='fax']");
	public static final By vatNumber =By.xpath("//input[@formcontrolname='vat']");
	public static final By status =By.xpath("//span[text()='Active']");
	public static final By inactive=By.xpath("//span[text()='Inactive']");
	public static final By street =By.xpath("//input[@formcontrolname='street']");
	public static final By street2 =By.xpath("//input[@formcontrolname='street2']");
	public static final By city =By.cssSelector("div[class='mat-mdc-form-field-focus-overlay ng-tns-c20-132 ng-star-inserted']");
	public static final By selectCity=By.xpath("//span[text()='Pretoria']");
	public static final By province =By.xpath("//mat-select[@formcontrolname='province']");
	public static final By country =By.xpath("//mat-label[text()='Country']");
	public static final By selectCountry=By.xpath("//span[text()='South Africa']");	
	public static final By postalCode =By.xpath("//input[@formcontrolname='zipCode']");
	public static final By comments =By.xpath("//input[@formcontrolname='comment']");
	public static final By saveAndContinueButton=By.xpath("//button[text()=' Save and Continue ']");
	public static final By cancelButton=By.xpath("//button[text()=' Cancel ']");
	public static final By bulkUploadButton=By.xpath("//button[text()=' Bulk Upload ']");
	public static final By nullValidate=By.xpath("//h1[text()='Manage Providers']");
	
	public static final By errorMobileNumber=By.xpath("//span[text()='Give Correct Mobile Number']");
	public static final By errorOtherContactNumber=By.xpath("(//span[text()='Give Correct Mobile Number'])[2]");
	public static final By errorEmailAddress=By.xpath("//span[text()='Enter valid Email Address.']");
	public static final By errorFaxNumber=By.xpath("//span[text()='Give Correct Fax Number']");
	public static final By errorVatNumber=By.xpath("//span[text()='Give Correct Vat Number']");
	public static final By errorPostalCode=By.xpath("//span[text()='Give Correct Postal Code']");
	
	public static final By lengthProviderName=By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
	public static final By lengthStreet=By.xpath("//span[text()='Maximum 100 Characters Allowed.']");
	public static final By lengthStreet2=By.xpath("//span[text()='Maximum 100 characters Allowed.']");
	
	
}
