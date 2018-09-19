package com.Day1.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class project2 {
	
	@Test(priority=3)
	public void Testcasee() {
		
		System.out.println("123");
	}
	@BeforeClass
	public void abcd() {
		System.out.println("1st");
	}
	@BeforeSuite
	public void awbcd() {
		System.out.println("211st");
	}
	@AfterClass
	public void abcde() {
		System.out.println("56412");
	}
	@Test(priority=1)
	public void Testcase() {
		
		System.out.println("12333");
	}
	@BeforeMethod
	public void openBroeser() {
		System.out.println("opening");
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("output");
	}

}
