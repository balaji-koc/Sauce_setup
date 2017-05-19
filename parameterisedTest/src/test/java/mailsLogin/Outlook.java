package mailsLogin;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Outlook {

  WebDriver driver;
	@Parameters({"browser"})
	@Test(priority=1)
	void getDriver(String browser)
	{
		BrowserFacory bf = new BrowserFacory();
		 driver = bf.getBrowser(browser);
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
          driver.close();
		  
	  }
	
}
