package sauselabs;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GamilLogin {
	WebDriver driver;
	@Test
	@Parameters({"browser", "os", "browVer"})
   public void  login(String browser, String os, String browVer) throws MalformedURLException, InterruptedException {
	  
	  driver = SauceConfig.config(browser,os,browVer);
	  driver.get("http://newtours.demoaut.com/");
	  Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
	  Thread.sleep(5000);
	  System.out.println("title of page is: " + driver.getTitle());
	  driver.close();
  }
  
 
}
