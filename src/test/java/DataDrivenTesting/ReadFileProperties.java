package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadFileProperties {
	@Test
	public void Login() throws IOException, InterruptedException {
		Properties prop=new Properties();
		Thread.sleep(1000);
		FileInputStream fis=new FileInputStream("../com.crm.AdvanceSeleniumM4/ConfigureFile/DwsLogin.properties");
	    prop.load(fis);
	    Thread.sleep(1000);
	    String browser=prop.getProperty("browser");
	    String url=prop.getProperty("url");	    
	    String email=prop.getProperty("email");
	    String pass=prop.getProperty("pass");
	    System.out.println(browser);
	    Thread.sleep(1000);
	    System.out.println(url);
	    Thread.sleep(1000);
	    System.out.println(email);
	    Thread.sleep(1000);
	    System.out.println(pass);
	
	}

}
