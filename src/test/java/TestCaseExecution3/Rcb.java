package TestCaseExecution3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rcb {
	@Parameters("url")
	@Test(groups = "smoke")
	  public void rcb(String url) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
			Thread.sleep(2000);
//			driver.quit();
	  }

}
