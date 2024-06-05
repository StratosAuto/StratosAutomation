package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Manager_JobCards_Pageobjects {
	
	public static final By jobCardMenu=By.xpath("//span[text()='Job Card & Tasks']");
	public static final By addNewJobCardButton=By.xpath("//button[text()=' Add New Job Card ']");
	public static final By bulkUploadButton=By.xpath("//button[text()=' Bulk Upload ']");
	public static final By inactiveJobCards=By.xpath("//span[text()='Inactive Job Cards']");
	public static final By jobCardName=By.xpath("//input[@formcontrolname='jobCardName']");
	public static final By jobCardDescription=By.xpath("//input[@formcontrolname='jobCardDescription']");
	public static final By clientName=By.xpath("//mat-select[@formcontrolname='clientName']");
	public static final By selectClientName=By.xpath("//span[text()='Sadio']");
	public static final By siteName=By.xpath("//mat-select[@formcontrolname='siteName']");
	public static final By selectSiteName=By.xpath("//span[text()='Zina']");
	public static final By saveAndContinueButton=By.xpath("//button[text()=' Save and Continue ']");
	public static final By cancelButton=By.xpath("//button[text()=' Cancel ']");
	public static final By validateNull=By.xpath("//h1[text()='Job Cards And Tasks']");
	public static final By manageJobCardsButton=By.xpath("//button[text()=' Manage Job Card ']");
	public static final By manageTasksButton=By.xpath("//button[text()=' Manage Tasks ']");
	public static final By updateButton=By.xpath("//button[text()=' Update ']");
	public static final By deactivate=By.xpath("//button[text()=' Deactivate ']");
	public static final By activate=By.xpath("//button[text()=' Activate ']");
	public static final By taskName=By.xpath("//input[@formcontrolname='name']");
	public static final By taskDescription=By.xpath("//input[@formcontrolname='description']");
	public static final By checkpoint=By.xpath("//mat-select[@role='combobox']");
	public static final By selectCheckpoint=By.xpath("//mat-select[@formcontrolname='checkpoint']/../../../../../../../../../../../../../../../following-sibling::div/div/div/div/mat-option");
	public static final By required=By.xpath("//mat-select[@formcontrolname='required']");
	public static final By selectRequired=By.xpath("//span[text()='Yes']");
	public static final By addButton=By.xpath("//button[text()=' Add ']");
	public static final By clearButton=By.xpath("//button[text()=' Clear ']");
	public static final By editSymbol=By.xpath("//i[@class='fa-solid fa-pen']");
	public static final By validateTask=By.xpath("//div[@class='table']/table/tbody/tr/td");
	public static final By cancelSymbol=By.xpath("//i[@class='fa-solid fa-xmark']");
	public static final By filterValidates=By.xpath("//input[@placeholder='Ex. Mia']/../../../../following-sibling::div/table/tbody/tr/td");
	
	public static final By lengthJobCardName=By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
	public static final By lengthJobCardDescription=By.xpath("//span[text()='Maximum 250 Characters Allowed.']");
	public static final By lengthTaskName=By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
	public static final By lengthTaskDescription=By.xpath("//span[text()='Maximum 250 characters allowed.']");
	public static final By filterError=By.xpath("//input[@placeholder='Ex. Mia']/../../../../following-sibling::div/table/tbody/tr/td");
	
	public static final By invalidBulkUpload=By.xpath("//p[text()='Error']");
	public static final By successBulkUpload=By.xpath("//p[text()='Job cards Uploaded Successfully']");
	public static final By nullBulkUpload=By.xpath("//p[text()='Your Excel file is Empty.']");
	
}