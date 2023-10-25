package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SitemapPage;
import pageObjects.MyAccountPage;
import pageObjects.SerchCriteriaPage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class TC_015_MyAccount extends BaseClass{
	
	@Test(groups = {"master"})
	public void test_MyAccount () {
		try
		{
			//1. Validate Navigate to MyAccount Page from Order Sucess Page
			/* HomePage hp = new HomePage(driver);
			 hp.clickMyAccount();
			 hp.clickLogin();
			 LoginPage lp=new LoginPage(driver);
			 lp.setEmail(rb.getString("email"));
			 lp.setPassword(rb.getString("password"));
			 lp.clickLogin();
			 HomePage hp1 = new HomePage(driver);		
			 hp1.inputtxt(rb.getString("Txt"));
			 hp1.serch();
			 Thread.sleep(2000);
			 SerchCriteriaPage scpg = new SerchCriteriaPage(driver);
			 scpg.clkaddtocart();
			 Thread.sleep(2000);
			 boolean sucessmsg = scpg.prdaddcartmsgisdisplayed();
			 Assert.assertEquals(sucessmsg, true);
			 hp.clickMyAccount();
			 hp.clkmyaccount();
			 MyAccountPage macp = new MyAccountPage(driver);
			 boolean targetpage = macp.isMyAccountPageExists();
			 Assert.assertEquals(targetpage, true);*/
			//2. Validate Navigate to My Account page on Login
			/* HomePage hp = new HomePage(driver);
			 hp.clickMyAccount();
			 hp.clickLogin();
			 LoginPage lp=new LoginPage(driver);
			 Thread.sleep(2000);
			 lp.setEmail(rb.getString("email"));
			 lp.setPassword(rb.getString("password"));
			 lp.clickLogin();
			 Thread.sleep(2000);
			 MyAccountPage macp = new MyAccountPage(driver);
			 boolean targetpage = macp.isMyAccountPageExists();
			 Assert.assertEquals(targetpage, true);*/
			 
	//3. Validate Navigation to Myaccount using my account option
			/* HomePage hp = new HomePage(driver);
			 Thread.sleep(2000);
			 hp.clickMyAccount();
			 hp.clickLogin();
			 LoginPage lp=new LoginPage(driver);
			 Thread.sleep(2000);
			 lp.setEmail(rb.getString("email"));
			 lp.setPassword(rb.getString("password"));
			 lp.clickLogin();
			 Thread.sleep(2000);
			 hp.clickMyAccount();
			 hp.clkmyaccount();
			 MyAccountPage macp = new MyAccountPage(driver);
			 boolean targetpage = macp.isMyAccountPageExists();
			 Assert.assertEquals(targetpage, true);*/
			 
	  //4. Validate navigate to myaccount page using right column option
			 
			/* HomePage hp = new HomePage(driver);
			 Thread.sleep(2000);
			 hp.clickMyAccount();
			 hp.clickLogin();
			 LoginPage lp=new LoginPage(driver);
			 Thread.sleep(2000);
			 lp.setEmail(rb.getString("email"));
			 lp.setPassword(rb.getString("password"));
			 lp.clickLogin();
			 MyAccountPage macp = new MyAccountPage(driver);
			 boolean targetpage = macp.isMyAccountPageExists();
			 Assert.assertEquals(targetpage, true);
			 macp.clkordrhis();	 			 
			 hp.clickMyAccount();
			 hp.clkmyaccount();
			 MyAccountPage macp1 = new MyAccountPage(driver);
			 boolean targetpage1 = macp1.isMyAccountPageExists();
			 Assert.assertEquals(targetpage1, true);*/
			 
	//5. vlidating navigate to my account page by using option in site map
			/* HomePage hp = new HomePage(driver);
			 Thread.sleep(2000);
			 hp.clickMyAccount();
			 hp.clickLogin();
			 LoginPage lp=new LoginPage(driver);
			 Thread.sleep(2000);
			 lp.setEmail(rb.getString("email"));
			 lp.setPassword(rb.getString("password"));
			 lp.clickLogin();
			 MyAccountPage macp = new MyAccountPage(driver);
			 macp.clkfooter();
			 SitemapPage stmappg = new SitemapPage(driver);
			 stmappg.clcmyact();			 
			 MyAccountPage macp1 = new MyAccountPage(driver);
			 boolean targetpage1 = macp1.isMyAccountPageExists();
			 Assert.assertEquals(targetpage1, true);*/
			 
	//6. Validate Breadcrump in myaccount page
			/* HomePage hp = new HomePage(driver);
			 Thread.sleep(2000);
			 hp.clickMyAccount();
			 hp.clickLogin();
			 LoginPage lp=new LoginPage(driver);
			 Thread.sleep(2000);
			 lp.setEmail(rb.getString("email"));
			 lp.setPassword(rb.getString("password"));
			 lp.clickLogin();
			 MyAccountPage macp = new MyAccountPage(driver);
			 macp.clickMyAccount();
			 macp.clickMyAccount();
			 boolean breadcum  = macp.brscrumshmpgdisdisply();
			 Assert.assertEquals(breadcum, true);*/
		//7. Validate PAge URL, Page Heading, Page Title
			 HomePage hp = new HomePage(driver);
			 Thread.sleep(2000);
			 hp.clickMyAccount();
			 hp.clickLogin();
			 LoginPage lp=new LoginPage(driver);
			 Thread.sleep(2000);
			 lp.setEmail(rb.getString("email"));
			 lp.setPassword(rb.getString("password"));
			 lp.clickLogin();
			 MyAccountPage macp = new MyAccountPage(driver);
		//	 macp.clickMyAccount();
		//	 macp.clickMyAccount();
			 boolean breadcum  = macp.brscrumshmpgdisdisply();
			 Assert.assertEquals(breadcum, true);
			 /*String currentUrl = macp.getCurrentPageUrl();
		     String expectedUrl = "https://tutorialsninja.com/demo/"; 
		     Assert.assertEquals(currentUrl, expectedUrl,"Account page URL dosnet match URL");*/
			 boolean pagetitle = macp.pgtitleisdisply();
			 Assert.assertEquals(pagetitle, true);
			boolean pageheading = macp.pageheadingisdisply();
			Assert.assertEquals(pageheading, true);
			
		}
		catch (InterruptedException e) {
		    e.printStackTrace();
			}
		
	}
}
	



