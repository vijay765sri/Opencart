package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class ProductDisplayPage extends BasePage{
	
	public ProductDisplayPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='product comparison']") 
	WebElement lnkprdcomp;
	
	@FindBy(xpath="//h1[normalize-space()='Product Comparison']") 
	WebElement pdCompmsg;
	
	//Product details

	@FindBy(xpath="//h1[normalize-space()='iMac']") 
	WebElement productname;
	
	@FindBy(xpath="//div[@class='col-sm-4']//ul[1]//li[1]") 
	WebElement brandname;
	
	@FindBy(xpath="//li[normalize-space()='Product Code:Product 14']") 
	WebElement productcode;
	
	@FindBy(xpath="//li[normalize-space()='Availability:Out Of Stock']") 
	WebElement stockavilability;
	
	@FindBy(xpath="//h2[normalize-space()='$122.00']")
	WebElement prdpriceincludtax;
	
	@FindBy(xpath="//li[normalize-space()='Ex Tax:$100.00']") 
	WebElement prdpriceextax;
	

	@FindBy(xpath="//input[@id='input-quantity']") 
	WebElement inputqty;
	
	@FindBy(xpath="//button[@id='button-cart']") 
	WebElement btnaddtocart;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement prdaddedtocartmsg;
	
	//Review page
	
	
	@FindBy(xpath="//a[normalize-space()='Write a review']") 
	WebElement review_rd;
	
	@FindBy(xpath="//input[@id='input-name']")
	WebElement inputyourname;
	
	@FindBy(xpath="//textarea[@id='input-review']") 
	WebElement inputyourreview;
	
	@FindBy(xpath="//div[4]//div[1]//input[1]")
	WebElement ratingradiobtn;
	
	@FindBy(xpath="//button[@id='button-review']") 
	WebElement cotinuebtn;

	//validation of review box input

	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") 
	WebElement alertmsgwithlessthan25char;

	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") 
	WebElement alertmsgmorethan1k;
	
	@FindBy(xpath="//button[@id='button-review']") 
	WebElement btncontinue;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement confrmmsgafterreview;
	

	@FindBy(xpath="//a[normalize-space()='shopping cart']") 
	WebElement reviewsubackdisplayed;

	//Cart button Black colour
	@FindBy(xpath="//span[@id='cart-total']") 
	WebElement blackcartbtn;
	
	@FindBy(xpath="//strong[normalize-space()='View Cart']")
	WebElement clckviewcart;
	
	//Clicking on wishlist on product in Related prd area
	
	@FindBy(xpath="//div[@class='col-xs-6 col-sm-3']//button[2]")
	WebElement clkwishlst;
	
	//Prd added to wishlist msg
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement msg;
	
	//Click Store Logo

	@FindBy(xpath="//a[normalize-space()='Qafox.com']") 
	WebElement clkstorelogo;
	
	//Clicking on wishlist on displayed product display page

	@FindBy(xpath="//button[@class='btn btn-default']//i[@class='fa fa-heart']")
	WebElement clkwishlistprddisplay;
	
	//Wishlist on Footer
	
		@FindBy(xpath="//a[normalize-space()='Wish List']") 
		WebElement Wishlistft;
	//Click on wish list link from non login add on
		
		@FindBy(xpath="//a[normalize-space()='wish list']") 
		WebElement clkbtnlnk;
		
	//Clicking on the shopping cart link after adding prd to cart
	
		@FindBy(xpath="//a[normalize-space()='shopping cart']") 
		WebElement lnkshpgcart;
		
		//click on Wishlist link

		@FindBy(xpath="//a[normalize-space()='wish list']") 
		WebElement lnkwishlst;
		
		
		//Add to cart
		
		@FindBy(xpath="//button[@id='button-cart']")
		WebElement addtocartpdd;
		
		
		

	public void lnkprdcomp()
	{
		lnkprdcomp.click();
	}

	public boolean pdCompmsg() {
		try
		{
			return (pdCompmsg.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	
	public boolean productname() {
		try
		{
			return (productname.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	public boolean brandname() {
		try
		{
			return (brandname.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	public boolean productcode() {
		try
		{
			return (productcode.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	
	public boolean stockavilability() {
		try
		{
			return (stockavilability.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	public boolean prdpriceincludtax() {
		try
		{
			return (prdpriceincludtax.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	
	public boolean prdpriceextax() {
		try
		{
			return (prdpriceextax.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	
	public void setvalue()
	{
		inputqty.sendKeys("2");
	}
	

	public void addtocart()
	{
		btnaddtocart.click();
	}
	
	public boolean prdaddedtocartmsg() {
		try
		{
			return (prdaddedtocartmsg.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	//Review Page
	/*public void clickElementWithJS()
	{
		review_rd.click();
	}*/
	
	 public void performActionWithJavaScript(String WebElement) {
		 	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		 	WebElement review_rd = driver.findElement(By.xpath("//a[normalize-space()='Write a review']"));
	        jsExecutor.executeScript("arguments[0].click()",review_rd);}
	        
	
	public void inputyourname(String Name)
	{
		
		inputyourname.sendKeys("Name");
	}
	
	public void inputyourreview(String Review)
	{
		inputyourreview.sendKeys("The product was good and its very useful for my daily work and office works.");
	}
	
	public void ratingradiobtn()
	{
		ratingradiobtn.click();
	}
	
	public void cotinuebtn()
	{
		cotinuebtn.click();
	}
	
	//validation of review input box
	public boolean alertmsgwithlessthan25char() {
		try
		{
			return (alertmsgwithlessthan25char.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	
	public boolean alertmsgmorethan1k() {
		try
		{
			return (alertmsgmorethan1k.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	 public void btncontinue() 
	 {
		 btncontinue.click();
	 }
	
	
	//confirm message after sucesfull submission validation
	public boolean confrmmsgafterreview() {
		try
		{
			return (confrmmsgafterreview.isDisplayed());
		} catch (Exception e)
		{
			return false;
		}
		}
	
	 public void reviewsubackdisplayed() 
	 {
		 reviewsubackdisplayed.click();
	 }
	
	 //Click balck colur cart button
	 public void blackcartbtn() 
	 {
		 blackcartbtn.click();
	 }
	 
	  public void clckviewcart() 
	 {
		  clckviewcart.click();
	 }
	  
	  //Clicking on wishlist of related product
	  
	  
	  public void clkwishlst() 
		 {
		  clkwishlst.click();
		 }
	  //product added to wishlist msg
	  

		public boolean msgisdisplayed() {
			try
			{
				return (msg.isDisplayed());
			} catch (Exception e)
			{
				return false;
			}
			}
	//Click store Logo
		 public void clkstorelogo() 
			 {
			 clkstorelogo.click();
			 }	
		 
	//Clicking on wishlist on displayed product display page
		 public void clkwishlistprddisplay() 
		 {
			 clkwishlistprddisplay.click();
		 }
	//Wishlist on Footer
		public void Wishlistft()
		{
			Wishlistft.click();
		}	 
	//Click on wish list link from non login add on
		public void clkbtnlnk()
		{
			clkbtnlnk.click();
		}
		
//Clicking on the shopping cart link after adding prd to cart
		public void lnkshpgcart()
		{
			lnkshpgcart.click();
		}	
		
		//click on Wishlist link
		public void lnkwishlst()
		{
			lnkwishlst.click();
		}
		//Add to cart
		public void addtocartpdd()
		{
			addtocartpdd.click();
		}
		
	
				
				
				

				
}
