package com.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBus {

	public WebDriver driver= null;
	
	@Test(priority = 1)
	public void redbus() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sushils\\eclipse-workspace\\Test1\\target\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public void searchbus() throws InterruptedException {
		//search from and to
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Ichalkaranji");
		Thread.sleep(2000);
		
		System.out.println("from ich set");
		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Bengaluru");
		System.out.println("To Bengaluru set");
		Thread.sleep(2000);
		
		
		//set date
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		System.out.println("date click");
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[6]")).click();
		Thread.sleep(3000);
		
		//click search button
		driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		System.out.println("search button click");
	}
	
	@Test(priority = 3)
	public void signIn() {
		
		driver.findElement(By.xpath("//*[@id=\"i-icon-profile\"]")).click();
		
	}

}
