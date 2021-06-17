package com.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushils\\eclipse-workspace\\Test1\\target\\chromedriver.exe");
		
		//sit link
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//click signin
		driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
		
		//click and enter username
		driver.findElement(By.id("ap_email")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("8806756792");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		
		//click and enter password
		driver.findElement(By.id("ap_password")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("12345678");
		Thread.sleep(2000);
		
		//click sign button
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		
		//chrome close
		driver.quit();
	}

}
