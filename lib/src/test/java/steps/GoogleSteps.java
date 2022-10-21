package steps;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.GooglePage;

public class GoogleSteps {
	
	GooglePage google = new GooglePage();
	
	@Given("^I am on the Google Search page$")
	public void navigateGoogle() {
		google.navigateToGoogle();
	}
	
	@When("^I enter a search critera$")
	public void enterSearchCriteria() {
		google.enterSearchCriteria("Peru");
	}
	
	@And("^click on the search critera$")
	public void clickSearchButton() {
		google.clickGoogleSearch();
	}
	
	@Then("^the results match the criteria$")
	public void validateResults() {
		Assert.assertEquals("Texto que Esperamos", google.firstResult());
	}
	
}