package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class CrossBrowser {
	
	public static WebDriver driver;
	@BeforeClass
	public static void browsers(String browser) {
		 if(browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
				
			}
			else if(browser.equalsIgnoreCase("Edge")) {
				driver=new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
	}
}
