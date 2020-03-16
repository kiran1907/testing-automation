package com.kiranapp.qa.tests.functional.hompage;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kiranapp.qa.pages.hompage.Homepage;
import com.kiranapp.qa.tests.functional.BaseFunctionalTest;

public class HomePageTest extends BaseFunctionalTest {

	Homepage homePage;
	
	@BeforeClass
	public void setup() throws IOException {
		super.setup();
	    this.homePage = new Homepage(this.driver, config);
	}
	
	@Test
	public void testNavigateToHomePage() {
		
		this.homePage.get();
		this.homePage.waitPageLoad();
		Assert.assertTrue(this.homePage.signInIconIsVisible(),"Sign In Icon should be visible");
	}
	
}
