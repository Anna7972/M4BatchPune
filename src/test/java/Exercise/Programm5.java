package Exercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Programm5 {
	@Test(threadPoolSize = 5, enabled = true)
	public void threadPoolSize() throws InterruptedException {
			  WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.royalchallengers.com/");
				Thread.sleep(2000);
				driver.quit();  
	}
	@Test(threadPoolSize = 3, enabled = false)
	public void invocationCount2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);	
	}
	@Test(threadPoolSize = 2, enabled = true)
	public void innovacationCount() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);	
}

}
