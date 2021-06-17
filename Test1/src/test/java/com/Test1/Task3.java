package com.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task3 {
	
	public WebDriver driver = null;
	Actions act=new Actions(driver);
	
	@Test(priority = 1)
	public void Test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushils\\eclipse-workspace\\Test1\\target\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
	}
	@Test(priority = 2)
	public void SeleniumWithJava() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[2]/ul/li[1]/a")).click();
		System.out.println("selenium java click");
		Thread.sleep(13000);
		//top 10 codless
		driver.findElement(By.xpath("//*[@id=\"node-286\"]/header/h2/a")).click();
		Thread.sleep(13000);
		//again back
		WebElement back=driver.findElement(By.xpath("//*[@id=\"block-easy-breadcrumb-easy-breadcrumb\"]/div/span[3]/a"));
		back.click();
		Thread.sleep(13000);
		//relative locator
		WebElement rl=driver.findElement(By.xpath("//*[@id=\"node-283\"]/header/h2/a"));
		act.dragAndDrop(back, rl);
		Thread.sleep(13000);
		rl.click();
		System.out.println("relative locator");
		Thread.sleep(13000);
		//again back
		driver.findElement(By.xpath("//*[@id=\"block-easy-breadcrumb-easy-breadcrumb\"]/div/span[3]/a")).click();
		//click Allure Report using Annotations
		WebElement ar=driver.findElement(By.xpath("//*[@id=\"node-266\"]/header/h2/a"));
		act.dragAndDrop(rl, ar);
		Thread.sleep(13000);
		ar.click();
		System.out.println("click Allure Report using Annotations");
		Thread.sleep(13000);
		//again back
		driver.findElement(By.xpath("//*[@id=\"block-easy-breadcrumb-easy-breadcrumb\"]/div/span[3]/a")).click();
		//click Manage driver executables using webdrivermanager
		WebElement md=driver.findElement(By.xpath("//*[@id=\"node-254\"]/header/h2/a"));
		act.dragAndDrop(rl, md);
		Thread.sleep(13000);
		md.click();
		System.out.println("click Manage driver executables using webdrivermanager");
		Thread.sleep(13000);
		System.out.println("java done");
		
	}
	
	@Test(priority = 3)
	public void SeleniumWithPythone() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[2]/ul/li[2]/a")).click();
		System.out.println("click python");
		Thread.sleep(13000);
		//click Run tests in parallel with pytest
		WebElement rt=driver.findElement(By.xpath("//*[@id=\"node-259\"]/header/h2/a"));
		rt.click();
		Thread.sleep(13000);
		//back
		driver.findElement(By.xpath("//*[@id=\"block-easy-breadcrumb-easy-breadcrumb\"]/div/span[3]/a")).click();
		Thread.sleep(12000);
		//click Grouping automation tests using Pytest.mark
		WebElement ga=driver.findElement(By.xpath("//*[@id=\"node-252\"]/header/h2/a"));
		act.dragAndDrop(rt, ga);
		Thread.sleep(12000);
		ga.click();
		System.out.println("click Grouping automation tests using Pytest.mark");
		Thread.sleep(12000);
		//back
		driver.findElement(By.xpath("//*[@id=\"block-easy-breadcrumb-easy-breadcrumb\"]/div/span[3]/a")).click();
		//Getting started with Selenium Webdriver in Python
		WebElement gs=driver.findElement(By.xpath("//*[@id=\"node-242\"]/header/h2/a"));
		act.dragAndDrop(rt, gs);
		Thread.sleep(13000);
		gs.click();
		System.out.println("Getting started with Selenium Webdriver in Python");
		Thread.sleep(13000);
		System.out.println("pythone done");
		
	}
	
	@Test(priority = 4)
	public void TestNG() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[3]/a")).click();
		Thread.sleep(13000);
		//page 4 click
		WebElement tt=driver.findElement(By.xpath("//*[@id=\"block-easy-breadcrumb-easy-breadcrumb\"]/div/span[3]/a"));
		WebElement page=driver.findElement(By.xpath("/html/body/div[3]/div/section/div[4]/ul/li[4]/a"));
		act.dragAndDrop(tt, page);
		Thread.sleep(13000);
		page.click();
		System.out.println("page 4 click");
		Thread.sleep(13000);
		System.out.println("TestNG done");
	}
	
	@Test(priority = 5)
	public void Maven() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[4]/a")).click();
		Thread.sleep(13000);
		System.out.println("maven done");
	}

	@Test(priority = 6)
	public void jenkins() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[5]/a")).click();
		Thread.sleep(13000);
		System.out.println("jenkins");
	}
	
	@Test(priority = 7)
	public void OtherOparation() throws InterruptedException {
		//click protractor
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[6]/a")).click();
				Thread.sleep(13000);
				
				//click appium
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[7]/a")).click();
				Thread.sleep(13000);
				
				//click appachi poi
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[8]/a")).click();
				Thread.sleep(13000);
				
				//click Katalon
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[9]/a")).click();
				Thread.sleep(13000);
				
				//click log4j
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[10]/a")).click();
				Thread.sleep(13000);
				
				//click jxl
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[1]/a")).click();
				System.out.println("click jxl");
				Thread.sleep(13000);
				
				//click jmeter tutorial
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[2]/a")).click();
				System.out.println("click jmeter tutorial");
				Thread.sleep(13000);
				
				//click ant
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[3]/a")).click();
				System.out.println("click ant");
				Thread.sleep(13000);
				
				//click juint
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[4]/a")).click();
				System.out.println("click JUnit");
				Thread.sleep(13000);
				
				//click java tutorial for selenium
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[5]/a")).click();
				System.out.println("click java tutorial for selenium");
				Thread.sleep(13000);
				
				//click manual testing
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[6]/a")).click();
				System.out.println("click manual testing");
				Thread.sleep(13000);
				
				//click fluentAtomation
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[11]/ul/li[7]/a")).click();
				System.out.println("click fluentAtomation");
				Thread.sleep(13000);
				
				System.out.println("Other Oparation is done");
	}
	
	@Test(priority = 8)
	public void HomePart() throws InterruptedException {
		//click Home page
				WebElement home = driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/nav/ul/li[1]/a"));
				home.click();
				Thread.sleep(13000);
				//click selenium articles
				WebElement sa = driver.findElement(By.xpath("//*[@id=\"node-20\"]/div/div/div/div[1]/div/div[2]/p[3]/a[1]"));
				act.dragAndDrop(home, sa);
				Thread.sleep(13000);
				sa.click();
				System.out.println("click selenium articles");
				Thread.sleep(12000);
				//back to home
				driver.findElement(By.xpath("//*[@id=\"block-easy-breadcrumb-easy-breadcrumb\"]/div/span[1]/a")).click();
				//click selenium beginners guide
				driver.findElement(By.xpath("//*[@id=\"node-20\"]/div/div/div/div[1]/div/div[2]/p[3]/a[2]")).click();
				System.out.println("click selenium beginners guide");
				Thread.sleep(12000);
				//back to home
				driver.findElement(By.xpath("//*[@id=\"block-easy-breadcrumb-easy-breadcrumb\"]/div/span[1]/a")).click();
				
				//selenium java
				//click manage driver
				WebElement cmd=driver.findElement(By.xpath("//*[@id=\"tab_default_1\"]/div/ul/li[1]/a"));
				act.dragAndDrop(home, cmd);
				Thread.sleep(13000);
				cmd.click();
				System.out.println("click manage driver");
				Thread.sleep(12000);
				//add comment
				WebElement yourname=driver.findElement(By.id("edit-name"));
				act.dragAndDrop(home, yourname);
				Thread.sleep(13000);
				yourname.click();
				yourname.sendKeys("Sushil");
				Thread.sleep(13000);
				WebElement sub=driver.findElement(By.id("edit-subject"));
				sub.click();
				sub.sendKeys("Selenium test");
				Thread.sleep(13000);
				WebElement comm=driver.findElement(By.id("edit-comment-body-und-0-value"));
				comm.click();
				comm.sendKeys("Its great introduction");
				Thread.sleep(13000);
				//click save
				WebElement save=driver.findElement(By.id("edit-submit"));
				act.dragAndDrop(comm, save);
				Thread.sleep(13000);
				save.click();
				System.out.println("save successfully");
				Thread.sleep(13000);
				//back to home
				driver.findElement(By.xpath("//*[@id=\"block-easy-breadcrumb-easy-breadcrumb\"]/div/span[1]/a")).click();
				Thread.sleep(13000);
				
				//click Extent Reports in Page Object Model framework
				WebElement er=driver.findElement(By.xpath("//*[@id=\"tab_default_1\"]/div/ul/li[2]/a"));
				act.dragAndDrop(home, er);
				Thread.sleep(13000);
				er.click();
				System.out.println("click Extent Reports in Page Object Model framework");
				Thread.sleep(13000);
				//back to home
				driver.findElement(By.xpath("//*[@id=\"block-easy-breadcrumb-easy-breadcrumb\"]/div/span[1]/a")).click();
				Thread.sleep(13000);
				//click view all
				WebElement vall=driver.findElement(By.xpath("//*[@id=\"tab_default_1\"]/p[2]/a"));
				act.dragAndDrop(home, vall);
				Thread.sleep(13000);
				vall.click();
				Thread.sleep(13000);
				//back to home
				driver.findElement(By.xpath("//*[@id=\"block-easy-breadcrumb-easy-breadcrumb\"]/div/span[1]/a")).click();
				Thread.sleep(13000);
				
				//Exception Handling In Selenium Webdriver Using Java
				WebElement eh=driver.findElement(By.xpath("//*[@id=\"node-20\"]/div/div/div/div[3]/div[1]/div/ul/li[1]/a"));
				act.dragAndDrop(home, eh);
				Thread.sleep(10000);
				eh.click();
				System.out.println("Exception Handling In Selenium Webdriver Using Java");
				Thread.sleep(13000);
				
				//Page Factory Framework
				WebElement pf=driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/li[1]/a"));
				act.dragAndDrop(home, pf);
				Thread.sleep(10000);
				pf.click();
				System.out.println("Page Factory Framework");
				Thread.sleep(13000);
				
				//POM Example
				driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/li[2]/a")).click();
				System.out.println("POM Example");
				Thread.sleep(13000);
				
				//working with selenium grid
				driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/li[3]/a")).click();
				System.out.println("working with selenium grid");
				Thread.sleep(12000);
				
				//click element with javascript
				driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/li[4]/a")).click();
				System.out.println("click element with javascript");
				Thread.sleep(12000);
				
				//Testing popular post
				driver.findElement(By.xpath("//*[@id=\"headingTwo\"]/h4/a")).click();
				Thread.sleep(13000);
				//assrtion in TestNG
				driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/li[1]/a")).click();
				System.out.println("assrtion in TestNG");
				Thread.sleep(13000);
				//click TestNG Introduction
				driver.findElement(By.xpath("//*[@id=\"block-views-testng-articles-block\"]/div/div/div/ul/li[1]/div/span/a")).click();
				System.out.println("TestNG Introduction");
				Thread.sleep(12000);
				// click Test Report with Retry Stacktrace and Screenshot
				WebElement tr=driver.findElement(By.xpath("//*[@id=\"block-views-testng-articles-block\"]/div/div/div/ul/li[35]/div/span/a"));
				act.dragAndDrop(home, tr);
				Thread.sleep(13000);
				tr.click();
				System.out.println("click Test Report with Retry Stacktrace and Screenshot");
				Thread.sleep(13000);
				
				//Jenkins Popular Posts
				WebElement jpp=driver.findElement(By.xpath("//*[@id=\"headingThree\"]/h4/a"));
				act.dragAndDrop(home, jpp);
				Thread.sleep(15000);
				jpp.click();
				System.out.println("Jenkins Popular Posts");
				//Execute testng.xml from Jenkins
				driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/li[1]/a")).click();
				System.out.println("Execute testng.xml from Jenkins");
				Thread.sleep(10000);
				
				//click properties file
				WebElement cpf=driver.findElement(By.xpath("//*[@id=\"block-views-tags-cloud-block\"]/div/div/div[50]/div/span/a"));
				act.dragAndDrop(home, cpf);
				Thread.sleep(10000);
				cpf.click();
				
				System.out.println("Home part is done");
	}
	
	public void Search() throws InterruptedException {
		WebElement search=driver.findElement(By.xpath("//*[@id=\"edit-search-block-form--2\"]"));
		search.click();
		search.sendKeys("testng");
		driver.findElement(By.xpath("//*[@id=\"search-block-form\"]/div/div/div[1]/span/button/span")).click();
		System.out.println("search successfully");
		Thread.sleep(10000);
		
		System.out.println("Search done");
	}
	
	public void close() {
		driver.close();
	}
}
