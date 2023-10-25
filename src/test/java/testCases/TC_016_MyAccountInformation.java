package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.LoginPage;
import pageObjects.SitemapPage;
import pageObjects.MyAccountInformationPage;
import pageObjects.ProductDisplayPage;
import pageObjects.SerchCriteriaPage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_016_MyAccountInformation extends BaseClass{
	
	@Test(groups = {"master"})
	public void test_MyAccountInformation()
	{
		try 
		{
	// 1. Navigate to My Account info from my account page
			HomePage hp = new HomePage(driver);
			 hp.clickMyAccount();
			 hp.clickLogin();
			 Thread.sleep(2000);
			 LoginPage lp=new LoginPage(driver);
			 lp.setEmail(rb.getString("email"));
			 lp.setPassword(rb.getString("password"));
			 lp.clickLogin(); 
			 Thread.sleep(2000);
			 MyAccountPage macp = new MyAccountPage(driver);
			/* macp.clkmyaccount();
			Thread.sleep(2000);
			 macp.clceditinfo();
			 MyAccountInformationPage myactinpg = new MyAccountInformationPage(driver);
			 boolean myactinfopage =myactinpg.myactinfopageisdiply();
			 Assert.assertEquals(myactinfopage, true);*/
			 
		//2. Navigate to My Account info from my account page
			/*HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			Thread.sleep(2000);
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickLogin(); 
			Thread.sleep(2000);
			MyAccountPage macp = new MyAccountPage(driver);
			macp.clkeditacc();
			MyAccountInformationPage myactinpg = new MyAccountInformationPage(driver);
			boolean myactinfopage =myactinpg.myactinfopageisdiply();
			Assert.assertEquals(myactinfopage, true);*/
				 
	//3. Navigate to My Account infopage  from my sitemap page
			/*HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			Thread.sleep(2000);
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickLogin(); 
			Thread.sleep(2000);
			MyAccountPage macp = new MyAccountPage(driver);
			macp.clksitmapft();
			Thread.sleep(2000);
			SitemapPage stmappg = new SitemapPage(driver);
			stmappg.clkacctinfo();
			Thread.sleep(2000);
			MyAccountInformationPage myactinpg = new MyAccountInformationPage(driver);
			boolean myactinfopage =myactinpg.myactinfopageisdiply();
			Assert.assertEquals(myactinfopage, true);*/
			
//4. validate updating account details in my account infor pg
		/*	HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			Thread.sleep(2000);
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickLogin(); 
			Thread.sleep(2000);
			MyAccountPage macp = new MyAccountPage(driver);
			macp.lnkMyAccount();
			macp.clkmyaccount();
			Thread.sleep(2000);
			macp.clceditinfo();
			MyAccountInformationPage myactinpg = new MyAccountInformationPage(driver);
			boolean myactinfopage =myactinpg.myactinfopageisdiply();
			Assert.assertEquals(myactinfopage, true);
			Thread.sleep(2000);
			myactinpg.inptfirstname("VIJAY");
			myactinpg.inptlastname("SREEDHAR");
			myactinpg.inputemail("vijay567sri@gmail.com");
			myactinpg.inputtel("8618618491");
			myactinpg.clkctnbtn();	
			Thread.sleep(2000);
			MyAccountPage macp1 = new MyAccountPage(driver);
			macp1.sucsmsgisdisply();
			macp.lnkMyAccount();
			macp.clickLogout();
			hp.clickMyAccount();
			hp.clickLogin();
			LoginPage lp1=new LoginPage(driver);
			lp1.setEmail(rb.getString("email1"));
			lp1.setPassword(rb.getString("password1"));
			lp1.clickLogin(); */
			 
			/*macp.clksitmapft();
			Thread.sleep(2000);
			SitemapPage stmappg = new SitemapPage(driver);
			stmappg.clkacctinfo();
			Thread.sleep(2000);
			MyAccountInformationPage myactinpg = new MyAccountInformationPage(driver);
			boolean myactinfopage =myactinpg.myactinfopageisdiply();
			Assert.assertEquals(myactinfopage, true);*/
			
//5. Validating making all fields empty and update
			
			/*HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			Thread.sleep(2000);
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickLogin(); 
			Thread.sleep(2000);
			MyAccountPage macp = new MyAccountPage(driver);
			macp.lnkMyAccount();
			macp.clkmyaccount();
			Thread.sleep(2000);
			macp.clceditinfo();
			MyAccountInformationPage myactinpg = new MyAccountInformationPage(driver);
			boolean myactinfopage =myactinpg.myactinfopageisdiply();
			Assert.assertEquals(myactinfopage, true);
			Thread.sleep(2000);
			myactinpg.fnamefieldinput();
			myactinpg.lnamefieldinput();
			myactinpg.emailfieldinput();
			myactinpg.telfieldinput();
			myactinpg.clkctnbtn();
			Thread.sleep(2000);
			boolean falertmsg = myactinpg.fnmalertmgisdiply();
			Assert.assertEquals(falertmsg, true);
			boolean lalertmsg = myactinpg.lnmalertmgisdiply();
			Assert.assertEquals(lalertmsg, true);
			boolean emlalertmsg = myactinpg.emlalertmgisdiply();
			Assert.assertEquals(emlalertmsg, true);
			boolean telalertmsg = myactinpg.telalertmgisdiply();
			Assert.assertEquals(telalertmsg, true);*/
			
	//6.Validate all fields in my account information having placeholders
			/*HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			Thread.sleep(2000);
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickLogin(); 
			Thread.sleep(2000);
			MyAccountPage macp = new MyAccountPage(driver);
			macp.lnkMyAccount();
			macp.clkmyaccount();
			Thread.sleep(2000);
			macp.clceditinfo();
			MyAccountInformationPage myactinpg = new MyAccountInformationPage(driver);
			boolean myactinfopage =myactinpg.myactinfopageisdiply();
			Assert.assertEquals(myactinfopage, true);
			Thread.sleep(2000);
			myactinpg.fnamefieldinput();
			myactinpg.lnamefieldinput();
			myactinpg.emailfieldinput();
			myactinpg.telfieldinput();*/
			
	//7. Validate all field in my account info are marked as mandatory
			
		/*	HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			Thread.sleep(2000);
			LoginPage lp=new LoginPage(driver);
			lp.clearemail();
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickLogin(); 
			Thread.sleep(2000);
			MyAccountPage macp = new MyAccountPage(driver);
			macp.lnkMyAccount();
			macp.clkmyaccount();
			Thread.sleep(2000);
			macp.clceditinfo();
			MyAccountInformationPage myactinpg = new MyAccountInformationPage(driver);
			boolean myactinfopage =myactinpg.myactinfopageisdiply();
			Assert.assertEquals(myactinfopage, true);
			Thread.sleep(2000);
			myactinpg.fnamefieldinput();
			myactinpg.lnamefieldinput();
			myactinpg.emailfieldinput();
			myactinpg.telfieldinput();
			myactinpg.clkctnbtn();
			Thread.sleep(2000);
			boolean fnamalert = myactinpg.fnmalrtisdiply();
			Assert.assertEquals(fnamalert, true);
			boolean lnamalert = myactinpg.lnmalrtisdiply();
			Assert.assertEquals(lnamalert, true);
			boolean malalert = myactinpg.emlalrtisdiply();
			Assert.assertEquals(malalert, true);
			boolean telalert = myactinpg.telalrtisdiply();
			Assert.assertEquals(telalert, true);*/
			
	//8.Validate providing invalid emailformat into email address field
			
			/*HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			Thread.sleep(2000);
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			Thread.sleep(2000);
			MyAccountPage macp = new MyAccountPage(driver);
			macp.clkedituraccinfo();
			MyAccountInformationPage myacinfopg. = new MyAccountInformationPage(driver);
			myacinfopg.inputedit();
			
			if(expres.equals("Valid"))
		    {
		    	if(targetpage==true)
		    	{
		    		myacinfopg.clkctnbtn();
		    		macp.clickLogout();
		    		Assert.assertTrue(true);
		    	}
		    	else
		    	{
		    		Assert.assertTrue(false);
		    	}
		    }
		    if (expres.equals("Invalid"))
		    {
		    	if(targetpage==true)
		    	{
		    		macp.clickLogout();
		    		Assert.assertTrue(false);
		    	}
		    else
		    	{
		    		Assert.assertTrue(true);
		    	}
		    }
		    }
		
			MyAccountInformationPage myactinpg = new MyAccountInformationPage(driver);
			boolean myactinfopage =myactinpg.myactinfopageisdiply();
			Assert.assertEquals(myactinfopage, true);
			Thread.sleep(2000);
			/*if(expres.equals("Valid"))
		    {
		    	if(targetpage==true)
		    	{
		    		macp.clickLogout();
		    		Assert.assertTrue(true);
		    	}
		    	else
		   	{
		    		Assert.assertTrue(false);
		    	}
		    }
		    if (expres.equals("Invalid"))
		    {
		    	if(targetpage==true)
		    	{
		    		macp.clickLogout();
		    		Assert.assertTrue(false);
		    	}
		    else
		    	{
		    		Assert.assertTrue(true);
		    	}
		    }*/
		    
	//9.Verifying the back button in My Account Information Page
			/*HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			Thread.sleep(2000);
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickLogin(); 
			Thread.sleep(2000);
			MyAccountPage macp = new MyAccountPage(driver);
			boolean msg = macp.isMyAccountPageExists();
			macp.clkedituraccinfo();
			MyAccountInformationPage myacinfopg1 = new MyAccountInformationPage(driver);
			myacinfopg1.inputedit("Vijay");
			myacinfopg1.clkback();
			myacinfopg1.inputedit("Vijay");
			MyAccountInformationPage myacinfopg2 = new MyAccountInformationPage(driver);
			boolean msg1 = myacinfopg2.myactinfopageisdiply();*/
			
		}	catch (InterruptedException e) {
		    e.printStackTrace();
			}
	}
}