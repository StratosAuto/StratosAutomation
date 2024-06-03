package Stratos_gluecode;

import Stratos_pageObjects.Stratos_Admin_3rdPartyProviders_PageObjects;
import Stratos_pageObjects.Stratos_Admin_Employees_PageObjects;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import io.cucumber.java.en.*;

public class Stratos_Admin_Employees {
	
	public static String excelFileLocation ="./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName ="EMPLOYEES";
	public static String sheetName1="3RD PARTY PROVIDER";
	public static String employeeID;
	public String mobileNumber;
	public String otherContactNumber;
	public String employeeName;
	
	@Given("User clicks on Employees in the menu")
	public void user_clicks_on_Employees_in_the_menu() throws Exception {
	   testBase.waitForElement(Stratos_Admin_Employees_PageObjects.employeesMenu, 20);
	   testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeesMenu, "Employees");
	}

	@Given("User clicks on Add New Employee button")
	public void user_clicks_on_Add_New_Employee_button() throws Exception {
	   testBase.waitForElement(Stratos_Admin_Employees_PageObjects.addNewEmployeeButton, 20);
	   testBase.clickonElement(Stratos_Admin_Employees_PageObjects.addNewEmployeeButton, "Add New Employee");
	}

	@Given("Verify that user able to enter invalid data in Add Employee page")
	public void verify_that_user_able_to_enter_invalid_data_in_Add_Employee_page() throws Exception {
	    String firstName=testBase.randomAlphanumeric(15)+"1@!";
	    String lastName=testBase.randomAlphanumeric(15)+"1*%";
	    String mobileNumber=testBase.randomAlphanumeric(8)+"@#";
	    String otherContactNumber=testBase.randomAlphanumeric(8)+"@!";
	    String emailAddress="!*"+testBase.randomAlphanumeric(6)+"@gmail.com";
	    String jobTitle="%$"+testBase.randomAlphanumeric(10);
	    String passportNumber="@!"+testBase.randomAlphanumeric(7);
	    String saId="*@"+testBase.randomAlphanumeric(11);
	    String postalCode=testBase.randomAlphanumeric(3)+"@";
	    String relationship=testBase.randomAlphanumeric(15)+"1#@!";
	    String securityLicenceNumber=testBase.randomAlphanumeric(10)+"@!";
	    String firstAidCPR=testBase.randomAlphanumeric(10)+"#$!";
	    String driverLicence=testBase.randomAlphanumeric(10)+"&*";
	    String gunLicence=testBase.randomAlphanumeric(11)+"@#";
	    
// Employee Details
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.firstName, firstName, "First Name");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.lastName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.lastName, lastName, "Last Name");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.mobileNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.mobileNumber, mobileNumber, "Mobile Number");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.otherContactNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.otherContactNumber, otherContactNumber, "other Contact Number");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emailAddress, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emailAddress, emailAddress, "Email Address");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.jobTitle, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.jobTitle, jobTitle, "job Title");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportRadioButton, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.passportRadioButton, "Passport Radio Button");
	    Thread.sleep(3000);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.passportNumber, passportNumber, "Passport Number");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, "SA ID radio button");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.saID, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.saID, saId, "SA ID");
	    
// Employee Residential Address Details
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.employeeResidentialDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeResidentialDetails, "Employee Residential Address Details");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialPostalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialPostalCode, postalCode, "Postal Code");
	    
// Postal Address Details
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalAddressDetails, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalAddressDetails, "Postal Address Details");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalCode, postalCode, "Postal Code");
	    
// Emergency Contact Details
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyContactDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.emergencyContactDetails, "Emergency Contact Details");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyFirstName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyFirstName, firstName, "First Name");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyLastName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyLastName, lastName, "Last Name");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyMobileNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyMobileNumber, mobileNumber, "Mobile Number");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyOtherContactNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyOtherContactNumber, otherContactNumber, "Other Contact Number");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyEmailAddress, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyEmailAddress, emailAddress, "Email Address");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyPostalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyPostalCode, postalCode, "Postal Code");
	
// Next of Kin Details
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.kinDetails, "Next of Kin Details");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinFirstName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinFirstName, firstName, "First Name");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinLastName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinLastName, lastName, "Last Name");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinMobileNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinMobileNumber, mobileNumber, "Mobile Number");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinRelationship, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinRelationship, relationship, "Relationship");
	    
// Security Details
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.securityDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityDetails, "Security Details");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.securityLicenceNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.securityLicenceNumber, securityLicenceNumber, "Security Licence Number");

	
// First Aid Details
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstAidDetails, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.firstAidDetails, "First Aid Details");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstAidCPR, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.firstAidCPR, firstAidCPR, "First Aid CPR");
	
