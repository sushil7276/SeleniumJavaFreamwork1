package testTrip;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import groovy.time.BaseDuration.From;
import project.Selenium1Test;



public class ValidationTrip {

	public WebDriver driver = null;
	static Properties prop = new Properties();

	public void file() throws Exception {

		InputStream input = new FileInputStream("C:\\Users\\sushils\\git\\SeleniumJavaFreamwork1\\Test1\\src\\test\\java\\config\\config.properties");
		prop.load(input);

	}

	public void DriverSet() throws Exception {

		file();

		Selenium1Test.browser = prop.getProperty("browser");
		System.out.println(Selenium1Test.browser);

		if(prop.getProperty("browser").contentEquals("Chrome")) {

			String web=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", web+"\\target\\chromedriver.exe");
			driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();

			//url set
			driver.get(prop.getProperty("url1"));

			//implicit wait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}

	@Test(priority = 1)
	public void Test() throws Exception {

		DriverSet();


		SetLinks t = PageFactory.initElements(driver, SetLinks.class);


		// From side setting

		t.from.click();
		Thread.sleep(3000);
		//		t.from.sendKeys("Kolkata");

		//		driver.findElement(By.id("fromCity")).click();

		List<WebElement> dynamicList = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));

		for(int i=0; i<dynamicList.size(); i++) {

			String text = dynamicList.get(i).getText();
			System.out.println("Text is"+text);

			if(text.contains("Kolkata")) {

				dynamicList.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void TO() throws Exception {

		//To side setting
		
		SetLinks t = PageFactory.initElements(driver, SetLinks.class);

		t.to.click();
		Thread.sleep(3000);
		t.to.sendKeys("Bengaluru");

		List<WebElement> d = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));

		for(int i=0; i<d.size(); i++) {

			String text = d.get(i).getText();
			System.out.println("Text is"+text);

			if(text.contains("Bengaluru")) {

				d.get(i).click();
				break;
			}
		}
	}
	
	public void search() {
		
		SetLinks t = PageFactory.initElements(driver, SetLinks.class);

		t.search.click();
	}

}
