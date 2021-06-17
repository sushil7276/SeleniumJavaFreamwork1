package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {
	
	public WebDriver driver= null;
	
	@Test(priority = 1)
	public void site() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushils\\eclipse-workspace\\Test1\\target\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