// Compliance/Training/Certification Details
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.complianceDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.complianceDetails, "Compliance/Training/Certification Details");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.driverLicence, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.driverLicence, driverLicence, "Driver Licence");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.gunLicence, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.gunLicence, gunLicence, "Gun Licence");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstName, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstName, "First Name");
	}

	@Then("User Validates the error messages of Invalid data of all the feilds in Add Employee page")
	public void user_Validates_the_error_messages_of_Invalid_data_of_all_the_feilds_in_Add_Employee_page() throws Exception {
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidFirstName, "First Name"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Name element is nor visible");
	    }else
	    	Logs.info("Give Correct Name element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidLastName, "Last Name"))) {
	    	ExceptionHandling.HandleAssertion("Give Corret Name element is not visible");
	    }else
	    	Logs.info("Give Corret Name element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidMobileNumber, "Mobile Number"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
	    }else
	    	Logs.info("Give Correct Mobile Number is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidEmergencyOtherContact, "Other Contact Number"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Number element is nor visible");
	    }else
	    	Logs.info("Give Correct Number element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidEmailAddress, "Email Address"))) {
	    	ExceptionHandling.HandleAssertion("Invalid Email Format. element is not visible");
	    }else
	    	Logs.info("Invalid Email Format. element is visible");
	    
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.passportRadioButton, "Passport Radio Button");
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidPassportNumber, "Passport Number"))) {
	    	ExceptionHandling.HandleAssertion("Give Valid Passport Number element is not visible");
	    }else
	    	Logs.info("Give Valid Passport Number element is visible");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, "SA ID radio button");
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidSAID, "SA ID"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct SA_ID element is visible");
	    }else
	    	Logs.info("Give Correct SA_ID element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidResidentialPostalCode, "Postal Code"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Postal Code element is not visible");
	    }else
	    	Logs.info("Give Correct Postal Code element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidPostalCode, "Postal Code"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Postal Code element is not visible");
	    }else
	    	Logs.info("Give Correct Postal Code element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidEmergencyFirstName, "First Name"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Name element is not visible");
	    }else
	    	Logs.info("Give Correct Name element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidEmergencyLastName, "Last Name"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Name element is not visible");
	    }else
	    	Logs.info("Give Correct Name element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidEmergencyMobile, "Mobile Number"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Mobile Number is not visible");
	    }else
	    	Logs.info("Give Correct Mobile Number is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidEmergencyOtherContact, "Other Contact NUmber"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Number is not visible");
	    }else
	    	Logs.info("Give Correct Number is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidEmergencyEmailAddress, "Email Address"))) {
	    	ExceptionHandling.HandleAssertion("Invalid email format. is not visible");
	    }else
	    	Logs.info("Invalid email format. is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidEmergencyPostalCode, "Postal Code"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Postal Code is not visible");
	    }else
	    	Logs.info("Give Correct Postal Code is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidKinFirstName, "First Name"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Name element is not visible");
	    }else
	    	Logs.info("Give Correct Name element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidKinLastName, "Last Name"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Name element is not visible");
	    }else
	    	Logs.info("Give Correct Name element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidKinMobile, "Mobile Number"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
	    }else
	    	Logs.info("Give Correct Mobile Number element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidKinRelationship, "Relationship"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Name element is not visible");
	    }else
	    	Logs.info("Give Correct Name element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidSecurityLicence, "Security Licence Number"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Licence Number element is not visible");
	    }else
	    	Logs.info("Give Correct Licence Number element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidFirstAidCPR, "First Aid CPR"))) {
	    	ExceptionHandling.HandleAssertion("Give Correct Details element is not visible");
	    }else
	    	Logs.info("Give Correct Details element is visible");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidDriverLicence, "Driver Licence"))) {
	    	ExceptionHandling.HandleAssertion("Give Valid Driving Licence Number");
	    }else
	    	Logs.info("Give Valid Driving Licence Number");
	    
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidGunLicence, "Gun Licence"))) {
	    	ExceptionHandling.HandleAssertion("Give Valid Gun Licence Number element is not visible");
	    }else
	    	Logs.info("Give Valid Gun Licence Number element is visible");  
	}

	@And("User clicks on Cancel button on Add Employees page")
	public void user_clicks_on_Cancel_buttonon_Add_Employees_page() throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.cancelButton, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.cancelButton, "Cancel Button");
	}
	
	@Then("Verify that user able to enter invalid field length data in Add Employee page")
	public void verify_that_user_able_to_enter_invalid_field_length_data_in_Add_Employee_page() throws Exception {
	    
		String lengthFirstName=testBase.randomAplhabet(26);
		String lengthLastName=testBase.randomAplhabet(26);
		String lengthMobileNumber=testBase.randomNumeric(11);
		String lengthOtherContactNumber=testBase.randomNumeric(11);
		String lengthJobTitle=testBase.randomAplhabet(26);
		String lengthPassportNumber="A"+testBase.randomNumeric(9);
		String lengthSAID=testBase.randomNumeric(14);
		String lengthStreet1=testBase.randomAplhabet(101);
		String lengthStreet2=testBase.randomAplhabet(101);
		String lengthPostalCode=testBase.randomNumeric(5);
		String lengthRelationship=testBase.randomAplhabet(26);
		String lengthDriverLicence=testBase.randomNumeric(10)+"A9KJ";
		String lengthGunLicence=testBase.randomNumeric(14);
		
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.firstName, lengthFirstName, "First Name");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.lastName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.lastName, lengthLastName, "Last Name");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.mobileNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.mobileNumber, lengthMobileNumber, "Mobile Number");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.otherContactNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.otherContactNumber, lengthOtherContactNumber, "Other Contact Number");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.jobTitle, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.jobTitle, lengthJobTitle, "Job Title");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportRadioButton, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.passportRadioButton, "Passport Radio Button");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.passportNumber, lengthPassportNumber, "Passport Number");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, "ID Number Radio Button");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.saID, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.saID, lengthSAID, "SA ID");
		
		
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.employeeResidentialDetails, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeResidentialDetails, "Employee Residential Details");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialStreet1, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialStreet1, lengthStreet1, "Street1");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialStreet2, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialStreet2, lengthStreet2, "Street2");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialPostalCode, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialPostalCode, lengthPostalCode, "Postal Code");
		
		
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalAddressDetails, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.postalAddressDetails, "Postal Address Details");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalStreet1, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalStreet1, lengthStreet1, "Street1");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalStreet2, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalStreet2, lengthStreet2, "Street2");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalCode, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalCode, lengthPostalCode, "Postal Code");
		
		
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyContactDetails, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.emergencyContactDetails, "Emergency Contact Details");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyFirstName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyFirstName, lengthFirstName, "First Name");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyLastName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyLastName, lengthLastName, "Last Name");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyMobileNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyMobileNumber, lengthMobileNumber, "Mobile Number");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyOtherContactNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyOtherContactNumber, lengthOtherContactNumber, "Other Contact Number");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyStreet1, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyStreet1, lengthStreet1, "Street1");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyStreet2, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyStreet2, lengthStreet2, "Street2");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyPostalCode, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyPostalCode, lengthPostalCode, "Postal Code");
		
		
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinDetails, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.kinDetails, "Kin Details");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinFirstName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinFirstName, lengthFirstName, "First Name");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinLastName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinLastName, lengthLastName, "Last Name");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinMobileNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinMobileNumber, lengthMobileNumber, "Mobile Number");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinRelationship, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinRelationship, lengthRelationship, "Relationship");
		
		
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.complianceDetails, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.complianceDetails, "Compliance Details");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.driverLicence, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.driverLicence, lengthDriverLicence, "Driver Licence");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.gunLicence, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.gunLicence, lengthGunLicence, "Gun Licence");
		
		
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstName, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstName, "First Name");
	}

	@Then("User Validates the error messages of Invalid field length data of all the feilds in Add Employee page")
	public void user_Validates_the_error_messages_of_Invalid_field_length_data_of_all_the_feilds_in_Add_Employee_page() throws Exception {
	    
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthFirstName, "FirstName"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 Characters Allowed. element is not visible");
		}else
			Logs.info("Maximum 25 Characters Allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthLastName, "Last Name"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 Characters Allowed. element is not visible");
		}else
			Logs.info("Maximum 25 Characters Allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidMobileNumber, "Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		}else
			Logs.info("Give Correct Mobile Number element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidOtherContactNumber, "Other Contact Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Number element is not visible");
		}else
			Logs.info("Give Correct Number element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthJobTitle, "Job Title"))) {
			ExceptionHandling.HandleAssertion("Max 25 Characters Allowed element is not visible");
		}else
			Logs.info("Max 25 Characters Allowed element is visible");
		
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.passportRadioButton, "Passport Radio Button");
		Thread.sleep(3000);
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidPassportNumber, "Passport Number"))) {
			ExceptionHandling.HandleAssertion("Give Valid Passport Number element is not visible");
		}else
			Logs.info("Give Valid Passport Number element is visible");
		
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, "ID Number radio button");
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidSAID, "SA ID"))) {
			ExceptionHandling.HandleAssertion("Give Correct SA_ID element is not visible");
		}else
			Logs.info("Give Correct SA_ID element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthResidentialStreet1, "Street1"))) {
			ExceptionHandling.HandleAssertion("Maximum 100 Characters Allowed. is not visible");
		}else
			Logs.info("Maximum 100 Characters Allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthResidentialStreet2, "Street"))) {
			ExceptionHandling.HandleAssertion("Maximum 100 characters allowed. element is not visible");
		}else
			Logs.info("Maximum 100 characters allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidResidentialPostalCode, "Postal Code"))) {
			ExceptionHandling.HandleAssertion("Give Correct Postal Code element is not visible");
		}else
			Logs.info("Give Correct Postal Code elemnt is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthPostalStreet1, "Street1"))) {
			ExceptionHandling.HandleAssertion("Maximum 100 characters allowed. element is not visible");
		}else
			Logs.info("Maximum 100 characters allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthPostalStreet2, "Street2"))) {
			ExceptionHandling.HandleAssertion("Maximum 100 characters allowed. element is not visible");
		}else
			Logs.info("Maximum 100 characters allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidPostalCode, "Postal Code"))) {
			ExceptionHandling.HandleAssertion("Give Correct Postal Code element is not visible");
		}else
			Logs.info("Give Correct Postal Code element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthEmergencyFirstName, "First Name"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 characters Allowed. element is not visible");
		}else
			Logs.info("Maximum 25 characters Allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthEmergencyLastName, "Last Name"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 characters Allowed. element is not visible");
		}else
			Logs.info("Maximum 25 characters Allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidEmergencyMobile, "Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		}else
			Logs.info("Give Correct Mobile Number element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidEmergencyOtherContact, "Other Contact Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Number element is not visible");
		}else
			Logs.info("Give Correct Number element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthEmergencyStreet1, "Street1"))) {
			ExceptionHandling.HandleAssertion("Maximum 100 characters allowed. element is not visible");
		}else
			Logs.info("Maximum 100 characters allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthEmergencyStreet2, "Street2"))) {
			ExceptionHandling.HandleAssertion("Maximum 100 characters allowed. element is not visible");
		}else
			Logs.info("Maximum 100 characters allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidEmergencyPostalCode, "Postal Code"))) {
			ExceptionHandling.HandleAssertion("Give Correct Postal Code element is visible");
		}else
			Logs.info("Give Correct Postal Code element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthKinFirstName, "First Name"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 characters allowed. element is not visible");
		}else
			Logs.info("Maximum 25 characters allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthKinLastName, "Last Name"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 characters allowed. element is not visible");
		}else
			Logs.info("Maximum 25 characters allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidKinMobile, "Mobile Number"))) {
			ExceptionHandling.HandleAssertion("Give Correct Mobile Number element is not visible");
		}else
			Logs.info("Give Correct Mobile Number element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.lengthKinRelationship, "Relationship"))) {
			ExceptionHandling.HandleAssertion("Maximum 25 characters allowed. element is not visible");
		}else
			Logs.info("Maximum 25 characters allowed. element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidDriverLicence, "Driver Licence"))) {
			ExceptionHandling.HandleAssertion("Give Valid Driving Licence Number element is not visible");
		}else
			Logs.info("Give Valid Driving Licence Number element is visible");
		
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.invalidGunLicence, "Gun Licence"))) {
			ExceptionHandling.HandleAssertion("Give Valid Gun Licence Number element is not visible");
		}else
			Logs.info("Give Valid Gun Licence Number element is visible");	
	}

	@Then("User clicks on Save button to validate mandatory fields of Add Employee page")
	public void user_clicks_on_Save_button_to_validate_mandatory_fields_of_Add_Employee_page() throws Exception {
	   
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.saveButton, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.saveButton, "Save Button");
		if (testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.nullValidateEmployees, "Validate Mandatory fields")) {
			ExceptionHandling.HandleAssertion("New Employee Created");
		} else
			Logs.info("New Employee not created");
	}

	@Then("User enters First Name as {string} in Employee Details")
	public void user_enters_First_Name_as_in_Employee_Details(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String firstName = Excel_Utility.getCellData(2, 0);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.firstName, firstName, "First Name");
	}

	@Then("User enters Last Name as {string} in Employee Details")
	public void user_enters_Last_Name_as_in_Employee_Details(String string) throws Exception {
	    String lastName=Excel_Utility.getCellData(2, 1);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.lastName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.lastName, lastName, "lastName");
	}

	@Given("User enters Mobile Number as {string} in Employee Details")
	public void user_enters_Mobile_Number_as_in_Employee_Details(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String mobileNumber=Excel_Utility.getCellData_Integer(2, 2);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.countryCode, "Country Code");
		Thread.sleep(2000);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectCountryCode, "Country Code");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.mobileNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.mobileNumber, mobileNumber, "Mobile Number");
	}

	@Then("User enters Other Contact Number as {string} in Employee Details")
	public void user_enters_Other_Contact_Number_as_in_Employee_Details(String string) throws Exception {
	    String otherContactNumber=Excel_Utility.getCellData_Integer(2, 3);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.otherContactNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.otherContactNumber, otherContactNumber, "Other Contact Number");
	}

	@Then("User enters Email Address as {string} in Employee Details")
	public void user_enters_Email_Address_as_in_Employee_Details(String string) throws Exception {
	    String emailAddress=Excel_Utility.getCellData(2, 4);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emailAddress, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emailAddress, emailAddress, "email Address");
	}

	@Then("User enters Job Title as {string} in Employee Details")
	public void user_enters_Job_Title_as_in_Employee_Details(String string) throws Exception {
	    String jobTitle=Excel_Utility.getCellData(2, 5);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.jobTitle, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.jobTitle, jobTitle, "job Title");
	}

	@Then("User selects Gender as {string} from Gender dropdown in Employee Details")
	public void user_selects_Gender_as_from_Gender_dropdown_in_Employee_Details(String string) throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.gender, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.gender, "Gender");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.selectGender, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectGender, "Male");
	}

	@Then("User clicks on Birthday date picker button and selects Birthday as {string} in Employee Details")
	public void user_clicks_on_Birthday_date_picker_button_and_selects_Birthday_as_in_Employee_Details(String string) throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.birthdayCalendarButton, 20);
	    Thread.sleep(2000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthdayCalendarButton, "Birthday Calendar Button");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.birthdayCalendarArrow, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthdayCalendarArrow, "Birthday Calendar Arrow");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.birthYear, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthYear, "Year");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.birthMonth, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthMonth, "Month");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.birthDate, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthDate, "Date");
	}

	@Then("User selects Role as {string} from Role dropdown in Employee Details")
	public void user_selects_Role_as_from_Role_dropdown_in_Employee_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.role, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.role, "Role");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.selectRole, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectRole, "Manager");
	}

	@Then("User selects Department as {string} from Select Department dropdown in Employee Details")
	public void user_selects_Department_as_from_Select_Department_dropdown_in_Employee_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.department, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.department, "Department");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.selectDepartment, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectDepartment, "Operations");
	}

	@Then("User clicks on Passport radio button in Employee Details")
	public void user_clicks_on_Passport_radio_button_in_Employee_Details() throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportRadioButton, 20);
		Thread.sleep(2000);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.passportRadioButton, "Passport Radio Button");   
	}

	@Then("User enters Passport Number as {string} in Employee Details")
	public void user_enters_Passport_Number_as_in_Employee_Details(String string) throws Exception {
		String passportNumber=Excel_Utility.getCellData(2, 10);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.passportNumber, passportNumber, "Passport Number");
	}

	@Then("User clicks on Passport Expiry Date date picker button and selects Passport Expiry Date as {string} in Employee Details")
	public void user_clicks_on_Passport_Expiry_Date_date_picker_button_and_selects_Passport_Expiry_Date_as_in_Employee_Details(String string) throws Exception {
	    Thread.sleep(2000);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportCalendarButton, 20);
		 Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportCalendarButton, "Passport Calendar Button");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportCalendarArrow, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportCalendarArrow, "Passport Calendar Arrow");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportExpiryYear, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportExpiryYear, "Year");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportExpiryMonth, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportExpiryMonth, "Month");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportExpiryDate, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportExpiryDate, "Date");
	}

	@Then("User clicks on ID Number radio button in Employee Details")
	public void user_clicks_on_ID_Number_radio_button_in_Employee_Details() throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, 20);
		Thread.sleep(2000);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, "ID Number Radio Button");
	}

	@Then("User enters SA ID as {string} in Employee Details")
	public void user_enters_SA_ID_as_in_Employee_Details(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String saID=Excel_Utility.getCellData_Integer(2, 12);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.saID, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.saID, saID, "SA ID");
	}

	@Then("User clicks on Employee Residential Address Details")
	public void user_clicks_on_Employee_Residential_Address_Details() throws Exception {
		Thread.sleep(3000);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.employeeResidentialDetails, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeResidentialDetails, "Employee Residential Details");
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeResidentialDetails, "Employee Residential Details");
	}

	@Given("User enters Street1  as {string} in Employee Residential Address Details")
	public void user_enters_Street1_as_in_Employee_Residential_Address_Details(String string) throws Exception {
		String street1=Excel_Utility.getCellData(2, 13);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialStreet1, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialStreet1, street1, "Street1");
	}

	@Given("User enters Street2  as {string} in Employee Residential Address Details")
	public void user_enters_Street2_as_in_Employee_Residential_Address_Details(String string) throws Exception {
	   String street2=Excel_Utility.getCellData(2, 14);
	   testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialStreet2, 20);
	   testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialStreet2, street2, "Street2");
	}

	@Then("User selects City as {string} from City dropdown in Employee Residential Address Details")
	public void user_selects_City_as_from_City_dropdown_in_Employee_Residential_Address_Details(String string) throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialCity, "City");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialSelectCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialSelectCity, "Pretoria");
	}

	@Then("User validates valid province is auto-populated when city is selected")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected() throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialProvince, 20);
		if (!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.residentialProvince, "Province"))) {
			ExceptionHandling.HandleAssertion("Province is not auto-populated");
		} else
			Logs.info("Province is auto-populated");
	}

	@Then("User enters Postal Code as {string} in Employee Residential Address Details")
	public void user_enters_Postal_Code_as_in_Employee_Residential_Address_Details(String string) throws Exception {
		String postalCode=Excel_Utility.getCellData(2, 16);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialPostalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialPostalCode, postalCode, "Postal Code");
	}

	@Then("User selects Country as {string} from Select Country dropdown in Employee Residential Address Details")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Employee_Residential_Address_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialCountry, "Country");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialSelectCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialSelectCountry, "South Africa");
	}

	@Then("User clicks on Postal Address Details")
	public void user_clicks_on_Postal_Address_Details() throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalAddressDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.postalAddressDetails, "Postal Address Details");
	
	}

	@Then("User enters Street1 as {string} in Postal Address Details")
	public void user_enters_Street1_as_in_Postal_Address_Details(String string) throws Exception {
		String street1=Excel_Utility.getCellData(2, 18);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalStreet1, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalStreet1, street1, "Street1");
	}

	@Then("User enters Street2 as {string} in Postal Address Details")
	public void user_enters_Street2_as_in_Postal_Address_Details(String string) throws Exception {
	    String street2=Excel_Utility.getCellData(2, 19);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalStreet2, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalStreet2, street2, "Street2");
	}
	
	@Then("User selects City as {string} from City dropdown in Postal Address Details")
	public void user_selects_City_as_from_City_dropdown_in_Postal_Address_Details(String string) throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalCity, "City");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalSelectCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalSelectCity, "Pretoria");
	}

	@Then("User validates valid province is auto-populated when city is selected in Postal Address Details")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected_in_Postal_Address_Details() throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalProvince, 20);
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.postalProvince, "Province"))) {
	    	ExceptionHandling.HandleAssertion("Province is not auto-populated");
	    }else
	    	Logs.info("Province is auto-populated");
	}

	@Then("User enter Postal Code as {string} in Postal Address Details")
	public void user_enter_Postal_Code_as_in_Postal_Address_Details(String string) throws Exception {
		String postalCode=Excel_Utility.getCellData(2, 21);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalCode, postalCode, "Postal Code");
	}

	@Then("User selects Country as {string} from Select Country dropdown in Postal Address Details")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Postal_Address_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalCountry, "Country");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalSelectCountry, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalSelectCountry, "South Africa");
	}

	@Then("User clicks on Emergency Contact Details")
	public void user_clicks_on_Emergency_Contact_Details() throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyContactDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.emergencyContactDetails, "Emergency Contact Details");
	}

	@Then("And User enters First Name as {string} in Emergency Contact Details")
	public void and_User_enters_First_Name_as_in_Emergency_Contact_Details(String string) throws Exception {
	    String firstName=Excel_Utility.getCellData(2, 23);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyFirstName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyFirstName, firstName, "First Name");
	}

	@Then("User enters Last Name as {string} in Emergency Contact Details")
	public void user_enters_Last_Name_as_in_Emergency_Contact_Details(String string) throws Exception {
		String lastName=Excel_Utility.getCellData(2, 24);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyLastName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyLastName, lastName, "Last Name");
	}

	@Then("User enters Mobile Number {string} in Emergency Contact Details")
	public void user_enters_Mobile_Number_in_Emergency_Contact_Details(String string) throws Exception {
		String mobileNumber=Excel_Utility.getCellData_Integer(2, 25);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyMobileNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyMobileNumber, mobileNumber, "Mobile Number");
	}

	@Then("User enters Other Contact Number as {string} in Emergency Contact Details")
	public void user_enters_Other_Contact_Number_as_in_Emergency_Contact_Details(String string) throws Exception {
		String otherContactNumber=Excel_Utility.getCellData_Integer(2, 26);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyOtherContactNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyOtherContactNumber, otherContactNumber, "Other Contact Number");
	}

	@Then("User enters Email Address as {string} in Emergency Contact Details")
	public void user_enters_Email_Address_as_in_Emergency_Contact_Details(String string) throws Exception {
	    String emailAddress=Excel_Utility.getCellData(2, 27);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyEmailAddress, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyEmailAddress, emailAddress, "email Address");
	}
	
	@Then("User enters Street1 as {string} in Emergency Contact Details")
	public void user_enters_Street1_as_in_Emergency_Contact_Details(String string) throws Exception {
		String street1=Excel_Utility.getCellData(2, 28);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyStreet1, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyStreet1, street1, "Street1");
	}

	@Then("User enters Street2 as {string} in Emergency Contact Details")
	public void user_enters_Street2_as_in_Emergency_Contact_Details(String string) throws Exception {
		String street2=Excel_Utility.getCellData(2, 29);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyStreet2, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyStreet2, street2, "Street2");
	    
	}
	
	@Then("User selects City as {string} from City dropdown in Emergency Contact Details")
	public void user_selects_City_as_from_City_dropdown_in_Emergency_Contact_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencyCity, "City");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencySelectCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencySelectCity, "Johannesburg");
	}

	@Then("User validates valid province is auto-populated when city is selected in Emergency Contact Details")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected_in_Emergency_Contact_Details() throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyProvince, 20);
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.emergencyProvince, "Province"))) {
	    	ExceptionHandling.HandleAssertion("Province is not auto-populated");
	    }else
	    	Logs.info("Province is auto-populated");
	}

	@Then("User enter Postal Code as {string} in Emergency Contact Details")
	public void user_enter_Postal_Code_as_in_Emergency_Contact_Details(String string) throws Exception {
		String postalCode=Excel_Utility.getCellData(2, 31);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyPostalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyPostalCode, postalCode, "Postal Code");
	}

	@Then("User selects Country as {string} from Select Country dropdown in Emergency Contact Details")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Emergency_Contact_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencyCountry, "Country");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencySelectCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencySelectCountry, "South Africe");
	}

	@Then("User clicks on Next Of Kin Details")
	public void user_clicks_on_Next_Of_Kin_Details() throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.kinDetails, " Next Of Kin Details");
	}

	@Then("And User enters First Name as {string} in Next Of Kin Details")
	public void and_User_enters_First_Name_as_in_Next_Of_Kin_Details(String string) throws Exception {
	    String firstName=Excel_Utility.getCellData(2, 33);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinFirstName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinFirstName, firstName, "First Name");
	}

	@Then("User enters Last Name as {string} in Next Of Kin Details")
	public void user_enters_Last_Name_as_in_Next_Of_Kin_Details(String string) throws Exception {
		String lastName=Excel_Utility.getCellData(2, 34);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinLastName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinLastName, lastName, "Last Name");
	}

	@Then("User enters Mobile Number {string} in Next Of Kin Details")
	public void user_enters_Mobile_Number_in_Next_Of_Kin_Details(String string) throws Exception {
		String mobileNumber=Excel_Utility.getCellData_Integer(2, 35);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinMobileNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinMobileNumber, mobileNumber, "Mobile Number");
	}

	@Then("User enters Relationship as {string} in Next Of Kin Details")
	public void user_enters_Relationship_as_in_Next_Of_Kin_Details(String string) throws Exception {
		String relationship=Excel_Utility.getCellData(2, 36);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinRelationship, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinRelationship, relationship, "Relationship");
	}

	@Then("User clicks on Security Details")
	public void user_clicks_on_Security_Details() throws Throwable {
		Thread.sleep(5000);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.securityDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityDetails, "Security Details");
	}

	@Then("User enters Security Licence Number as {string} in Security Details")
	public void user_enters_Security_Licence_Number_as_in_Security_Details(String string) throws Exception {
		String securityLicenceNumber=Excel_Utility.getCellData_Integer(2, 37);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.securityLicenceNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.securityLicenceNumber, securityLicenceNumber, "Security Licence Number");
	}

	@Then("User clicks on Security Licence Expiry Date date picker button and selects Security Licence Expiry Date as {string} in Security Details")
	public void user_clicks_on_Security_Licence_Expiry_Date_date_picker_button_and_selects_Security_Licence_Expiry_Date_as_in_Security_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.securityCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityCalendarButton, "Security Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityCalendarArrow, "Security Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryYear, "Year");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryMonth, "Month");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryDate, "Date");  
	}

	@Then("User clicks on First Aid Details")
	public void user_clicks_on_First_Aid_Details() throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstAidDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidDetails, "First Aid Details");
	}

	@Then("User enters First Aid\\/CPR as {string} in First Aid Details")
	public void user_enters_First_Aid_CPR_as_in_First_Aid_Details(String string) throws Exception {
		String firstAidCPR=Excel_Utility.getCellData_Integer(2, 39);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstAidCPR, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.firstAidCPR, firstAidCPR, "First Aid CPR");
	}

	@Then("User clicks on First Aid\\/CPR Expiry Date date picker button and selects First Aid\\/CPR Expiry Date as {string} in First Aid Details")
	public void user_clicks_on_First_Aid_CPR_Expiry_Date_date_picker_button_and_selects_First_Aid_CPR_Expiry_Date_as_in_First_Aid_Details(String string) throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstAidCalendarButton, 20);
	    Thread.sleep(2000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidCalendarButton, "First Aid Calendar Button");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidCalendarArrow, "First Aid Calendar Arrow");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidExpiryYear, "Year");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidExpiryMonth, "Month");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidExpiryDate, "Date");
	}

	@Then("User clicks on Compliance / Training / Certification Details")
	public void user_clicks_on_Compliance_Training_Certification_Details() throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.complianceDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.complianceDetails, "complianceDetails");
	}

	@Then("User enters Drivers Licence as {string} in Compliance / Training / Certification Details")
	public void user_enters_Drivers_Licence_as_in_Compliance_Training_Certification_Details(String string) throws Exception {
		String driverLicence=Excel_Utility.getCellData(2, 41);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.driverLicence, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.driverLicence, driverLicence, "Driver Licence");
	}

	@Then("User clicks on Drivers Licence Expiry date picker button and selects Drivers Licence Expiry date as {string} in Compliance / Training / Certification Details")
	public void user_clicks_on_Drivers_Licence_Expiry_date_picker_button_and_selects_Drivers_Licence_Expiry_date_as_in_Compliance_Training_Certification_Details(String string) throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.driverLicenceCalendarButton, 20);
	    Thread.sleep(2000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceCalendarButton, "Driver Licence Calendar Button");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceCalendarArrow, "Driver Licence Calendar Arrow");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceExpiryYear, "Year");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceExpiryMonth, "Month");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceExpiryDate, "Date");
	}

	@Given("User enters Gun Licence as {string} in Compliance / Training / Certification Details")
	public void user_enters_Gun_Licence_as_in_Compliance_Training_Certification_Details(String string) throws Exception {
		String gunLicence=Excel_Utility.getCellData_Integer(2, 43);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.gunLicence, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.gunLicence, gunLicence, "Gun Licence");
	}

	@Given("User clicks on Gun Licence Expiry date picker button and selects Gun Licence Expiry date as {string} in Compliance / Training / Certification Details")
	public void user_clicks_on_Gun_Licence_Expiry_date_picker_button_and_selects_Gun_Licence_Expiry_date_as_in_Compliance_Training_Certification_Details(String string) throws Exception {
	  testBase.waitForElement(Stratos_Admin_Employees_PageObjects.gunLicenceCalendarButton, 20);
	  Thread.sleep(2000);
	  testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceCalendarButton, "Gun Licence Calendar Button");
	  Thread.sleep(1000);
	  testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceCalendarArrow, "Gun Licence Calendar Arrow");
	  Thread.sleep(1000);
	  testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceExpiryYear, "Year");
	  Thread.sleep(1000);
	  testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceExpiryMonth, "Month");
	  Thread.sleep(1000);
	  testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceExpiryDate, "Date");
	}
	
	@Then("User clicks on Equipment Details")
	public void user_clicks_on_Equipment_Details() throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.equipmentDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.equipmentDetails, "Equipment Details");
	    Thread.sleep(2000);
	}

	@Then("User selects Use Force as {string} from Use Force dropdown in Equipment Details")
	public void user_selects_Use_Force_as_from_Use_Force_dropdown_in_Equipment_Details(String string) throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.useForce, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.useForce, "Use Force");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectUseForce, "YES");
	}

	@Then("User selects Traffic Control as {string} from Traffic Control dropdown in Equipment Details")
	public void user_selects_Traffic_Control_as_from_Traffic_Control_dropdown_in_Equipment_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.trafficControl, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.trafficControl, "Traffic Control");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectTrafficControl, "YES");
	}

	@Then("User selects Use Handcuffs as {string} from Use Handcuffs dropdown in Equipment Details")
	public void user_selects_Use_Handcuffs_as_from_Use_Handcuffs_dropdown_in_Equipment_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.useHandcuffs, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.useHandcuffs, "Handcuffs");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectuseHandcuffs, "NO");
	}

	@Then("User selects Use Baton as {string} from Use Baton dropdown in Equipment Details")
	public void user_selects_Use_Baton_as_from_Use_Baton_dropdown_in_Equipment_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.usebaton, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.usebaton, "Use Baton");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectUseBaton, "YES");  
	}

	@Then("User selects Use Gun as {string} from Use Gun dropdown in Equipment Details")
	public void user_selects_Use_Gun_as_from_Use_Gun_dropdown_in_Equipment_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.useGun, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.useGun, "Use Gun");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectUseGun, "NO"); 
	}

	@Then("User clicks on Contract Details")
	public void user_clicks_on_Contract_Details() throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.contractDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractDetails, "Contract Details");
	}

	@Then("User selects Contract Type as {string} from Contract Type dropdown in Contract Details")
	public void user_selects_Contract_Type_as_from_Contract_Type_dropdown_in_Contract_Details(String string) throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.contractType, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.contractType, "Contract Type");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectContractType, "Contractor");
	}

	@Then("User clicks on Contract Start Date date picker button and selects Contract Start Date as {string} in Contract Details")
	public void user_clicks_on_Contract_Start_Date_date_picker_button_and_selects_Contract_Start_Date_as_in_Contract_Details(String string) throws Exception {
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.contractStartCalendarButton, 20);
	    Thread.sleep(2000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartCalendarButton, "Contract Start Calendar Button");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartCalendarArrow, "Contract Start Calendar Arrow");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartYear, "Year");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartMonth, "Month");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartDate, "Date");
	}

	@Then("User clicks on Contract End Date date picker button and selects Contract End Date as {string} in Contract Details")
	public void user_clicks_on_Contract_End_Date_date_picker_button_and_selects_Contract_End_Date_as_in_Contract_Details(String string) throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.contractEndCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractEndCalendarButton, "Contract End Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractEndCalendarArrow, "Contract End Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractEndYear, "Year");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractEndMonth, "Month");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractEndDate, "Date"); 
	}

	@Then("User selects 3rd Party Provider as {string} from 3rd Party Provider dropdown")
	public void user_selects_3rd_Party_Provider_as_from_3rd_Party_Provider_dropdown(String string) throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName1);
		String provider=Excel_Utility.getCellData(1, 0);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.thirdPartyProvider, 20);
		Thread.sleep(2000);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.thirdPartyProvider, "Third Party Provider");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.parentEmployee(provider), "3rd Party Provider");
	}
	
	@Then("User clicks on Save button")
	public void user_clicks_on_Save_button() throws Exception {
		Thread.sleep(3000);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.saveButton, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.saveButton, "Save");
	}
	
	@Then("User verifies the created Manager to validate Manager is created")
	public void user_verifies_the_created_Manager_to_validate_Manager_is_created() throws Exception {
		Thread.sleep(5000);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String managerName = Excel_Utility.getCellData(2, 0);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, managerName, "Filter");
		String data=testBase.getElementText(Stratos_Admin_Employees_PageObjects.filterValidates, "Filtered Data");
		if (!(data.contains(managerName))) {
			ExceptionHandling.HandleAssertion("New Manager is not created");
		} else
			Logs.info("New Manager is created successfully");
	}

