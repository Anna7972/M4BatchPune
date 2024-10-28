package Exercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Programm6 {
	@Test(groups = "a")
	public void group1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);	
	}
	@Test(groups = "b")
	public void group2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);
	}
	@Test(groups = "c")
	public void group3() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(2000);
	}
	@Test(groups = "a")
	public void group4() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ktm.com/en-us.html");
		Thread.sleep(2000);
	}
	@Test(groups = "b")
	public void group5() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.royalenfield.com/in/en/home/");
		Thread.sleep(2000);
	}
	

}
