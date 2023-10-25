package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishlistPage extends BasePage{
	
	
	public MyWishlistPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary']//i[@class='fa fa-shopping-cart']") 
	WebElement clkaddtocart;
	
	@FindBy(xpath="//a[normalize-space()='shopping cart']") 
	WebElement clkshoppingcartlnk;
	
	//Prd displayed
	
	@FindBy(xpath="//img[@title='Apple Cinema 30']") 
	WebElement prddispld;
	
	//Wishlist section displayed
	@FindBy(xpath="//h2[normalize-space()='My Wish List']") 
	WebElement sctwishdis;
	
	//Breadcrums

	@FindBy(xpath="//ul[@class='breadcrumb']")
	WebElement breadcrumdisplyd;
	
	//Click continue on Wishlist products

	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement clkcontbtnwshlst;
	
	// msg on Mywishlist where wishlist is empty
	
	@FindBy(xpath="//p[normalize-space()='Your wish list is empty.']")
	WebElement msgwshempty;
	
	//Click continue on empty wish list button
	
	@FindBy(xpath="//a[normalize-space()='Continue']") 
	WebElement clckctnbtn;
	
	//Click on Remove in Wish list 
	
	@FindBy(xpath="//i[@class='fa fa-times']") 
	WebElement clkremove;
	
	@FindBy(xpath="//p[normalize-space()='Your wish list is empty.']") 
	WebElement wishlistemptymsg;
	
	//Add to cart in Wish list page
	
	@FindBy(xpath="//button[@class='btn btn-primary']//i[@class='fa fa-shopping-cart']")
	WebElement addcartbtn;
	
	//Sucess msg pd added to cart
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement sucesmsg;
	
	//Product on Wishlist
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]")
	WebElement Prdimg;
	
	//Breadcrums on WishlistPage
	
	@FindBy(xpath="//ul[@class='breadcrumb']")
	WebElement breadcrum;
	
	
	public void clkaddtocart()
	{
		clkaddtocart.click();
	}
	
	public void clkshoppingcartlnk()
	{
		clkshoppingcartlnk.click();
	}
	
	//Click continue on Wishlist products
	
			public void clkcontbtnwshlst()
			{
				clkcontbtnwshlst.click();
			}
	
	public boolean prddispld() {
		try
		{
			return (prddispld.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	//Wishlist section displayed
	public boolean sctwishdisdispld() {
	try
	{
		return (sctwishdis.isDisplayed());
	} catch (Exception e)
	{
		return false;
	}
	}
	//
	public boolean breadcrumdisplydisdispld() {
		try
		{
			return (breadcrumdisplyd.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}}
		
		// msg on Mywishlist where wishlist is empty
		
	public boolean msgwshemptyisplydisdispld() {
	try
		{
			return (msgwshempty.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}}
	//Click continue on empty wish list button
	
	public void clckctnbtn()
	{
		clckctnbtn.click();
	}
	
	//Click on Remove in Wish list 
	public void clkremove()
	{
		clkremove.click();
	}
	
		public boolean wishlistemptymsgisplydisdispld() {
			try
			{
				return (wishlistemptymsg.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}}
	//Add to cart in Wish list page  
		
		public void addcartbtn()
		{
			addcartbtn.click();
		}
	//Sucess msg pd added to cart   
			
	public boolean sucesmsgisplydisdispld() {
	try
		{
			return (sucesmsg.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}	}
	//Product on Wishlist
	
	public boolean Prdimgisplyd() {
		try
			{
				return (Prdimg.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}		
}
	//Breadcrums on WishlistPage
	
	public boolean breadcrumisplyd() {
		try
			{
				return (breadcrum.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}		
}
		
}
