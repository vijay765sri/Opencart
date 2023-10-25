package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage{

	WebDriver driver;
	
	public ChangePasswordPage(WebDriver driver)
	{
		super(driver);
	}

// ChangePassword Page header
	@FindBy(xpath="//h1[normalize-space()='Change Password']") 
	WebElement cngpwdhed;
	
//Changing the password

	@FindBy(xpath="//input[@id='input-password']")
	WebElement inptpwd;
	
	@FindBy(xpath="//input[@id='input-confirm']") 
	WebElement inptpwdconfrm;
	
	@FindBy(xpath="//input[@value='Continue']") 
	WebElement clkcontn;
	
	//Clicking on continue btn with out inputs in change password page
	
	@FindBy(xpath="//div[@class='text-danger']")
	WebElement alertmsg;
	
	//Passing different details in two columns of password change

	@FindBy(xpath="//div[@class='text-danger']")
	WebElement pwdmismatchalrt;
	
	//Change password marked as mandatory with * in all field

	@FindBy(xpath="//label[normalize-space()='Password']")
	WebElement pwdmandatory;
	
	@FindBy(xpath="//label[normalize-space()='Password Confirm']")
	WebElement cnfpwdmantory;
	
	//Toggled passowrd in change password field

	@FindBy(xpath="//input[@id='input-password']")
	WebElement toggpwd;
	
	//Back buttton in change password

	@FindBy(xpath="//a[normalize-space()='Back']")
	WebElement clkbackbtn;
	
	//Pwd and confirm pwd text field entered text was disappered after clicking back button
	@FindBy(xpath="//input[@id='input-password']")
	WebElement inptpawd;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement inptconpawd;
	
	//Breadcrums

	@FindBy(xpath="//ul[@class='breadcrumb']")
	WebElement breadcrum;


	// ChangePassword Page header
	public boolean cngpwdhedisDisplayed()
	{
		try
		{
			return (cngpwdhed.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}			
	}
	
	//Changing the password

	 public void inptpwd(String inpwd)
		{
		 inptpwd.sendKeys(inpwd);
		} 	
		
	 public void inptpwdconfrm(String inpwd)
		{
		 inptpwdconfrm.sendKeys(inpwd);
		} 
	 
		
	 public void clkcontn()
		{
		 clkcontn.click();
		} 
	 
		//Clicking on continue btn with out inputs in change password page
		
	 public boolean alertmsgisDisplayed()
		{
			try
			{
				return (alertmsg.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		}
	//Passing different details in two columns of password change

	 public boolean pwdmismatchalrtisDisplayed()
		{
			try
			{
				return (pwdmismatchalrt.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		}
	//Change password marked as mandatory with * in all field

	 public boolean pwdmandatoryisDisplayed()
		{
			try
			{
				return (pwdmandatory.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		}	
		
	 public boolean cnfpwdmantoryisDisplayed()
		{
			try
			{
				return (cnfpwdmantory.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		}
	//Toggled passowrd in change password field

	 public boolean toggpwdisDisplayed()
		{
			try
			{
				return (toggpwd.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		}
	 
	//Back buttton in change password

	 public void clkbackbtn()
		{
		 clkbackbtn.click();
		} 
	 
	//Pwd and confirm pwd text field entered text was disappered after clicking back button
	 public boolean inptpawdisDisplayed()
		{
			try
			{
				return (inptpawd.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		}
		
	 public boolean inptconpawdisDisplayed()
		{
			try
			{
				return (inptconpawd.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		}	
	//Breadcrums

	 public boolean breadcrumisDisplayed()
		{
			try
			{
				return (breadcrum.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		}		
}


	
