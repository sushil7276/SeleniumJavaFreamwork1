package com.Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sushils\\\\eclipse-workspace\\\\Test1\\\\target\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement serch=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		serch.click();
		serch.sendKeys("PYTHON TUTORIAL");
		
		WebElement s=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]"));
		s.click();
		
		
		WebElement serch1=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		serch1.click();
		Thread.sleep(10000);
		driver.close();
		
	}

}
