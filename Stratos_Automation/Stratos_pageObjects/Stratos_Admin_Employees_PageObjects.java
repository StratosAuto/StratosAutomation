package Stratos_pageObjects;

import org.openqa.selenium.By;

public class Stratos_Admin_Employees_PageObjects {
	
	public static final By nullBulkFileError=By.xpath("//p[text()='Your Excel file is Empty.']");
	public static final By employeesMenu=By.xpath("//span[text()='Employees']");
	public static final By addNewEmployeeButton=By.xpath("//button[text()=' Add New Employee ']");
	public static final By cancelButton=By.xpath("//button[text()=' Cancel ']");
	public static final By saveButton=By.xpath("//button[text()=' Save ']");
	public static final By nullValidateEmployees=By.xpath("//h1[text()='Manage Employees']");
	public static final By manageEmployee=By.xpath("//button[text()=' Manage Employee ']");
	public static final By inactiveEmployees=By.xpath("//span[text()='Inactive Employees']");
	public static final By updateButton=By.xpath("//button[@type='submit']");
	public static final By deactivateButton=By.xpath("//button[text()=' Deactivate ']");
	public static final By activateButton=By.xpath("//button[text()=' Activate ']");
	public static final By generatePIN=By.xpath("//button[text()=' Generate Pin ']");
	public static final By filterError=By.xpath("//input[@placeholder='Ex. Mia']/../../../../following-sibling::div/span/table/tbody/tr/td");
	public static final By parentEmployee(String Object) {
		By data=By.xpath("//div[@role='listbox']/descendant::mat-option/span[contains(text(),'"+Object+"')]");
				return data;
	}
	

// Employee Details
	public static final By firstName=By.xpath("//input[@formcontrolname='FirstName']");
	public static final By lastName=By.xpath("//input[@formcontrolname='LastName']");
	public static final By countryCode=By.xpath("//span[text()='+27']");
	public static final By selectCountryCode=By.xpath("//span[text()=' +91 ']");
	public static final By mobileNumber=By.xpath("//input[@formcontrolname='mobileNumber']");
	public static final By otherContactNumber=By.xpath("//input[@formcontrolname='otherContactNumber']");
	public static final By emailAddress=By.xpath("//input[@formcontrolname='email']");
	public static final By jobTitle=By.xpath("//input[@formcontrolname='jobTitle']");
	public static final By gender=By.xpath("//mat-label[text()='Gender']");
	public static final By selectGender=By.xpath("//span[text()='Male']");
	public static final By birthdayCalendarButton=By.className("mat-mdc-button-touch-target");
	public static final By birthdayCalendarArrow=By.className("mat-calendar-arrow");
	public static final By birthYear=By.xpath("//span[text()=' 2003 ']");
	public static final By birthMonth=By.xpath("//span[text()=' JAN ']");
	public static final By birthDate=By.xpath("//span[text()=' 16 ']");
	public static final By role=By.xpath("//mat-label[text()='Role']");
	public static final By selectRole=By.xpath("//span[text()='Manager']");
	public static final By department=By.xpath("//mat-label[text()='Select Department']");
	public static final By selectDepartment=By.xpath("//span[text()='Operations']");
	public static final By passportRadioButton=By.xpath("(//div[@class='mdc-radio__background'])[1]");
	public static final By passportNumber=By.xpath("//input[@formcontrolname='passportNumber']");
	public static final By passportCalendarButton=By.xpath("(//span[@class='mat-mdc-button-touch-target'])[2]");
	public static final By passportCalendarArrow=By.className("mdc-button__label");
	public static final By passportExpiryYear=By.xpath("//span[text()=' 2029 ']");
	public static final By passportExpiryMonth=By.xpath("//span[text()=' MAY ']");
	public static final By passportExpiryDate=By.xpath("//span[text()=' 5 ']");
	public static final By idNumberRadioButton=By.xpath("(//div[@class='mdc-radio__background'])[2]");
	public static final By saID=By.xpath("//input[@formcontrolname='SA_ID']");
	public static final By invalidFirstName=By.xpath("//span[text()='Give Correct Name']");
	public static final By invalidLastName=By.xpath("(//span[text()='Give Correct Name'])[2]");
	public static final By invalidMobileNumber=By.xpath("//span[text()='Give Correct Mobile Number']");
	public static final By invalidOtherContactNumber=By.xpath("//span[text()='Give Correct Number']");
	public static final By invalidEmailAddress=By.xpath("//span[text()='Invalid Email Format.']");
	public static final By invalidJobTitle=By.xpath("//span[text()='Give Correct Title']");
	public static final By invalidPassportNumber=By.xpath("//span[text()='Give Valid Passport Number']");
	public static final By invalidSAID=By.xpath("//span[text()='Give Correct SA_ID']");
	
