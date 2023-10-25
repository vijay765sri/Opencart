package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookEntriesPage extends BasePage{
	
	public AddressBookEntriesPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//h2[normalize-space()='Address Book Entries']") 
	WebElement addresbookenrttitle;
	
	
		public boolean addresbookenrttitleExists()
	{
		try
		{
			return (addresbookenrttitle.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}			
	}	
	
	 

}



