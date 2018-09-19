package com.Day1.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class webElement {
	@Test
	public void testcase1() throws InterruptedException{

	System.setProperty("webdriver.chrom.driver", "C:\\Users\\a07208trng_b4a.04.28\\Downloads\\chromedriver_win32");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
driver.findElement(By.xpath("<button class=\"_2AkmmA _29YdH8\">✕</button>")).click();
Thread.sleep(2000);
WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input"));
Thread.sleep(2000);
WebElement searchbutton=driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[2]/button/svg"));
Thread.sleep(2000);
searchbox.sendKeys("shoes");
Thread.sleep(2000);
searchbutton.click();
	}
}
