package com.Day1.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenExample {
	@Test(dataProvider="getdata")
	public void Testcase(String Cname,String cpass) {
		System.out.println(Cname+" ------ "+cpass);
	}
	@DataProvider
	public Object [][] getdata(){
	Object obj[][]= {{"Name1","Pass1"},
			{"pawan","pass2"}
	};
return obj;
}
}
