package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DwsBaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void preCondtion() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");	
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
