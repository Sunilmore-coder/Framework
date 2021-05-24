package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver)

	{
		this.driver = ldriver;
	}

	@FindBy(name = "email")
	WebElement emailid;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(xpath = "//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")
	WebElement LoginButton;

	public void LogintoCRM(String emailApplication, String passwordApplication) {
		emailid.sendKeys(emailApplication);
		pass.sendKeys(passwordApplication);
		LoginButton.click();
	}
}
