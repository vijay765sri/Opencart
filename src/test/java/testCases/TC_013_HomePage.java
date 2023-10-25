package testCases;

import testBase.BaseClass;
import pageObjects.HomePage;
import pageObjects.SerchCriteriaPage;
import pageObjects.ProductDisplayPage;
import pageObjects.ShoppingCartPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_013_HomePage extends BaseClass{
	
	@Test(groups = {"master"})
	public void test_HomePage() {
		try
		{
			//1. Validate Navigate to Home Pagefrom Shopping cart
			HomePage hp = new HomePage(driver);		
			hp.inputtxt(rb.getString("Txt"));
			hp.serch();
			Thread.sleep(5000);
			SerchCriteriaPage scpg = new SerchCriteriaPage(driver);
			scpg.clkaddtocart();
			Thread.sleep(5000);
			boolean sucessmsg = scpg.prdaddcartmsgisdisplayed();
			Assert.assertEquals(sucessmsg, true);
			scpg.lnkclk();
			/*ShoppingCartPage spgcartpg = new ShoppingCartPage(driver);
			spgcartpg.drop();
			spgcartpg.clkcotnshop();
			ProductDisplayPage pddsipg = new ProductDisplayPage(driver);
			pddsipg.addtocart();
			Thread.sleep(5000);
			pddsipg.lnkshpgcart();
			ShoppingCartPage spgcrt = new ShoppingCartPage(driver);
			boolean shopingcrtmsg = spgcrt.msgisply();
			Assert.assertEquals(shopingcrtmsg, true);*/
		}
		catch (InterruptedException e) {
		    e.printStackTrace();
			}
	}

}
