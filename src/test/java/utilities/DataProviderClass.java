package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class DataProviderClass extends SafeActions {
	public WebDriver driver;

	public DataProviderClass(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	@DataProvider(name ="LoginCredentials")
	public static  Object[][] LoginCredentials() {
		Object[][] loginCredentials = new Object[4][2];
		loginCredentials[0][0] = "admin";
		loginCredentials[0][1] = "admin123";
		loginCredentials[1][0] = "_ohrmSysAdmin_";
		loginCredentials[1][1] = "sysadmin";
		loginCredentials[2][0] = "linda";
		loginCredentials[2][1] = "linda.anderson";
		loginCredentials[3][0] = "kevin";
		loginCredentials[3][1] = "kevin.mathews";
		return loginCredentials;
	}
}
