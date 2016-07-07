package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	private WebDriver driver;
	By usernameLocator = By.id("username");
	By passwordLocator = By.id("password");
	By submitButton = By.cssSelector("button");
	By successMessageLocator = By.cssSelector(".flash.success");
 
	//constructor that will run whenever a new instance of the class is created
	public Login(WebDriver driver) {
		this.driver = driver;
		driver.get("http://the-internet.herokuapp.com/login");
	}
 
	//core functionality of the login page (fills in the login form and submits it)
	 public void with(String username, String password) {
		 driver.findElement(usernameLocator).sendKeys(username);
		 driver.findElement(passwordLocator).sendKeys(password);
		 driver.findElement(submitButton).click();
	 }
	 
	 //display check from earlier that was used in our assertion 
	 public Boolean successMessagePresent() {
		 return driver.findElement(successMessageLocator).isDisplayed();
	 }
}