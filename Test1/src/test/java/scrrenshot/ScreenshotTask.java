package scrrenshot;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import project.Selenium1Test;

public class ScreenshotTask {

	public Properties pro = new Properties();
	public WebDriver driver=null;

	@Test(priority = 1)
	public void site() {
		
		try {
			
			InputStream input = new FileInputStream("C:\\Users\\sushils\\eclipse-workspace\\Test1\\src\\test\\java\\config\\config.properties");
			
			pro.load(input);
			Selenium1Test.browser = pro.getProperty("browser");
			System.out.println(Selenium1Test.browser);
			
			if(pro.getProperty("browser").contentEquals("Chrome")) {
				
				String web=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", web+"\\target\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				//url set
				driver.get(pro.getProperty("url1"));
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	@Test(priority = 2)
	public void screenshot() throws Exception {
		
		//Screenshot and store it has file format
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshot/sss.png"));
		
		//driver quite
		driver.quit();
		
	}
}
