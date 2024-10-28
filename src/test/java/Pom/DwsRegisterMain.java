package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.Pom.DwsRegister;


public class DwsRegisterMain {
	@Test
	public void reguster() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/register");
		DwsRegister reg=new  DwsRegister(driver);
		reg.gender.click();
		reg.Firstname.sendKeys("admin");
		reg.lastname.sendKeys("admin");
		reg.emial.sendKeys("admin01@gmail.com");
		reg.pass.sendKeys("Admin01");
		reg.conPass.sendKeys("Admin01");
		reg.register.click();
	}

}
