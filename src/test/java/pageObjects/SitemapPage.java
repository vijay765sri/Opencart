package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SitemapPage extends BasePage{

	WebDriver driver;
	
	public SitemapPage(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(xpath="//div[@class='col-sm-6']//a[normalize-space()='My Account']")
	WebElement clcmyact;
	// click on Account information
	

	@FindBy(xpath="//a[normalize-space()='Address Book']") 
	WebElement clkadress;
	
	
	public void clcmyact()
	{
		clcmyact.click();
	}
	// click on Account information
	public void clkadress()
	{
		clkadress.click();
	}
	
	

}
