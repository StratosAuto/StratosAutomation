package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="com.stratos.automation/features/Stratos_Login.feature",
		glue={"gluecode", "TestRunner"},
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","progress","summary"},
		monochrome= true
		)


public class Stratos_Test_Runner_Test {

}
