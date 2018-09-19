package com.Day1.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basicAnnotations {
	@Test
	public void testcase() throws InterruptedException{
	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver", "C:\\Users\\a07208trng_b4a.04.28\\Downloads\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		
	}

}
