package steps;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.GridPage;

public class GridTestPage {
	
    GridPage grid = new GridPage();
    
    @Given("^I navigate to the static table$")
    public void navigateToGridPage()  {
        grid.navigateToGrid();
    }

    @Then("^I can return the value I wanted$")
    public void returnValue() {
       final String value = grid.getValueFromGrid(3, 2);
       Assert.assertEquals("r: 1, c: 2", value);
    }

    @Then("^I can validate the table is displayed$")
    public void theTableIsThere(){
        Assert.assertTrue("El elemento no esta siendo mostrado.",grid.cellStatus());
    }

}