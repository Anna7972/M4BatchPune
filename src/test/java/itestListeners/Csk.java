package itestListeners;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(com.crm.listeners.Sample.class)
public class Csk {
	@Test
	public void csk() throws InterruptedException {
		String value1="mani";
		String value2="money";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);
		driver.quit();
		Reporter.log("csk",true);
//		/assertEquals(value1, value2);
			
	}
	@Test(dependsOnMethods = "csk")
	 public void rcb() throws InterruptedException {
		String value1="mani";
		String value2="money";
		  WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.royalchallengers.com/");
			Thread.sleep(2000);
			assertEquals(value1, value2);
			driver.quit();
	  }
}
