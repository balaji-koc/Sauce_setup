package browserstackconfig;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrowserStack {
  
	
	public static final String USERNAME = "balajikoc1";
	public static final String AUTOMATE_KEY = "T6sFjzYUmP5Qtvy1Fkwy";
	public static final String URI = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	
	public static WebDriver config(String platform, String browser, String version) throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("browser", browser);
		caps.setCapability("browser_version", version);
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "7");
		caps.setCapability("resolution", "1024x768");
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("browserstack.video", "false");
		caps.setCapability("acceptSslCerts", "true");


		/*capability.setCapability("platform",platform);
	    capability.setCapability("browserName", browser);
	    capability.setCapability("browserVersion", version);*/
		
		WebDriver driver = new RemoteWebDriver(new URL(URI),caps);
		
		return driver;
		
	}
	
}
