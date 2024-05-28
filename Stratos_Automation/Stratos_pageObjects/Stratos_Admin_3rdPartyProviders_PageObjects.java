package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Admin_3rdPartyProviders_PageObjects {
	public static final By provider =By.xpath("//span[text()='3rd Party Provider']");
	public static final By addNewProviderButton =By.xpath("//button[text()=' Add New Provider ']");
	
	public static final By errorMobileNumber=By.xpath("//span[text()='Give Correct Mobile Number']");
	public static final By errorOtherContactNumber=By.xpath("(//span[text()='Give Correct Mobile Number'])[2]");
	public static final By errorEmailAddress=By.xpath("//span[text()='Enter valid Email Address.']");
	public static final By errorFaxNumber=By.xpath("//span[text()='Give Correct Fax Number']");
	public static final By errorVatNumber=By.xpath("//span[text()='Give Correct Vat Number']");
	public static final By errorPostalCode=By.xpath("//span[text()='Give Correct Postal Code']");
	public static final By lengthProviderName=By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
	public static final By lengthStreet=By.xpath("//span[text()='Maximum 100 Characters Allowed.']");
	public static final By lengthStreet2=By.xpath("//span[text()='Maximum 100 characters Allowed.']");
	
	public static final By providerName =By.xpath("//input[@formcontrolname='providerName']");
	public static final By mobileNumber =By.xpath("//input[@formcontrolname='mobileNumber']");
	public static final By otherContactNumber =By.xpath("//input[@formcontrolname='otherNumber']");
	public static final By emailAddress =By.xpath("//input[@formcontrolname='email']");
	public static final By faxNumber =By.xpath("//input[@formcontrolname='fax']");
	public static final By vatNumber =By.xpath("//input[@formcontrolname='vat']");
	public static final By status =By.xpath("//span[text()='Active']");
	public static final By active=By.xpath("(//span[text()='Active'])[2]");
	public static final By inactive=By.xpath("//span[text()='Inactive']");
	public static final By street =By.xpath("//input[@formcontrolname='street']");
	public static final By street2 =By.xpath("//input[@formcontrolname='street2']");
	public static final By city =By.xpath("//mat-select[@formcontrolname='city']");
	public static final By selectCity=By.xpath("//span[text()='Pretoria']");
	public static final By province =By.xpath("//mat-select[@formcontrolname='province']");
	public static final By country =By.xpath("//mat-select[@formcontrolname='country']");
	public static final By selectCountry=By.xpath("//span[text()='South Africa']");	
	public static final By postalCode =By.xpath("//input[@formcontrolname='zipCode']");
	public static final By comments =By.xpath("//input[@formcontrolname='comment']");
	public static final By saveAndContinueButton=By.xpath("//button[text()=' Save and Continue ']");
	public static final By cancelButton=By.xpath("//button[text()=' Cancel ']");
	public static final By filter=By.xpath("//input[@placeholder='Ex. Mia']");
	public static final By filterName=By.xpath("//td[text()='xyz']");
	public static final By bulkUploadButton=By.xpath("//button[text()=' Bulk Upload ']");
	public static final By nullValidate=By.xpath("//h1[text()='Manage Providers']");
	public static final By activeProviderRef=By.xpath("//td[text()='65b5dba994f8e6cc41dd5024']");
	public static final By filterValidates=By.xpath("(//input[@placeholder='Ex. Mia']/../../../../following-sibling::div/span/table/tbody/tr/td)[2]");
	public static final By inactiveProvider=By.xpath("//span[text()='Inactive Providers']");
	public static final By inactiveProviderRef=By.xpath("//td[text()='6576cdab2c97546ad1fa115a']");
	public static final By itemsDropdown=By.xpath("//span[text()='5']");
	public static final By itemsDropdownOption=By.xpath("//span[text()=' 10 ']");
	public static final By errorFilter=By.xpath("//input[@placeholder='Ex. Mia']/../../../../following-sibling::div/table/tbody/tr/td");
	
	public static final By manageProviderButton=By.xpath("//button[text()=' Manage Provider ']");
	public static final By updateButton=By.xpath("//button[text()=' Update ']");
	public static final By deactivateButton=By.xpath("//button[text()=' Deactivate ']");
	public static final By validateDeactivate=By.xpath("//td[text()='TY solutions']");
	public static final By activate=By.xpath("//button[text()=' Activate ']");
	public static final By cancelProvider=By.xpath("//button[text()='Cancel']");
	public static final By validateActivate=By.xpath("//td[text()='JohnThird']");
	public static final By selectFile=By.xpath("//label[text()=' Select File ']");
	public static final By file=By.xpath("//input[@type='file']");
	public static final By submitButton=By.xpath("//button[text()='Submit']");
	public static final By errorFileUpload=By.xpath("//p[text()='Please fill required and valid data in row number 2']");
	public static final By nullFileUpload=By.xpath("//p[text()='Your Excel file is Empty.']");
	public static final By successFileUpload=By.xpath("");
	public static final By cancelBulkUpload=By.xpath("//button[text()='Cancel']");	
}