package TDD;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelTest.TaskExel;
import page_factory.PageTask;

public class WordpressLogin {
	
	public WebDriver driver = null;
	static Properties prop = new Properties();
	
	public void set() throws Exception {
		
		InputStream input = new FileInputStream("C:\\Users\\sushils\\eclipse-workspace\\Test1\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		
	}
	
	@Test(dataProvider="wordpress")
	public void login(String uid,String pass) throws Exception {
		
		set();
		
		//set driver
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\target\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url2"));
		
		/*
		driver.findElement(By.id("usernameOrEmail")).sendKeys(uid);
		driver.findElement(By.xpath("//*[@id=\\\"primary\\\"]/div/main/div/div/form/div[1]/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\\\"primary\\\"]/div/main/div/div/form/div[1]/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		*/
		

		PageTask login_page = PageFactory.initElements(driver, PageTask.class);
		
		login_page.login_wordpress(uid,pass);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
//		Assert.assertTrue(driver.getTitle().contains("Dashbord"),"User is not able to login - Invalid Credentils");
//		System.out.println("Page Title verified - user is able to login Successfully");
		
		//close browser
		driver.close();
	
	}
	
	
	@DataProvider(name="wordpress")
	public Object[][] passData() throws Exception {
		
		set();
		//set excel sheet
		TaskExel config = new TaskExel(prop.getProperty("exelurl"));
		
		int row = config.getRowCount(0);
		
		Object[][] data = new Object[row][2];
		
		for(int i=0; i<row; i++) {
			
			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
		}
		
		return data;
	}

}
