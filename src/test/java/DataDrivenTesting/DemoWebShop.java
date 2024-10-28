package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\marot\\OneDrive\\Desktop\\Automation\\DwsLogin.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		String email = sheet.getRow(0).getCell(0).toString();
		String password = sheet.getRow(0).getCell(1).toString();
		System.out.println(email);
		System.out.println(password);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String expected_url = "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		if(expected_url.equals(driver.getCurrentUrl())) {
			Thread.sleep(2000);
			if(driver.findElement(By.linkText("Log in")).isDisplayed()) {
				driver.findElement(By.linkText("Log in")).click();
				driver.findElement(By.linkText("Log in")).click();
				driver.findElement(By.id("Email")).sendKeys(email);
				driver.findElement(By.id("Password")).sendKeys(password);
				driver.findElement(By.id("RememberMe")).click();
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				
			}
		}
		
		
	}

}
