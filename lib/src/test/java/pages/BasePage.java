package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{
	
	protected static WebDriver driver;
	private static WebDriverWait wait;
	
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Testing Proyects\\WORKSPACE_01\\demo_gradle\\lib\\src\\test\\resources\\Chrome_driver\\chromedriver_104.0.5112.81.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		wait = new WebDriverWait(driver,10);
	}
	
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}
	
	public static void nagivateTo(String url) {
		driver.get(url);
	}
	
}