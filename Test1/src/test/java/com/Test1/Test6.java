package com.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test6 {
	
public WebDriver driver = null;
	
	
	@Test(priority = 1)
	public void Test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushils\\eclipse-workspace\\Test1\\target\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test(priority = 2)
	public void Selenium() throws InterruptedException {
		
		//selenium java valid text
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[2]/ul/li[1]/a")).click();
		
		String selenium = driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		
		if(!selenium.equalsIgnoreCase("Selenium Tutorials")) {
			System.out.println("selenium java is not present: "+selenium);
		}
		else {
			System.out.println("selenium java is present: "+selenium);
		}
		Thread.sleep(3000);
		
		//selenium python valid text
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[2]/ul/li[2]/a")).click();
		
		String python= driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		
		if(!python.equalsIgnoreCase("Selenium Tutorials with Python")) {
			System.out.println("python text is not present: "+python);
		}
		else {
			System.out.println("python text is present: "+python);
		}
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 3)
	public void TestNG() throws InterruptedException {
		
		//TestNG valid text
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[3]/a")).click();
		
		String ng=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		
		if(!ng.equalsIgnoreCase("TestNG Tutorials")) {
			System.out.println("TestNG text is not present: "+ng);
		}
		else {
			System.out.println("TestNG text is present: "+ng);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	public void maven() throws InterruptedException {
		
		//maven valid text
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[4]/a")).click();
		String ma=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		
		if(!ma.equalsIgnoreCase("Maven Tutorials")) {
			System.out.println("maven text is not present: "+ma);
		}
		else {
			System.out.println("maven text is present: "+ma);
		}
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 5)
	public void jenkins() throws InterruptedException {
		
		//jenkins valid text
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[5]/a")).click();
		String jn=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		
		if(!jn.equalsIgnoreCase("Jenkins Continuous Integration Tutorial")) {
			System.out.println("jenkins text is not present: "+jn);
		}
		else {
			System.out.println("jenkins text is present: "+jn);	
		}
		Thread.sleep(3000);
	}
	
	@Test(priority = 6)
	public void protractor() throws InterruptedException {
		
		//protractor valid text
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[6]/a")).click();
		String pt=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		
		if(!pt.equalsIgnoreCase("Protractor Tutorials")) {
			System.out.println("protractor text is not present: "+pt);
		}
		else {
			System.out.println("protractor text is present: "+pt);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority = 7)
	public void appium() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[7]/a")).click();
		String app=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		if(!app.equalsIgnoreCase("Appium Tutorials")) {
			System.out.println("appium text is not present: "+app);
		}
		else {
			System.out.println("appium text is present: "+app);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority = 8)
	public void apachi() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[8]/a")).click();
		String ap=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		
		if(!ap.equalsIgnoreCase("Apache POI")) {
			System.out.println("Apache POI text is not present: "+ap);
		}
		else {
			System.out.println("Apache POI text is present: "+ap);
		}
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 9)
	public void katlon() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[9]/a")).click();
		String ka=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		if(!ka.equalsIgnoreCase("Katalon Studio Tutorials")) {
			System.out.println("Katalon Studio Tutorials text is not present: "+ka);
		}
		else {
			System.out.println("Katalon Studio Tutorials text is present: "+ka);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority = 10)
	public void log4j() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[10]/a")).click();
		String log= driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		
		if(!log.equalsIgnoreCase("Log4j Tutorials")) {
			System.out.println("Log4j Tutorials text is not present: "+log);
		}
		else {
			System.out.println("Log4j Tutorials text is present: "+log);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority = 11)
	public void jxl() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[1]/a")).click();
		
		String jx=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		if(!jx.equalsIgnoreCase("JExcel API")) {
			System.out.println("JExcel API text is not present: "+jx);
		}
		else {
			System.out.println("JExcel API text is present: "+jx);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority = 12)
	public void jmeter() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[2]/a")).click();
		
		String jm = driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		if(!jm.equalsIgnoreCase("JMeter Tutorials")) {
			System.out.println("JMeter Tutorials text is not present: "+jm);
		}
		else {
			System.out.println("JMeter Tutorials text is present: "+jm);
		}
		Thread.sleep(3000);
	}

	@Test(priority = 13)
	public void ant() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[3]/a")).click();
		
		String an= driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		if(!an.equalsIgnoreCase("Ant Tutorials")) {
			System.out.println("Ant Tutorials text is not present: "+an);
		}
		else {
			System.out.println("Ant Tutorials text is present: "+an);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority = 14)
	public void junit() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[4]/a")).click();
		
		String ju=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		if(!ju.equalsIgnoreCase("JUnit")) {
			System.out.println("JUnit text is not present: "+ju);
		}
		else {
			System.out.println("JUnit text is present: "+ju);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority = 15)
	public void javaT() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[5]/a")).click();
		
		String ja=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		if(!ja.equalsIgnoreCase("Java Tutorials for Selenium")) {
			System.out.println("Java Tutorials for Selenium text is not present: "+ja);
		}
		else {
			System.out.println("Java Tutorials for Selenium text is present: "+ja);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority = 16)
	public void manual() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[6]/a")).click();
		
		String mt=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		if(!mt.equalsIgnoreCase("Manual Testing")) {
			System.out.println(mt+" text is not present: "+mt);
		}
		else {
			System.out.println(mt+" text is present: "+mt);
		}
		Thread.sleep(3000);
	}

	
	@Test(priority = 17)
	public void flu() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[7]/a")).click();
		
		String fac=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[1]/h1")).getText();
		if(!fac.equalsIgnoreCase("FluentAutomation CSharp")) {
			System.out.println(fac+" Text is not present: "+fac);
		}
		else {
			System.out.println(fac+" Text is present: "+fac);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority = 18)
	public void close() {
		
		//close browser
		driver.close();
		System.out.println("driver successfully close");
	}

}
