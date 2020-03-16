package com.kiranapp.qa.tests.functional;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.kiranapp.qa.pages.BasePage;
import com.kiranapp.qa.pages.hompage.Homepage;
import com.kiranapp.qa.tests.BaseTest;

public class BaseFunctionalTest extends BaseTest {
	protected WebDriver driver;
	protected Homepage homePage;

	@BeforeClass
	public void setup() throws IOException {
		super.setup();
		this.driver = this.getDriver();
		this.homePage = new Homepage(this.driver, config);

	}

	private WebDriver getDriver() {
		// TODO Auto-generated method stub
		
		if (config.getProperty("webdriver.browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Zip files testing\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (config.getProperty("webdriver.browser").contains("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
