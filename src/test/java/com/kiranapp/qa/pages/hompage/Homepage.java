package com.kiranapp.qa.pages.hompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.kiranapp.qa.configuration.Config;
import com.kiranapp.qa.pages.BasePage;

public class Homepage extends BasePage {
	
	
	public Homepage(WebDriver driver, Config config) {
		super(driver,config);
		this.url=this.config.getProperty("app.baseurl");
	}
	
	public void waitPageLoad() {
		this.wait.until(ExpectedConditions.visibilityOf(this.signIn));
	}
	
	@FindBy(xpath="//div[@id = 'gc-custom-header-tool-bar-shop-menu']/button/span/span")
	protected WebElement shopTravel;
	
	@FindBy(xpath="//div[@id = 'gc-custom-header-nav-bar-acct-menu']/button/span/span")
	protected WebElement signIn;
	
	public WebElement shopTravelIcon() {
		return shopTravel;
	}
	
	public void clickSignInIcon() {
		this.wait.until(ExpectedConditions.visibilityOf(this.signIn));
		this.signIn.click();
	}
	
	public boolean signInIconIsVisible() {
		this.wait.until(ExpectedConditions.visibilityOf(this.signIn));
		return this.signIn.isDisplayed();
	}
}
