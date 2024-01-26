package Stratos_gluecode;

import Stratos_pageObjects.Stratos_3rdPartyProviders_PageObjects;
import Stratos_pageObjects.Stratos_Login_PageObjects;
import Stratos_testBase.PageBase;
import Stratos_testBase.testBase;
import Stratos_utilities.Excel_Utility;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;
import Stratos_utilities.Utils;
import io.cucumber.java.en.*;

public class Stratos_Login01 {
	public static String excelFileLocation = "./TestData/Excel_data/Stratos_Test_Data.xlsx";
	public static String sheetName = "LOGIN";
	public static int valid_Password;
	public static String valid_Username;
	public static int invalid_Password;
	public static String invalid_Username;
	
	@Given("Enter the Url")
	public void enter_the_Url() {
		PageBase.OpenBrowser("Browser");
		String url = Utils.getFileProperty("URL");
		PageBase.driver.get(url);
		testBase.RefreshPage();
	}

	@Given("Enter Email Address")
	public void enter_Email_Address() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		valid_Username = Excel_Utility.getCellData(1, 0);
		valid_Password = Excel_Utility.getNumericCellData(1, 1);
		testBase.waitForElement(Stratos_Login_PageObjects.email, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.email, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.email, valid_Username, "Enter Email id");
	}

	@Given("Enter Password")
	public void enter_Password() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.password, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.password, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.password, String.valueOf(valid_Password), "Enter password");
	}

	@When("Click on Log In button")
	public void click_on_Log_In_button() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.login_button, 50);
		testBase.clickonElement(Stratos_Login_PageObjects.login_button, "Login");
	}

	@Then("Verify Success message")
	public void verify_Success_message() throws InterruptedException, Exception {
		Thread.sleep(3000);
		testBase.waitForElement(Stratos_Login_PageObjects.successMessage, 20);
		if (!(testBase.isElementVisible(Stratos_Login_PageObjects.successMessage, "Login successfull message"))) {
//			Thread.sleep(10000);
			ExceptionHandling.HandleAssertion("User not Login into the application");
			
		} else {
			Logs.info("User navigated to Homepage");
			testBase.takeScreenshot("Login success message");
		}
		
	}

	@Given("Enter invalid Email Address")
	public void enter_invalid_Email_Address() throws Exception {
		Excel_Utility.setExcelFile(excelFileLocation, sheetName);
		invalid_Username = Excel_Utility.getCellData(2, 0);
		invalid_Password = Excel_Utility.getNumericCellData(2, 1);
		testBase.waitForElement(Stratos_Login_PageObjects.email, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.email, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.email, invalid_Username, "Enter email id");
	}

	@Given("Enter invalid Password")
	public void enter_invalid_Password() throws Exception {
		testBase.waitForElement(Stratos_Login_PageObjects.password, 20);
		testBase.clickonElement(Stratos_Login_PageObjects.password, "clicked");
		testBase.typeinTextBox(Stratos_Login_PageObjects.password, String.valueOf(invalid_Password),"Enter password");
	}

	@Then("Verify Error message")
	public void verify_Error_message() throws Exception {
		Thread.sleep(2000);
		String loginerrormessage =testBase.getElementText(Stratos_Login_PageObjects.errorMessage, "Error Message");
		System.out.println(loginerrormessage);
		String loginerrormessage1 = "Entered Email/Password is Incorrect";
		if (!(loginerrormessage.contains(loginerrormessage1))) {
			ExceptionHandling.HandleAssertion("Login error message is not validated");
		} else {
			Logs.info("Login error message is validated");
		}
	}
}
