package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement clearemail;
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']") 
	WebElement btnLogin;

	@FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']") 
	WebElement lnkforgotpwd;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement alertmsgforgotpwd;
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void clearemail()
	{
		clearemail.clear();
	}

	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin()   
	{
		btnLogin.click();
	}
	public void clickForgottenPwd()   
	{
		lnkforgotpwd.click();
	}
	
	public boolean isforgotpwdmsgdisplayed()
	{
		try
		{
			return (alertmsgforgotpwd.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}	
		
	}
}
