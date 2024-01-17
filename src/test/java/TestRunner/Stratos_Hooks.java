package TestRunner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Stratos_testBase.PageBase;
import Stratos_testBase.testBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import Stratos_utilities.ExceptionHandling;
import Stratos_utilities.Logs;



public class Stratos_Hooks extends PageBase{

	@Before
	public void BeforeScenario(Scenario scenario) throws Exception {
		try {
			testBase.TestCaseName=scenario.getName();
			Logs.startTestCase(testBase.TestCaseName);
			
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "Unable to run before scenario");
		}
	}
	
	@After
	public void AfterScenario(Scenario scenario) throws Exception {
		try {
			if(scenario.isFailed()) {
				final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "image");
				System.out.println("After Hook");
			}
			Logs.endTestCase();
		//	Stratos_BrowserActions.tearDown();
			
		}catch(Exception e) {
			ExceptionHandling.HandleExecption(e, "Unable to run After scenario");
		}
	}
	
}