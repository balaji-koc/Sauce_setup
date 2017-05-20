import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Dummy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.mail.yahoo.com");
		Thread.sleep(5000);
		System.out.println("Title :"+driver.getTitle());
		
		
	}

}
