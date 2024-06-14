package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Admin_Equipment_PageObject {
	
	public static final By dropdownSelect(String Object) {

		By data=By.xpath("//div[@role='listbox']/descendant::mat-option/span[contains(text(),'"+Object+"')]");

				return data;

	}

	
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
//  By.xpath("//mat-select[@formcontrolname='autoAllocate']");
	public static final By equipmentType=By.xpath("//mat-select[@formcontrolname='equipmentType']");
	public static final By licenceExpiryDate=By.xpath("[class='mat-mdc-button-touch-target']");
	public static final By saveAndContinue=By.xpath("//button[@form='myForm']");
	public static final By cancelButton=By.xpath("//button[text()=' Cancel ']");
	public static final By selectClientName=By.xpath("//span[text()='Omega Building']");
	public static final By selectSiteName=By.xpath("//span[text()='sativa']");
	public static final By selectEquipmentType=By.xpath("//span[text()='Electronic Device']");
	public static final By selectAutoAllocate=By.xpath("//span[text()='YES']");
	public static final By equipmentDescriptionerror=By.xpath("//span[text()='Maximum 250 Characters Allowed.']");
	public static final By equipmentTypeError=By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
	public static final By licenseExpirydateButton=By.xpath("//button[@type='button']");
	public static final By selectlicenseExpirydate=By.xpath("//span[text()=' 30 ']");
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
	public static final By inactiveManageEquipment=By.xpath("//button[text()=' Manage Equipment ']");
	public static final By assignEquipment=By.xpath("//button[text()=' Assign Employee ']");
	public static final By employeeNameInAssignEmployee=By.xpath("//input[@formcontrolname='employeeName']");
	public static final By selectEmployeeNameInAssignEmployee=By.xpath("(//span[@class='mdc-list-item__primary-text'])[1]");
	public static final By returnDateInAssignEmployee=By.xpath("(//button[@type='button'])[2]");
	public static final By selectreturnDateInAssignEmployee=By.xpath("//span[text()=' 30 ']");
	public static final By submitButtonAssignEmployee=By.xpath("//button[text()=' Submit ']");
	public static final By manageEquipmentInActiveEquipment=By.xpath("(//button[text()=' Manage Equipment '])[1]");
	public static final By returnEquipmentButton=By.xpath(" //button[text()=' Return Equipment ']");
	public static final By returnComments=By.xpath("//input[@formcontrolname='comments']");
	public static final By returnStateDropDown=By.xpath("//mat-select[@formcontrolname='state']");
	public static final By selectReturnStateDropDown=By.xpath("//span[text()='Faulty']");
	public static final By SubmitButtonReturnEquipment=By.xpath("//button[text()=' Submit ']");
	public static final By manageEquipmentInFaulty=By.xpath("(//button[text()=' Manage Equipment '])[1]");
	public static final By dectivateButtonInFaultyEquipment=By.xpath("//button[text()=' Deactivate ']");
	public static final By workingStateinReturnEquipment=By.xpath("//span[text()='Working']");
	
	
	public static final By successMessageforAssignEmployee=By.xpath("//p[text()='Equipment assigned successfully']");
	public static final By returnStatrSuccessMessage=By.xpath("//p[text()='Equipment updated successfully']");
	
	
	public static By SelectWithoptions(String text) {
	   	  final By textXpath = By.xpath("//mat-select[@formcontrolname='clientName']/mat-option/span[text()='"+text+"']");
	   	  return textXpath;
	        }
	
	
	public static final By equipmentCalendarButton=By.xpath("//span[@class='mat-mdc-button-touch-target']");
	public static final By equipmentCalendarArrow=By.xpath("//span[@class='mdc-button__label']");
	public static final By equipmentExpiryYear=By.xpath("//span[text()=' 2032 ']");
	public static final By equipmentExpiryMonth=By.xpath("//span[text()=' FEB ']");
	public static final By equipmentExpiryDate=By.xpath("//span[text()=' 17 ']");





}