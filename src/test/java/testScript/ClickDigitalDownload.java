package testScript;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class ClickDigitalDownload extends DwsBaseClass {
	@Test
	public void testScript1() throws InterruptedException {
		System.out.println("Test Script1");
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		String parent = driver.getWindowHandle();
		List<WebElement> link = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		String rss = "https://demowebshop.tricentis.com/news/rss/1";
		for (WebElement web : link) {
			web.click();
			String actual_url = driver.getCurrentUrl();
			if(rss.equals(actual_url)) {
				driver.navigate().back();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		
		Set<String> childs = driver.getWindowHandles();
		for (String str : childs) 
		{
			driver.switchTo().window(str);
			
		}
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Thread.sleep(2000);		
		driver.switchTo().window(parent);
	}
	@Test
	public void testScript2() throws InterruptedException {
		System.out.println("Test Script2");
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(2000);
		List<WebElement> item = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (WebElement web : item) {
			web.click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		Thread.sleep(2000);
		List<WebElement> remove_cart = driver.findElements(By.xpath("//td[@class='remove-from-cart']"));
		for (WebElement web2 : remove_cart) {
			web2.click();
			Thread.sleep(2000);
		}
		driver.findElement(By.name("updatecart")).click();
	}
	
}
