package Exercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Programm3 {
	@Test(priority =2)
	public void helper1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}
	@Test(priority = 'b')
	public void rcb() throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.royalchallengers.com/");
			Thread.sleep(2000);
			driver.quit();
	  }
	@Test(priority = 'v')
	public void dws() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
