package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLogin {
	@FindBy(id = "username")
	public WebElement uname;
	@FindBy(id = "password")
	public WebElement pass;
	@FindBy(xpath = "//button[text()='Sign in']")
	public WebElement sign_in;
	public VtigerLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
}
