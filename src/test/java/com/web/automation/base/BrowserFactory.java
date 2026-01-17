package com.web.automation.base;

public class BrowserFactory{	
	
	public static Browser getBrowser(String BrowserType) {
		switch(BrowserType) {
		case "chrome":
			return new ChromeBrowser();
		case "edge":
			return new EdgeBrowser();
		default:
			return new ChromeBrowser();
		}
	}
	
}
