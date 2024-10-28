package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadFromExcel {
	@Test
	public void login() throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream("C:\\Users\\marot\\OneDrive\\Desktop\\Automation\\Login1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	String email = sheet.getRow(0).getCell(0).toString();
	String password = sheet.getRow(0).getCell(1).toString();
	System.out.println(email);
	System.out.println(password);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
