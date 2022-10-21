package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",  
		glue={"steps"},
		monochrome = true,
		 plugin = { "pretty", "html:target/cucumber-reports"},
		// plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"},
		// plugin = {"pretty","json:target/cucumber.json"},
		tags = "@Testing",
		strict = true)

public class runner {
	@AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();

    }
}