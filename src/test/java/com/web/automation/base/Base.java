package com.web.automation.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public WebDriver driver;
	Browser browser;
	String browserType = "edge";
	
	@BeforeMethod
	public void OpenBrowser() {
		browser = new BrowserFactory();
		driver = browser.getBrowser(browserType);
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	}

}
