package com.kiranapp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kiranapp.qa.configuration.Config;

public class BasePage {
	protected WebDriver driver = null;
	protected WebDriverWait wait = null;
	protected Config config;
	protected String url;
	
	public BasePage(WebDriver driver, Config config) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, 25);
		this.config=config;
		PageFactory.initElements(this.driver, this);
	}
	
	public void get() {
		this.driver.get(this.url);
	}
	
	public void getCurrentUrl() {
		this.driver.getCurrentUrl();
	}
}
