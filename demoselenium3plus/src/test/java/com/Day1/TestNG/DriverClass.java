package com.Day1.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
	public static WebDriver getdriver(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome")) {
System.setProperty("webdriver.chrom.driver", "C:\\Users\\a07208trng_b4a.04.28\\Downloads\\chromedriver_win32");
	return new ChromeDriver();
	}
		return null;
	

}
}
