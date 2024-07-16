package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Manager_Shifts_Pageobjects {
	
	public static final By shiftsDropdown(String Object) {
		By s1=By.xpath("//span[contains(text(),'"+Object+"')]");
				return s1;
	}
	
	public static By supervisorNameText(String text) {
   	 final By textpath = By.xpath("//mat-option[@role='"+text+"']");
   	 return textpath;
    }
	
	
	public static final By nullBulkError=By.xpath("//p[text()='Your Excel file is Empty.']");
	public static final By shiftsMenu=By.xpath("//span[text()='Shifts']");
	public static final By addNewShiftsButton=By.xpath("//button[text()=' Add New Shifts ']");
	public static final By bulkUploadButton=By.xpath("//button[text()=' Bulk Upload ']");
//	public static final By editShiftsButton=By.xpath("//button[text()=' Edit shifts ']");
	public static final By editShiftsButton=By.xpath("(//button[@class='btn m-1 ng-star-inserted'])[1]");
	public static final By updateButton=By.xpath("//button[text()=' Update ']");
	public static final By assignButton=By.xpath("//button[text()=' Assign ']");
	public static final By duplicateAssignButton=By.xpath("(//button[text()=' Assign '])[2]");
	public static final By duplicateShift=By.xpath("//span[text()='This Employee is alreay assigned with another task in this shifts time. Please select other employee']");
	public static final By employeeName=By.xpath("//mat-select[@formcontrolname='assignEmployee']");
	public static final By jobCard=By.xpath("//mat-select[@formcontrolname='JobCard']");
	public static final By supervisorName=By.xpath("//mat-select[@formcontrolname='employeeName']");
	public static final By selectSupervisorName=By.xpath("//span[text()='Dela Supervisor Supervisor']");
	public static final By clientName=By.xpath("//mat-select[@formcontrolname='client']");
	public static final By selectClientName=By.xpath("//span[text()='Sadio']");
	public static final By siteName=By.xpath("//mat-label[text()='Site Name & Address']");
	public static final By selectSiteName=By.xpath("//span[text()='Zina']");
	public static final By checkInDateCalendarButton=By.xpath("//span[@class='mat-mdc-button-touch-target']");
	public static final By calendarArrow=By.xpath("//span[@class='mdc-button__label']");
	public static final By checkInYear=By.xpath("//span[text()=' 2025 ']");
	public static final By checkInMonth=By.xpath("//span[text()=' FEB ']");
	public static final By checkInDate=By.xpath("//span[text()=' 22 ']");
	public static final By checkInTime=By.xpath("//input[@formcontrolname='checkInTime']");
	public static final By checkOutdateCalendarButton=By.xpath("(//span[@class='mat-mdc-button-touch-target'])[2]");
	public static final By checkOutYear=By.xpath("//span[text()=' 2025 ']");
	public static final By checkOutMonth=By.xpath("//span[text()=' FEB ']");
	public static final By checkOutDate=By.xpath("//span[text()=' 22 ']");
	public static final By checkOutTime=By.xpath("//input[@formcontrolname='checkOutTime']");
	public static final By addButton=By.xpath("//button[text()=' Add ']");
	public static final By clearButton=By.xpath("//button[text()='Clear']");
	public static final By validatedCreatedShift=By.xpath("(//input[@placeholder='Ex. Mia']/../../../../following-sibling::div/table/tbody/tr/td)[2]");
	public static final By cancelButton=By.xpath("//button[text()='Cancel']");
	public static final By assignCancelButton=By.xpath("//button[text()=' Cancel ']");
	public static final By bulkError=By.xpath("//p[text()='Error']");
	public static final By validateAssignedEmployee=By.xpath("(//input[@placeholder='Ex. Mia']/../../../../following-sibling::div/table/tbody/tr/td)[3]");
}
