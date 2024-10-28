package TestCaseExecution4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoyalEnfield {
	@Test(groups = "smoke")
	public void royalEnfield() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.royalenfield.com/in/en/home/");
		Thread.sleep(2000);
		//driver.quit();
	}

}
