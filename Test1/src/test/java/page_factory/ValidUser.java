package page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ValidUser {
	
	
	@Test
	public void CheckUser() throws InterruptedException {
		
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://wordpress.com/log-in");
		
		PageTask login_page = PageFactory.initElements(driver, PageTask.class);
		
		login_page.login_wordpress("shil7276", "shil@7276");
	}

}
