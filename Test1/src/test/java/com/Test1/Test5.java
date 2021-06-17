package com.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test5 {

	public WebDriver driver= null;
	
	@BeforeMethod
	public void bookMyShow() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushils\\eclipse-workspace\\Test1\\target\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		
		//close popup
		driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")).click();
		
		//location set
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[3]/span")).click();
		WebElement ad= driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[3]/ul/li[2]/div"));
		WebElement ich=driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[3]/ul/li[548]/div"));
		act.dragAndDrop(ad, ich);
		Thread.sleep(3000);
		ich.click();
		Thread.sleep(5000);
		System.out.println("location set seccessfully done");
	}
	
	/*
	@Test(priority = 1)
	public void signin() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[1]/div/div/div/div[2]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/div/div[1]/div/div[3]/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("emailId")).sendKeys("shil7276@gmail.com");
		Thread.sleep(3000);
		//click continue
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/form/div[2]/button")).click();
		Thread.sleep(3000);
		
		System.out.println("signin is done");
	}
	
	@Test(priority = 2)
	public void moive() throws InterruptedException {
		
		//click movie 
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[1]")).click();
		System.out.println("movie click");
		
		//validation text
		String mv= driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[1]/h1")).getText();
		
		if(!mv.equalsIgnoreCase("Movies in Ichalkaranji")) {
			System.out.println("text is not present: "+mv);
		}
		else {
			System.out.println("text is present: "+mv);
		}
		
		//click stream
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[2]/header/div[2]/div/div/div/div[1]/div/a[2]")).click();
		System.out.println("stream click");
		//movie video library
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/a/div/div[2]")).click();
		
		System.out.println("stream is done");
		
		//click event
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[3]")).click();
		
		//validation event
		String ev=driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[1]/h1")).getText();
		
		if(!ev.equalsIgnoreCase("Events in Ichalkaranji")) {
			System.out.println("Text is not present: "+ev);
		}
		else {
			System.out.println("Text is present: "+ev);
		}
			
		//click plays
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[2]/header/div[2]/div/div/div/div[1]/div/a[4]")).click();
		Thread.sleep(3000);
		System.out.println("click plays");
		
		//validation plays
		String pl= driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[1]/h1")).getText();
		
		if(!pl.equalsIgnoreCase("Plays in Ichalkaranji")) {
			System.out.println("Text is not present: "+pl);
		}
		else {
			System.out.println("Text is present: "+pl);
		}
		
		//click sports
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[2]/header/div[2]/div/div/div/div[1]/div/a[5]")).click();
		System.out.println("click sports");
		
		String sp=driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[1]/h1")).getText();
		
		if(!sp.equalsIgnoreCase("Sports in Ichalkaranji")) {
			System.out.println("Text is not present: "+sp);
		}
		else {
			System.out.println("Text is present: "+sp);
		}
		
		//click activities
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[2]/header/div[2]/div/div/div/div[1]/div/a[6]")).click();
		System.out.println("click activities");
		
		//validation activities
		String ac=driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[1]/h1")).getText();
		
		if(!ac.equalsIgnoreCase("Activities in Ichalkaranji")) {
			System.out.println("Text is not present: "+ac);
		}
		else {
			System.out.println("Text is present: "+ac);
		}
		
		//click fanhood
		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[2]/header/div[2]/div/div/div/div[1]/div/a[7]")).click();
		System.out.println("click fanhood");
		Thread.sleep(3000);

	}
	*/
	@Test(priority = 3)
	public void buzz() throws InterruptedException {
		Actions act=new Actions(driver);
//		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[8]")).click();
//		Thread.sleep(3000);
//		System.out.println("click buzz");
		
		//list of show
//		driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[2]/div/a[1]")).click();
//		System.out.println("click list of show");
		
		//click corporate
		WebElement cp=driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[2]/div/a[2]"));
		cp.click();
		System.out.println("corporate click");
		
		//drag and drop
		WebElement rc= driver.findElement(By.xpath("//*[@id=\"bms-lead-form\"]/form/button"));
		act.dragAndDrop(cp, rc);
		Thread.sleep(3000);
		
		//sendkyes
		driver.findElement(By.xpath("//*[@id=\"0041733164219037944\"]")).sendKeys("Sushil");
		driver.findElement(By.xpath("//*[@id=\"bms-lead-form\"]/form/div[2]/label")).sendKeys("7499177484");
		driver.findElement(By.xpath("//*[@id=\"05765529238827789\"]")).sendKeys("sushils@infinite.com");
		driver.findElement(By.xpath("//*[@id=\"bms-lead-form\"]/form/div[4]/label")).sendKeys("Infinite");
		Thread.sleep(4000);
		System.out.println("all sendkyes work");
		
		//click offer
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[3]/div/div[2]/ul/li[3]/a")).click();
		System.out.println("click offer");
		Thread.sleep(3000);
		
	}
	@AfterMethod
	public void close() {
		//close the browser
		driver.close();
		System.out.println("browser is successfully closed");
	}
	
}
