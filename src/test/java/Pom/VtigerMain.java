package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.Pom.VtigerLogin;

public class VtigerMain {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		VtigerLogin vt=new VtigerLogin(driver);
		vt.uname.sendKeys("admin");
		vt.pass.sendKeys("admin");
		vt.sign_in.click();
	}

}