	public static final By lengthFirstName=By.xpath("//span[text()='Maximum 25 Characters Allowed.']");
	public static final By lengthLastName=By.xpath("(//span[text()='Maximum 25 Characters Allowed.'])[2]");
	public static final By lengthJobTitle=By.xpath("//span[text()='Max 25 Characters Allowed']");
	
// Employee Residential Address Details	
	public static final By employeeResidentialDetails=By.xpath("(//button[@class='btn'])[2]");
	public static final By residentialStreet1=By.xpath("//input[@formcontrolname='streetOne']");
	public static final By residentialStreet2=By.xpath("//input[@formcontrolname='streetTwo']");
	public static final By residentialCity=By.xpath("//mat-label[text()='City']");
	public static final By residentialSelectCity=By.xpath("//span[text()='Pretoria']");
	public static final By residentialProvince=By.xpath("//mat-select[@formcontrolname='province']");
	public static final By residentialPostalCode=By.xpath("//input[@formcontrolname='EmployeeDetailsPostalCode']");
	public static final By residentialCountry=By.xpath("//mat-label[text()='Select Country']");
	public static final By residentialSelectCountry=By.xpath("//span[text()='South Africa']");
	
	public static final By invalidResidentialPostalCode=By.xpath("//span[text()='Give Correct Postal Code']");
	public static final By lengthResidentialStreet1=By.xpath("//span[text()='Maximum 100 Characters Allowed.']");
	public static final By lengthResidentialStreet2=By.xpath("//span[text()='Maximum 100 characters allowed.']");
	
// Postal Address Details	
	public static final By postalAddressDetails=By.xpath("//button[text()=' Postal Address Details ']");
	public static final By postalStreet1=By.xpath("//input[@formcontrolname='PostalstreetOne']");
	public static final By postalStreet2=By.xpath("//input[@formcontrolname='PostalstreetTwo']");
	public static final By postalCity=By.xpath("(//mat-label[text()='City'])[2]");
	public static final By postalSelectCity=By.xpath("(//span[text()='Pretoria'])[2]");
	public static final By postalProvince=By.xpath("//mat-select[@formcontrolname='Postalprovince']");
	public static final By postalCode=By.xpath("//input[@formcontrolname='postalAddressCode']");
	public static final By postalCountry=By.xpath("(//mat-label[text()='Select Country'])[2]");
	public static final By postalSelectCountry=By.xpath("(//span[text()='South Africa'])[2]");
	
