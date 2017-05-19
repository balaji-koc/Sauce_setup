package browserstackconfig;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class GmailLogin {
  
	WebDriver driver;
	@org.testng.annotations.Parameters({"browser","version","platform"})
	@Test(priority=1)
	void getDriver(String platform, String browser, String version) throws MalformedURLException
	{
		
		 driver = BrowserStack.config(platform, browser, version);
		 
		 System.out.println("got the browser...");
	}
	    @Test(priority=2)
       public void glogin() throws InterruptedException
       {
	    	System.out.println("enter into glogin()");
    	   driver.get("http://www.gmail.com");
   		/*driver.findElement(By.name("Email")).sendKeys("balaji.koc@gmail.com");
   		driver.findElement(By.id("next")).click();
   		Thread.sleep(5000);
   		driver.findElement(By.id("Passwd")).sendKeys("General#@1");
   		System.out.println("attributes: "+driver.findElement(By.id("signIn")).getAttribute("id"));//usage of getAttribute()
   		driver.findElement(By.id("signIn")).click();
   	
   		Thread.sleep(7000);
   		
   		//Logout Steps
   		
   		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
   		driver.findElement(By.linkText("Sign out")).click();*/
   		Assert.assertEquals("Gmail", driver.getTitle());
       }
	    
	    @AfterClass
	    void tearDown()
	    {
	    	driver.close();
	    }
  
}
