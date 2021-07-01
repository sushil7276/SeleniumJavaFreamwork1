package testTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SetLinks {

	WebDriver driver;

	public SetLinks(WebDriver ldriver) {

		this.driver=ldriver;

	}

	@FindBy(id="fromCity") 
	@CacheLookup
	WebElement from;
	
	
	@FindBy(id="toCity") 
	@CacheLookup
	WebElement to;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/label/p[1]")
	@CacheLookup
	WebElement date;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[4]/label/p[1]/span[3]")
	@CacheLookup
	WebElement returnt;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/label/p[1]")
	@CacheLookup
	WebElement sit;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/p/a")
	@CacheLookup
	WebElement search;
	
	
	
}
