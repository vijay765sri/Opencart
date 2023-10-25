 package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductDisplayPage;
import pageObjects.MyWishlistPage;
import pageObjects.MyAccountPage;
import pageObjects.SerchCriteriaPage;
import testBase.BaseClass;

public class TC_011_WishList extends BaseClass{
	
	
	@Test(groups = {"master"})
	public void test_WishListTest()
	{try
	{
		//1. Addition of prd to wishlist from related products
		HomePage hp = new HomePage(driver);
		 hp.clickMyAccount();
		 hp.clickLogin();
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmail(rb.getString("email"));
		 lp.setPassword(rb.getString("password"));
		 lp.clickLogin();
		 hp.inputtxt(rb.getString("Txt"));
		hp.serch();
		Thread.sleep(5000);
		SerchCriteriaPage scpg = new SerchCriteriaPage(driver);
		scpg.pdimg();
		Thread.sleep(5000);
		ProductDisplayPage pddsipg = new ProductDisplayPage(driver);
		pddsipg.clkwishlistprddisplay();
		Thread.sleep(5000);
		boolean msgdis = pddsipg.msgisdisplayed();
		Assert.assertEquals(msgdis, true);
		pddsipg.lnkwishlst();
		MyWishlistPage mywishpg= new MyWishlistPage(driver);
		boolean mywishlistpg = mywishpg.Prdimgisplyd();
		Assert.assertEquals(mywishlistpg, true);
		
		//2. Adding product to wish list from Featured section
	/*	HomePage hp1 = new HomePage(driver);		
		hp1.inputtxt(rb.getString("Txt"));
		hp1.serch();
		Thread.sleep(5000);
		SerchCriteriaPage scpg1 = new SerchCriteriaPage(driver);
		scpg1.ClkPrd();
		Thread.sleep(5000);
		ProductDisplayPage pddsipg1 = new ProductDisplayPage(driver);
		pddsipg1.clkwishlst();
		Thread.sleep(5000);
		pddsipg1.clkstorelogo();
		HomePage hp2 = new HomePage(driver);
		Thread.sleep(5000);
		hp2.clckfearturedprd();
		boolean wishmsg = hp2.WishlistmsgisDisplayed();
		Assert.assertEquals(wishmsg, true);
		MyWishlistPage mywishpg = new MyWishlistPage(driver);
		mywishpg.prddispld();*/
		//Hover the mouse test
		
		
		
		
		
		//4Validate the product to wishlist from Serch page
		/*HomePage hp3 = new HomePage(driver);		
		hp3.inputtxt(rb.getString("Txt"));
		hp3.serch();
		Thread.sleep(5000);
		SerchCriteriaPage scpg2 = new SerchCriteriaPage(driver);
		scpg2.clckpdwishlst();
		Thread.sleep(5000);
		scpg2.pdadwishlst();
		boolean wishmsg = hp3.WishlistmsgisDisplayed();
		Assert.assertEquals(wishmsg, true);*/
		
		//5 Navigate to Wishlist Page from Wishlist sucess Message
		/*HomePage hp4 = new HomePage(driver);		
		hp4.inputtxt(rb.getString("Txt"));
		hp4.serch();
		Thread.sleep(5000);
		SerchCriteriaPage scpg3 = new SerchCriteriaPage(driver);
		scpg3.ClkPrd();
		Thread.sleep(5000);
		ProductDisplayPage pddsipg3 = new ProductDisplayPage(driver);
		pddsipg3.clkwishlistprddisplay();
		Thread.sleep(5000);
		boolean msgdis3 = pddsipg3.msgisdisplayed();
		Assert.assertEquals(msgdis3, true);*/
		
		//6 validate the navigation to wishlist by wishlist header option
	/*	HomePage hp5 = new HomePage(driver);		
		hp5.inputtxt(rb.getString("Txt"));
		hp5.serch();
		Thread.sleep(5000);
		SerchCriteriaPage scpg5 = new SerchCriteriaPage(driver);
		scpg5.ClkPrd();
		Thread.sleep(5000);
		ProductDisplayPage pddsipg5 = new ProductDisplayPage(driver);
		pddsipg5.clkwishlst();
		Thread.sleep(5000);
		boolean msgdis5 = pddsipg5.msgisdisplayed();
		Assert.assertEquals(msgdis5, true);
		pddsipg5.Wishlistft();
		LoginPage lp=new LoginPage(driver);
	    lp.setEmail(rb.getString("email"));
	    lp.setPassword(rb.getString("password"));
	    lp.clickLogin();
		MyWishlistPage mywishlst = new MyWishlistPage(driver);
		boolean wishlistpg = mywishlst.sctwishdisdispld();
		Assert.assertEquals(wishlistpg, true);*/
		
		//7 Breadcrum options check
		/*HomePage hp6 = new HomePage(driver);		
		hp6.inputtxt(rb.getString("Txt"));
		hp6.serch();
		Thread.sleep(5000);
		SerchCriteriaPage scpg6 = new SerchCriteriaPage(driver);
		scpg6.ClkPrd();
		Thread.sleep(5000);
		scpg6.clckpdwishlst();
		scpg6.lnkwishlist();
		LoginPage lp=new LoginPage(driver);
	    lp.setEmail(rb.getString("email"));
	    lp.setPassword(rb.getString("password"));
	    lp.clickLogin();
		MyWishlistPage mywishlst = new MyWishlistPage(driver);
		boolean wishlistpg = mywishlst.sctwishdisdispld();
		Assert.assertEquals(wishlistpg, true);
		boolean breadcrum = mywishlst.breadcrumdisplydisdispld();
		Assert.assertEquals(breadcrum, true);*/
		
		//8 Validate mywishlist where prd not added to cart//Error//
		/*HomePage hp7 = new HomePage(driver);	
		hp7.clickMyAccount();
		hp7.clickLogin();
		LoginPage lp7=new LoginPage(driver);
	    lp7.setEmail(rb.getString("email"));
	    lp7.setPassword(rb.getString("password"));
	    lp7.clickLogin();
		MyAccountPage maccpg7 = new MyAccountPage(driver);
		maccpg7.inpttxt(rb.getString("Txt3"));
		maccpg7.srch();
		maccpg7.clkwish();
		Thread.sleep(5000);
		MyWishlistPage mywishlst7 = new MyWishlistPage(driver);
		boolean wishmsg7 = mywishlst7.msgwshemptyisplydisdispld();
		Assert.assertEquals(wishmsg7, true);
		mywishlst7.clckctnbtn();
		MyAccountPage maccpg8 = new MyAccountPage(driver);
		boolean myacct = maccpg8.isMyAccountPageExists();
		Assert.assertEquals(myacct, true);*/
		
		//9.Remove Prodcust from Wishlist
		/*HomePage hp8 = new HomePage(driver);		
		hp8.inputtxt(rb.getString("Txt"));
		hp8.serch();
		Thread.sleep(5000);
		SerchCriteriaPage scpg8 = new SerchCriteriaPage(driver);
		scpg8.ClkPrd();
		Thread.sleep(5000);
		ProductDisplayPage pddsipg8 = new ProductDisplayPage(driver);
		pddsipg8.clkwishlst();
		Thread.sleep(5000);
		boolean msgdis8 = pddsipg8.msgisdisplayed();
		Assert.assertEquals(msgdis8, true);
		pddsipg8.clkbtnlnk();LoginPage lp7=new LoginPage(driver);
	    lp7.setEmail(rb.getString("email"));
	    lp7.setPassword(rb.getString("password"));
	    lp7.clickLogin();
		MyWishlistPage mywishpg = new MyWishlistPage(driver);
		mywishpg.clkremove();
		boolean msgempty = mywishpg.wishlistemptymsgisplydisdispld();
		Assert.assertEquals(msgempty, true);*/
		
		//10 Adding the product to cart from my wishlist
		/*HomePage hp9 = new HomePage(driver);		
		hp9.inputtxt(rb.getString("Txt"));
		hp9.serch();
		Thread.sleep(5000);
		SerchCriteriaPage scpg9 = new SerchCriteriaPage(driver);
		scpg9.ClkPrd();
		Thread.sleep(5000);
		ProductDisplayPage pddsipg9 = new ProductDisplayPage(driver);
		pddsipg9.clkwishlst();
		Thread.sleep(5000);
		boolean msgdis9 = pddsipg9.msgisdisplayed();
		Assert.assertEquals(msgdis9, true);
		pddsipg9.clkbtnlnk();
		LoginPage lp9=new LoginPage(driver);
	    lp9.setEmail(rb.getString("email"));
	    lp9.setPassword(rb.getString("password"));
	    lp9.clickLogin();
		MyWishlistPage mywishpg9 = new MyWishlistPage(driver);
		mywishpg9.addcartbtn();
		boolean sucessmsg = mywishpg9.sucesmsgisplydisdispld();
		Assert.assertEquals(sucessmsg, true);*/
		
	}
	catch (InterruptedException e) {
	    e.printStackTrace();
	}

}
}
 