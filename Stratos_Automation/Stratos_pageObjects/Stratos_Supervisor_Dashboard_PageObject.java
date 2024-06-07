package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Supervisor_Dashboard_PageObject {
	
	public static final By dashBoard=By.xpath("(//span[text()='Dashboard']");
	public static final By dashboardMenu=By.xpath("//span[text()='Dashboard']");
	public static final By clickAllClients=By.xpath("//mat-select[@formcontrolname='selectedClient']");
	public static final By seleclAllClicents=By.xpath("//span[text()='All Clients']");
	public static final By clickCountry=By.xpath("//mat-select[@aria-labelledby='mat-mdc-form-field-label-2 mat-select-value-3']");
	public static final By selectCountry=By.xpath("//mat-option[@role='option']");
	public static final By clickonProvnce=By.xpath("//mat-select[@formcontrolname='selectedProvince']");
	public static final By selectProvince=By.xpath("//span[text()='All Provinces']");
	public static final By clickView=By.xpath("//mat-select[@formcontrolname='selectedview']");
	public static final By selectView=By.xpath("//span[text()='List View']");
	public static final By filterButton=By.xpath("//button[text()='Filter']");
	public static final By map=By.xpath("//span[text()='To navigate, press the arrow keys.']");
	public static final By maps=By.xpath("//div[@role='region']");
	public static final By mapTag=By.xpath("//IMG[@draggable='false']");
	public static final By viewSites=By.xpath("(//div[text()=' view sites '])[1]");
	public static final By moreInfo=By.xpath("(//button[text()='More Info'])[1]");
	public static final By firstEmployee=By.xpath("//mat-icon[@fonticon='person']");
	public static final By backButton=By.xpath("//span[text()='Back']");
	public static final By moreInfoButtonInActiveShift=By.xpath("(//button[text()='More Info'])[2]");
	public static final By backButton2=By.xpath("//span[text()='Back']");
	public static final By selectMApView=By.xpath("//span[text()='Map View']");
	public static final By mapPopup=By.xpath("//button[text()='OK']");
	
	
	
}