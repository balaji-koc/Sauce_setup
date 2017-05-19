package mailsLogin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class YahooLogin {
	
	
	WebDriver driver;
	@Parameters({"browser"})
	@Test(priority=1)
	void getDriver(String browser)
	{
		BrowserFacory bf = new BrowserFacory();
		 driver = bf.getBrowser(browser);
	}
	
	@Test(priority=2)
  public void Ylogin() throws IOException, InterruptedException
  {
	  
		
		
		driver.get("http://www.yahoomail.com");
		
		/*String l= br.readLine();
		String p[]=l.split(",");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("login-username")).sendKeys(p[0]);
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/main/div/div[1]/div[1]/div[1]/div[2]/fieldset/form/div[3]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-passwd")).sendKeys(p[1]);
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/main/div/div[1]/div[1]/div[1]/div[2]/fieldset/form/div[3]/button")).click();
		Thread.sleep(10000);
		boolean y = driver.findElement(By.xpath("html/body/div[9]/div[3]/div[3]/div/ul/li/button")).isDisplayed();
		
		if(y)
		{
			System.out.println("Yahoo mail :"+y);
		 bw.write("Yahoo test Passed");
		 bw.newLine();
		}
		
		
		
		 bw.close();
		 fw.close();
		 br.close();
		 fr.close();*/
		driver.close();
	  
  }
}
