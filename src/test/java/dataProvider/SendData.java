package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SendData {
	@Test(dataProvider = "login")
	public void senddata(String email, String password) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		}
		@DataProvider(name="login")
		public Object[][] provider(){
			Object[][] obj=new Object[3][2];
			obj[0][0]="marotip@gmail.com";
			obj[0][1]="Maroti@123";
			obj[1][0]="marotip1@gmail.com";
			obj[1][1]="Maroti@1234";
			obj[2][0]="anbs@gmail.com";
			obj[2][1]="anss";
			return obj ;
		}
	}

