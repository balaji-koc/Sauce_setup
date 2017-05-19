package mailsLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

  public class  BrowserFacory {
	
	
	public WebDriver driver;

	public  WebDriver getBrowser(String browser)
	{
	    
		System.out.println("In static method :"+browser);
		if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "G://Selenim_Learn//ActiTime//src//main//resources//browsers//chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("Interner Explorer"))
		{
			System.setProperty("webdriver.ie.driver", "G://Selenim_Learn//ActiTime//src//main//resources//browsers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
			
		return driver;
	}
	

}
