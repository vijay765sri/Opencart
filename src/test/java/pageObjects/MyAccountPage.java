
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//h2[normalize-space()='My Account']") 
	WebElement msgHeading;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") 
	WebElement lnkLogout;
	
	//Click emptywishlist
	
	@FindBy(xpath="//i[@class='fa fa-heart']") 
	WebElement clkwish;
	
	//Myaccount Empty Input Text
	
	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement inpttxt;
	
	//Myaccount MacBook Input Text
	
		@FindBy(xpath="//input[@placeholder='Search']") 
		WebElement macbkinpttxt;
	
	//Myaccount Empty Input Serch
	@FindBy(xpath="//i[@class='fa fa-search']") 
	WebElement srch;
	
	//Macbook search option
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") 
	WebElement macbokserch;
	
	//clicking on order history page from right table option

	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Order History']")
	WebElement clkordrhis;
	
	//Clicking on sit emap link in footer
	
	@FindBy(xpath="//a[normalize-space()='Site Map']") 
	WebElement clkfooter;
	
	//click My account dropdown
	
	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement lnkMyAccount;
	
	//Click on My Account
@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']") 
WebElement clkmyaccount;


// BreadCrums in Home page with Myaccount option

@FindBy(xpath="//ul[@class='breadcrumb']") 
WebElement brscrumshmpgdis;

//Page Title page Heading

@FindBy(xpath="//a[normalize-space()='Qafox.com']") 
WebElement pgtitle;

@FindBy(xpath="//div[@class='collapse navbar-collapse navbar-ex1-collapse']")
WebElement pageheading;
//Click on Edit your account information

@FindBy(xpath="//a[normalize-space()='Edit your account information']") 
WebElement clceditinfo;

//Click on right side Edit account

@FindBy(xpath="//a[normalize-space()='Edit Account']")
WebElement clkeditacc;

//Click on site map footer option

@FindBy(xpath="//a[normalize-space()='Site Map']") 
WebElement clksitmapft;

//Sucess msg after updating your personal details

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
WebElement sucsmsg;

//Edit Your Account Information in left mayaccountpage

@FindBy(xpath="//a[normalize-space()='Edit your account information']") 
WebElement clkedituraccinfo;

//After Login with mail ID
	@FindBy(xpath="//span[@class='caret']")
	WebElement dropmyacnt;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']")
	WebElement myact;

	@FindBy(xpath="//a[normalize-space()='Change your password']")
	WebElement clkchangpwd;
	
	//Clicking on Password option on right side

	@FindBy(xpath="//a[normalize-space()='Password']") 
	WebElement clkpswd;
	
	//Password from site map option
	
	@FindBy(xpath="//a[normalize-space()='Site Map']") 
	WebElement clksitemap;
	
	@FindBy(xpath="//a[normalize-space()='Password']") 
	WebElement clkpwd;
	
	//Change password msg displayed

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement pwdmsgsucesful;
	
	//Modify address

	@FindBy(xpath="//a[normalize-space()='Modify your address book entries']") 
	WebElement clkmodifyadd;
	
	//Address book from right side

	@FindBy(xpath="//a[normalize-space()='Address Book']") 
	WebElement clkadrsbok;
	
	
	
	public boolean isMyAccountPageExists()
	{
		try
		{
			return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}			
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	//Click emptywishlist
	public void clkwish()
	{
		clkwish.click();
	}
	
	//Myaccount Empty Input Txt
	
	public void inpttxt(String Txt)
	{
		inpttxt.sendKeys();
	}
	
	//Myaccount MacBook Input Text
	
	public void macbkinpttxt(String Txt)
	{
		macbkinpttxt.sendKeys(Txt);
	}
	
	//Macbook search option
	
	public void macbokserch()
	{
		macbokserch.click();
	}	
	
	//Myaccount Empty Input Serch   
	public void srch()
	{
		srch.sendKeys();
	}
	//clicking on order history page from right table option

	public void clkordrhis()
	{
		clkordrhis.click();
	}
	//Clicking on sit emap link in footer
	
	public void clkfooter()
	{
		clkfooter.click();
	}
	//click My account dropdown
	public void lnkMyAccount()
	{
		lnkMyAccount.click();
	}
	//Click on My Account
	
	public void clkmyaccount()
	{
		clkmyaccount.click();
	}
	// BreadCrums in Home page with Myaccount option

	public boolean brscrumshmpgdisdisply()
	{
		try
		{
			return (brscrumshmpgdis.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}			
	}
	//get Page URL
	 public String getCurrentPageUrl()
	 {
	     return driver.getCurrentUrl();
	 }
	//Page Title page Heading

	 public boolean pgtitleisdisply()
		{
			try
			{
				return (pgtitle.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		} 
	 
	 public boolean pageheadingisdisply()
		{
			try
			{
				return (pageheading.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		}
	//Click on Edit your account information

	 public void clceditinfo()
		{
		 clceditinfo.click();
		} 
	//Click on right side Edit account

	 public void clkeditacc()
		{
		 clkeditacc.click();
		}  
	//Click on site map footer option


	 public void clksitmapft()
		{
		 clksitmapft.click();
		}  
	//Sucess msg after updating your personal details

	 public boolean sucsmsgisdisply()
		{
			try
			{
				return (sucsmsg.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		} 
	 
	//Edit Your Account Information in left mayaccountpage

	 public void clkedituraccinfo()
		{
		 clkedituraccinfo.click();
		}  
	 
	//After Login with mail ID
	 public void dropmyacnt()
		{
		 dropmyacnt.click();
		}  	
		
	 public void myact()
		{
		 myact.click();
		} 	
		
	 public void clklnkchangpwd()
		{
		 clkchangpwd.click();
		} 	
	//Clicking on Password option on right side

	 public void clkpswd()
		{
		 clkpswd.click();
		} 
	 
	//Password from site map option
		
	 public void clksitemap()
		{
		 clksitemap.click();
		} 	
		
	 public void clkpwd()
		{
		 clkpwd.click();
		} 
	 
	//Change password msg displayed

	 public boolean pwdmsgsucesfulisdisply()
		{
			try
			{
				return (pwdmsgsucesful.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		} 
	//Modify address

	 public void clkmodifyadd()
		{
		 clkmodifyadd.click();
		} 		
	//Address book from right side

	 public void clkadrsbok()
		{
		 clkadrsbok.click();
		} 	
	 
		

}
