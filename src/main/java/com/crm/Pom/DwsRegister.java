package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsRegister {
	@FindBy(id  = "gender-male")
	public WebElement gender;
	@FindBy(id = "FirstName")
	public WebElement Firstname;
	@FindBy(id = "LastName")
	public WebElement lastname;
	@FindBy(id = "Email")
	public WebElement emial;
	@FindBy(id = "Password")
	public WebElement pass;
	@FindBy(id = "ConfirmPassword")
	public WebElement conPass;
	@FindBy(id = "register-button")
	public WebElement register;
	public DwsRegister(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

}
