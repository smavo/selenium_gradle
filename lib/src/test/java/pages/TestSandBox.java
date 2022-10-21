package pages;

public class TestSandBox extends BasePage {
	
	private String categoryDropdown = "//select[@id='testingDropdown']";
	
	public TestSandBox() {
		super(driver);
	}
	
	public void nagivateToSandbox() {
		navigateTo("https://www.testandquiz.com/selenium/testing.html");
	}
	
	public void selectCategory(String category) {
		selectFromDropdownByValue(categoryDropdown, category);
	}
	
}