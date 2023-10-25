package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage extends BasePage{
	
	public ShoppingCartPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement prddisply;
	//Shopping Cart Page displayed

	@FindBy(xpath="//h1[contains(text(),'Shopping Cart')]") 
	WebElement msg;
	
	
	// All the product details of Shopping Cart
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]")
	WebElement prdimg;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement prdname;
	
	@FindBy(xpath="//td[normalize-space()='Product 16']")
	WebElement prdmodelno;	

	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
	WebElement prdqty;
	
	/*@FindBy(xpath="//td[normalize-space()='$602.00']") 
	WebElement prdunitprice;*/
	
/*	WebElement prdunitprice= driver.findElement(By.xpath("//td[normalize-space()='$602.00']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	boolean isDisplayed = (boolean)js.executeScript("return arguments[0].offsetParent!==null;", prdunitprice);
	
	/* public void performActionWithJavaScript(String WebElement) {
		 	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		 	WebElement prd_price = driver.findElement(By.xpath("//td[normalize-space()='$602.00']"));
	        jsExecutor.executeScript("arguments[0].click()",prd_price);}*/

	@FindBy(xpath="//td[normalize-space()='$500.00']") 
	WebElement prduntprice;
	
	@FindBy(xpath="//tbody//tr//td[6]") 
	WebElement prdtotalamt;
	
	//Updation in Shopping cart Page

	@FindBy(xpath="//input[@name='quantity[62839]']") 
	WebElement qtyinput;
	
	@FindBy(xpath="//i[@class='fa fa-refresh']") 
	WebElement clkupdate;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement sucessmofiedmsg;
	
	//Removing item from Shopping cart

	@FindBy(xpath="//i[@class='fa fa-times-circle']")
	WebElement clkrmove;
	
	@FindBy(xpath="//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
	WebElement cartemptymsg;
	
	//Page Heading , Title, URL
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse navbar-ex1-collapse']")
	WebElement pageheading;
	
	@FindBy(xpath="//a[normalize-space()='Qafox.com']") 
	WebElement pgtitle;
	
		
	//DropdoenCoupon Code

	@FindBy(xpath="//a[normalize-space()='Use Coupon Code']")
	WebElement drpcoupn;
	
	//Check out option
	
	@FindBy(xpath="//a[@class='btn btn-primary']") 
	WebElement clkcheckout;
	
	//Click on continue shoppingh
	
	@FindBy(xpath="//a[normalize-space()='Continue Shopping']")
	WebElement clkcotnshop;
	
	//click on Use Coupon Code
	//WebElement drop = driver.findElement(By.className("fa fa-caret-down"));

	@FindBy(xpath="//a[normalize-space()='Use Coupon Code']")
	WebElement drop;
	
	//Onckicking checout in Home Pge empty cart shopping page should be displayed
	
	@FindBy(xpath="//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]") 
	WebElement emptyspgcart;
	
	//Scroll Down to Coupon code
	@FindBy(xpath="//a[normalize-space()='Use Coupon Code']") 
	WebElement scrdown;
	
	
	//SHopping Cart Message displayed after error msg

	@FindBy(xpath="//h1[contains(text(),'Shopping Cart')]") 
	WebElement shoppingcartmsg;
	
	//Shopping cart page MacBook
	

	@FindBy(xpath="//h1[contains(text(),'Shopping Cart')]") 
	WebElement Shopingcarttitle;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]") 
	 WebElement productimage;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement prodctname;
	@FindBy(xpath="//td[normalize-space()='Product 16']") 
	WebElement model;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]") 
	WebElement qunty;
	@FindBy(xpath="//td[normalize-space()='$500.00']")
	WebElement unitprice;
	@FindBy(xpath="//tbody//tr//td[6]") 
	WebElement total;
	@FindBy(xpath="//a[@class='btn btn-primary']") 
	WebElement clickcheckout;
	
	public boolean prddisply() {
		try
		{
			return (prddisply.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	//Shopping Cart Page displayed
	public boolean msgisply() {
		try
		{
			return (msg.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	
		
	// All the product details of Shopping Cart
	public boolean prdimg() {
		try
		{
			return (prdimg.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	public boolean prdname() {
		try
		{
			return (prdname.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	public boolean prdmodelno() {
		try
		{
			return (prdmodelno.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	public boolean prdqty() {
		try
		{
			return (prdqty.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}}
	/* 
	{
		System.out.println("Element is displayed");
	}
	else
	{
		System.out.println("Element is not displayed");
	}*/
	
	public boolean prduntprice() {
		try
		{
			return (prduntprice.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	
	public boolean prdtotalamt() {
		try
		{
			return (prdtotalamt.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	
	//Updation in Shopping cart Page

	/*public void setqtyinput(String 1)
	{
		
		setqtyinput.sendKeys(1);
	}

	public void clkupdate()
	{
		
		clkupdate.click();
	}*/
	
	public boolean sucessmofiedmsg() {
		try
		{
			return (sucessmofiedmsg.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}}
	
	//Removing item from Shopping cart
	public void clkrmove()   
	{
		clkrmove.click();
	}
	
	public boolean cartemptymsg() {
		try
		{
			return (cartemptymsg.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}}
	//Page Heading , Title, URL
	
	public boolean pageheading() {
		try
		{
			return (pageheading.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}}	
	
	public boolean pgtitle() {
		try
		{
			return (pgtitle.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}}
	
	
	
	//DropdoenCoupon Code

	public void drpcoupn()   
	{
		drpcoupn.click();
	}
	//Check out option
	
	public void clkcheckout()   
	{
		clkcheckout.click();
	}	
	//Click on continue shoppingh

	public void clkcotnshop()   
	{
		clkcotnshop.click();
	}	
	//click on Use Coupon Code
		
		public void drop()   
		{
			drop.click();
		}
		
//Onckicking checout in Home Pge empty cart shopping page should be displayed
		
		public boolean emptyspgcartisdiplyd() {
			try
			{
				return (emptyspgcart.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}}	
	//Scroll Down to Coupon code
	/*WebElement couponcd = driver.findElement(By.xpath("//a[normalize-space()='Use Coupon Code']"));
	js.executeScript("arguments[0].scrollIntoView();",couponcd);*/
		
/*		 public WebElement couponcd() 
		 {
		     return driver.findElement(By.xpath("//a[normalize-space()='Use Coupon Code']");
		 }*/
		//SHopping Cart Message displayed after error msg

		public boolean shoppingcartmsgisdiplyd() {
			try
			{
				return (shoppingcartmsg.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}}
		
		//Shopping cart page MacBook
		

		public boolean Shopingcarttitleisdiplyd() {
			try
			{
				return (Shopingcarttitle.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}}
		public boolean productimageisdiplyd() {
			try
			{
				return (productimage.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}}
		public boolean prodctnameisdiplyd() {
			try
			{
				return (prodctname.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}}
		public boolean modelisdiplyd() {
			try
			{
				return (model.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}}
		public boolean quntyisdiplyd() {
			try
			{
				return (qunty.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}}
		public boolean unitpriceisdiplyd() {
			try
			{
				return (unitprice.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}}
		public boolean totalisdiplyd() {
			try
			{
				return (total.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}}
		public void clickcheckout()   
		{
			clickcheckout.click();
		}
	
	}
