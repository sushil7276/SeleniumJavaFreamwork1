package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.PropertiesFile;

public class Selenium1Test {
	
	public static String browser;
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		//setBrowser();
		PropertiesFile.readProperties();
		setBrowserConfig();
		runTest();
		PropertiesFile.writeProperties();		
	}
	
	public static void setBrowser() {
	
		browser = "Chrome";
		
	}
	
	public static void setBrowserConfig() {
		
		if(browser.contains("Chrome")) {
			
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\target\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		
	}

	public static void runTest() {

		driver.get("https://www.selenium.dev/");
		driver.quit();
		
	}
	
}
