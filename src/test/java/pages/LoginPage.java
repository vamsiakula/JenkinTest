package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import utilities.Log;
import utilities.SafeActions;

public class LoginPage extends SafeActions {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public void verifyLoginPage(){
		WebElement welcomeNote=driver.findElement(By.xpath("//*[text()='OrangeHRM Demo']"));
		Log.info("Login Page of Orange HRM is displayed.");
		welcomeNote.isDisplayed();
		System.out.println("Login Page of Orange HRM is displayed");
	}


	public void userLogin(String Username,String Password) throws InterruptedException {
		WebElement username=driver.findElement(By.cssSelector("[name='txtUsername']"));
		username.clear();
		Log.info("Enter username:"+Username+"");
		safeSendKeys(username,Username);
		WebElement password=driver.findElement(By.cssSelector("[name='txtPassword']"));
		password.clear();
		Log.info("Enter password:"+Password+"");
		safeSendKeys(password,Password);
		Log.info("Login credentails are provided");
		WebElement login=driver.findElement(By.cssSelector("[name='Submit']"));
		safeClick(login,10);
		Log.info("Login button is clicked");
	}

}