//	------------------------------	ADD NEW EMPLOYEE AS *SUPERVISOR*	----------------------------------------
	
	@Given("User enters First Name as {string} in Employee Details of Supervisor")
	public void user_enters_First_Name_as_in_Employee_Details_of_Supervisor(String string) throws Exception {
		Thread.sleep(10000);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String firstName = Excel_Utility.getCellData(3, 0);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.firstName, firstName, "First Name");
	}

	@Given("User enters Last Name as {string} in Employee Details of Supervisor")
	public void user_enters_Last_Name_as_in_Employee_Details_of_Supervisor(String string) throws Exception{
		String lastName=Excel_Utility.getCellData(3, 1);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.lastName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.lastName, lastName, "lastName");	    
	}

	@Given("User enters Mobile Number as {string} in Employee Details of Supervisor")
	public void user_enters_Mobile_Number_as_in_Employee_Details_of_Supervisor(String string) throws Exception{
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String mobileNumber=Excel_Utility.getCellData_Integer(3, 2);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.countryCode, "Country Code");
		Thread.sleep(2000);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectCountryCode, "Country Code");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.mobileNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.mobileNumber, mobileNumber, "Mobile Number");	    
	}

	@Given("User enters Other Contact Number as {string} in Employee Details of Supervisor")
	public void user_enters_Other_Contact_Number_as_in_Employee_Details_of_Supervisor(String string)throws Exception {
		String otherContactNumber=Excel_Utility.getCellData_Integer(3, 3);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.otherContactNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.otherContactNumber, otherContactNumber, "Other Contact Number");	    
	}

	@Given("User enters Email Address as {string} in Employee Details of Supervisor")
	public void user_enters_Email_Address_as_in_Employee_Details_of_Supervisor(String string)throws Exception {
		String emailAddress=Excel_Utility.getCellData(3, 4);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emailAddress, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emailAddress, emailAddress, "email Address");	    
	}

	@Given("User enters Job Title as {string} in Employee Details of Supervisor")
	public void user_enters_Job_Title_as_in_Employee_Details_of_Supervisor(String string)throws Exception {
		String jobTitle=Excel_Utility.getCellData(3, 5);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.jobTitle, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.jobTitle, jobTitle, "job Title");   
	}

	@Given("User selects Gender as {string} from Gender dropdown in Employee Details of Supervisor")
	public void user_selects_Gender_as_from_Gender_dropdown_in_Employee_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.gender, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.gender, "Gender");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.selectGender, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectGender, "Male");
	}

	@Given("User clicks on Birthday date picker button and selects Birthday as {string} in Employee Details of Supervisor")
	public void user_clicks_on_Birthday_date_picker_button_and_selects_Birthday_as_in_Employee_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.birthdayCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthdayCalendarButton, "Birthday Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthdayCalendarArrow, "Birthday Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.supervisorBirthdayYear, "Year");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.supervisorBirthdayMonth, "Month");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.supervisorBirthdayDate, "Date");
	}

	@Given("User selects Role as {string} from Role dropdown in Employee Details of Supervisor")
	public void user_selects_Role_as_from_Role_dropdown_in_Employee_Details_of_Supervisor(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.role, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.role, "Role");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.selectRole, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.supervisorRole, "Supervisor");
	}

	@Given("User selects Department as {string} from Select Department dropdown in Employee Details of Supervisor")
	public void user_selects_Department_as_from_Select_Department_dropdown_in_Employee_Details_of_Supervisor(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.department, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.department, "Department");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.selectDepartment, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectDepartment, "Operations");
	}

	@Given("User clicks on Passport radio button in Employee Details of Supervisor")
	public void user_clicks_on_Passport_radio_button_in_Employee_Details_of_Supervisor()throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportRadioButton, 20);
		Thread.sleep(2000);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.passportRadioButton, "Passport Radio Button"); 
	}

	@Given("User enters Passport Number as {string} in Employee Details of Supervisor")
	public void user_enters_Passport_Number_as_in_Employee_Details_of_Supervisor(String string)throws Exception {
		String passportNumber=Excel_Utility.getCellData(3, 10);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.passportNumber, passportNumber, "Passport Number");
	}

	@Given("User clicks on Passport Expiry Date date picker button and selects Passport Expiry Date as {string} in Employee Details of Supervisor")
	public void user_clicks_on_Passport_Expiry_Date_date_picker_button_and_selects_Passport_Expiry_Date_as_in_Employee_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportCalendarButton, 20);
		Thread.sleep(3000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportCalendarButton, "Passport Calendar Button");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportCalendarArrow, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportCalendarArrow, "Passport Calendar Arrow");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportExpiryYear, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportExpiryYear, "Year");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportExpiryMonth, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportExpiryMonth, "Month");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportExpiryDate, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportExpiryDate, "Date");
	    
	}

	@Given("User clicks on ID Number radio button in Employee Details of Supervisor")
	public void user_clicks_on_ID_Number_radio_button_in_Employee_Details_of_Supervisor() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, 20);
		Thread.sleep(2000);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, "ID Number Radio Button");
	}

	@Given("User enters SA ID as {string} in Employee Details of Supervisor")
	public void user_enters_SA_ID_as_in_Employee_Details_of_Supervisor(String string) throws Exception{
		String saID=Excel_Utility.getCellData_Integer(3, 12);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.saID, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.saID, saID, "SA ID");
	}

	@Given("User clicks on Employee Residential Address Details of Supervisor")
	public void user_clicks_on_Employee_Residential_Address_Details_of_Supervisor() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.employeeResidentialDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeResidentialDetails, "Employee Residential Details");  
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeResidentialDetails, "Employee Residential Details");
	}

	@Given("User enters Street1  as {string} in Employee Residential Address Details of Supervisor")
	public void user_enters_Street1_as_in_Employee_Residential_Address_Details_of_Supervisor(String string) throws Exception{
		String street1=Excel_Utility.getCellData(3, 13);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialStreet1, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialStreet1, street1, "Street1"); 
	}

	@Given("User enters Street2  as {string} in Employee Residential Address Details of Supervisor")
	public void user_enters_Street2_as_in_Employee_Residential_Address_Details_of_Supervisor(String string) throws Exception{
		String street2=Excel_Utility.getCellData(3, 14);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialStreet2, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialStreet2, street2, "Street2");
	}

	@Given("User selects City as {string} from City dropdown in Employee Residential Address Details of Supervisor")
	public void user_selects_City_as_from_City_dropdown_in_Employee_Residential_Address_Details_of_Supervisor(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialCity, "City");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialSelectCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialSelectCity, "Pretoria");
	}

	@Given("User validates valid province is auto-populated when city is selected of Supervisor")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected_of_Supervisor() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialProvince, 20);
		if (!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.residentialProvince, "Province"))) {
			ExceptionHandling.HandleAssertion("Province is not auto-populated");
		} else
			Logs.info("Province is auto-populated");  
	}

	@Given("User enters Postal Code as {string} in Employee Residential Address Details of Supervisor")
	public void user_enters_Postal_Code_as_in_Employee_Residential_Address_Details_of_Supervisor(String string)throws Exception {
		String postalCode=Excel_Utility.getCellData(3, 16);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialPostalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialPostalCode, postalCode, "Postal Code");
	}

	@Given("User selects Country as {string} from Select Country dropdown in Employee Residential Address Details of Supervisor")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Employee_Residential_Address_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialCountry, "Country");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialSelectCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialSelectCountry, "South Africa");
	}

	@Given("User clicks on Postal Address Details of Supervisor")
	public void user_clicks_on_Postal_Address_Details_of_Supervisor()throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalAddressDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.postalAddressDetails, "Postal Address Details");
	}

	@Given("User enters Street1 as {string} in Postal Address Details of Supervisor")
	public void user_enters_Street1_as_in_Postal_Address_Details_of_Supervisor(String string) throws Exception{
		String street1=Excel_Utility.getCellData(3, 18);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalStreet1, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalStreet1, street1, "Street1");
	}

	@Given("User enters Street2 as {string} in Postal Address Details of Supervisor")
	public void user_enters_Street2_as_in_Postal_Address_Details_of_Supervisor(String string)throws Exception {
		String street2=Excel_Utility.getCellData(3, 19);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalStreet2, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalStreet2, street2, "Street2");
	}

	@Given("User selects City as {string} from City dropdown in Postal Address Details of Supervisor")
	public void user_selects_City_as_from_City_dropdown_in_Postal_Address_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalCity, "City");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalSelectCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalSelectCity, "Pretoria");
	}

	@Given("User validates valid province is auto-populated when city is selected in Postal Address Details of Supervisor")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected_in_Postal_Address_Details_of_Supervisor()throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalProvince, 20);
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.postalProvince, "Province"))) {
	    	ExceptionHandling.HandleAssertion("Province is not auto-populated");
	    }else
	    	Logs.info("Province is auto-populated");
	    
	}

	@Given("User enter Postal Code as {string} in Postal Address Details of Supervisor")
	public void user_enter_Postal_Code_as_in_Postal_Address_Details_of_Supervisor(String string)throws Exception {
		String postalCode=Excel_Utility.getCellData(3, 21);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalCode, postalCode, "Postal Code");
	}

	@Given("User selects Country as {string} from Select Country dropdown in Postal Address Details of Supervisor")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Postal_Address_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalCountry, "Country");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalSelectCountry, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalSelectCountry, "South Africa");
	}

	@Given("User clicks on Next Of Kin Details of Supervisor")
	public void user_clicks_on_Next_Of_Kin_Details_of_Supervisor()throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.kinDetails, " Next Of Kin Details");
	}

	@Given("And User enters First Name as {string} in Next Of Kin Details of Supervisor")
	public void and_User_enters_First_Name_as_in_Next_Of_Kin_Details_of_Supervisor(String string) throws Exception{
		String firstName=Excel_Utility.getCellData(3, 33);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinFirstName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinFirstName, firstName, "First Name");
	}

	@Given("User enters Last Name as {string} in Next Of Kin Details of Supervisor")
	public void user_enters_Last_Name_as_in_Next_Of_Kin_Details_of_Supervisor(String string) throws Exception{
		String lastName=Excel_Utility.getCellData(3, 34);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinLastName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinLastName, lastName, "Last Name");
	}

	@Given("User enters Mobile Number {string} in Next Of Kin Details of Supervisor")
	public void user_enters_Mobile_Number_in_Next_Of_Kin_Details_of_Supervisor(String string)throws Exception {
		String mobileNumber=Excel_Utility.getCellData_Integer(3, 35);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinMobileNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinMobileNumber, mobileNumber, "Mobile Number");
	}

	@Given("User enters Relationship as {string} in Next Of Kin Details of Supervisor")
	public void user_enters_Relationship_as_in_Next_Of_Kin_Details_of_Supervisor(String string)throws Exception {
		String relationship=Excel_Utility.getCellData(3, 36);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinRelationship, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinRelationship, relationship, "Relationship");
	}

	@Given("User clicks on Emergency Contact Details of Supervisor")
	public void user_clicks_on_Emergency_Contact_Details_of_Supervisor()throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyContactDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.emergencyContactDetails, "Emergency Contact Details");
	}

	@Given("And User enters First Name as {string} in Emergency Contact Details of Supervisor")
	public void and_User_enters_First_Name_as_in_Emergency_Contact_Details_of_Supervisor(String string) throws Exception{
		String firstName=Excel_Utility.getCellData(3, 23);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyFirstName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyFirstName, firstName, "First Name");
	    
	}

	@Given("User enters Last Name as {string} in Emergency Contact Details of Supervisor")
	public void user_enters_Last_Name_as_in_Emergency_Contact_Details_of_Supervisor(String string)throws Exception {
		String lastName=Excel_Utility.getCellData(3, 24);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyLastName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyLastName, lastName, "Last Name");
	    
	}

	@Given("User enters Mobile Number {string} in Emergency Contact Details of Supervisor")
	public void user_enters_Mobile_Number_in_Emergency_Contact_Details_of_Supervisor(String string)throws Exception {
		String mobileNumber=Excel_Utility.getCellData_Integer(3, 25);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyMobileNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyMobileNumber, mobileNumber, "Mobile Number");
	    
	}

	@Given("User enters Other Contact Number as {string} in Emergency Contact Details of Supervisor")
	public void user_enters_Other_Contact_Number_as_in_Emergency_Contact_Details_of_Supervisor(String string)throws Exception {
		String otherContactNumber=Excel_Utility.getCellData_Integer(3, 26);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyOtherContactNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyOtherContactNumber, otherContactNumber, "Other Contact Number");
	    
	}

	@Given("User enters Email Address as {string} in Emergency Contact Details of Supervisor")
	public void user_enters_Email_Address_as_in_Emergency_Contact_Details_of_Supervisor(String string)throws Exception {
		String emailAddress=Excel_Utility.getCellData(3, 27);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyEmailAddress, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyEmailAddress, emailAddress, "email Address");   
	}

	@Given("User enters Street1 as {string} in Emergency Contact Details of Supervisor")
	public void user_enters_Street1_as_in_Emergency_Contact_Details_of_Supervisor(String string) throws Exception{
		String street1=Excel_Utility.getCellData(3, 28);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyStreet1, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyStreet1, street1, "Street1");
	    
	}

	@Given("User enters Street2 as {string} in Emergency Contact Details of Supervisor")
	public void user_enters_Street2_as_in_Emergency_Contact_Details_of_Supervisor(String string)throws Exception {
		String street2=Excel_Utility.getCellData(3, 29);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyStreet2, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyStreet2, street2, "Street2");
	    
	}

	@Given("User selects City as {string} from City dropdown in Emergency Contact Details of Supervisor")
	public void user_selects_City_as_from_City_dropdown_in_Emergency_Contact_Details_of_Supervisor(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencyCity, "City");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencySelectCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencySelectCity, "Johannesburg");
	    
	}

	@Given("User validates valid province is auto-populated when city is selected in Emergency Contact Details of Supervisor")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected_in_Emergency_Contact_Details_of_Supervisor() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyProvince, 20);
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.emergencyProvince, "Province"))) {
	    	ExceptionHandling.HandleAssertion("Province is not auto-populated");
	    }else
	    	Logs.info("Province is auto-populated");
	    
	}

	@Given("User enter Postal Code as {string} in Emergency Contact Details of Supervisor")
	public void user_enter_Postal_Code_as_in_Emergency_Contact_Details_of_Supervisor(String string) throws Exception{
		String postalCode=Excel_Utility.getCellData(3, 31);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyPostalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyPostalCode, postalCode, "Postal Code");
	    
	}

	@Given("User selects Country as {string} from Select Country dropdown in Emergency Contact Details of Supervisor")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Emergency_Contact_Details_of_Supervisor(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencyCountry, "Country");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencySelectCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencySelectCountry, "South Africe");
	}

	@Given("User clicks on Security Details of Supervisor")
	public void user_clicks_on_Security_Details_of_Supervisor() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.securityDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityDetails, "Security Details");    
	}

	@Given("User enters Security Licence Number as {string} in Security Details of Supervisor")
	public void user_enters_Security_Licence_Number_as_in_Security_Details_of_Supervisor(String string) throws Exception{
		String securityLicenceNumber=Excel_Utility.getCellData(3, 37);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.securityLicenceNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.securityLicenceNumber, securityLicenceNumber, "Security Licence Number");
	}

	@Given("User clicks on Security Licence Expiry Date date picker button and selects Security Licence Expiry Date as {string} in Security Details of Supervisor")
	public void user_clicks_on_Security_Licence_Expiry_Date_date_picker_button_and_selects_Security_Licence_Expiry_Date_as_in_Security_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.securityCalendarButton, 20);
		Thread.sleep(3000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityCalendarButton, "Security Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityCalendarArrow, "Security Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryYear, "Year");
		Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryMonth, "Month");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryDate, "Date");
	}

	@Given("User clicks on First Aid Details of Supervisor")
	public void user_clicks_on_First_Aid_Details_of_Supervisor() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstAidDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidDetails, "First Aid Details");
	}

	@Given("User enters First Aid\\/CPR as {string} in First Aid Details of Supervisor")
	public void user_enters_First_Aid_CPR_as_in_First_Aid_Details_of_Supervisor(String string)throws Exception {
		String firstAidCPR=Excel_Utility.getCellData_Integer(3, 39);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstAidCPR, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.firstAidCPR, firstAidCPR, "First Aid CPR");
	}

	@Given("User clicks on First Aid\\/CPR Expiry Date date picker button and selects First Aid\\/CPR Expiry Date as {string} in First Aid Details of Supervisor")
	public void user_clicks_on_First_Aid_CPR_Expiry_Date_date_picker_button_and_selects_First_Aid_CPR_Expiry_Date_as_in_First_Aid_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstAidCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidCalendarButton, "First Aid Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidCalendarArrow, "First Aid Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidExpiryYear, "Year");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidExpiryMonth, "Month");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidExpiryDate, "Date");
	}

	@Given("User clicks on Compliance / Training / Certification Details of Supervisor")
	public void user_clicks_on_Compliance_Training_Certification_Details_of_Supervisor()throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.complianceDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.complianceDetails, "complianceDetails");
	}

	@Given("User enters Drivers Licence as {string} in Compliance / Training / Certification Details of Supervisor")
	public void user_enters_Drivers_Licence_as_in_Compliance_Training_Certification_Details_of_Supervisor(String string) throws Exception{
		String driverLicence=Excel_Utility.getCellData(3, 41);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.driverLicence, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.driverLicence, driverLicence, "Driver Licence");
	}

	@Given("User clicks on Drivers Licence Expiry date picker button and selects Drivers Licence Expiry date as {string} in Compliance / Training / Certification Details of Supervisor")
	public void user_clicks_on_Drivers_Licence_Expiry_date_picker_button_and_selects_Drivers_Licence_Expiry_date_as_in_Compliance_Training_Certification_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.driverLicenceCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceCalendarButton, "Driver Licence Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceCalendarArrow, "Driver Licence Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceExpiryYear, "Year");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceExpiryMonth, "Month");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceExpiryDate, "Date");
	}

	@Given("User enters Gun Licence as {string} in Compliance / Training / Certification Details of Supervisor")
	public void user_enters_Gun_Licence_as_in_Compliance_Training_Certification_Details_of_Supervisor(String string)throws Exception {
		String gunLicence=Excel_Utility.getCellData_Integer(3, 43);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.gunLicence, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.gunLicence, gunLicence, "Gun Licence");
	}

	@Given("User clicks on Gun Licence Expiry date picker button and selects Gun Licence Expiry date as {string} in Compliance / Training / Certification Details of Supervisor")
	public void user_clicks_on_Gun_Licence_Expiry_date_picker_button_and_selects_Gun_Licence_Expiry_date_as_in_Compliance_Training_Certification_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.gunLicenceCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceCalendarButton, "Gun Licence Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceCalendarArrow, "Gun Licence Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceExpiryYear, "Year");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceExpiryMonth, "Month");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceExpiryDate, "Date");
	}

	@Given("User clicks on Equipment Details of Supervisor")
	public void user_clicks_on_Equipment_Details_of_Supervisor()throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.equipmentDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.equipmentDetails, "Equipment Details");
	    Thread.sleep(2000);
	}

	@Given("User selects Use Force as {string} from Use Force dropdown in Equipment Details of Supervisor")
	public void user_selects_Use_Force_as_from_Use_Force_dropdown_in_Equipment_Details_of_Supervisor(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.useForce, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.useForce, "Use Force");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectUseForce, "YES");
	}

	@Given("User selects Traffic Control as {string} from Traffic Control dropdown in Equipment Details of Supervisor")
	public void user_selects_Traffic_Control_as_from_Traffic_Control_dropdown_in_Equipment_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.trafficControl, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.trafficControl, "Traffic Control");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectTrafficControl, "YES");
	}

	@Given("User selects Use Handcuffs as {string} from Use Handcuffs dropdown in Equipment Details of Supervisor")
	public void user_selects_Use_Handcuffs_as_from_Use_Handcuffs_dropdown_in_Equipment_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.useHandcuffs, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.useHandcuffs, "Handcuffs");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectuseHandcuffs, "NO");
	}

	@Given("User selects Use Baton as {string} from Use Baton dropdown in Equipment Details of Supervisor")
	public void user_selects_Use_Baton_as_from_Use_Baton_dropdown_in_Equipment_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.usebaton, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.usebaton, "Use Baton");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectUseBaton, "YES");  
	}

	@Given("User selects Use Gun as {string} from Use Gun dropdown in Equipment Details of Supervisor")
	public void user_selects_Use_Gun_as_from_Use_Gun_dropdown_in_Equipment_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.useGun, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.useGun, "Use Gun");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectUseGun, "NO"); 
	}

	@Given("User clicks on Contract Details of Supervisor")
	public void user_clicks_on_Contract_Details_of_Supervisor() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.contractDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractDetails, "Contract Details");
	}

	@Given("User selects Contract Type as {string} from Contract Type dropdown in Contract Details of Supervisor")
	public void user_selects_Contract_Type_as_from_Contract_Type_dropdown_in_Contract_Details_of_Supervisor(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.contractType, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.contractType, "Contract Type");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.supervisorContractType, "Permanent");   
	}

	@Given("User clicks on Contract Start Date date picker button and selects Contract Start Date as {string} in Contract Details of Supervisor")
	public void user_clicks_on_Contract_Start_Date_date_picker_button_and_selects_Contract_Start_Date_as_in_Contract_Details_of_Supervisor(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.contractStartCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartCalendarButton, "Contract Start Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartCalendarArrow, "Contract Start Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartYear, "Year");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartMonth, "Month");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartDate, "Date");
	}

	@Given("User clicks on Parent Employee Details of Supervisor")
	public void user_clicks_on_Parent_Employee_Deatils_of_Supervisor() throws Exception{
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.parentEmployeeDetails, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.parentEmployeeDetails, "Parent Employee Details");
	}

	@Given("User selects Parent Contact Name as {string} from Parent Contact Name dropdown in Parent Employees Details of Supervisor")
	public void user_selects_Parent_Contact_Name_as_from_Parent_Contact_Name_dropdown_in_Parent_Employees_Details_of_Supervisor(String string)throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String parentName1 = Excel_Utility.getCellData(2, 0);
		String parentName2=Excel_Utility.getCellData(2, 1);
		String parentName= parentName1+" "+parentName2;
		Thread.sleep(7000);
	//	testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.parentdropdown, "Parent Contact Name");
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.parentContactName, "Parent Contact Name");
		Thread.sleep(5000);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.parentEmployee(parentName), "Parent Employee Name");
	}
	
	@Then("User verifies the created Supervisor to validate Supervisor is created")
	public void user_verifies_the_created_Supervisor_to_validate_Supervisor_is_created() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String supervisorName= Excel_Utility.getCellData(3, 0);
		Thread.sleep(5000);
		Thread.sleep(3000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, supervisorName, "Filter");
		String data=testBase.getElementText(Stratos_Admin_Employees_PageObjects.filterValidates, "Filtered Data");
		if (!(data.contains(supervisorName))) {
			ExceptionHandling.HandleAssertion("New Supervisor is not created");
		} else
			Logs.info("New Supervisor is created successfully");
	}
	
