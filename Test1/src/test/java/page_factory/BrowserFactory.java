package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver StartBrowser(String name,String url) {
		
		if(name.equals("chrome")) {
			
			String projectLocation = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectLocation+"\\target\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}

}
