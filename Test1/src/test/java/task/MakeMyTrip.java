package task;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import project.Selenium1Test;


public class MakeMyTrip {
	
	public Properties pro = new Properties();
	public WebDriver driver = null;
	
	@Test(priority = 1)
	public void site() {
		
		try {
			
			InputStream input = new FileInputStream("C:\\Users\\sushils\\git\\SeleniumJavaFreamwork1\\Test1\\src\\test\\java\\config\\config.properties");
			
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
	public void set() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[5]")).click();
		
		//from set
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("kolkata");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[2]")).click();
		System.out.println("from set");
		
		//to set
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("bengaluru");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
		System.out.println("to set");
		
		
	}
	
	@Test(priority = 3)
	public void dateset() throws InterruptedException {
		
		//date set
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/label")).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				System.out.println("date click");
				
				List<WebElement> date=driver.findElements(By.xpath("//div[@class='DayPicker-Body']"));
				int t_node=date.size();
				
				for(int i=0;i<t_node;i++) {
					
					String dates=date.get(i).getText();
					
					if(dates.equalsIgnoreCase("16")) {
						
						date.get(i).click();
						break;
					}
				}
		
	}

	@Test(priority = 4)
	public void sitSet() throws InterruptedException {
		
		//sit set
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/div[2]/div[2]/button")).click();
		Thread.sleep(3000);
		
		//search click
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/p/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
}