//	------------------------------------	ADD NEW EMPLOYEE AS *EMPLOYEE*	--------------------------------------------------
	
	@Given("User enters First Name as {string} in Employee Details of Employee")
	public void user_enters_First_Name_as_in_Employee_Details_of_Employee(String string)throws Exception {
		Thread.sleep(10000);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String firstName = Excel_Utility.getCellData(4, 0);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.firstName, firstName, "First Name");
	}

	@Given("User enters Last Name as {string} in Employee Details of Employee")
	public void user_enters_Last_Name_as_in_Employee_Details_of_Employee(String string)throws Exception {
		String lastName=Excel_Utility.getCellData(4, 1);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.lastName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.lastName, lastName, "lastName");	   
	}

	@Given("User enters Mobile Number as {string} in Employee Details of Employee")
	public void user_enters_Mobile_Number_as_in_Employee_Details_of_Employee(String string) throws Exception{
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String mobileNumber=Excel_Utility.getCellData_Integer(4, 2);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.countryCode, "Country Code");
		Thread.sleep(2000);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectCountryCode, "Country Code");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.mobileNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.mobileNumber, mobileNumber, "Mobile Number");
	}

	@Given("User enters Other Contact Number as {string} in Employee Detail of Employees")
	public void user_enters_Other_Contact_Number_as_in_Employee_Detail_of_Employees(String string) throws Exception{
		String otherContactNumber=Excel_Utility.getCellData_Integer(4, 3);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.otherContactNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.otherContactNumber, otherContactNumber, "Other Contact Number");  
	}

	@Given("User enters Email Address as {string} in Employee Details of Employee")
	public void user_enters_Email_Address_as_in_Employee_Details_of_Employee(String string)throws Exception {
		String emailAddress=Excel_Utility.getCellData(4, 4);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emailAddress, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emailAddress, emailAddress, "email Address");	
	}

	@Given("User enters Job Title as {string} in Employee Details of Employee")
	public void user_enters_Job_Title_as_in_Employee_Details_of_Employee(String string)throws Exception {
		String jobTitle=Excel_Utility.getCellData(4, 5);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.jobTitle, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.jobTitle, jobTitle, "job Title");   
	}

	@Given("User selects Gender as {string} from Gender dropdown in Employee Details of Employee")
	public void user_selects_Gender_as_from_Gender_dropdown_in_Employee_Details_of_Employee(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.gender, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.gender, "Gender");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.selectGender, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectGender, "Male"); 
	}

	@Given("User clicks on Birthday date picker button and selects Birthday as {string} in Employee Details of Employee")
	public void user_clicks_on_Birthday_date_picker_button_and_selects_Birthday_as_in_Employee_Details_of_Employee(String string) throws Exception{
		Thread.sleep(3000);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.birthdayCalendarButton, 20);
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthdayCalendarButton, "Birthday Calendar Button");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.birthdayCalendarArrow, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.birthdayCalendarArrow, "Birthday Calendar Arrow");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeBirthdayYear, "Year");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeBirthdayMonth, "Month");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeBirthdayDate, "Date");
	}

	@Given("User selects Role as {string} from Role dropdown in Employee Details of Employee")
	public void user_selects_Role_as_from_Role_dropdown_in_Employee_Details_of_Employee(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.role, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.role, "Role");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.selectRole, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.employeeRole, "Employee");
	}

	@Given("User selects Department as {string} from Select Department dropdown in Employee Details of Employee")
	public void user_selects_Department_as_from_Select_Department_dropdown_in_Employee_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.department, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.department, "Department");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.selectDepartment, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectDepartment, "Operations"); 
	}

	@Given("User clicks on Passport radio button in Employee Details of Employee")
	public void user_clicks_on_Passport_radio_button_in_Employee_Details_of_Employee()throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportRadioButton, 20);
		Thread.sleep(2000);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.passportRadioButton, "Passport Radio Button"); 
	}

	@Given("User enters Passport Number as {string} in Employee Details of Employee")
	public void user_enters_Passport_Number_as_in_Employee_Details_of_Employee(String string)throws Exception {
		String passportNumber=Excel_Utility.getCellData(4, 10);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.passportNumber, passportNumber, "Passport Number");
	}

	@Given("User clicks on Passport Expiry Date date picker button and selects Passport Expiry Date as {string} in Employee Details of Employee")
	public void user_clicks_on_Passport_Expiry_Date_date_picker_button_and_selects_Passport_Expiry_Date_as_in_Employee_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportCalendarButton, "Passport Calendar Button");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportCalendarArrow, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportCalendarArrow, "Passport Calendar Arrow");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportExpiryYear, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportExpiryYear, "Year");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportExpiryMonth, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportExpiryMonth, "Month");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.passportExpiryDate, 20);
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.passportExpiryDate, "Date");
	}

	@Given("User clicks on ID Number radio button in Employee Details of Employee")
	public void user_clicks_on_ID_Number_radio_button_in_Employee_Details_of_Employee() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, 20);
		Thread.sleep(2000);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.idNumberRadioButton, "ID Number Radio Button");
	}

	@Given("User enters SA ID as {string} in Employee Details of Employee")
	public void user_enters_SA_ID_as_in_Employee_Details_of_Employee(String string)throws Exception {
		String saID=Excel_Utility.getCellData_Integer(4, 12);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.saID, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.saID, saID, "SA ID");
	}

	@Given("User enters Street1  as {string} in Employee Residential Address Details of Employee")
	public void user_enters_Street1_as_in_Employee_Residential_Address_Details_of_Employee(String string)throws Exception {
		String street1=Excel_Utility.getCellData(4, 13);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialStreet1, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialStreet1, street1, "Street1");    
	}

	@Given("User enters Street2  as {string} in Employee Residential Address Details of Employee")
	public void user_enters_Street2_as_in_Employee_Residential_Address_Details_of_Employee(String string) throws Exception{
		String street2=Excel_Utility.getCellData(4, 14);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialStreet2, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialStreet2, street2, "Street2");
	}

	@Given("User selects City as {string} from City dropdown in Employee Residential Address Details of Employee")
	public void user_selects_City_as_from_City_dropdown_in_Employee_Residential_Address_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialCity, "City");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialSelectCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialSelectCity, "Pretoria");
	}

	@Given("User validates valid province is auto-populated when city is selected of Employee")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected_of_Employee() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialProvince, 20);
		if (!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.residentialProvince, "Province"))) {
			ExceptionHandling.HandleAssertion("Province is not auto-populated");
		} else
			Logs.info("Province is auto-populated");   
	}

	@Given("User enters Postal Code as {string} in Employee Residential Address Details of Employee")
	public void user_enters_Postal_Code_as_in_Employee_Residential_Address_Details_of_Employee(String string) throws Exception{
		String postalCode=Excel_Utility.getCellData(4, 16);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialPostalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.residentialPostalCode, postalCode, "Postal Code");
	}

	@Given("User selects Country as {string} from Select Country dropdown in Employee Residential Address Details of Employee")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Employee_Residential_Address_Details_of_Employee(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialCountry, "Country");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.residentialSelectCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.residentialSelectCountry, "South Africa"); 
	}

	@Given("User enters Street1 as {string} in Postal Address Details of Employee")
	public void user_enters_Street1_as_in_Postal_Address_Details_of_Employee(String string)throws Exception {
		String street1=Excel_Utility.getCellData(4, 18);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalStreet1, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalStreet1, street1, "Street1");
	}

	@Given("User enters Street2 as {string} in Postal Address Details of Employee")
	public void user_enters_Street2_as_in_Postal_Address_Details_of_Employee(String string) throws Exception{
		String street2=Excel_Utility.getCellData(4, 19);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalStreet2, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalStreet2, street2, "Street2");
	}

	@Given("User selects City as {string} from City dropdown in Postal Address Details of Employee")
	public void user_selects_City_as_from_City_dropdown_in_Postal_Address_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalCity, "City");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalSelectCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalSelectCity, "Pretoria"); 
	}

	@Given("User validates valid province is auto-populated when city is selected in Postal Address Details of Employee")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected_in_Postal_Address_Details_of_Employee() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalProvince, 20);
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.postalProvince, "Province"))) {
	    	ExceptionHandling.HandleAssertion("Province is not auto-populated");
	    }else
	    	Logs.info("Province is auto-populated"); 
	}

	@Given("User enter Postal Code as {string} in Postal Address Details of Employee")
	public void user_enter_Postal_Code_as_in_Postal_Address_Details_of_Employee(String string) throws Exception{
		String postalCode=Excel_Utility.getCellData(4, 21);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.postalCode, postalCode, "Postal Code");
	}

	@Given("User selects Country as {string} from Select Country dropdown in Postal Address Details of Employee")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Postal_Address_Details_of_Employee(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalCountry, "Country");
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.postalSelectCountry, 20);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.postalSelectCountry, "South Africa");
	}

	@Given("User clicks on Next Of Kin Details of Employee")
	public void user_clicks_on_Next_Of_Kin_Details_of_Employee()throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.kinDetails, " Next Of Kin Details");
	}

	@Given("And User enters First Name as {string} in Next Of Kin Details of Employee")
	public void and_User_enters_First_Name_as_in_Next_Of_Kin_Details_of_Employee(String string) throws Exception{
		String firstName=Excel_Utility.getCellData(4, 33);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinFirstName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinFirstName, firstName, "First Name");
	}

	@Given("User enters Last Name as {string} in Next Of Kin Details of Employee")
	public void user_enters_Last_Name_as_in_Next_Of_Kin_Details_of_Employee(String string) throws Exception{
		String lastName=Excel_Utility.getCellData(4, 34);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinLastName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinLastName, lastName, "Last Name");
	}

	@Given("User enters Mobile Number {string} in Next Of Kin Details of Employee")
	public void user_enters_Mobile_Number_in_Next_Of_Kin_Details_of_Employee(String string) throws Exception{
		String mobileNumber=Excel_Utility.getCellData_Integer(4, 35);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinMobileNumber, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinMobileNumber, mobileNumber, "Mobile Number");
	}

	@Given("User enters Relationship as {string} in Next Of Kin Details of Employee")
	public void user_enters_Relationship_as_in_Next_Of_Kin_Details_of_Employee(String string)throws Exception {
		String relationship=Excel_Utility.getCellData(4, 36);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.kinRelationship, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.kinRelationship, relationship, "Relationship");
	}

	@Given("User clicks on Emergency Contact Details of Employee")
	public void user_clicks_on_Emergency_Contact_Details_of_Employee() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyContactDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.emergencyContactDetails, "Emergency Contact Details");
	}

	@Given("And User enters First Name as {string} in Emergency Contact Details of Employee")
	public void and_User_enters_First_Name_as_in_Emergency_Contact_Details_of_Employee(String string) throws Exception{
		String firstName=Excel_Utility.getCellData(4, 23);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyFirstName, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyFirstName, firstName, "First Name");   
	}

	@Given("User enters Last Name as {string} in Emergency Contact Details of Employee")
	public void user_enters_Last_Name_as_in_Emergency_Contact_Details_of_Employee(String string)throws Exception {
		String lastName=Excel_Utility.getCellData(4, 24);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyLastName, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyLastName, lastName, "Last Name");
	}

	@Given("User enters Mobile Number {string} in Emergency Contact Details of Employee")
	public void user_enters_Mobile_Number_in_Emergency_Contact_Details_of_Employee(String string) throws Exception{
		String mobileNumber=Excel_Utility.getCellData_Integer(4, 25);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyMobileNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyMobileNumber, mobileNumber, "Mobile Number");
	}

	@Given("User enters Other Contact Number as {string} in Emergency Contact Details of Employee")
	public void user_enters_Other_Contact_Number_as_in_Emergency_Contact_Details_of_Employee(String string) throws Exception{
		String otherContactNumber=Excel_Utility.getCellData_Integer(4, 26);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyOtherContactNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyOtherContactNumber, otherContactNumber, "Other Contact Number");
	    
	}

	@Given("User enters Email Address as {string} in Emergency Contact Details of Employee")
	public void user_enters_Email_Address_as_in_Emergency_Contact_Details_of_Employee(String string) throws Exception{
		String emailAddress=Excel_Utility.getCellData(4, 27);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyEmailAddress, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyEmailAddress, emailAddress, "email Address"); 
	}

	@Given("User enters Street1 as {string} in Emergency Contact Details of Employee")
	public void user_enters_Street1_as_in_Emergency_Contact_Details_of_Employee(String string)throws Exception {
		String street1=Excel_Utility.getCellData(4, 28);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyStreet1, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyStreet1, street1, "Street1");
	    
	}

	@Given("User enters Street2 as {string} in Emergency Contact Details of Employee")
	public void user_enters_Street2_as_in_Emergency_Contact_Details_of_Employee(String string)throws Exception {
		String street2=Excel_Utility.getCellData(4, 29);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyStreet2, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyStreet2, street2, "Street2");
	    
	}

	@Given("User selects City as {string} from City dropdown in Emergency Contact Details of Employee")
	public void user_selects_City_as_from_City_dropdown_in_Emergency_Contact_Details_of_Employee(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencyCity, "City");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencySelectCity, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencySelectCity, "Johannesburg");
	}

	@Given("User validates valid province is auto-populated when city is selected in Emergency Contact Details of Employee")
	public void user_validates_valid_province_is_auto_populated_when_city_is_selected_in_Emergency_Contact_Details_of_Employee()throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyProvince, 20);
	    if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.emergencyProvince, "Province"))) {
	    	ExceptionHandling.HandleAssertion("Province is not auto-populated");
	    }else
	    	Logs.info("Province is auto-populated");  
	}

	@Given("User enter Postal Code as {string} in Emergency Contact Details of Employee")
	public void user_enter_Postal_Code_as_in_Emergency_Contact_Details_of_Employee(String string)throws Exception {
		String postalCode=Excel_Utility.getCellData(4, 31);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyPostalCode, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.emergencyPostalCode, postalCode, "Postal Code");  
	}

	@Given("User selects Country as {string} from Select Country dropdown in Emergency Contact Details of Employee")
	public void user_selects_Country_as_from_Select_Country_dropdown_in_Emergency_Contact_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencyCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencyCountry, "Country");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.emergencySelectCountry, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.emergencySelectCountry, "South Africe");
	}

	@Given("User clicks on Security Details of Employee")
	public void user_clicks_on_Security_Details_of_Employee() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.securityDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityDetails, "Security Details");
	    Thread.sleep(3000);
	}

	@Given("User enters Security Licence Number as {string} in Security Details of Employee")
	public void user_enters_Security_Licence_Number_as_in_Security_Details_of_Employee(String string) throws Exception{
		String securityLicenceNumber=Excel_Utility.getCellData(4, 37);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.securityLicenceNumber, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.securityLicenceNumber, securityLicenceNumber, "Security Licence Number");
	}

	@Given("User clicks on Security Licence Expiry Date date picker button and selects Security Licence Expiry Date as {string} in Security Details of Employee")
	public void user_clicks_on_Security_Licence_Expiry_Date_date_picker_button_and_selects_Security_Licence_Expiry_Date_as_in_Security_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.securityCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityCalendarButton, "Security Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityCalendarArrow, "Security Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryYear, "Year");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryMonth, "Month");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.securityExpiryDate, "Date");
	}

	@Given("User clicks on First Aid Details of Employee")
	public void user_clicks_on_First_Aid_Details_of_Employee() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstAidDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidDetails, "First Aid Details");
	    Thread.sleep(3000);
	}

	@Given("User enters First Aid\\/CPR as {string} in First Aid Details of Employee")
	public void user_enters_First_Aid_CPR_as_in_First_Aid_Details_of_Employee(String string) throws Exception{
		String firstAidCPR=Excel_Utility.getCellData_Integer(4, 39);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstAidCPR, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.firstAidCPR, firstAidCPR, "First Aid CPR");
	}

	@Given("User clicks on First Aid\\/CPR Expiry Date date picker button and selects First Aid\\/CPR Expiry Date as {string} in First Aid Details of Employee")
	public void user_clicks_on_First_Aid_CPR_Expiry_Date_date_picker_button_and_selects_First_Aid_CPR_Expiry_Date_as_in_First_Aid_Details_of_Employee(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.firstAidCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidCalendarButton, "First Aid Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidCalendarArrow, "First Aid Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidExpiryYear, "Year");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidExpiryMonth, "Month");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.firstAidExpiryDate, "Date");
	}

	@Given("User clicks on Compliance / Training / Certification Details of Employee")
	public void user_clicks_on_Compliance_Training_Certification_Details_of_Employee() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.complianceDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.complianceDetails, "complianceDetails");
	    Thread.sleep(3000);
	}

	@Given("User enters Drivers Licence as {string} in Compliance / Training / Certification Details of Employee")
	public void user_enters_Drivers_Licence_as_in_Compliance_Training_Certification_Details_of_Employee(String string) throws Exception{
		String driverLicence=Excel_Utility.getCellData(4, 41);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.driverLicence, 20);
	    testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.driverLicence, driverLicence, "Driver Licence");
	}

	@Given("User clicks on Drivers Licence Expiry date picker button and selects Drivers Licence Expiry date as {string} in Compliance / Training / Certification Details of Employee")
	public void user_clicks_on_Drivers_Licence_Expiry_date_picker_button_and_selects_Drivers_Licence_Expiry_date_as_in_Compliance_Training_Certification_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.driverLicenceCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceCalendarButton, "Driver Licence Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceCalendarArrow, "Driver Licence Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceExpiryYear, "Year");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceExpiryMonth, "Month");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.driverLicenceExpiryDate, "Date");
	}

	@Given("User enters Gun Licence as {string} in Compliance / Training / Certification Details of Employee")
	public void user_enters_Gun_Licence_as_in_Compliance_Training_Certification_Details_of_Employee(String string) throws Exception{
		String gunLicence=Excel_Utility.getCellData_Integer(4, 43);
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.gunLicence, 20);
		testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.gunLicence, gunLicence, "Gun Licence");
	}

	@Given("User clicks on Gun Licence Expiry date picker button and selects Gun Licence Expiry date as {string} in Compliance / Training / Certification Details of Employee")
	public void user_clicks_on_Gun_Licence_Expiry_date_picker_button_and_selects_Gun_Licence_Expiry_date_as_in_Compliance_Training_Certification_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.gunLicenceCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceCalendarButton, "Gun Licence Calendar Button");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceCalendarArrow, "Gun Licence Calendar Arrow");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceExpiryYear, "Year");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceExpiryMonth, "Month");
		Thread.sleep(1000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.gunLicenceExpiryDate, "Date");
	}

	@Given("User clicks on Equipment Details of Employee")
	public void user_clicks_on_Equipment_Details_of_Employee()throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.equipmentDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.equipmentDetails, "Equipment Details");
	    Thread.sleep(3000);
	}

	@Given("User selects Use Force as {string} from Use Force dropdown in Equipment Details of Employee")
	public void user_selects_Use_Force_as_from_Use_Force_dropdown_in_Equipment_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.useForce, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.useForce, "Use Force");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectUseForce, "YES");
	}

	@Given("User selects Traffic Control as {string} from Traffic Control dropdown in Equipment Details of Employee")
	public void user_selects_Traffic_Control_as_from_Traffic_Control_dropdown_in_Equipment_Details_of_Employee(String string) throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.trafficControl, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.trafficControl, "Traffic Control");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectTrafficControl, "YES");
	}

	@Given("User selects Use Handcuffs as {string} from Use Handcuffs dropdown in Equipment Details of Employee")
	public void user_selects_Use_Handcuffs_as_from_Use_Handcuffs_dropdown_in_Equipment_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.useHandcuffs, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.useHandcuffs, "Handcuffs");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectuseHandcuffs, "NO");
	}

	@Given("User selects Use Baton as {string} from Use Baton dropdown in Equipment Details of Employee")
	public void user_selects_Use_Baton_as_from_Use_Baton_dropdown_in_Equipment_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.usebaton, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.usebaton, "Use Baton");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectUseBaton, "YES"); 
	}

	@Given("User selects Use Gun as {string} from Use Gun dropdown in Equipment Details of Employee")
	public void user_selects_Use_Gun_as_from_Use_Gun_dropdown_in_Equipment_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.useGun, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.useGun, "Use Gun");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.selectUseGun, "NO"); 
	}

	@Given("User clicks on Contract Details of Employee")
	public void user_clicks_on_Contract_Details_of_Employee() throws Exception{
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.contractDetails, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractDetails, "Contract Details");
	}

	@Given("User selects Contract Type as {string} from Contract Type dropdown in Contract Details of Employee")
	public void user_selects_Contract_Type_as_from_Contract_Type_dropdown_in_Contract_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.contractType, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.contractType, "Contract Type");
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.employeeContractType, "Permanent");   
	}

	@Given("User clicks on Contract Start Date date picker button and selects Contract Start Date as {string} in Contract Details of Employee")
	public void user_clicks_on_Contract_Start_Date_date_picker_button_and_selects_Contract_Start_Date_as_in_Contract_Details_of_Employee(String string)throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.contractStartCalendarButton, 20);
		Thread.sleep(2000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartCalendarButton, "Contract Start Calendar Button");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.contractStartCalendarArrow, "Contract Start Calendar Arrow");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeontractStartYear, "Year");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeContractStartMonth, "Month");
	    Thread.sleep(1000);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.employeeContractStartDate, "Date");
	}

	@Given("User clicks on Parent Employee Deatils of Employee")
	public void user_clicks_on_Parent_Employee_Deatils_of_Employee() throws Exception{
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.parentEmployeeDetails, 20);
	    testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.parentEmployeeDetails, "Parent Employee Details");
	}

	@Given("User selects Parent Contact Name as {string} from Parent Contact Name dropdown in Parent Employees Details of Employee")
	public void user_selects_Parent_Contact_Name_as_from_Parent_Contact_Name_dropdown_in_Parent_Employees_Details_of_Employee(String string) throws Exception{
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String parentName1 = Excel_Utility.getCellData(3, 0);
		String parentName2= Excel_Utility.getCellData(3, 1);
		String parentName =parentName1+" "+parentName2;
		System.out.println(parentName);
		Thread.sleep(7000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.parentContactName, "Parent Contact Name");
		Thread.sleep(5000);
		testBase.ClickViaMouse(Stratos_Admin_Employees_PageObjects.parentEmployee(parentName), "Parent Employee Name"); 
	}
	
	@Then("User verifies the created Employee to validate Employee is created")
	public void user_verifies_the_created_Employee_to_validate_Employee_is_created() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String employeeName = Excel_Utility.getCellData(4, 0);
		Thread.sleep(5000);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, employeeName, "Filter");
		String data=testBase.getElementText(Stratos_Admin_Employees_PageObjects.filterValidates, "Filtered Data");
		if (!(data.contains(employeeName))) {
			ExceptionHandling.HandleAssertion("New Employee is not created");
		} else
			Logs.info("New Employee is created successfully");
	}

