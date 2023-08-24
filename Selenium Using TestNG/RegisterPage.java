package com.simplilearn.CapstronProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	@FindBy(css="body > div:nth-child(2) > form > a")
	private WebElement register;
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(name="email")
	private WebElement email;
	

	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
	private WebElement registerbtn;	
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void registerPage()
	{
		register.click();
	}
	
	public void EnterName()
	{
		name.sendKeys("Bhumi");
	}
	
	public void EnterEmail() {
	   email.sendKeys("bhumi@gmail.com");
	}
	
	public void EnterPassword()
	{
		password.sendKeys("12345");
	}
	
	public void clickRegisterBtn()
	{
		registerbtn.click();
	}
}
