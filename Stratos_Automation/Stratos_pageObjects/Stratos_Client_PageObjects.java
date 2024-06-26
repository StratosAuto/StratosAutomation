package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Client_PageObjects {	
	
//	public static final By clientModule=By.xpath("//span[text()='Clients']");
	public static final By clientModule=By.xpath("//span[text()='Clients']");
	public static final By addNewclient=By.xpath("//button[text()=' Add New Client ']");
	
	public static final By clientName=By.xpath("//input[@formcontrolname='clientName']");

//	public static final By clientName=By.xpath("//input[@formcontrolname=\"clientName\"]");
	public static final By mobileNumber=By.xpath("//input[@formcontrolname='mobileNumber']");
	public static final By emailAdress=By.xpath("//input[@formcontrolname='email']");
	public static final By faxNumber=By.xpath("//input[@formcontrolname='faxNumber']");
	public static final By vatNumber=By.xpath("//input[@formcontrolname='vatNumber']");
	public static final By accountManager=By.xpath("//input[@formcontrolname='accountManager']");
	public static final By clickStatus =By.id("mat-select-value-3");
	public static final By clickStatus1=By.id("mat-select-value-13");
	public static final By status=By.xpath("//span[text()='Inactive']");
	public static final By street=By.xpath("//input[@formcontrolname='street']");
	public static final By street2=By.xpath("//input[@formcontrolname='street2']");
	public static final By city=By.xpath("//mat-label[text()='City']");
	public static final By selectCity=By.xpath("//span[text()='Johannesburg']");
	public static final By provinceText=By.xpath("//mat-label[text()='Province']");
	public static final By province=By.xpath("//span[@class=\"mat-mdc-select-placeholder mat-mdc-select-min-line ng-tns-c24-287 ng-star-inserted\"]");
	public static final By country=By.xpath("//mat-select[@formcontrolname='country']");
	public static final By selectCountry=By.xpath("//span[text()='South Africa']");
	public static final By postalCode=By.xpath("//input[@formcontrolname='zipCode']");
	public static final By comments=By.xpath("//textarea[@formcontrolname='comment']");
	public static final By cancelButton=By.xpath("//button[text()=' Cancel ']");
	public static final By saveAndcontinue=By.xpath("//button[text()=' Save and Continue ']");
	public static final By addclientSuccessMessage=By.xpath("//div[@class='container-2']");
	public static final By manageClient=By.xpath("//button[text()=' Manage Client ']");
	public static final By editManageClientDetails=By.xpath("//button[text()=' Edit ']");
	public static final By updateButton=By.xpath("//button[@form='form']");
	public static final By succcessMessageForUpdate=By.xpath("//p[text()='Client updated Successfully']");
	public static final By deActivateButton=By.xpath("//button[@class='btn btn-danger add ng-star-inserted']");
	public static final By CheckpointsEdit=By.xpath("//p[text()='Edit']");
	public static final By bulkUploadButton=By.xpath("//button[text()=' Bulk Upload ']");
	public static final By bulkUploadSubmitButton=By.xpath("//button[text()='Submit']");
	public static final By bulkUploadCancelButton=By.xpath("//button[text()='Cancel']");
	public static final By file=By.xpath("//input[@type='file']");
	 public static final By cellData=By.xpath("//td[@role='cell']");
	 public static final By filter =By.xpath("//input[@placeholder='Ex. Mia']");
	 public static final By inactiveClients =By.xpath("//span[text()='Inactive Clients']");
	public static final By inavlidMobileNumberError=By.xpath("//span[text()='Give Correct Mobile Number']");
	public static final By invalidEmailAddress=By.xpath("//span[text()='Give Valid Email']");
	public static final By invalidFaxNumber=By.xpath("//span[text()='Give Correct Fax Number']");
	public static final By invalidVatNumberError=By.xpath("//span[text()='Give Correct Vat Number']");
	public static final By invalidAccountManager=By.xpath("//span[text()='Give Correct Name']");
	public static final By inavlidPostalCode=By.xpath("//span[text()='Give Correct Postal Code']");
	public static final By fieldLengthErrorForClientName=By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
	public static final By fieldValiErrorforStreet=By.xpath("(//span[text()='Max length is 100 characters allowed'])[1]");
	public static final By filedValiErrorForStreet2=By.xpath("(//span[text()='Max length is 100 characters allowed'])[2]");
	public static final By fieldValiForCommentserror=By.xpath("//span[text()='Max length is 250 characters']");
	public static final By activateButton=By.xpath("//button[text()=' Activate ']");
//	public static final By =By.xpath("");
	
	 
	 
	
	public static By SelectWithoptions(String text) {
	   	  final By textXpath = By.xpath("//div[@role='listbox']/mat-option/span[text()='"+text+"']");
	   	  return textXpath;
	        }
}