	public static final By invalidPostalCode=By.xpath("(//span[text()='Give Correct Postal Code'])[2]");
	public static final By lengthPostalStreet1=By.xpath("(//span[text()='Maximum 100 characters allowed.'])[2]");
	public static final By lengthPostalStreet2=By.xpath("(//span[text()='Maximum 100 characters allowed.'])[3]");
	
// Emergency Contact Details
	public static final By emergencyContactDetails=By.xpath("//button[text()=' Emergency Contact Details ']");
	public static final By emergencyFirstName=By.xpath("//input[@formcontrolname='EmergencyContactFirstName']");
	public static final By emergencyLastName=By.xpath("//input[@formcontrolname='EmergencyContactLastName']");
	public static final By emergencyMobileNumber=By.xpath("//input[@formcontrolname='EmergencyContactmobileNumber']");
	public static final By emergencyOtherContactNumber=By.xpath("//input[@formcontrolname='EmergencyContactotherContactNumber']");
	public static final By emergencyEmailAddress=By.xpath("//input[@formcontrolname='EmergencyContactEmail']");
	public static final By emergencyStreet1=By.xpath("//input[@formcontrolname='EmergencyContactstreetOne']");
	public static final By emergencyStreet2=By.xpath("//input[@formcontrolname='EmergencyContactstreetTwo']");
	public static final By emergencyCity=By.xpath("(//mat-label[text()='City'])[3]");
	public static final By emergencySelectCity=By.xpath("//span[text()='Johannesburg']");
	public static final By emergencyProvince=By.xpath("//mat-select[@formcontrolname='EmergencyContactprovince']");
	public static final By emergencyPostalCode=By.xpath("//input[@formcontrolname='EmergencyContactpostalCode']");
	public static final By emergencyCountry=By.xpath("(//mat-label[text()='Select Country'])[3]");
	public static final By emergencySelectCountry=By.xpath("(//span[text()='South Africa'])[3]");
	
	public static final By invalidEmergencyFirstName=By.xpath("(//span[text()='Give Correct Name'])[3]");
	public static final By invalidEmergencyLastName=By.xpath("(//span[text()='Give Correct Name'])[4]");
	public static final By invalidEmergencyMobile=By.xpath("(//span[text()='Give Correct Mobile Number'])[2]");
	public static final By invalidEmergencyOtherContact=By.xpath("(//span[text()='Give Correct Number'])[2]");
	public static final By invalidEmergencyEmailAddress=By.xpath("//span[text()='Invalid Email Format.']");
	public static final By invalidEmergencyPostalCode=By.xpath("(//span[text()='Give Correct Postal Code'])[3]");
	public static final By lengthEmergencyFirstName=By.xpath("//span[text()='Maximum 25 characters Allowed.']");
	public static final By lengthEmergencyLastName=By.xpath("(//span[text()='Maximum 25 characters Allowed.'])[2]");
	public static final By lengthEmergencyStreet1=By.xpath("(//span[text()='Maximum 100 characters allowed.'])[4]");
	public static final By lengthEmergencyStreet2=By.xpath("(//span[text()='Maximum 100 characters allowed.'])[5]");
	
// Next Of Kin Details	
	public static final By kinDetails=By.xpath("//button[text()=' Next Of Kin Details ']");
	public static final By kinFirstName=By.xpath("//input[@formcontrolname='kinFirstName']");
	public static final By kinLastName=By.xpath("//input[@formcontrolname='kinLastName']");
	public static final By kinMobileNumber=By.xpath("//input[@formcontrolname='kinContactNumber']");
	public static final By kinRelationship=By.xpath("//input[@formcontrolname='kinRelationship']");
	
	public static final By invalidKinFirstName=By.xpath("(//span[text()='Give Correct Name'])[5]");
	public static final By invalidKinLastName=By.xpath("(//span[text()='Give Correct Name'])[6]");
	public static final By invalidKinRelationship=By.xpath("(//span[text()='Give Correct Name'])[7]");
	public static final By invalidKinMobile=By.xpath("(//span[text()='Give Correct Mobile Number'])[3]");
	public static final By lengthKinFirstName=By.xpath("//span[text()='Maximum 25 characters allowed.']");
	public static final By lengthKinLastName=By.xpath("(//span[text()='Maximum 25 characters allowed.'])[2]");
	public static final By lengthKinRelationship=By.xpath("(//span[text()='Maximum 25 characters allowed.'])[3]");
	
// Security Details
	public static final By securityDetails=By.xpath("(//div[@class='card-body text-secoundary'])[2]/div/div/div/div/div/h5/button");
	public static final By securityLicenceNumber=By.xpath("//input[@formcontrolname='SecurityLicenceNumber']");
	public static final By securityCalendarButton=By.xpath("(//span[@class='mat-mdc-button-touch-target'])[2]");
	public static final By securityCalendarArrow=By.xpath("//span[@class='mdc-button__label']");
	public static final By securityExpiryYear=By.xpath("//span[text()=' 2038 ']");
	public static final By securityExpiryMonth=By.xpath("//span[text()=' JUN ']");
	public static final By securityExpiryDate=By.xpath("//span[text()=' 16 ']");
	
