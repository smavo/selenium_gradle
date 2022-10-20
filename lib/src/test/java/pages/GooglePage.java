package pages;

public class GooglePage extends BasePage {
	
	public GooglePage() {
		super(driver);
	}
	
	public void navigateToGoogle() {
		nagivateTo("https://google.com");
	}
	
}