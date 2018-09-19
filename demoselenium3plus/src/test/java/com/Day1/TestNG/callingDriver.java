package com.Day1.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class callingDriver {
	WebDriver driver;
	String browser="chrome";
	@BeforeMethod
	public void openbrowser() throws InterruptedException {
		driver=DriverClass.getdriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
@Test
public void test() {
	System.out.println("this is the test");
}
@AfterMethod
public void closebrowser() {
	driver.close();
}
}
