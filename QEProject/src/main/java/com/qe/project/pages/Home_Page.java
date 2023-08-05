package com.qe.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qe.project.base.TestBase;

public class Home_Page extends TestBase{

	@FindBy(xpath = "//*[contains(text(),'Unauthorized')]")
	WebElement UnauthorizedErrorMessage;

	// Initilization
	public Home_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean unauthErrorMsgIsPresent() {
		return UnauthorizedErrorMessage.isDisplayed();
	}

}
