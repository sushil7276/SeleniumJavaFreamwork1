package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageTask {
	
	
	WebDriver driver;
	
	public PageTask(WebDriver ldriver) {
		
		this.driver=ldriver;
		
	}
	
	
	@FindBy(id="usernameOrEmail") 
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"primary\"]/div/main/div/div/form/div[1]/div[2]/button") 
	@CacheLookup
	WebElement button;
	
	@FindBy(id="password") 
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.LINK_TEXT,using="Lost your password?") 
	@CacheLookup
	WebElement lost_password;
	
	
	public void login_wordpress(String uid,String pass) throws InterruptedException {
		
		username.sendKeys(uid);
		button.click();
		Thread.sleep(4000);
		password.sendKeys(pass);
		button.click();
	}

}