	public static final By invalidSecurityLicence=By.xpath("//span[text()='Give Correct Licence Number']");
	public static final By invalidSecurityDate=By.xpath("//input[@formcontrolname='SecurityLicenceExpiry']/../../../../following-sibling::mat-error/span");
	
// First Aid Details
	public static final By firstAidDetails=By.xpath("(//div[@id='headingOne'])[7]");
	public static final By firstAidCPR=By.xpath("//input[@formcontrolname='FirstAid']");
	public static final By firstAidCalendarButton=By.xpath("(//span[@class='mat-mdc-button-touch-target'])[3]");
	public static final By firstAidCalendarArrow=By.xpath("//span[@class='mdc-button__label']");
	public static final By firstAidExpiryYear=By.xpath("//span[text()=' 2041 ']");
	public static final By firstAidExpiryMonth=By.xpath("//span[text()=' MAR ']");
	public static final By firstAidExpiryDate=By.xpath("//span[text()=' 3 ']");
	
	public static final By invalidFirstAidCPR=By.xpath("//span[text()='Give Correct Details']");
	
// Compliance/Training/Certification Details	
	public static final By complianceDetails=By.xpath("//button[text()=' Compliance / Training / Certification Details ']");
	public static final By driverLicence=By.xpath("//input[@formcontrolname='DriversLicence']");
	public static final By driverLicenceCalendarButton=By.xpath("(//span[@class='mat-mdc-button-touch-target'])[4]");
	public static final By driverLicenceCalendarArrow=By.xpath("//span[@class='mdc-button__label']");
	public static final By driverLicenceExpiryYear=By.xpath("//span[text()=' 2032 ']");
	public static final By driverLicenceExpiryMonth=By.xpath("//span[text()=' FEB ']");
	public static final By driverLicenceExpiryDate=By.xpath("//span[text()=' 17 ']");
	public static final By gunLicence=By.xpath("//input[@formcontrolname='GunLicence']");
	public static final By gunLicenceCalendarButton=By.xpath("(//span[@class='mat-mdc-button-touch-target'])[5]");
	public static final By gunLicenceCalendarArrow=By.xpath("//span[@class='mdc-button__label']");
	public static final By gunLicenceExpiryYear=By.xpath("//span[text()=' 2030 ']");
	public static final By gunLicenceExpiryMonth=By.xpath("//span[text()=' APR ']");
	public static final By gunLicenceExpiryDate=By.xpath("//span[text()=' 26 ']");
	
