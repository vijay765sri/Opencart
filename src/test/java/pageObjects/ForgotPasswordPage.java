package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {
	
	public ForgotPasswordPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//input[@id='input-email']") 
	WebElement inputemail;
	
	@FindBy(xpath="//input[@value='Continue']") 
	WebElement btncontinue;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement msgforgotpwd;
		
	public void inputEmail(String Email)
	{
		inputemail.sendKeys(Email);
	}
	
	public void clickcontinue()
	{
		btncontinue.click();
	}
	
	public boolean msgforgotpwdisdisplayed()
	{
		try
		{
			return(msgforgotpwd.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
		
}