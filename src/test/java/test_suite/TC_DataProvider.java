package test_suite;

import base.BrowserSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.DataProviderClass;


import java.io.IOException;


public class TC_DataProvider extends BrowserSetUp  {

	@Test(dataProvider="LoginCredentials",dataProviderClass= DataProviderClass.class)
	public void login(String Username,String Password) throws IOException, InterruptedException {

		openApplication("https://orangehrm-demo-6x.orangehrmlive.com/symfony/web/index.php/auth/login");

		LoginPage loginPage=new LoginPage(driver);
		loginPage.verifyLoginPage();
		loginPage.userLogin(Username, Password);


	}

}
