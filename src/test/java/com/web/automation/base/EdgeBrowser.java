package com.web.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser implements Browser{

	@Override
	public WebDriver getDriver() {
		return new EdgeDriver();
	}

}
