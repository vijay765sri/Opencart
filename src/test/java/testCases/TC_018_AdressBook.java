package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ChangePasswordPage;
import pageObjects.AddressBookEntriesPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SitemapPage;
import pageObjects.MyAccountPage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_018_AdressBook extends BaseClass{
	@Test(groups = {"master"})
	public void test_AdressBook() {
		try 
		{
			// 1 Validate navigation to address book page from my account
				/*logger.info("Home page displayed..............."); 	
				HomePage hp = new HomePage(driver);
			    hp.clickMyAccount();
			    hp.clickLogin();
			    logger.info("Login page displayed...............");
			    LoginPage lp=new LoginPage(driver);
			    lp.setEmail(rb.getString("email"));
			    lp.setPassword(rb.getString("password"));
			    lp.clickLogin();
			    Thread.sleep(1000);
			    logger.info("My accountpage displayed...............");
			    MyAccountPage myaccpg = new MyAccountPage(driver);
			    boolean myacpg = myaccpg.isMyAccountPageExists();
			    Assert.assertEquals(myacpg, true);
			    logger.info("Drop down my account...............");
			    myaccpg.clkmodifyadd();
			    AddressBookEntriesPage adentrypg = new AddressBookEntriesPage(driver);
			    boolean enrypg = adentrypg.addresbookenrttitleExists();
			    Assert.assertEquals(enrypg, true);*/
			
			//2 Validate navigation to address book page from right column options
				/*logger.info("Home page displayed..............."); 	
				HomePage hp = new HomePage(driver);
				hp.clickMyAccount();
				hp.clickLogin();
				logger.info("Login page displayed...............");
				LoginPage lp=new LoginPage(driver);
				lp.setEmail(rb.getString("email"));
				lp.setPassword(rb.getString("password"));
				lp.clickLogin();
				Thread.sleep(1000);
				logger.info("My accountpage displayed...............");
				MyAccountPage myaccpg = new MyAccountPage(driver);
				boolean myacpg = myaccpg.isMyAccountPageExists();
				Assert.assertEquals(myacpg, true);
				logger.info("Drop down my account...............");
				myaccpg.clkadrsbok();
				AddressBookEntriesPage adentrypg = new AddressBookEntriesPage(driver);
				boolean enrypg = adentrypg.addresbookenrttitleExists();
				Assert.assertEquals(enrypg, true);*/
			
			//3 Validate navigation to address book entry page from site map page
				/*logger.info("Home page displayed..............."); 	
				HomePage hp = new HomePage(driver);
				hp.clickMyAccount();
				hp.clickLogin();
				logger.info("Login page displayed...............");
				LoginPage lp=new LoginPage(driver);
				lp.setEmail(rb.getString("email"));
				lp.setPassword(rb.getString("password"));
				lp.clickLogin();
				Thread.sleep(1000);
				logger.info("My accountpage displayed...............");
				MyAccountPage myaccpg = new MyAccountPage(driver);
				boolean myacpg = myaccpg.isMyAccountPageExists();
				Assert.assertEquals(myacpg, true);
				logger.info("Drop down my account...............");
				myaccpg.clksitmapft();
				SitemapPage stpg = new SitemapPage(driver);
				stpg.clkadress();				
				AddressBookEntriesPage adentrypg = new AddressBookEntriesPage(driver);
				boolean enrypg = adentrypg.addresbookenrttitleExists();
				Assert.assertEquals(enrypg, true);*/
			
			//4 Validate navigation to address book entry page from right column options before logging into app
			/*logger.info("Home page displayed..............."); 	
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clkregister();
			RegisterPage rgpg = new RegisterPage(driver);
			rgpg.clkregistr();
			logger.info("Providing customer details");
			rgpg.setFirstName(randomeString().toUpperCase());
			rgpg.setLastName(randomeString().toUpperCase());
			rgpg.setEmail(randomeString()+"@gmail.com");// randomly generated the email
			rgpg.setTelephone(randomeNumber());
			
			String password=randomAlphaNumeric();
			
			rgpg.setPassword(password);
			rgpg.setConfirmPassword(password);
			
			rgpg.setPrivacyPolicy();
			rgpg.clickContinue();
			
			
			
			logger.info("My accountpage displayed...............");
			MyAccountPage myaccpg = new MyAccountPage(driver);
			boolean myacpg = myaccpg.isMyAccountPageExists();
			Assert.assertEquals(myacpg, true);
			logger.info("Drop down my account...............");
			myaccpg.clksitmapft();
			SitemapPage stpg = new SitemapPage(driver);
			stpg.clkadress();				
			AddressBookEntriesPage adentrypg = new AddressBookEntriesPage(driver);
			boolean enrypg = adentrypg.addresbookenrttitleExists();
			Assert.assertEquals(enrypg, true);*/

			//5 Validate deafault address displayed in Address book entries page
			logger.info("Home page displayed..............."); 	
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clkregister();
			RegisterPage rgpg = new RegisterPage(driver);
			rgpg.clkregistr();
			logger.info("Providing customer details");
			rgpg.setFirstName(randomeString().toUpperCase());
			rgpg.setLastName(randomeString().toUpperCase());
			rgpg.setEmail(randomeString()+"@gmail.com");// randomly generated the email
			rgpg.setTelephone(randomeNumber());
			
			String password=randomAlphaNumeric();
			
			rgpg.setPassword(password);
			rgpg.setConfirmPassword(password);
			
			rgpg.setPrivacyPolicy();
			rgpg.clickContinue();
			
			
			
			logger.info("My accountpage displayed...............");
			MyAccountPage myaccpg = new MyAccountPage(driver);
			boolean myacpg = myaccpg.isMyAccountPageExists();
			Assert.assertEquals(myacpg, true);
			logger.info("Drop down my account...............");
			myaccpg.clksitmapft();
			SitemapPage stpg = new SitemapPage(driver);
			stpg.clkadress();				
			AddressBookEntriesPage adentrypg = new AddressBookEntriesPage(driver);
			boolean enrypg = adentrypg.addresbookenrttitleExists();
			Assert.assertEquals(enrypg, true);

	
		
				}
		    
				catch (InterruptedException e) {
				e.printStackTrace();
				}
	}
}

