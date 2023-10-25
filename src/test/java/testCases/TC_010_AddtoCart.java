package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductDisplayPage;
import pageObjects.SerchCriteriaPage;
import pageObjects.ShoppingCartPage;
import pageObjects.MyWishlistPage;
import testBase.BaseClass;

public class TC_010_AddtoCart extends BaseClass{

	@Test(groups = {"master"})
		public void test_AddtoCartTest()
	{
		//1. Adding Prodcut to cart
		HomePage hp1 = new HomePage(driver);		
		hp1.inputtxt(rb.getString("Txt"));
		hp1.serch();
		SerchCriteriaPage scpg1 = new SerchCriteriaPage(driver);
		scpg1.productdisplayed();
		ProductDisplayPage pddis1 = new ProductDisplayPage(driver);
		pddis1.addtocart();
		boolean prdaddedtocartsucessmsg1 = pddis1.prdaddedtocartmsg();
		Assert.assertEquals(prdaddedtocartsucessmsg1, true);
		
		//Using two products in Serch
		/*HomePage hp2 = new HomePage(driver);		
		//hp2.inputtxt1(rb.getString("Txt1"));
		hp2.inputMacbook(rb.getString("Txt1"));
		hp2.serch();
		SerchCriteriaPage scpg2 = new SerchCriteriaPage(driver);
		scpg2.productdisplayed();
		ProductDisplayPage pddis2 = new ProductDisplayPage(driver);
		pddis2.addtocart();
		boolean prdaddedtocartsucessmsg2 = pddis2.prdaddedtocartmsg();
		Assert.assertEquals(prdaddedtocartsucessmsg2, true);
		
		
		/*HomePage hp2 = new HomePage(driver);
		hp2.inputtxt2(rb.getString("Txt1"));
		hp2.serch();
		SerchCriteriaPage scpg2 = new SerchCriteriaPage(driver);
		scpg1.productdisplayed();
		ProductDisplayPage pddis2 = new ProductDisplayPage(driver);
		pddis1.addtocart();
		boolean prdaddedtocartsucessmsg2 = pddis1.prdaddedtocartmsg();
		Assert.assertEquals(prdaddedtocartsucessmsg2, true);*/
		
	/*	HomePage hp2 = new HomePage(driver);		
		hp2.inputtxt(rb.getString("Txt2"));
		hp2.serch();
		SerchCriteriaPage scpg2 = new SerchCriteriaPage(driver);
		scpg2.productdisplayed();
		ProductDisplayPage pddis2 = new ProductDisplayPage(driver);
		pddis2.addtocart();
		boolean prdaddedtocartsucessmsg2 = pddis2.prdaddedtocartmsg();
		Assert.assertEquals(prdaddedtocartsucessmsg2, true);*/
		
	
		//2. Adding Product to Wishlist
		/*HomePage hp2 = new HomePage(driver);
		hp2.clearInputBoxTest();
		hp2.inputtxt(rb.getString("Txt"));
		hp2.serch();
		SerchCriteriaPage scpg2 = new SerchCriteriaPage(driver);
		scpg2.prdImageisdisplayed();
		scpg2.addprdtowishlist();
		boolean msgpdaddcart = scpg2.prdaddcartmsgisdisplayed();
		Assert.assertEquals(msgpdaddcart, true);
		//WishlistPage
		/*MyWishlistPage mywishlstpg = new MyWishlistPage(driver);
		mywishlstpg.clkaddtocart();
		mywishlstpg.clkshoppingcartlnk();*/
		//ShoppingCartPage
		/*ShoppingCartPage shpgcartpg1 = new ShoppingCartPage(driver);
		boolean productaddedtocart = shpgcartpg1.prddisply();
		Assert.assertEquals(productaddedtocart, true);*/
		//3Add Prodcut to cart from Serch Results
	/*	HomePage hp3 = new HomePage(driver);
		hp3.clearInputBoxTest();
		hp3.inputtxt(rb.getString("Txt"));
		hp3.serch();
		SerchCriteriaPage scpg3 = new SerchCriteriaPage(driver);
		scpg3.prdImageisdisplayed();
		scpg3.clkaddtocart();
		scpg3.clkblkcart();
		scpg3.clkviewcart();
		ShoppingCartPage shpgcartpg2 = new ShoppingCartPage(driver);
		boolean productadedtocart = shpgcartpg2.prddisply();
		Assert.assertEquals(productadedtocart, true);
		//4.Hover mouse options test
		/*HomePage hp = new HomePage(driver);
		hp.hoverOverDesktop();*/
		//5 Clicking on Featured Product
	/*	HomePage hp4 = new HomePage(driver);
		hp4.featuredaddtocart();
		boolean msg = hp4.featuredaddtocartmsgisDisplayed();
		Assert.assertEquals(msg, true);*/
		
		}
}
