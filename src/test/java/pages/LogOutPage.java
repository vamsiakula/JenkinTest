package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import utilities.Log;
import utilities.SafeActions;

public class LogOutPage extends SafeActions {
	public WebDriver driver;

	public LogOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}



	public void userLogOut() throws InterruptedException {
		WebElement arrow = driver.findElement(By.xpath("//*[text()='keyboard_arrow_down']"));
		Log.info("Arrow button is clicked");
		safeClick(arrow, 10);
		WebElement logout = driver.findElement(By.xpath("//*[text()='Logout']"));
		Log.info("Logout button is clicked");
		safeClick(logout, 10);
	}


}