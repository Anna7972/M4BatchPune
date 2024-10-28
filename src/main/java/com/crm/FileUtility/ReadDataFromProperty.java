package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromProperty {
	@Test
	public static void Login() throws IOException {
		String url = PropertyFile.method1("url");
		System.out.println(url);
		String email=PropertyFile.method1("email");
		System.out.println(email);
		String pass=PropertyFile.method1("password");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(pass);
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();

		
	}
}
