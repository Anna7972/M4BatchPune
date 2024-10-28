 package com.crm.BaseClass;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class DwsBaseClass2 {
	public WebDriver driver=null;
	@BeforeClass
	public void preCondtion() {
	 Properties prop=new Properties();
	 prop.getProperty("browser");
	 prop.getProperty("url");
	 prop.getProperty("chrome");
	}
	@BeforeMethod
	public void Login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("marotip@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Maroti@123");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod
	public void LogOut() {
		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterClass
	public void PostCondition() {
		driver.quit();
	}


}
