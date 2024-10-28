package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
	@Test
	public void main() {
		System.out.println("Open the browser");
		WebDriver driver=new ChromeDriver();
		
	}

}
