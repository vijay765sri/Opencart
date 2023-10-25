package pageObjects;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ResourceBundle;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement lnkMyAccount;

	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkRegister;

	@FindBy(xpath="//a[normalize-space()='Login']") 
	WebElement lnkLogin;

	@FindBy(xpath="//h1[normalize-space()='Account Logout']")
	WebElement AccountLogouthdg;

	//Currency

	@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']") 
	WebElement CurrencyDropDown;

	@FindBy(xpath="//button[contains(text(),'€Euro')]") 
	WebElement CurrencyEuro;
	

	@FindBy(xpath="//button[normalize-space()='£Pound Sterling']") 
	WebElement CurrencyPoundSterling;

	@FindBy(xpath="//button[normalize-space()='$US Dollar']") 
	WebElement CurrencyUSDollar; 


	@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']") 
	WebElement Euro;

	@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']") 
	WebElement Pound;

	@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']") 
	WebElement Dollar;

	//Serch

	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement inputserch;
	

	@FindBy(xpath="//i[@class='fa fa-search']") 
	WebElement serchbtn	;

	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement inputtxt;

	//Compare
	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement txtinput;

	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement txtinputserchbtn;

	//MouseHoverActions

	@FindBy(xpath="//a[normalize-space()='Desktops']")
	WebElement MouseoverDsktop;

	@FindBy(xpath="//a[normalize-space()='Mac (1)']")
	WebElement Imacpd;
	
	//Clear inputBox
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement inputbox;
	
	//HoverOver Actionson Desktop
		
	@FindBy(xpath="//a[normalize-space()='Desktops']")
	WebElement hoverOverDesktop;
	
	//Featured Products
	
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[3]//button[1]") 
	WebElement featuredaddtocart;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement featuredaddtocartmsg;
	
	//for serching two prodcuts in one page
	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement inputtxt1;
	
	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement inputtxt2;
	//Featured products wishlist
	
	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[3]//button[2]//i[1]") 
	WebElement clckfearturedprd;
	
	//Msg on Home page 

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement Wishlistmsg;
	
	//Click on Checkout
	
	@FindBy(xpath="//i[@class='fa fa-share']")
	WebElement clkcheckout;
	
	//Click on my account after adding prodcut to cart
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']")
	WebElement clkmyaccount;
	
	//Input for MacBook

@FindBy(xpath="//input[@placeholder='Search']") 
WebElement inputMacbook;
	
//Click on register before Login

	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement clkregister;
	



	public void settxtinput(String Txt)
	{
		txtinput.sendKeys("iMac");
	}

	public void clickMyAccount()
	{
		lnkMyAccount.click();
	}

	public void clickRegister()
	{
		lnkRegister.click();
	}
	public void clickLogin()
	{
		lnkLogin.click();
	}

	public boolean isLogoutMsgDisplayed()
	{
		try
		{
			return (AccountLogouthdg.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}			
	}	
//Currency DropDown
	public void clickCurrencyDropDown()
	{
		CurrencyDropDown.click();
	}

	public void clickCurrencyEuro()
	{
		CurrencyEuro.click();
	}

	public void clickCurrencyPoundSterling()
	{
		CurrencyPoundSterling.click();
	}


	public void clickCurrencyUSDollar()
	{
		CurrencyUSDollar.click();
	} 

	public boolean isEuroSymbolDisplayed()
	{
		try
		{
			return (Euro.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}			
	}	

	public boolean isPoundSymbolDisplayed()
	{
		try
		{
			return (Pound.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}			
	}

	public boolean isDollarSymbolDisplayed()
	{
		try
		{
			return (Dollar.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}			
	}

	public void inputserch(String Txt)
	{
		inputserch.click();;
	}
	


	public void serch()
	{
		serchbtn.click();
	}

	public void inputtxt(String Txt)
	{
		inputtxt.sendKeys("iMac");
	}
	 public void txtinputserchbtn()
	 {
		 txtinputserchbtn.click();
	 }
	 
	 public void clearInputBoxTest()
	 {	        
		 inputbox.clear();
	 }
	 
	 public void hoverOverDesktop() {
		 
	     WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	     WebElement showalldesktops = driver.findElement(By.xpath("//a[normalize-space()='Show AllDesktops']"));
	     Actions act = new Actions(driver);
	     act.moveToElement(desktop).moveToElement(showalldesktops).click().perform();
	     
	 }	 
	 //Featured product add to cart
	 
	 public void featuredaddtocart()
	 {
		 featuredaddtocart.click();
	 }
	 
	 
	 public boolean featuredaddtocartmsgisDisplayed()
		{
			try
			{
				return (featuredaddtocartmsg.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}			
		}
	 //for serching of Two prodcuts in one page
	 
	 public void inputtxt1(String Txt1)
		{
			inputtxt1.sendKeys("iMac");
		}
	 public void inputtxt2(String Txt2)
		{
			inputtxt2.sendKeys("Monitors");
		}
	 //Add to wishlist the featured product
		 public void clckfearturedprd()
		 {
			 clckfearturedprd.click();
		 }
		 
		 
	//Message on home page
	 public boolean WishlistmsgisDisplayed()
		{
			try
		{
			return (Wishlistmsg.isDisplayed());
		}
			catch(Exception e)
		{
			return(false);
		}			
		}
	//Click on Checkout
		
	 public void clkcheckout()
	 {
		 clkcheckout.click();
	 }
	//Click on my account after adding prodcut to cart
		
	 public void clkmyaccount()
	 {
		 clkmyaccount.click();
	 }	
	 
	//Input for MacBook

	 public void inputMacbook(String Txt1)
	 {
		 inputMacbook.sendKeys("MacBook");	
	} 
	 
	//Click on register before Login

		 public void clkregister()
			{
			 clkregister.click();
			} 	
	 
	}