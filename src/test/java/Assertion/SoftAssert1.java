package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	@Test
	public void softAssertMethod() {
		String expectedurl = "https://demowebshop.tricentis.com/";
		//String expectedurl = "https://demowebshop.tricentis.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demowebshop.tricentis.com/");
	    String actualurl = driver.getCurrentUrl();
	    SoftAssert soft=new SoftAssert();
	    soft.assertEquals(expectedurl, actualurl);
	    driver.findElement(By.id("small-searchterms")).sendKeys("watch");
	    WebElement search = driver.findElement(By.cssSelector("input[type='submit']"));
	    soft.assertTrue(search.isEnabled());
	    search.click();
	    //soft.assertAll();
	    
	}
}
