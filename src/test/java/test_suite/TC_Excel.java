package test_suite;

import base.BrowserSetUp;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LogOutPage;
import pages.LoginPage;
import sun.tools.jar.Main;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class TC_Excel extends BrowserSetUp  {
	public static XSSFSheet excelSheet;
	public static XSSFCell cell;

	@Test

	public void login() throws IOException, InterruptedException {

		openApplication("https://orangehrm-demo-6x.orangehrmlive.com/symfony/web/index.php/auth/login");
		LoginPage loginPage = new LoginPage(driver);
		LogOutPage logOutPage=new LogOutPage(driver);
		loginPage.verifyLoginPage();

		String Username=null;
		String Password=null;

		File file = new File("TestData/Login Credentials of ORANGE_HRM.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet testData = workbook.getSheetAt(0);
		for (int i = 0; i <= testData.getLastRowNum(); i++) {
			Username = testData.getRow(i).getCell(0).getStringCellValue();
			Password = testData.getRow(i).getCell(1).getStringCellValue();
			loginPage.userLogin(Username, Password);
			logOutPage.userLogOut();
		}

	}

}

