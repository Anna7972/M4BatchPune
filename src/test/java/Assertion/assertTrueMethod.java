package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assertTrueMethod {
	public class HardAssert {
		@Test
		public void hardAssert() {
			String expectedurl = "https://demowebshop.tricentis.com/";
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://demowebshop.tricentis.com/");
		    String actualurl = driver.getCurrentUrl();
		    assertEquals(expectedurl, actualurl);
		    driver.findElement(By.id("small-searchterms")).sendKeys("watch");
		    WebElement search = driver.findElement(By.cssSelector("input[type='submit']"));
		    assertTrue(search.isEnabled());
		    search.click();
		  
		  
		  
		}

	}


}
