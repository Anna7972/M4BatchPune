package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {
	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
