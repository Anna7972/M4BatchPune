package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperMethod2 {
	@Test(priority = 105,invocationCount = 2)
	public void dws() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(priority = 'b',invocationCount = 3)
	public void csk() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}
	@Test(priority = 'a',invocationCount = 2)
  public void rcb() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(2000);
		
  }

}
