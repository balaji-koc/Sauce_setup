package mailsLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class GmailLogin {
  
	WebDriver driver;
	@Parameters({"browser"})
	@Test(priority=1)
	void getDriver(String browser)
	{
		BrowserFacory bf = new BrowserFacory();
		 driver = bf.getBrowser(browser);
	}
	    @Test(priority=2)
       public void glogin() throws InterruptedException
       {
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
   		driver.close();
       }
  
}
