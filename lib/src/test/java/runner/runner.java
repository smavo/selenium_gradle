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
		tags = "@Testing",
		strict = true)

public class runner {
	@AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();

    }
}