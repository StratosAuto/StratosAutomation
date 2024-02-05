package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Admin_Employees_PageObjects {
	
	public static final By employeesMenu=By.xpath("//span[text()='Employees']");
	public static final By addNewEmployeeButton=By.xpath("//button[text()=' Add New Employee ']");
// Employee Details	
	public static final By firstName=By.xpath("//input[@formcontrolname='FirstName']");
	public static final By lastName=By.xpath("//input[@formcontrolname='LastName']");
	public static final By mobileNumber=By.xpath("//input[@formcontrolname='mobileNumber']");
	public static final By otherContactNumber=By.xpath("//input[@formcontrolname='otherContactNumber']");
	public static final By emailAddress=By.xpath("//input[@formcontrolname='email']");
	public static final By jobTitle=By.xpath("//input[@formcontrolname='jobTitle']");
	public static final By gender=By.xpath("//mat-label[text()='Gender']");
	public static final By selectGender=By.xpath("//span[text()='Male']");
	public static final By calenderButton=By.className("mat-mdc-button-touch-target");
	public static final By calenderArrow=By.className("mat-calendar-arrow");
	public static final By birthYear=By.xpath("//span[text()=' 2016 ']");
	public static final By birthMonth=By.xpath("//span[text()=' JAN ']");
	public static final By birthDate=By.xpath("//span[text()=' 1 ']");
	public static final By role=By.xpath("//mat-label[text()='Role']");
	public static final By selectRole=By.xpath("//span[text()='Manager']");
	public static final By department=By.xpath("//mat-label[text()='Select Department']");
	public static final By selectDepartment=By.xpath("//span[text()='Operations']");
	public static final By passportRadioButton=By.className("mdc-radio__inner-circle");
	public static final By passportNumber=By.xpath("//input[@formcontrolname='passportNumber']");
	public static final By passportExpiry=By.xpath("(//span[@class='mat-mdc-button-touch-target'])[2]");
	public static final By passportCalenderArrow=By.className("mat-calendar-arrow");
	public static final By passportExpiryYear=By.xpath("//span[text()=' 2020 ']");
	public static final By passportExpiryMonth=By.xpath("//span[text()=' MAY ']");
	public static final By passportExpiryDate=By.xpath("//span[text()=' 5 ']");
	public static final By idNumberRadioButton=By.xpath("//input[@value='Idnumber']");
	public static final By saID=By.xpath("//input[@formcontrolname='SA_ID']");
// Employee Residential Address Details	
	public static final By emergencyResidentialDetails=By.xpath("//button[text()=' Employee Residential Address Details']");
	public static final By residentialStreet=By.xpath("//input[@formcontrolname='streetOne']");
	public static final By residentialStreet2=By.xpath("//input[@formcontrolname='streetTwo']");
	public static final By residentialCity=By.xpath("//mat-label[text()='City']");
	public static final By residentialSelectCity=By.xpath("//span[text()='Pretoria']");
	public static final By residentialProvince=By.xpath("//mat-select[@formcontrolname='province']");
	public static final By residentialPostalCode=By.xpath("//input[@formcontrolname='EmployeeDetailsPostalCode']");
	public static final By residentialCountry=By.xpath("//mat-label[text()='Select Country']");
	public static final By residentialSelectCountry=By.xpath("//span[text()='South Africa']");
// Postal Address Details	
	public static final By postalAddressDetails=By.xpath("//button[text()=' Postal Address Details']");
	public static final By postalStreet1=By.xpath("//input[@formcontrolname='PostalstreetOne']");
	public static final By postalStreet2=By.xpath("//input[@formcontrolname='PostalstreetTwo']");
	public static final By postalCity=By.xpath("//mat-label[text()='City']");
	public static final By postalSelectCity=By.xpath("//span[text()='Pretoria']");
	public static final By postalProvince=By.xpath("//mat-select[@formcontrolname='Postalprovince']");
	public static final By postalCode=By.xpath("//input[@formcontrolname='postalAddressCode']");
	public static final By postalCountry=By.xpath("//mat-label[text()='Select Country']");
	public static final By postalSelectCountry=By.xpath("//span[text()='South Africa']");
// Emergency Contact Details
	public static final By emergencyContactDetails=By.xpath("//button[text()=' Emergency Contact Details']");
	public static final By emergencyFirstName=By.xpath("//input[@formcontrolname='EmergencyContactFirstName']");
	public static final By emergencyLastName=By.xpath("//input[@formcontrolname='EmergencyContactLastName']");
	public static final By emergencyMobileNumber=By.xpath("//input[@formcontrolname='EmergencyContactmobileNumber']");
	public static final By emergencyOtherContactNumber=By.xpath("//input[@formcontrolname='EmergencyContactotherContactNumber']");
	public static final By emergencyEmailAddress=By.xpath("//input[@formcontrolname='EmergencyContactEmail']");
	public static final By emergencyStreet1=By.xpath("//input[@formcontrolname='EmergencyContactstreetOne']");
	public static final By emergencyStreet2=By.xpath("//input[@formcontrolname='EmergencyContactstreetTwo']");
	public static final By emergencyCity=By.xpath("//mat-label[text()='City']");
	public static final By emergencySelectCity=By.xpath("//span[text()='Johannesburg']");
	public static final By emergencyProvince=By.xpath("//mat-select[@formcontrolname='EmergencyContactprovince']");
	public static final By emergencyPostalCode=By.xpath("//input[@formcontrolname='EmergencyContactpostalCode']");
	public static final By emergencyCountry=By.xpath("//mat-label[text()='Select Country']");
	public static final By emergencySelectCountry=By.xpath("//span[text()='South Africa']");
// Next Of Kin Details	
	public static final By kinDetails=By.xpath("//button[text()=' Next Of Kin Details']");
	public static final By kinFirstName=By.xpath("//input[@formcontrolname='kinFirstName']");
	public static final By kinLastName=By.xpath("//input[@formcontrolname='kinLastName']");
	public static final By kinMobileNumber=By.xpath("//input[@formcontrolname='kinContactNumber']");
	public static final By kinRelationship=By.xpath("//input[@formcontrolname='kinRelationship']");
// Security Details
	public static final By securityDetails=By.xpath("//button[text()=' Security Details']");
	public static final By securityLicenceNumber=By.xpath("//input[@formcontrolname='SecurityLicenceNumber']");
	public static final By securityExpiryYear=By.xpath("//span[text()=' 2038 ']");
	public static final By securityExpiryMonth=By.xpath("//span[text()=' JUN ']");
	public static final By securityExpiryDate=By.xpath("//span[text()=' 16 ']");
// First Aid Details
	public static final By firstAidDetails=By.xpath("//button[text()=' First Aid Details']");
	public static final By firstAidCPR=By.xpath("//input[@formcontrolname='FirstAid']");
	public static final By firstAidExpiryYear=By.xpath("//span[text()=' 2041 ']");
	public static final By firstAidExpiryMonth=By.xpath("//span[text()=' MAR ']");
	public static final By firstAidExpiryDate=By.xpath("//span[text()=' 3 ']");
// Compliance/Training/Certification Details	
	public static final By complianceDetails=By.xpath("//button[text()=' Compliance / Training / Certification Details']");
	public static final By driverLicence=By.xpath("//input[@formcontrolname='DriversLicence']");
	public static final By driverLicenceExpiryYear=By.xpath("//span[text()=' 2032 ']");
	public static final By driverLicenceExpiryMonth=By.xpath("//span[text()=' FEB ']");
	public static final By driverLicenceExpiryDate=By.xpath("//span[text()=' 17 ']");
	public static final By gunLicence=By.xpath("//input[@formcontrolname='GunLicence']");
	public static final By gunLicenceExpiryYear=By.xpath("//span[text()=' 2030 ']");
	public static final By gunLicenceExpiryMonth=By.xpath("//span[text()=' APR ']");
	public static final By gunLicenceExpiryDate=By.xpath("//span[text()=' 26 ']");
// Equipment Details
	public static final By equipmentDetails=By.xpath("//button[text()=' Equipment Details']");
	public static final By useForce=By.xpath("//mat-label[text()='Use Force']");
	public static final By selectUseForce=By.xpath("//span[text()='Yes']");	
	public static final By trafficControl=By.xpath("//mat-label[text()='Traffic Control']");
	public static final By selectTrafficControl=By.xpath("//span[text()='Yes']");
	public static final By useHandcuffs=By.xpath("//mat-label[text()='Use Handcuffs']");
	public static final By selectuseHandcuffs=By.xpath("//span[text()='No']");
	public static final By usebaton=By.xpath("//mat-label[text()='Use Baton']");
	public static final By selectUseBaton=By.xpath("//span[text()='Yes']");
	public static final By useGun=By.xpath("//mat-label[text()='Use Gun']");
	public static final By selectUseGun=By.xpath("//span[text()='No']");
// Contract Details
	public static final By contractDetails=By.xpath("//button[text()=' Contract Details']");
	public static final By contractType=By.xpath("//mat-label[text()='Contract Type']");
	public static final By contractStartYear=By.xpath("//span[text()=' 2030 ']");
	public static final By contractStartMonth=By.xpath("//span[text()=' APR ']");
	public static final By contractStartDate=By.xpath("//span[text()=' 26 ']");
// Parent Employee Details	
	public static final By parentEmployeeDetails=By.xpath("//button[text()=' Parent Employee Details']");
// 3rd Party Provider
	public static final By thirdPartyProvider=By.xpath("//mat-label[text()='3rd Party Provider']");
	public static final By provider=By.xpath("//span[text()='JohnThird ']");
}