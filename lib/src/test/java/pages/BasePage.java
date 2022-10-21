package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{
	
	protected static WebDriver driver;
	private static WebDriverWait wait;
	private static Actions action;
	
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Testing Proyects\\WORKSPACE_01\\demo_gradle\\lib\\src\\test\\resources\\Chrome_driver\\chromedriver_104.0.5112.81.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		wait = new WebDriverWait(driver,15);
	}
	
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
		wait = new WebDriverWait(driver, 15);
	}
	
	public static void navigateTo(String url) {
		driver.get(url);
	}
	
	private WebElement Find(String locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))); 
	}
	
	public void clickElement(String locator) {
		Find(locator).click();
	}
	
	public void write(String locator, String textToWrite) {
		Find(locator).clear();
		Find(locator).sendKeys(textToWrite);
	}
	
	 public void selectFromDropdownByValue(String locator, String valueToSelect) {
		 Select dropDown = new Select (Find(locator));
		 dropDown.selectByValue(valueToSelect);
	 }
	 
	 public void selectFromDropdownByIndex(String locator, int valueToSelect) {
		 Select dropDown = new Select (Find(locator));
		 dropDown.selectByIndex(valueToSelect);
	 }
	 
	 public void selectFromDropdownByText(String locator, String valueToSelect) {
		 Select dropDown = new Select (Find(locator));
		 dropDown.selectByVisibleText(valueToSelect);
	 }
	 
	 public void hoverOverElement(String locator) {
		 action.moveToElement(Find(locator));
	 }	
	 
	 public void dobleClick(String locator) {
		 action.doubleClick(Find(locator));
	 }
	 
	 public void rightClick(String locator) {
		 action.contextClick(Find(locator));
	 }
	 
	 public String getValueFromTable(String locator, int row, int column){
	     String cellINeed = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
	     return Find(cellINeed).getText();
	 }

	 public void setValueOnTable(String locator, int row, int column, String stringToSend){
	     String cellToFill = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
	     Find(cellToFill).sendKeys(stringToSend);
	 }
	 
	 public void switchToiFrame(int iFrameIndex){
	     driver.switchTo().frame(iFrameIndex);
	 }
	 
	 public void switchToParentFrame(){
	     driver.switchTo().parentFrame();
	 }


	 public void dismissAlert(){
	     try{
	     driver.switchTo().alert().dismiss();
	     }catch(NoAlertPresentException e){
	         e.printStackTrace();
	     }
	 }
	   
	 public String textFromElement(String locator){
	     return Find(locator).getText();
	 }

	 public boolean elementEnabled(String locator){
	     return Find(locator).isEnabled();
	 }

	 public boolean elementIsDisplayed(String locator){
	     return Find(locator).isDisplayed();
	 }
	 
	 public boolean elementIsSelected(String locator){

		 return Find(locator).isSelected();
	 }

	 public List<WebElement> bringMeAllElements(String locator){
	     return driver.findElements(By.className(locator));
	 }	 
	 
}