package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.Pom.DwsLogin;

public class Login {
	@Test
	public void login() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/login");
	DwsLogin ref=new DwsLogin(driver);
	ref.email.sendKeys("marotip@gmail.com");
	ref.pass.sendKeys("Maroti@123");
	ref.login_button.click();
	}

}
