package Task;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PreConditionClass  extends CrossBrowser {
	@BeforeClass
	public static void preContition() {
		browsers("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String expectedurl = "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		String actualurl=driver.getCurrentUrl();
		driver.findElement(By.linkText("Log in")).click();
		assertEquals(actualurl, expectedurl);
		System.out.println(actualurl);
	}
	

}
