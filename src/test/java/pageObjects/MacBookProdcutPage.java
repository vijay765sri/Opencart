package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MacBookProdcutPage extends BasePage{
	
	public MacBookProdcutPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Mac book Prodcut Display ELements

			@FindBy(xpath="//div[@id='product-product']//li[1]//a[1]//img[1]") 
			WebElement macbkimg;
			
			@FindBy(xpath="//button[@title='Next (Right arrow key)']")
			WebElement macbknxt;
			
			@FindBy(xpath="//button[@title='Previous (Left arrow key)']") 
			WebElement macbkprev;
			

			@FindBy(xpath="//button[normalize-space()='×']") 
			WebElement clkclose;
			
			@FindBy(xpath="//li[2]//a[1]//img[1]") 
			WebElement Thumnailimgclk;
			

			@FindBy(xpath="//button[@title='Next (Right arrow key)']")
			WebElement clkrigt;
			
			@FindBy(xpath="//button[@title='Previous (Left arrow key)']") 
			WebElement clklft;
			
			@FindBy(xpath="//button[normalize-space()='×']") 
			WebElement clkcls;
			

			@FindBy(xpath="//h1[normalize-space()='MacBook']") 
			WebElement Titlemacbook;
			
			@FindBy(xpath="//div[@class='col-sm-4']//ul[1]//li[1]")
			WebElement brnd;
			
			@FindBy(xpath="//li[normalize-space()='Product Code:Product 16']") 
			WebElement prdcode;
			
			@FindBy(xpath="//li[normalize-space()='Reward Points:600']")
			WebElement rewdptn;
			
			@FindBy(xpath="//li[normalize-space()='Availability:In Stock']")
			WebElement stkavl;
			
			@FindBy(xpath="//h2[normalize-space()='$500.00']") 
			WebElement itmprc;
			
			@FindBy(xpath="//li[normalize-space()='Ex Tax:$500.00']")
			WebElement prcextax;
			
			@FindBy(xpath="//input[@id='input-quantity']")
			WebElement qty;

			@FindBy(xpath="//a[normalize-space()='Description']")
			WebElement prddesc;
			
			@FindBy(xpath="//a[normalize-space()='Specification']") 
			WebElement prdspec;
			
			@FindBy(xpath="//a[normalize-space()='Reviews (0)']") 
			WebElement prdrevew;
			
			@FindBy(xpath="//button[@id='button-cart']") 
			WebElement clkadcart;
			

			@FindBy(xpath="//div[@id='tab-description']//div") 
			WebElement prddescptn;
			
			@FindBy(xpath="//td[normalize-space()='test 1']")
			WebElement prdspectn;
			

			@FindBy(xpath="//i[@class='fa fa-exchange']")
			WebElement ClkCompare;
			
			@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
			WebElement Msgcomp;
			
			@FindBy(xpath="//a[normalize-space()='product comparison']") 
			WebElement clklnk;
			
			
			//Mac book Prodcut Display ELements
			public void macbkimg()
			{
				macbkimg.click();
			}
			
			public void macbknxt()
			{
				macbknxt.click();
			}
			
			public void macbkprev()
			{
				macbkprev.click();
			}
			
			public void clkclose()
			{
				clkclose.click();
			}
			
			public void Thumnailimgclk()
			{
				Thumnailimgclk.click();
			}
			
			public void clkrigt()
			{
				clkrigt.click();
			}
			
			public void clklft()
			{
				clklft.click();
			}
			
			public void clkcls()
			{
				clkcls.click();
			}
			
			//Prd for purchase
			

			@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
			WebElement Mgslnk;
			
			@FindBy(xpath="//a[normalize-space()='shopping cart']")
			WebElement lnkclk;

			/*Shopping cart on header for Macbook
			@FindBy(xpath="//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']") 
			WebElement spgcart;*/
			
			public boolean Titlemacbookisdisplayeed() {
				try
				{
					return (Titlemacbook.isDisplayed());
				} catch (Exception e)
				{
					return false;
				}}
			
			public boolean brndisdispalyed() {
				try
				{
					return (brnd.isDisplayed());
				} catch (Exception e)
				{
					return false;
				}}
			
			public boolean prdcodeisdisplyd() {
				try
				{
					return (prdcode.isDisplayed());
				} catch (Exception e)
				{
					return false;
				}}
			
			public boolean rewdptnisdisplyd() {
				try
				{
					return (rewdptn.isDisplayed());
				} catch (Exception e)
				{
					return false;
				}}
			
			public boolean stkavlisdisplyd() {
				try
				{
					return (stkavl.isDisplayed());
				} catch (Exception e)
				{
					return false;
				}}		
			

			public boolean itmprcisdisplyd() {
				try
				{
					return (itmprc.isDisplayed());
				} catch (Exception e)
				{
					return false;
				}}	
			
			public boolean prcexcludingtaxisdisply() {
				try
				{
					return (prcextax.isDisplayed());
				} catch (Exception e)
				{
					return false;
				}}	
			public void qty(String st)
			{
				qty.sendKeys(st);
			}
			
			public void prddesc()
			{
				prddesc.click();
			}

			public void prdspec()
			{
				prdspec.click();
			}
			
			public void prdrevew()
			{
				prdrevew.click();
			}
			public void clkadcart()
			{
				clkadcart.click();
			}
			
			public boolean prddescptnisdisply() {
				try
				{
					return (prddescptn.isDisplayed());
				} catch (Exception e)
				{
					return false;
				}}
			
			
			public boolean prdspectnisdisply() {
				try
				{
					return (prdspectn.isDisplayed());
				} catch (Exception e)
				{
					return false;
				}}
			

			public void ClkCompare()
			{
				ClkCompare.click();
			}
			
			public boolean Msgcompisdisply() {
				try
				{
					return (Msgcomp.isDisplayed());
				} catch (Exception e)
				{
					return false;
				}}
			public void clklnk()
			{
				clklnk.click();
			}
			
			public boolean Mgslnkisdisply() {
				try
				{
					return (Mgslnk.isDisplayed());
				} catch (Exception e)
				{
					return false;
				}}
			public void lnkclk()
			{
				lnkclk.click();
			}
			
			/*Shopping cart on header for Macbook
			public void spgcart()
			{
				spgcart.click();
			}*/		
			
			
			
		}



