package com.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sushils\\\\eclipse-workspace\\\\Test1\\\\target\\\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		// link for site
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://www.javatpoint.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//click python
		driver.findElement(By.xpath("//*[@id=\"link\"]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		
		// find python program
		WebElement last= driver.findElement(By.xpath("//*[@id=\"menu\"]/div[22]/a"));
		
		// scrolling down for python program
		WebElement first = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/a[1]/strong"));
		Actions act=new Actions(driver);
		act.dragAndDrop(first, last).build().perform();
		Thread.sleep(3000);
		
		//click python program
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[22]/a")).click();
		Thread.sleep(3000);
		
		// now click pytone tutorial
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/a[1]")).click();
		Thread.sleep(3000);
		
		//driver close
		driver.quit();
	}

}
