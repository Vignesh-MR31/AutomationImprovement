package com.web.automation.tests;

import org.testng.annotations.Test;

import com.web.automation.base.Base;
import com.web.automation.pages.HomePage;

public class HomePageTests extends Base{
	
	@Test
	public void startTest() {
		HomePage homePage = new HomePage(driver);
		homePage.openMyAccountDropdown();
	}

}
