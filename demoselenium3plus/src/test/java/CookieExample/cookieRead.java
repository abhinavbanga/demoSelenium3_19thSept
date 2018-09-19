package CookieExample;

import java.io.BufferedWriter;		
import java.io.File;		
import java.io.FileWriter;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;		

public class cookieRead{	
    

    public static void main(String[] args)		
    {
    	WebDriver driver;	
        System.setProperty("webdriver.chrome.driver","//chromedriver.exe");					
		driver=new ChromeDriver();        
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
	
        driver.findElement(By.name("username")).sendKeys("abc123");							
        driver.findElement(By.name("password")).sendKeys("123xyz");							
        driver.findElement(By.name("submit")).click();					
   	
        File file = new File("Cookies.data");							
        try		
        {	  
          
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
          	 		
            for(Cookie ck : driver.manage().getCookies())							
            {			
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();             
            }			
            Bwrite.close();			
            fileWrite.close();	
            
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }		
    }		
}