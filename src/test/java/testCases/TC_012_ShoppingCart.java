package testCases;

import testBase.BaseClass;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductDisplayPage;
import pageObjects.SerchCriteriaPage;
import pageObjects.ShoppingCartPage;
import pageObjects.MyWishlistPage;
import pageObjects.CheckoutPage;
import org.testng.Assert;

import pageObjects.ProductDisplayPage;

public class TC_012_ShoppingCart extends BaseClass {
	
	@Test(groups = {"master"})
	
	public void test_ShoppingCart()
	{
		try
		{
		/*logger.info("******Starting TC_012_SHoppingCart**********");
		//1. Validating shopping cart page from sucess page
		HomePage hp = new HomePage(driver);		
		hp.inputtxt(rb.getString("Txt"));
		hp.serch();
		Thread.sleep(5000);
		logger.info("******Openeing Sech Page**********");
		SerchCriteriaPage scpg = new SerchCriteriaPage(driver);
		scpg.ClkPrd();
		Thread.sleep(5000);
		logger.info("******Opening ProductDisplayPage**********");
		ProductDisplayPage pddsipg = new ProductDisplayPage(driver);
		logger.info("******Prodcut Added to cart**********");
		pddsipg.addtocart();
		Thread.sleep(5000);
		pddsipg.lnkshpgcart();
		logger.info("******Opening Shopping Cart Page**********");
		ShoppingCartPage spgcrt = new ShoppingCartPage(driver);
		boolean shopingcrtmsg = spgcrt.shoppingcartmsgisdiplyd();
		Assert.assertEquals(shopingcrtmsg, true);*/
		
		//2.Validate nav to shopping cart from shopping header
		
	
		HomePage hp1 = new HomePage(driver);		
		hp1.inputtxt(rb.getString("Txt"));
		hp1.serch();			
		Thread.sleep(5000);
		SerchCriteriaPage scpg1 = new SerchCriteriaPage(driver);
		scpg1.clkimac();
		Thread.sleep(5000);
		scpg1.clkshpgcrt();
	/*	ShoppingCartPage spgcrt1 = new ShoppingCartPage(driver);
		boolean shopingcrtmsg1 = spgcrt1.msgisply();
		Assert.assertEquals(shopingcrtmsg1, true);*/
			
		//3. validate shopping cart page from Site map Footer name   Getting Error
			/*HomePage hp1 = new HomePage(driver);		
			hp1.inputtxt(rb.getString("Txt"));
			hp1.serch();			
			Thread.sleep(5000);
			SerchCriteriaPage scpg1 = new SerchCriteriaPage(driver);
			scpg1.clkaddcrt();
			Thread.sleep(5000);*/
		//4.Validate cart btn with no products added to shopping cart
		
			
			
			
	    //5. Validate navigating to shopping cart page using view cart black
			/*HomePage hp4 = new HomePage(driver);		
			hp4.inputtxt(rb.getString("Txt"));
			hp4.serch();			
			Thread.sleep(5000);
			SerchCriteriaPage scpg4 = new SerchCriteriaPage(driver);
			scpg4.clkaddcrt();
			Thread.sleep(5000);
			scpg4.clkblkcart();
			scpg4.clkviewcart();
			ShoppingCartPage spgcrtpg4 = new ShoppingCartPage(driver);
			spgcrtpg4.msgisply();*/
			
		//6.validate wt of product in shopping cart page
			/*HomePage hp5 = new HomePage(driver);		
			hp5.inputtxt(rb.getString("Txt"));
			hp5.serch();			
			Thread.sleep(5000);
			SerchCriteriaPage scpg5 = new SerchCriteriaPage(driver);
			scpg5.ClkPrd();
			ProductDisplayPage pdspg5 = new ProductDisplayPage(driver);
			pdspg5.addtocart();
			pdspg5.lnkshpgcart();
			ShoppingCartPage spgcrtpg5 = new ShoppingCartPage(driver);
			spgcrtpg5.msgisply();*/
			
	    //7 Validate Image, Name, Model, Qty, Unitprice, Total of prd   JS Eceutor was pending
		/*	HomePage hp5 = new HomePage(driver);		
			hp5.inputtxt(rb.getString("Txt"));
			hp5.serch();			
			Thread.sleep(5000);
			SerchCriteriaPage scpg5 = new SerchCriteriaPage(driver);
			scpg5.clkmacbok();
			ProductDisplayPage pdspg5 = new ProductDisplayPage(driver);
			pdspg5.addtocart();
			pdspg5.lnkshpgcart();
			ShoppingCartPage spgcrtpg5 = new ShoppingCartPage(driver);
			boolean pdimg =spgcrtpg5.prdimg();
			Assert.assertEquals(pdimg, true);
			Thread.sleep(2000);
			boolean prdname = spgcrtpg5.prdname();
			Assert.assertEquals(prdname, true);
			Thread.sleep(2000);
			boolean prdtmodelno = spgcrtpg5.prdmodelno();
			Assert.assertEquals(prdtmodelno, true);
			Thread.sleep(2000);
			boolean prdctqty = spgcrtpg5.prdqty();
			Assert.assertEquals(prdctqty, true);
			Thread.sleep(2000);
			boolean pdunitpr = spgcrtpg5.isDisplayed();
			Assert.assertEquals(pdunitpr, true);
			Thread.sleep(2000);
			/*boolean prdtotalamountpr = spgcrtpg5.prdtotalamt();
			Assert.assertEquals(prdtotalamountpr, true);*/
		
		
		//8Validating qty of product in Shopping cart cage            //Number resource bundle to be identified
		/*HomePage hp7 = new HomePage(driver);		
		hp7.inputtxt(rb.getString("Txt"));
		hp7.serch();			
		Thread.sleep(5000);
		SerchCriteriaPage scpg7 = new SerchCriteriaPage(driver);
		scpg7.clkmacbok();
		ProductDisplayPage pdspg7 = new ProductDisplayPage(driver);
		pdspg7.addtocart();
		pdspg7.lnkshpgcart();
		ShoppingCartPage spgcrtpg7 = new ShoppingCartPage(driver);
		spgcrtpg7.qtyinput();*/
			
			
		//9Validating or updating the shopping cart page with 0 or -1       //RS for Number needs to be identified
			
		/*	HomePage hp8 = new HomePage(driver);		
			hp8.inputtxt(rb.getString("Txt"));
			hp8.serch();			
			Thread.sleep(5000);
			SerchCriteriaPage scpg8 = new SerchCriteriaPage(driver);
			scpg8.clkmacbok();
			ProductDisplayPage pdspg8 = new ProductDisplayPage(driver);
			pdspg8.addtocart();
			pdspg8.lnkshpgcart();
			ShoppingCartPage spgcrtpg8 = new ShoppingCartPage(driver);*/
			
	//10 Validate removing item from shopping cart page
		/*	HomePage hp9 = new HomePage(driver);		
			hp9.inputtxt(rb.getString("Txt"));
			hp9.serch();			
			Thread.sleep(5000);
			SerchCriteriaPage scpg9 = new SerchCriteriaPage(driver);
			scpg9.clkmacbok();
			ProductDisplayPage pdspg9 = new ProductDisplayPage(driver);
			pdspg9.addtocart();
			pdspg9.lnkshpgcart();
			ShoppingCartPage spgcrtpg9 = new ShoppingCartPage(driver);
			spgcrtpg9.clkrmove();
			boolean emptycart = spgcrtpg9.cartemptymsg();
			Assert.assertEquals(emptycart, true);*/
			
	//11 Validating page Heading, page Tile, page URL of shopping cart
			/*HomePage hp10 = new HomePage(driver);		
			hp10.inputtxt(rb.getString("Txt"));
			hp10.serch();			
			Thread.sleep(5000);
			SerchCriteriaPage scpg10 = new SerchCriteriaPage(driver);
			scpg10.clkmacbok();
			ProductDisplayPage pdspg10 = new ProductDisplayPage(driver);
			pdspg10.addtocart();
			pdspg10.lnkshpgcart();
			ShoppingCartPage spgcrtpg10 = new ShoppingCartPage(driver);
			boolean pghd = spgcrtpg10.pageheading();
			//Assert.assertEquals(pghd, true)
			boolean pagetitle  = spgcrtpg10.pgtitle();
			Assert.assertEquals(pagetitle, true);*/
			
	//12 Validating Breadcrums of shopping cart page.
			
		/*	HomePage hp11 = new HomePage(driver);		
			hp.inputtxt(rb.getString("Txt"));
			hp.serch();
			Thread.sleep(5000);
			SerchCriteriaPage scpg11 = new SerchCriteriaPage(driver);
			scpg11.pdimg();
			Thread.sleep(5000);
			ProductDisplayPage pddsipg11 = new ProductDisplayPage(driver);
			pddsipg11.addtocart();
			Thread.sleep(5000);
			pddsipg11.lnkshpgcart();
			ShoppingCartPage spgcrt11 = new ShoppingCartPage(driver);
			boolean shopingcrtmsg11 = spgcrt.msgisply();
			Assert.assertEquals(shopingcrtmsg11, true);
			MyWishlistPage breadcrums = new MyWishlistPage(driver);
			Assert.assertEquals(shopingcrtmsg, true);*/
			
	//13Validating Coupon Code Functionality
			
			/*HomePage hp = new HomePage(driver);		
			hp.inputtxt(rb.getString("Txt"));
			hp.serch();
			Thread.sleep(5000);
			SerchCriteriaPage scpg = new SerchCriteriaPage(driver);
			scpg.pdimg();
			Thread.sleep(5000);
			ProductDisplayPage pddsipg = new ProductDisplayPage(driver);
			pddsipg.addtocart();
			Thread.sleep(5000);
			pddsipg.lnkshpgcart();
			ShoppingCartPage spgcrt = new ShoppingCartPage(driver);
			boolean shopingcrtmsg = spgcrt.msgisply();
			Assert.assertEquals(shopingcrtmsg, true);
			spgcrt.drpcoupn();*/
			
			
	//14 Validate Checkout from Shopping cart Page         coupon code elemt is not getting interacted
			/*HomePage hp = new HomePage(driver);		
			hp.inputtxt(rb.getString("Txt"));
			hp.serch();
			Thread.sleep(5000);
			SerchCriteriaPage scpg = new SerchCriteriaPage(driver);
			scpg.pdimg();
			Thread.sleep(5000);
			ProductDisplayPage pddsipg = new ProductDisplayPage(driver);
			pddsipg.addtocart();
			Thread.sleep(5000);
			pddsipg.lnkshpgcart();
			ShoppingCartPage spgcrt = new ShoppingCartPage(driver);
			boolean shopingcrtmsg = spgcrt.msgisply();
			Assert.assertEquals(shopingcrtmsg, true);
			spgcrt.clkcheckout();
			CheckoutPage ckoutpg = new CheckoutPage(driver);
			ckoutpg.ischeckoutDisplayed();*/
			
	//15Continue to shopping from shopping cart page         coupon code elemt is not getting interacted
		/*	HomePage hp = new HomePage(driver);		
			hp.inputtxt(rb.getString("Txt"));
			hp.serch();
			Thread.sleep(5000);
			SerchCriteriaPage scpg = new SerchCriteriaPage(driver);
			scpg.pdimg();
			Thread.sleep(5000);
			ProductDisplayPage pddsipg = new ProductDisplayPage(driver);
			pddsipg.addtocart();
			Thread.sleep(5000);
			pddsipg.lnkshpgcart();
			ShoppingCartPage spgcrt = new ShoppingCartPage(driver);
			boolean shopingcrtmsg = spgcrt.msgisply();
			Assert.assertEquals(shopingcrtmsg, true);
			spgcrt.clkcotnshop();*/
			
	//16
			
			
			}
		catch (InterruptedException e) {
		    e.printStackTrace();
			}
	}
}
	

			
	
	

