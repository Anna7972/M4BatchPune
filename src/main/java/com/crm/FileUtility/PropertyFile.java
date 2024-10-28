
package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {
	public static String  method1(String key) throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("../com.crm.AdvanceSeleniumM4/FactoryMethodProperties/Data.properties");
		System.out.println(fis);
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
		
	}

}
