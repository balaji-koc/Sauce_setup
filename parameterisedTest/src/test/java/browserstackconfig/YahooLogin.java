package browserstackconfig;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class YahooLogin {
	
	
	WebDriver driver;
	@org.testng.annotations.Parameters({"browser","version","platform"})
	@Test(priority=1)
	void getDriver(String platform, String browser, String version) throws MalformedURLException
	{
		
		 driver = BrowserStack.config(platform, browser, version);
	}
	
	@Test(priority=2)
  public void Ylogin() throws IOException, InterruptedException
  {
	  
		
		
		driver.get("http://www.yahoomail.com");
		
		
		Assert.assertEquals("Yahoo - login", driver.getTitle());
	  
  }
	 @AfterClass
	    void tearDown()
	    {
	    	driver.close();
	    }
}
