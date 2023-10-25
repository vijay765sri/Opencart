package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//a[normalize-space()='Address Book']")
	WebElement clkregistr;

		 
	//Click on register before Login

		 public void clkregistr()
			{
			 clkregistr.click();
			} 	
	 
	}


