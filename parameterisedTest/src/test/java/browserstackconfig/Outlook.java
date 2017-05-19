package browserstackconfig;



import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Outlook {

  WebDriver driver;
  @org.testng.annotations.Parameters({"browser","version","platform"})
	
	@Test(priority=1)
	void getDriver(String platform, String browser, String version) throws MalformedURLException
	{
		
		 driver = BrowserStack.config(platform, browser, version);
	}
	
	@Test(priority=2)
	  public void Ologin() throws InterruptedException
	  {
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          driver.get("http://www.outlook.com");
         /* driver.findElement(By.id("i0116")).sendKeys("balaji.koc@outlook.com");
          driver.findElement(By.id("i0118")).sendKeys("General1");
          Thread.sleep(5000);
          driver.findElement(By.id("idSIButton9")).click();
		   System.out.println("quit");*/
        Assert.assertEquals("Outlook.com - Microsoft free personal email", driver.getTitle());
		  
	  }
	
	 @AfterClass
	    void tearDown()
	    {
	    	driver.close();
	    }
	
}
