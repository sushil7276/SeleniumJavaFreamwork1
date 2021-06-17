package com.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 {

public WebDriver driver = null;
	
	@BeforeMethod
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushils\\eclipse-workspace\\Test1\\target\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://ultimateqa.com/");
		driver.manage().window().maximize();
		
		System.out.println("site is open");
	}
	
	@Test(priority = 1)
	public void course() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"menu-home-page-menu\"]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/section/div/ul/li[1]/a/header/img")).click();
		
		//sign IN
		driver.findElement(By.xpath("/html/body/header/div/div/section[1]/ul/li/a")).click();
		driver.findElement(By.id("user[email]")).sendKeys("shil7276@yahoo.in");
		driver.findElement(By.id("user[password]")).sendKeys("123456789");
		Thread.sleep(5000);
		
		//close browser
		driver.close();
		System.out.println("course operation is done");
	}
	
	
	@Test(priority = 2)
	public void SeleniumJava() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"menu-home-page-menu\"]/li[2]/a")).click();
		
		//drag and drop
		Actions act=new Actions(driver);
		WebElement lastLine= driver.findElement(By.xpath("//*[@id=\"et-boc\"]/div/div/div[7]/div[2]/div[1]/div[24]/a"));
		WebElement firstLine= driver.findElement(By.xpath("//*[@id=\"et-boc\"]/div/div/div[1]/div/div[1]/div[1]/div/h1"));
		act.dragAndDrop(firstLine, lastLine);
		Thread.sleep(5000);
		lastLine.click();
		
		//close browser
		driver.close();
		System.out.println("selenium java operation done");
	}
	

	@Test(priority = 3)
	public void seleniumC() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"menu-home-page-menu\"]/li[3]/a")).click();
		
		//click start now
		Actions act=new Actions(driver);
		WebElement start=driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[9]/div/div/article/section/a"));
		WebElement first=driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/article/header/h2"));
		act.dragAndDrop(first, start);
		Thread.sleep(3000);
		start.click();
		
		//send keys 
		driver.findElement(By.id("user[first_name]")).sendKeys("Sushil");
		driver.findElement(By.id("user[last_name]")).sendKeys("Babar");
		driver.findElement(By.id("user[sign-up][email]")).sendKeys("shil7276@yahoo.in");
		driver.findElement(By.id("user[password]")).sendKeys("123456789");
		Thread.sleep(3000);
		
		//close browser
		driver.close();
		System.out.println("selenium c# operation is done");		
		
	}
	
	@Test(priority = 4)
	public void seleniumR() throws InterruptedException {
		Actions act=new Actions(driver);
		WebElement se=driver.findElement(By.xpath("//*[@id=\"menu-home-page-menu\"]/li[4]/a"));
		se.click();
		WebElement es=driver.findElement(By.xpath("//*[@id=\"comment-608\"]/a"));
		
		act.dragAndDrop(se, es);
		Thread.sleep(3000);
		es.click();
			
		
		//close browser
		driver.close();
		System.out.println("seleniumR is done");
	}	
	
	@Test(priority = 5)
	public void AE() {
		driver.findElement(By.xpath("//*[@id=\"menu-home-page-menu\"]/li[5]/a")).click();
		//click fake landing page
		driver.findElement(By.xpath("//*[@id=\"post-507\"]/div/div[1]/div/div[2]/div/div[1]/div/div/div/div/ul/li[2]/a")).click();
		
		//click view course
		driver.findElement(By.xpath("//*[@id=\"post-4816\"]/div/div[1]/div/div[1]/div/div[1]/div[3]/a")).click();
		
		//close browser
		driver.close();
		System.out.println("ae is done");
	}
	
	@Test(priority = 6)
	public void blog() throws InterruptedException {
		WebElement ss=driver.findElement(By.xpath("//*[@id=\"menu-home-page-menu\"]/li[6]/a"));
		ss.click();
		Actions act=new Actions(driver);
		//click 7 EXTREMELY USEFUL SELENIUM JAVASCRIPT COMMANDS
		WebElement ee=driver.findElement(By.xpath("//*[@id=\"post-216561\"]/div[1]/a/img"));
		act.dragAndDrop(ss, ee);
		Thread.sleep(3000);
		ee.click();
		Thread.sleep(3000);
		
		//click 7 7 – Testing sessionStorage
		driver.findElement(By.xpath("//*[@id=\"lpwtoc_widget-2\"]/div/div/div[2]/div/div[7]/a/span[2]")).click();
		Thread.sleep(3000);
		
		//close
		driver.close();
		System.out.println("blog is done");
	}
	
	
	@Test(priority = 7)
	public void search() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"header-sec\"]/div/div/div/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"header-sec\"]/div/div/div/div/div[3]/div/form/input")).sendKeys("python");
		Thread.sleep(5000);
		
		//close browser
		driver.close();
		System.out.println("search is done");
	}
	
	@Test(priority = 8)
	public void check() {
		
	}
}
