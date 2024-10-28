package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleChronologicalOrder {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suit");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method");
	}
	@Test
	public void TestSCript1() {
		System.out.println("Test Script1");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After TEst");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	@Test
	public void TestSCript2() {
		System.out.println("Test Script2");
	}
	

}
