package com.bit.test;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class BaseTest {
	public WebDriver dr;
@Before
	public void openBrowser(DataTable arg) {
		List<List<String>> browsers = arg.asLists(String.class);
		String browser = browsers.get(0).get(0);
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SWEETY\\Downloads\\chromedriver_win32\\chromedriver.exe");
			dr = new ChromeDriver();

		} 
		else if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "");
			dr = new FirefoxDriver();
		}
else if(browser.equals("IE")) {
			
			System.setProperty("", "");
			
		}

	}
 @After
	public void closeBrowser() throws InterruptedException {
		dr.quit();
		Thread.sleep(3000);
	}
}
