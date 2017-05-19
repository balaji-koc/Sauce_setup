package sauselabs;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceConfig {
	
	  public static final String USERNAME = "balaji_koc";
	  public static final String ACCESS_KEY = "a989db5e-31c9-4347-8435-58ea867d0fbb";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
	public static WebDriver config(String browser, String os, String browVer) throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("platform", os);
	    caps.setCapability("version", browVer);
	    caps.setBrowserName(browser);
	    
	 
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    
	    return driver;
		
	}

}
