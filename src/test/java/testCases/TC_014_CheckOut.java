package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductDisplayPage;
import pageObjects.SerchCriteriaPage;
import testBase.BaseClass;
import pageObjects.ShoppingCartPage;

public class TC_014_CheckOut extends BaseClass{
	
	@Test(groups = {"master"})
	public void test_CheckOut() {
		try 
		{
			// 1 Validate navigation to checkout page
			/*HomePage hp = new HomePage(driver);	
			Thread.sleep(5000);
			hp.clkcheckout();
			Thread.sleep(5000);
			ShoppingCartPage spgcrt = new ShoppingCartPage(driver);
			boolean msg = spgcrt.emptyspgcartisdiplyd();
			Assert.assertEquals(msg, true);*/
			
			//2. Validate navigate to Checkoutpage from Shopping cart page
			HomePage hp = new HomePage(driver);	
			hp.inputtxt(rb.getString("Txt"));
			hp.serch();
			Thread.sleep(2000);
			SerchCriteriaPage scpg = new SerchCriteriaPage(driver);
			scpg.clkimac();
			Thread.sleep(2000);
			ProductDisplayPage pddsipg = new ProductDisplayPage(driver);
			pddsipg.addtocart();
			Thread.sleep(2000);
			pddsipg.lnkshpgcart();
			/*ShoppingCartPage spgcrt = new ShoppingCartPage(driver);
			boolean shopingcrtmsg = spgcrt.msgisply();
			Assert.assertEquals(shopingcrtmsg, true);
			spgcrt.clkcheckout();*/
		}
		catch (InterruptedException e) {
		    e.printStackTrace();
			}
	}
}