	public static final By invalidDriverLicence=By.xpath("//span[text()='Give Valid Driving Licence Number']");
	public static final By invalidGunLicence=By.xpath("//span[text()='Give Valid Gun Licence Number']");
	
// Equipment Details
	public static final By equipmentDetails=By.xpath("//button[text()='Equipment Details']");
	public static final By useForce=By.xpath("//mat-label[text()='Use Force']");
	public static final By selectUseForce=By.xpath("//span[text()='Yes']");	
	public static final By trafficControl=By.xpath("//mat-label[text()='Traffic Control']");
	public static final By selectTrafficControl=By.xpath("(//span[text()='Yes'])[2]");
	public static final By useHandcuffs=By.xpath("//mat-label[text()='Use Handcuffs']");
	public static final By selectuseHandcuffs=By.xpath("//span[text()='No']");
	public static final By usebaton=By.xpath("//mat-label[text()='Use Baton']");
	public static final By selectUseBaton=By.xpath("(//span[text()='Yes'])[3]");
	public static final By useGun=By.xpath("//mat-label[text()='Use Gun']");
	public static final By selectUseGun=By.xpath("(//span[text()='No'])[2]");
// Contract Details
	public static final By contractDetails=By.xpath("//button[text()='Contract Details']");
	public static final By contractType=By.xpath("//mat-label[text()='Contract Type']");
	public static final By selectContractType=By.xpath("//span[text()='Contractor']");
	public static final By supervisorContractType=By.xpath("//span[text()='Permanent']");
	public static final By employeeContractType=By.xpath("//span[text()='Permanent']");
	public static final By contractStartCalendarButton=By.xpath("(//span[@class='mat-mdc-button-touch-target'])[6]");
	public static final By contractStartCalendarArrow=By.xpath("//span[@class='mdc-button__label']");
	public static final By contractStartYear=By.xpath("//span[text()=' 2022 ']");
	public static final By contractStartMonth=By.xpath("//span[text()=' FEB ']");
	public static final By contractStartDate=By.xpath("//span[text()=' 18 ']");
	public static final By contractEndCalendarButton=By.xpath("(//span[@class='mat-mdc-button-touch-target'])[7]");
	public static final By contractEndCalendarArrow=By.xpath("//span[@class='mdc-button__label']");
	public static final By contractEndYear=By.xpath("//span[text()=' 2027 ']");
	public static final By contractEndMonth=By.xpath("//span[text()=' DEC ']");
	public static final By contractEndDate=By.xpath("//span[text()=' 28 ']");
// Parent Employee Details	
	public static final By parentEmployeeDetails=By.xpath("//button[text()=' Parent Employee Details ']");
	public static final By parentdropdown=By.className("[class='ng-tns-c24-155']");
	public static final By parentContactName=By.xpath("(//mat-select[@role='combobox'])[20]");
	public static final By parentFirstName=By.xpath("//input[@formcontrolname='parentFirstName']");
	
// 3rd Party Provider
	public static final By thirdPartyProvider=By.xpath("//mat-label[text()='3rd Party Provider']");
	public static final By validateProvider=By.xpath("//mat-select[@formcontrolname='partyProvider']");
	
	
	public static final By supervisorBirthdayCalendarButton=By.xpath("");
	public static final By supervisorBirthdayCalendarArrow=By.xpath("");
	public static final By supervisorBirthdayYear=By.xpath("//span[text()=' 2001 ']");
	public static final By supervisorBirthdayMonth=By.xpath("//span[text()=' APR ']");
	public static final By supervisorBirthdayDate=By.xpath("//span[text()=' 18 ']");
	public static final By supervisorRole=By.xpath("//span[text()='Supervisor']");
	public static final By supervisorContractStartYear=By.xpath("//span[text()=' 2018 ']");
	public static final By supervisorContractStartMonth=By.xpath("//span[text()=' OCT ']");
	public static final By supervisorContractStartDate=By.xpath("//span[text()=' 22 ']");
	
	public static final By employeeBirthdayCalendarButton=By.xpath("");
	public static final By employeeBirthdayCalendarArrow=By.xpath("");
	public static final By employeeBirthdayYear=By.xpath("//span[text()=' 2002 ']");
	public static final By employeeBirthdayMonth=By.xpath("//span[text()=' JUL ']");
	public static final By employeeBirthdayDate=By.xpath("//span[text()=' 21 ']");
	public static final By employeeRole=By.xpath("//span[text()='Employee']");
	public static final By employeeontractStartYear=By.xpath("//span[text()=' 2021 ']");
	public static final By employeeContractStartMonth=By.xpath("//span[text()=' NOV ']");
	public static final By employeeContractStartDate=By.xpath("//span[text()=' 19 ']");
}