// Active Employees Filter
	
	@Given("User enters valid Employee Name as {string} on Active Employees")
	public void user_enters_valid_Employee_Name_as_on_Active_Employees(String string) throws Exception{
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		employeeName = Excel_Utility.getCellData(2, 0);
	    testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
	    Thread.sleep(5000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, employeeName, "Filters");
	    
	    employeeID=testBase.getElementText(Stratos_Admin_Employees_PageObjects.employeeID, "EmployeeID");
	}

	@Then("User validates the filtered data of Active Employees")
	public void user_validates_the_filtered_data_of_Active_Employees() throws Exception{
	    String data=testBase.getElementText(Stratos_Admin_Employees_PageObjects.filterValidates, "Filtered Data");
	    if(!(employeeName.contains(data))) {
	    	ExceptionHandling.HandleAssertion("Filtered data is not displayed");
	    }else
	    	Logs.info("Filtered data is displayed");
	}

	@Then("User enters invalid Employee Name as {string} on Active Employees")
	public void user_enters_invalid_Employee_Name_as_on_Active_Employees(String string)throws Exception {
	    String data1=testBase.randomAlphanumeric(10);
	    testBase.clearTextbox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, "Clear Filters");
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, data1, "Filter");
	}

	@Then("User validates the error message as {string} on Active Employees")
	public void user_validates_the_error_message_as_on_Active_Employees(String string)throws Exception {
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.filterError, "Filter Error"))) {
	    	ExceptionHandling.HandleAssertion(" No data matching the filter message is not displayed");
	    }else
	    	Logs.info(" No data matching the filter message is displayed");
	}

