package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class CheckoutPage extends BasePage {
	
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Check out displayed
	@FindBy(xpath="//h1[normalize-space()='Checkout']") 
	WebElement checkout;
	
	//Check out with new address

	@FindBy(xpath="//div[@id='checkout-checkout']//div[2]//div[1]//h4[1]") 
	WebElement clkbillgdetails;
	@FindBy(xpath="//input[@value='new']")
	WebElement clknewadd;
	@FindBy(xpath="//input[@id='input-payment-firstname']") 
	WebElement fname;
	@FindBy(xpath="//input[@id='input-payment-lastname']")
	WebElement lname;
	@FindBy(xpath="//input[@id='input-payment-company']")
	WebElement compnay;
	@FindBy(xpath="//input[@id='input-payment-address-1']")
	WebElement address;
	@FindBy(xpath="//input[@id='input-payment-city']")
	WebElement city;
	@FindBy(xpath="//input[@id='input-payment-postcode']")
	WebElement postalcd;
	@FindBy(xpath="//select[@id='input-payment-country']")
	WebElement country;
	@FindBy(xpath="//select[@id='input-payment-zone']")
	WebElement state;
	@FindBy(xpath="//input[@id='button-payment-address']")
	WebElement clkcontinue;
	//Check out displayed
	public boolean ischeckoutDisplayed()
	{
		try
		{
			return (checkout.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}			
	}
	
	//Check out with new address

	public void clkbillgdetails()
	{
		clkbillgdetails.click();
	}
	public void clknewadd()
	{
		clknewadd.click();
	}
	public void fname()
	{
		fname.sendKeys();
	}
	public void lname()
	{
		lname.sendKeys();
	}
	public void compnay()
	{
		compnay.sendKeys();
	}
	public void address()
	{
		address.sendKeys();
	}
	
	/*@FindBy(xpath="//input[@id='input-payment-city']")
	WebElement Ele;
	@FindBy(xpath="//input[@id='input-payment-postcode']")
	WebElement Ele;
	@FindBy(xpath="//select[@id='input-payment-country']")
	WebElement Ele;
	@FindBy(xpath="//select[@id='input-payment-zone']")
	WebElement Ele;*/
	public void clkcontinue()
	{
		clkcontinue.click();
	}
}
