package steps;

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
		
	}
	
	@And("^click on the search critera$")
	public void clickSearchButton() {
		
	}
	
	@Then("^the results match the criteria$")
	public void validateResults() {
		
	}
	
}