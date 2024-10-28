package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromExcelAndPropertiesFile {
	@Test
	public void fileandProperty() throws IOException {
		Properties prop=new Properties();
		FileInputStream propfis=new FileInputStream("../com.crm.AdvanceSeleniumM4/ConfigureFile/Commondata.properties");
		prop.load(propfis);
		String browser=prop.getProperty("browser");
		ChromeDriver driver=new ChromeDriver();
		driver.get(browser);
	    String url=prop.getProperty("url");
	    driver.get(url);
	    FileInputStream excelfis=new FileInputStream("C:\\Users\\marot\\OneDrive\\Desktop\\Automation\\Login1.xlsx");
	    Workbook wb=WorkbookFactory.create(excelfis);
	    Sheet sheet = wb.getSheet("Sheet1");
		String email = sheet.getRow(0).getCell(0).toString();
		String password = sheet.getRow(0).getCell(1).toString();
		System.out.println(email);
		System.out.println(password);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();	
	}
}
