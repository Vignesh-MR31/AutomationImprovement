package com.web.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory implements Browser{
	public WebDriver driver;

	@Override
	public WebDriver getBrowser(String browserType) {
		switch(browserType) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			driver = new ChromeDriver();
			break;
		}
		return driver;
	}

}