// Inactive Employees Filter
	
	@Then("User clicks on Inactive Employees")
	public void user_clicks_on_Inactive_Employees() throws Exception{
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String employeeName = Excel_Utility.getCellData(2, 0);
	    Thread.sleep(3000);
	    testBase.clearTextbox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, "Filter");
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, employeeName, "Filters");
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.manageEmployee, "Manage Employee");
	    Thread.sleep(3000);
	    testBase.clickonElement(Stratos_Admin_3rdPartyProviders_PageObjects.deactivateButton, "Deactivate");
	    Thread.sleep(3000);
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.inactiveEmployees, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.inactiveEmployees, "Inactive Employees");
	}

	@Then("User enters valid Employee Name as {string} on Inactive Employees")
	public void user_enters_valid_Employee_Name_as_on_Inactive_Employees(String string)throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		employeeName = Excel_Utility.getCellData(2, 0);
		Thread.sleep(5000);
		testBase.clearTextbox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, "Filter");
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, employeeName, "Filters");
	}
	
	@Then("User validates the filtered data on Inactive Employees")
	public void user_validates_the_filtered_data_of_Inactive_Employees() throws Exception{
	    String data=testBase.getElementText(Stratos_Admin_Employees_PageObjects.filterValidates, "Filtered Data");
	    if(!(employeeName.contains(data))) {
	    	ExceptionHandling.HandleAssertion("Filtered data is not displayed");
	    }else
	    	Logs.info("Filtered data is displayed");
	}

	@Then("User enters invalid Employee Name as {string} on Inactive Employees")
	public void user_enters_invalid_Employee_Name_as_on_Inactive_Employees(String string)throws Exception {
	    String data=testBase.randomAlphanumeric(10);
	    testBase.clearTextbox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, "Filter");
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, data, "Filter");
	}
	
	@Then("User validates the error message as {string} on Inactive Employees")
	public void user_validates_the_error_message_as_on_Inactive_Employees(String string)throws Exception {
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.filterError, "Filter Error"))) {
	    	ExceptionHandling.HandleAssertion(" No data matching the filter message is not displayed");
	    }else
	    	Logs.info(" No data matching the filter message is displayed");
	}

	@Then("User clicks on Manage Employee button")
	public void user_clicks_on_Manage_Employee_button()throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		employeeName = Excel_Utility.getCellData(4, 0);
	    testBase.waitForElement(Stratos_Admin_3rdPartyProviders_PageObjects.filter, 20);
	    Thread.sleep(5000);
	    testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, employeeName, "Filters");
	    testBase.waitForElement(Stratos_Admin_Employees_PageObjects.manageEmployee, 20);
	    testBase.clickonElement(Stratos_Admin_Employees_PageObjects.manageEmployee, "Manage Employee");
	}

	@Then("User enters Other Contact Number as {string} in Edit Employees page")
	public void user_enters_Other_Contact_Number_as_in_Edit_Employees_page(String string) throws Exception{
	   otherContactNumber=testBase.randomNumeric(10);
	   testBase.waitForElement(Stratos_Admin_Employees_PageObjects.otherContactNumber, 20);
	   Thread.sleep(3000);
	   testBase.clearTextbox(Stratos_Admin_Employees_PageObjects.otherContactNumber, "Other Contact Number");
	   testBase.typeinTextBox(Stratos_Admin_Employees_PageObjects.otherContactNumber, otherContactNumber, "Other Contact Number");
	}
	
	@Given("User clicks on Update button on employee page")
	public void user_clicks_on_Update_button_on_employee_page() throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.updateButton, 20);
		Thread.sleep(5000);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.updateButton, "Update");
	}

	@Then("User validates the updates of Active Employees")
	public void user_validates_the_updates_of_Active_Employees() throws Exception{
		Thread.sleep(5000);
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String managerName = Excel_Utility.getCellData(4, 0);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, managerName, "Manager Name");
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.manageEmployee, "Manage Employee");
		String updatedOtherContactNumber=testBase.getElementText(Stratos_Admin_Employees_PageObjects.otherContactNumber, "Other Contact Number");
		   if(!(otherContactNumber.contains(updatedOtherContactNumber))) {
			   ExceptionHandling.HandleAssertion("Other Contact Number is not updated");
		   }else
			   Logs.info("Other Contact Number is updated"); 
	}

	@And("User clicks on Deactivate button on Manage Employees page")
	public void user_clicks_on_Deactivate_button_on_Manage_Employees_page() throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.deactivateButton, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.deactivateButton, "Deactivate Button");
	}
	@Then("User validates the Deactivated Employee on employee page")
	public void user_validates_the_Deactivated_Employee() throws Exception {
	   Excel_Utility.setExcelFile(excelFileLocation, sheetName);
	   String employeerName = Excel_Utility.getCellData(4, 0);
	   Thread.sleep(5000);
	   testBase.waitForElement(Stratos_Admin_Employees_PageObjects.inactiveEmployees, 20);
	   testBase.clickonElement(Stratos_Admin_Employees_PageObjects.inactiveEmployees, "Inactive Employees");
	   Thread.sleep(5000);
	   testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, employeerName, "Employee Name");
	   String data=testBase.getElementText(Stratos_Admin_Employees_PageObjects.filterValidates, "Filtered Data");
	   if(!(data.contains(employeerName))) {
		   ExceptionHandling.HandleAssertion("Employee is not Deactivated");
	   }else
		   Logs.info("Employee is Deactivated");
	}

	@And("User clicks on Activate button on Manage Employees page")
	public void user_clicks_on_Activate_button_on_Manage_Employees_page() throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.activateButton, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.activateButton, "Activate Button");
	}
	
	@Then("User validates the Activated Employee")
	public void user_validates_the_Activated_Employee() throws Exception{
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		String managerName = Excel_Utility.getCellData(4, 0);
		Thread.sleep(5000);
		testBase.typeinTextBox(Stratos_Admin_3rdPartyProviders_PageObjects.filter, managerName, "Manager Name");
		String data=testBase.getElementText(Stratos_Admin_Employees_PageObjects.filterValidates, "Filtered Data");
		if(!(managerName.contains(data))) {
			ExceptionHandling.HandleAssertion("Employee is not Activated");
		}else
			Logs.info("Employee is Activated");
	}

