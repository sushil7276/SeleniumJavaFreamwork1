package project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	public WebDriver driver = null;
	
	@BeforeMethod
	public void site() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushils\\eclipse-workspace\\Test1\\target\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(8000);
	}
	
	@Test
	public void search() throws InterruptedException {
		//searching
		driver.findElement(By.name("q")).sendKeys("testng");
		Thread.sleep(5000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(8000);
		
	}
	
	@AfterMethod
	public void close() {
		
		//close browser
		driver.close();
	}

}
