package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class SerchPage extends BasePage {
	
	public SerchPage(WebDriver driver)
	{
		super(driver);
	}
			
	@FindBy(xpath="//img[@title='iMac']") 
	WebElement productdisplayed;
	
	@FindBy(xpath="//button[@class='btn btn-default']//i[@class='fa fa-exchange']") 
	WebElement btncompareproduct;
	
	
	
	public boolean productdisplayed()
	{
		try
		{
			return (productdisplayed.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public void btncompareproduct()
	{
		btncompareproduct.click();
	}
	
	
	
}