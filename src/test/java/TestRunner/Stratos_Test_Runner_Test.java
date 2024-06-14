package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features="Stratos_Automation/Stratos_features/Stratos_Supervisor_Login.feature",
		glue={"Stratos_gluecode", "TestRunner"},
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","progress","summary"},
		tags= {""},
		monochrome= true
		
		)
public class Stratos_Test_Runner_Test {

}
