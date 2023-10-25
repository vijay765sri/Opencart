package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SerchCriteriaPage extends BasePage{
	

	public SerchCriteriaPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-search']") 
	WebElement inputserchcriteria;	
	
	@FindBy(xpath="//select[@name='category_id']") 
	WebElement categorydropdown;
	
	//Category dropdown
	
	//WebElement drpcountryEle = driver.findElement(By.xpath("//select[@name='category_id']"));
/*	@FindBy(xpath="//select[@name='category_id']") 
	WebElement drpcountry;	
	Select drpcountry = new Select(drpcountryEle);
	drpcountry.*/
	


	
	@FindBy(xpath="//label[normalize-space()='Search in subcategories']") 
	WebElement rdiobtnserchsubcatgry;
	
	@FindBy(xpath="//input[@id='button-search']") 
	WebElement serchbox;
	
	@FindBy(xpath="//h1[normalize-space()='Search - iMac']") 
	WebElement SerchProductsTxt;
	//For Product iMac
	@FindBy(xpath="//img[@title='iMac']") 
	WebElement productdisplayed;
	
	//For Prodcut MacBook

	@FindBy(xpath="//div[@class='image']//img[@title='MacBook']") 
	WebElement clkprdmacbk;

	@FindBy(xpath="//img[@title='MacBook']") 
	WebElement clkonprd;
	
	//Click on prodcut IMAc
	@FindBy(xpath="//img[@title='iMac']") 
	WebElement clkimac;
	


	//Add prodcut to wishlist
	@FindBy(xpath="//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[2]") 
	WebElement addprdtowishlist;
	
	
	//Clicking on Wishlistbutton
	@FindBy(xpath="//a[@id='wishlist-total']")
	WebElement clkwishlistbtn;
	
	//Add  to cart

	@FindBy(xpath="//div[@class='button-group']//i[@class='fa fa-shopping-cart']") 
	WebElement clkaddtocart;
	
	//Click cart btn black colour
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	WebElement clkblkcart;
	
	//Click view cart on cart btn black colour
	
	@FindBy(xpath="//strong[normalize-space()='View Cart']") 
	WebElement clkviewcart;
	
	
	//Product Image Displayed
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement prdImage;
	
	//product added to cart msg diaplayed

	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement prdaddcartmsg;
	
	//Click on Product
	
	@FindBy(xpath="//img[@title='iMac']") 
	WebElement ClkPrd;	

	//click on Add to wish list prduct in serch criteria page
	
	@FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']") 
	WebElement clckpdwishlst;
	
	//Prd added to wishlist
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement pdadwishlst;
	
	//Click on wish list added to cart link
	
	@FindBy(xpath="//a[normalize-space()='wish list']") 
	WebElement lnkwishlist;
	
	//Click on add to cart on pdoduct displayed in serch criteria page
	
	@FindBy(xpath="//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]") 
	WebElement clkaddcrt;

	//Clicking on link Shopping cart in serch criteria page

	@FindBy(xpath="//a[normalize-space()='shopping cart']")
	WebElement lnkclk;
	
	//Clciking on Header shopping cart
	@FindBy(xpath="//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")
	WebElement clkshpgcrt;
	
	//clicking on Macbook in serch page 
	
	@FindBy(xpath="//div[@class='image']//img[@title='MacBook']")
	WebElement clkmacbok;
	
	//Click on product image
	
	@FindBy(xpath="//img[@class='img-responsive']") 
	WebElement pdimg;
	
	//Check the Prodcut Title for Macbook
	

	@FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[2]//div[1]//h4[1]//a[1]") 
	WebElement macbktitle;
	
	@FindBy(xpath="//div[@class='image']//img[@title='MacBook']") 
	WebElement macbkprd;
	
	public boolean inputserchcriteriaisdisplayed()
	{
		try
		{
			return (inputserchcriteria.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}	
	}
	
	public void categorydropdown()
	{
		categorydropdown.click();
	}
	
/*	//Category dropdown
	
	drpcountry.selectByVisibleText("Desktops");
	
	public void categorydropdown()
	{
		categorydropdown.click();
	}*/
		
	
	public void rdiobtnserchsubcatgry()
	{
		rdiobtnserchsubcatgry.click();
	}
	
	public void serchbtn()
	{
		serchbox.click();
	}
	public boolean SerchProductsTxtisdisplayed()
	{
		try
		{
			return (SerchProductsTxt.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}	
	}
	
	public void productdisplayed()
	{
		productdisplayed.click();
	}	
	
	
	//For Prodcut MacBook

	public void clkprdmacbk()
	{
		clkprdmacbk.click();
	}
	
		
	public void clkonprd()
	{
		clkonprd.click();
	}
	
	//Add product to wishlist
	public void addprdtowishlist()
	{
		addprdtowishlist.click();
	}
	
	//Clicking wishlist btn
		public void clkwishlistbtn()
		{
			clkwishlistbtn.click();
		}
	
	//Clicking wishlist btn
	public void clkaddtocart()
	{
		clkaddtocart.click();
	}
	
	//Clicking black clr cart
	public void clkblkcart()
	{
		clkblkcart.click();
	}
	//Click view cart black clr cart
	
	public void clkviewcart()
	{
		clkviewcart.click();
	}
	
	
	public boolean prdImageisdisplayed()
	{
		try
		{
			return (prdImage.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}	
	} 
	//prd added to cart msg dis
	public boolean prdaddcartmsgisdisplayed()
	{
		try
		{
			return (prdaddcartmsg.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}	
	}
	
	//Click on product
	
	public void ClkPrd()
	{
		ClkPrd.click();
	}
	
	//add product to wishlist from prodcuts meeting serch criteria
	public void clckpdwishlst()
	{
		clckpdwishlst.click();
	}
	//Prd added to wish list
	public void pdadwishlst()
	{
		pdadwishlst.click();
	}
	//Click on wish list added to cart link
	public void lnkwishlist()
	{
		lnkwishlist.click();
	}
	
	//Click on add to cart on pdoduct displayed in serch criteria page 
	public void clkaddcrt()
	{
		clkaddcrt.click();
	}
	
	//Clicking on link Shopping cart in serch criteria page    

	public void lnkclk()
	{
		lnkclk.click();
	}
	
	//Clciking on Header shopping cart   
	public void clkshpgcrt()
	{
		clkshpgcrt.click();
	}
	//clicking on Macbook in serch page  
	public void clkmacbok()
	{
		clkmacbok.click();
	}
	
//Click on product image

public void pdimg()
{
	pdimg.click();
}

//Click on prodcut IMAc
public void clkimac()
{
	clkimac.click();
}

//Check the Prodcut Title for Macbook

public boolean macbktitleisdisplayed()
{
	try
	{
		return (macbktitle.isDisplayed());
	}
	catch(Exception e)
	{
		return(false);
	}	
}

public boolean macbkprdisdisplayed()
{
	try
	{
		return (macbkprd.isDisplayed());
	}
	catch(Exception e)
	{
		return(false);
	}	
}
	
	

}
