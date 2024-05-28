package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_SitesAndCheckpoints_PageObjects {
	
	public static final By siteAndcheckpoints =By.xpath("//span[text()='Site & Checkpoints']");
	public static final By addnewSiteButton=By.xpath("//button[text()=' Add New Site ']");
	public static final By siteName=By.xpath("//mat-label[text()='Site Name']");
	public static final By siteNameInput=By.xpath("//input[@formcontrolname='Name']");
	public static final By siteDescription=By.xpath("//textarea[@formcontrolname='sitedescription']");
	public static final By completeAdress=By.xpath("//input[@formcontrolname='street1']");
	public static final By contactsFirstName=By.xpath("//input[@formcontrolname='firstname']");
	public static final By siteCancelButton=By.xpath("//button[text()=' Cancel ']");
	public static final By city=By.xpath("//mat-select[@formcontrolname='city']");
//	public static final By postalCode=By.xpath("//input[@formcontrolname='postalcode']");
	//mat-label[contains(text(),' Postal Code')]/following::input
	public static final By postalCode=By.xpath("//input[@formcontrolname='postalcode']");
	
	public static final By country=By.xpath("//mat-select[@formcontrolname='country']");
	public static final By mobile=By.xpath("//input[@formcontrolname='mobile']");
	public static final By email=By.xpath("//input[@formcontrolname='email']");
	public static final By siteManager=By.xpath("//input[@formcontrolname='sitemanager']");
	public static final By clientName =By.xpath("//mat-select[@formcontrolname='client']");
	public static final By firstName=By.xpath("//input[@formcontrolname='firstname']");
	public static final By lastName =By.xpath("//input[@formcontrolname='lastname']");
	public static final By siteMobile=By.xpath("//input[@formcontrolname='siteMobile']");
	public static final By siteEmail=By.xpath("//input[@formcontrolname='siteEmail']");
	public static final By selectCity=By.xpath("//span[text()='Soweto']");
	public static final By selectCountry =By.xpath("//span[text()='South Africa']");
	public static final By selectClientName =By.xpath("//span[text()='rose']");
	public static final By addnewsiteSaveButton =By.xpath("//button[text()=' Save and Continue ']");
	public static final By provinceValidate =By.xpath("/html/body/app-root/app-home/div/mat-sidenav-container/mat-sidenav-content/div/app-create/div/form/div[2]/div[1]/div/div[3]/div[2]/mat-form-field");
	public static final By longitudeVAlidate =By.xpath("//input[@formcontrolname='longitude']");
	public static final By manageCheckpointsButton =By.xpath("//button[text()=' Manage Checkpoints ']");
	public static final By checkPointName =By.xpath("//input[@formcontrolname='name']");
	public static final By CheckpointnameClick=By.xpath("//mat-label[text()='Checkpoint Name']");
	public static final By checkpointsAdress =By.xpath("//input[@formcontrolname='address']");
    public static final By  addButton=By.xpath("//button[text()=' Add ']");
	public static final By  doneButton=By.xpath("//button[text()=' Done ']");
    public static final By invalidDataErrorMessage =By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
    public static final By AdressdropDown=By.xpath("//div[@role='listbox']");
    public static final By clickonCheckpoints =By.xpath("//h2[text()='Create Checkpoints']");
    public static final By checkpointsLAtitude =By.xpath("//input[@formcontrolname='latitude']");
    public static final By manageSite =By.xpath("//button[text()=' Manage Site '] ");
    public static final By updateButton  =By.xpath("//button[text()=' Update ']");
    public static final By selectClientName1 =By.xpath("//mat-option[@id='mat-option-13']");
    public static final By filterButton =By.xpath("//input[@placeholder='Ex. Mia']");
    public static final By deactivateButton =By.xpath("//button[text()=' Deactivate ']");
    public static final By inactiveSite=By.xpath("//span[text()='Inactive Sites']");
    public static final By validateResults=By.xpath("//td[text()='Omni pvt lmtd']");
    public static final By otherContactNumber=By.xpath("//input[@formcontrolname='othernumber']");
    public static final By activateButton=By.xpath("//button[text()=' Activate ']");
    public static final By bulkUpload=By.xpath("//button[text()=' Bulk Upload ']");
    public static final By selectFile=By.xpath("//label[text()=' Select File ']");
    public static final By submitButton=By.xpath("//button[text()='Submit']");
    public static final By file=By.xpath("//input[@type='file']");
    public static final By cancelButton=By.xpath("//button[text()='Cancel']");
    public static final By nofileError=By.xpath("//p[text()='No File Selected']");
    public static final By filter =By.xpath("//input[@placeholder='Ex. Mia']");
    public static final By completeAdressOption =By.xpath("//mat-option[@role='option']");
    public static final By cellData=By.xpath("//td[@role='cell']");
    public static final By inavalidPostalCodeError=By.xpath("//span[text()='Give Correct Postal Code']");
    public static final By invalidMobileNumber=By.xpath("(//span[text()='Give Correct Mobile Number'])[1]");
    public static final By invalidEmailAdressError=By.xpath("(//span[text()='Give Correct Email'])[1]");
    
    
    public static final By SiteNameError=By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
    
    public static final By CancelButtonForInvalid=By.xpath("//button[text()=' Cancel ']");
    
    public static final By BulkUploadSuccessMessage=By.xpath("//p[text()='File Uploaded Successfully']");
    public static final By DuplicateBulkfileUploadErrrorMessage=By.xpath("//p[text()='The Emails are already exist']");
    public static final By EmptyBulkFileErrorMessage=By.xpath("//p[text()='No File Selected']");
    
}
