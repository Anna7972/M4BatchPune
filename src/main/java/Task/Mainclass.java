package Task;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Mainclass {
	public static WebDriver driver;
	@Test
	public static void execution() throws EncryptedDocumentException, IOException, InterruptedException {
		PreConditionClass.preContition();
		LoginProperty.beforeMethod();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
	}

}
