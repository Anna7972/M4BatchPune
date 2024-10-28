package dataProvider;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProvideDataFromExcel {
	@Test(dataProvider = "login")
	public void sendFromExcel(String email, String password) throws InterruptedException  {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
			}
		
	     
	     @DataProvider(name="login")
	     public Object[][] provider() throws EncryptedDocumentException, IOException{
	    	FileInputStream fis=new FileInputStream("C:\\Users\\marot\\Downloads\\DataProvider.xlsx");
	 		Workbook wb=WorkbookFactory.create(fis);
	 		Sheet sheet=wb.getSheet("Sheet1");
	 	    String email1 = sheet.getRow(0).getCell(0).toString();
	 	    String pass1 = sheet.getRow(0).getCell(1).toString();
	 	   String email2 = sheet.getRow(1).getCell(0).toString();
	 	    String pass2 = sheet.getRow(1).getCell(1).toString();
	     Object[][] obj=new Object[2][2];
	     obj[0][0]=email1;
	     obj[0][1]=pass1;
	     obj[1][0]=email2;
	     obj[1][1]=pass2;
	     return obj;
	     }
	}


