package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Supervisor_SHifts_PageObjects {
	public static final By shiftsModule=By.xpath("//span[text()='Shifts']");
	public static final By assignAction=By.xpath("(//button[text()=' Assign '])[1]");
	public static final By assignEmployee=By.xpath("//mat-select[@formcontrolname='assignEmployee']");
	public static final By selectEmployee=By.xpath("(//mat-option[@role='option'])[2]");
	public static final By jobCard=By.xpath("//mat-select[@formcontrolname='JobCard']");
	public static final By selectJobCard=By.xpath("//mat-option[@role='option']");
	public static final By assignButton=By.xpath("//button[@type='submit']");
	public static final By filterButton=By.xpath("//input[@placeholder='Ex. Mia']");
	public static final By errormessageForAlreayAssignShift=By.xpath("//span[text()='This Employee is alreay assigned with another task in this shifts time. Please select other employee']");
	public static final By cancelButton=By.xpath("//button[text()=' Cancel ']");
	public static final By assignButton2=By.xpath("(//button[text()=' Assign '])[2]");
	public static final By validAssignEmployee=By.xpath("(//mat-option[@role='option'])[1]");
	
}
