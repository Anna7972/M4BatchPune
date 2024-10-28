package Task;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginProperty extends CrossBrowser {
	
	@BeforeMethod
	public static void beforeMethod() throws EncryptedDocumentException, IOException, InterruptedException {
		Properties prop=new Properties();
		Thread.sleep(1000);
		FileInputStream fis=new FileInputStream("../com.crm.AdvanceSeleniumM4/ConfigureFile/DwsLogin.properties");
	    prop.load(fis);
	    Thread.sleep(1000);	    
	    String email=prop.getProperty("email");
	    String pass=prop.getProperty("pass");
	    System.out.println(email);
	    System.out.println(pass);
	    driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
	}

}
