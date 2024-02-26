package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Admin_Equipment_PageObject {
	public static final By equipmentModule=By.xpath("//span[text()='Equipment']");
	public static final By addNewEquipment=By.xpath("//button[text()=' Add New Equipment ']");
	public static final By equipmentDescription=By.xpath("//input[@formcontrolname='equipmentDescription']");
	public static final By equipmentName=By.xpath("//input[@formcontrolname='equipmentName']");
	public static final By clientNameDropdown=By.xpath("//mat-select[@formcontrolname='clientName']");
	public static final By siteNameDropdown=By.xpath("//mat-select[@formcontrolname='siteName']");
	public static final By equipmentCategory=By.xpath("//mat-select[@formcontrolname='equipmentCategory']");
	public static final By equipmentLicenceNumber=By.xpath("//mat-label[text()='Equipment Licence Number']");
	public static final By equipmentSerialNumber=By.xpath("//input[@formcontrolname='serialNumber']");
	public static final By equipmentAutoallocate=By.xpath("//mat-select[@formcontrolname='autoAllocate']");
//			By.xpath("//mat-select[@formcontrolname='autoAllocate']");
	public static final By equipmentType=By.xpath("//mat-select[@formcontrolname='equipmentType']");
	public static final By licenceExpiryDate=By.xpath("[class='mat-mdc-button-touch-target']");
	public static final By saveAndContinue=By.xpath("//button[@form='myForm']");
	public static final By cancelButton=By.xpath("//button[text()=' Cancel ']");
	public static final By selectClientName=By.xpath("//span[text()='John Fred']");
	public static final By selectSiteName=By.xpath("//span[text()='sativa']");
	public static final By selectEquipmentType=By.xpath("//span[text()='Electronic Device']");
	public static final By selectAutoAllocate=By.xpath("//span[text()='YES']");
	public static final By equipmentDescriptionerror=By.xpath("//span[text()='Maximum 250 Characters Allowed.']");
	public static final By equipmentTypeError=By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
	public static final By licenseExpirydateButton=By.xpath("//button[@type='button']");
	public static final By selectlicenseExpirydate=By.xpath("//span[text()=' 29 ']");
	public static final By saveAndContinueButton=By.xpath("//button[text()=' Save and Continue ']");
	public static final By manageEquipment=By.xpath("//button[text()=' Manage Equipment ']");
	public static final By equipmentLicenseNumberInput=By.xpath("//input[@formcontrolname='licenseNumber']");
	public static final By selectEquipmentType1=By.xpath("//span[text()='Doubel Barrel']");
	public static final By EquipmentFilter=By.xpath("//input[@placeholder='Ex. Mia']");
	public static final By equipmentNameValidate=By.xpath("//td[text()='KUKKI-182']");
	public static final By equipmentNameValidateequipmentName=By.xpath("//td[text()='KUKKA-01']");
	public static final By updateButton=By.xpath("//button[text()=' Update ']");
	public static final By faultyEquipment=By.xpath("//span[text()='Faulty Equipments']");
	public static final By deactivateButton=By.xpath("//button[text()=' Deactivate ']");
	public static final By markFaultyButton=By.xpath("//button[text()=' Mark Faulty ']");
//	public static final By markFaultyButton=By.xpath("//button[text()=' Mark Faulty ']");
	public static final By inactiveEquipment=By.xpath("//span[text()='Inactive Equipments']");
	public static final By bulkUploadBUtton=By.xpath("//button[text()=' Bulk Upload ']");
	public static final By file=By.xpath("//input[@type='file']");
	public static final By bulkSubmitButton=By.xpath("//button[text()='Submit']");
//	public static final By =By.xpath("");
	public static final By filterValidates=By.xpath("(//input[@placeholder='Ex. Mia']/../../../../following-sibling::div/table/tbody/tr/td)[3]");
	public static final By equipmentDescriptionFieldvalidationError=By.xpath("//span[text()='Maximum 250 Characters Allowed.']");
	public static final By equipmentNameFieldValidation=By.xpath("(//span[text()='Maximum 25 Characters Allowed.'])[1]");
	public static final By equipmentLicenseNumberFieldValidation=By.xpath("//span[text()='Maximum 50 Characters Allowed.']");
	public static final By equipmentSerialNumberFieldValidation=By.xpath("(//span[text()='Maximum 25 Characters Allowed.'])[2]");
	public static final By inavalidEquipmentNameError=By.xpath("//span[text()='Give Correct Name']");
	public static final By invalidLicenseNumberError=By.xpath("//span[text()='No special Characters Allowed.']");
	public static final By invalidSerialNumberError=By.xpath("//span[text()='No Special Characters Allowed.']");
	public static final By clearButton=By.xpath("//button[text()=' Clear ']");
	public static final By bulkUploadCancelButton=By.xpath("//button[text()='Cancel']");







}