// Bulk Upload
	
	@Then("User clicks on Select File button and upload employees file")
	public void user_clicks_on_Select_File_button_and_upload_employees_file() throws Exception {
		Thread.sleep(3000);
		String CSVFile = "Auto-IT/Bulk_Employee-Stable.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);
	}
	
	@Given("User clicks on Submit button of Employee")
	public void user_clicks_on_Submit_button_of_Employee() throws Exception {
		testBase.waitForElement(Stratos_Admin_Employees_PageObjects.submitButton, 20);
		testBase.clickonElement(Stratos_Admin_Employees_PageObjects.submitButton, "Submit");
	}
	
	@Then("User validates the success message as {string} of employee bulk file")
	public void user_validates_the_success_message_as_of_employee_bulk_file(String string) {

	}

	@Then("User clicks on Select File button to upload invalid Employees bulk file")
	public void user_clicks_on_selects_File_button_to_upload_invalid_Employees_bulk_file() throws Exception {
		Thread.sleep(3000);
		String CSVFile = "Auto-IT/Bulk-Employee-Unstable.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);
	}
	
	@Then("User validates the error message as {string} of invalid Employees Bulk Upload")
	public void user_validates_the_error_message_as_of_invalid_EmployeesBulk_Upload(String string) throws Exception {
		Thread.sleep(2000);
		if(!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.nullBulkFileError, "Invalid Bulk File Upload"))) {
			ExceptionHandling.HandleAssertion("Invalid bulk upload file is uploaded");
		}else
			Logs.info("Invalid bulk file upload file is not uploaded");
	}

	@Then("User clicks on Select File button to upload empty Employees bulk file")
	public void user_clicks_on_Select_File_button_to_upload_empty_Employees_bulk_file() throws Exception {
		Thread.sleep(3000);
		String CSVFile = "Auto-IT/Bulk-Employee-Null.xlsx";
		testBase.FileUpload(Stratos_Admin_3rdPartyProviders_PageObjects.file, CSVFile);
	}
	
	@Given("User validates the error message as {string} of empty Employee null Bulk Upload file")
	public void user_validates_the_error_message_as_of_empty_Employee_null_Bulk_Upload_file(String string) throws Exception {
		if (!(testBase.isElementVisible(Stratos_Admin_Employees_PageObjects.nullBulkFileError, "Null Bulk File Upload"))) {
			ExceptionHandling.HandleAssertion("Null bulk upload file is uploaded");
		} else
			Logs.info("Null bulk upload file is not uploaded");
	}	
}