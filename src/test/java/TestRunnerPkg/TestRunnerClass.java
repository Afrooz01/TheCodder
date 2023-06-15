package TestRunnerPkg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import UtilityAmazonPkg.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resource/amazonPkg" }, plugin = { "json:target/cucumber.json" },
//glue = "StepDepCamp",tags = {"@contact"})
		glue = "StefdeffAmazonPkg") //tags = { "@Homeheader" })
//glue = "StepDepCamp") // , tags = {"@Ebay"})

public class TestRunnerClass extends AbstractTestNGCucumberTests{
	
	@BeforeTest 
	public void startUrl() {
		BaseClass test = new BaseClass();
		test.initbrowser();
		
		}
	@AfterTest
	public void closeUrl() {
		BaseClass test =new BaseClass();
		test.driver.quit();
	}
	
	

}
