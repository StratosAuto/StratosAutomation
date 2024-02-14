package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Manager_Dashboard_Pageobjects {
	
	public static final By dashboardMenu=By.xpath("//span[text()='Dashboard']");
	public static final By allClients=By.xpath("//mat-label[text()='All Clients']");
	public static final By selectClient=By.xpath("//span[text()=' John Fred ']");
	public static final By country=By.xpath("//mat-label[text()='Country']");
	public static final By selectCountry=By.xpath("//span[text()='South Africa']");
	public static final By allProvinces=By.xpath("//mat-label[text()='All Provinces']");
	public static final By selectProvince=By.xpath("//span[text()=' Gauteng ']");
	public static final By view=By.xpath("//mat-select[@formcontrolname='selectedview']");
	public static final By listView=By.xpath("//span[text()='List View']");
	public static final By mapView=By.xpath("//span[text()='Map View']");
	public static final By filter=By.xpath("//button[text()='Filter']");
	public static final By filterdata=By.xpath("//input[@formcontrolname='page']");
	public static final By filterValidates=By.xpath("//input[@formcontrolname='page']/../../../../../following-sibling::table/tbody/tr/td");
	public static final By mapTag=By.xpath("//img[@draggable='false']");
	public static final By viewSites=By.xpath("//div[text()=' view sites ']");
	public static final By moreInfo=By.xpath("//button[text()='More Info']");
	public static final By activeMoreInfo=By.xpath("(//button[text()='More Info'])[2]");
//	public static final By 
//	public static final By 
//	public static final By 
//	public static final By 
}