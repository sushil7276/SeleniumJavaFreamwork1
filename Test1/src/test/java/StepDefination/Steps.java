package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;

	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		String web=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", web+"\\target\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	    lp=new LoginPage(driver);
	    
	}

	
	@When("User open URL {string}")
	public void user_open_url(String url) {
		
	   driver.get(url);
		
	}

	
	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	   lp.setUserName(email);
	   lp.setPassword(password);
		
	}

	@When("Click on login")
	public void click_on_login() {
	   lp.clickLogin();
	   
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
	   
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title, driver.getTitle());
		}
		
	}

	@When("USer click on log out link")
	public void u_ser_click_on_log_out_link() throws Exception {
	    
		lp.clickLogout();
		Thread.sleep(4000);
	}
	
	@Then("Page Tilte should be {string}")
	public void page_tilte_should_be(String title) {
		
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}


	@Then("close browser")
	public void close_browser() {
	    
		driver.close();
	}
}
