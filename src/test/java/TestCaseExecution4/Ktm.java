package TestCaseExecution4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ktm {
	@Test(groups = "regression")
	public void ktm() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ktm.com/en-us.html");
		Thread.sleep(2000);
		//driver.quit();
	}

}
