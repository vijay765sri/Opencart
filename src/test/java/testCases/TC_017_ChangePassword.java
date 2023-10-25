package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.ChangePasswordPage;
import testBase.BaseClass;

public class TC_017_ChangePassword extends BaseClass{
	@Test(groups = {"master"})
	public void test_ChangePassword() {
		try 
		{
			// 1 Validate navigation to Change password page from My Account Page
			/*	logger.info("Home page displayed..............."); 	
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
			    Thread.sleep(1000);
			    logger.info("Drop down my account...............");
			    myaccpg.dropmyacnt();
			    Thread.sleep(1000);
			    logger.info("Click My Account ...............");
			    myaccpg.myact();
			    Thread.sleep(1000);
			    logger.info("Clicking change password ...............");
			    myaccpg.clklnkchangpwd();
			    Thread.sleep(1000);
			    logger.info("Changepassword page displayed ...............");
			    ChangePasswordPage cngpwd = new ChangePasswordPage(driver);
			    boolean cangpwd = cngpwd.cngpwdhedisDisplayed();
			    Assert.assertEquals(cangpwd, true);*/
			// 2 Validate navigation to Change password page using password right column option
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
		    Thread.sleep(1000);
		    logger.info("Drop down my account...............");
		    myaccpg.dropmyacnt();
		    Thread.sleep(1000);
		    logger.info("Click My Account ...............");
		    myaccpg.myact();
		    Thread.sleep(1000);
		    logger.info("Clicking change password ...............");
		    myaccpg.clkpswd();
		    Thread.sleep(1000);
		    logger.info("Changepassword page displayed ...............");
		    ChangePasswordPage cngpwd = new ChangePasswordPage(driver);
		    boolean cangpwd = cngpwd.cngpwdhedisDisplayed();
		    Assert.assertEquals(cangpwd, true);*/
			
			// 3 Validate navigation to Change password page from Site Map Page
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
			Thread.sleep(1000);
			logger.info("Click on SIte map in Footer...............");
			myaccpg.clksitemap();
			Thread.sleep(1000);
			logger.info("Click on password link...............");
			myaccpg.clkpwd();
			Thread.sleep(1000);
			logger.info("Changepassword page displayed ...............");
			ChangePasswordPage cngpwd = new ChangePasswordPage(driver);
			boolean cangpwd = cngpwd.cngpwdhedisDisplayed();
			Assert.assertEquals(cangpwd, true);*/
			
			// 4 Validate changing the password
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
			Thread.sleep(1000);
			myaccpg.clkpswd();			
			logger.info("Changepassword page displayed ...............");
			ChangePasswordPage cngpwd = new ChangePasswordPage(driver);
			boolean cangpwd = cngpwd.cngpwdhedisDisplayed();
			Assert.assertEquals(cangpwd, true);
			cngpwd.inptpwd("nomith@567");
			cngpwd.inptpwdconfrm("nomith@567");
			cngpwd.clkcontn();
			MyAccountPage myaccpg1 = new MyAccountPage(driver);
			boolean paswdchangsucss = myaccpg1.pwdmsgsucesfulisdisply();
			Assert.assertEquals(paswdchangsucss, true);*/
			
			// 5 Validate changing the password without entering anything into change password page
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
			Thread.sleep(1000);
			myaccpg.clkpswd();			
			logger.info("Changepassword page displayed ...............");
			ChangePasswordPage cngpwd = new ChangePasswordPage(driver);
			boolean cangpwd = cngpwd.cngpwdhedisDisplayed();
			Assert.assertEquals(cangpwd, true);
			cngpwd.clkcontn();
			boolean alrtmsg = cngpwd.alertmsgisDisplayed();
			Assert.assertEquals(alrtmsg, true);*/
			
			// 6 Validate entering different password in to password and password confirm field while changing the password
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
			Thread.sleep(1000);
			myaccpg.clkpswd();	
			logger.info("Changepassword page displayed ...............");
			ChangePasswordPage cngpwd = new ChangePasswordPage(driver);
			boolean cangpwd = cngpwd.cngpwdhedisDisplayed();
			Assert.assertEquals(cangpwd, true);
			cngpwd.inptpwd("Nomith@567");
			cngpwd.inptpwdconfrm("mith@567");
			cngpwd.clkcontn();
			boolean alrt = cngpwd.pwdmismatchalrtisDisplayed();
			Assert.assertEquals(alrt, true);*/
			
			// 7 Validate all pasword fields in th echange password page are marked as mandatoyr 
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
			Thread.sleep(1000);
			myaccpg.clkpswd();	
			logger.info("Changepassword page displayed ...............");
			ChangePasswordPage cngpwd = new ChangePasswordPage(driver);
			boolean cangpwd = cngpwd.cngpwdhedisDisplayed();
			Assert.assertEquals(cangpwd, true);
			boolean mandmarking = cngpwd.pwdmandatoryisDisplayed();
			Assert.assertEquals(mandmarking, true);
			boolean mancofrmmarking = cngpwd.cnfpwdmantoryisDisplayed();
			Assert.assertEquals(mancofrmmarking, true);*/
			
			// 8 Validate the text entered into fields in change pswd field is toggled to hide its display 
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
			Thread.sleep(1000);
			myaccpg.clkpswd();	
			logger.info("Changepassword page displayed ...............");
			ChangePasswordPage cngpwd = new ChangePasswordPage(driver);
			boolean cangpwd = cngpwd.cngpwdhedisDisplayed();
			Assert.assertEquals(cangpwd, true);
			cngpwd.inptpwd("Nomith@567");
			boolean togpwd = cngpwd.toggpwdisDisplayed();
			Assert.assertEquals(togpwd, true);*/
			
			// 9 Validate back button in change password page 
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
			Thread.sleep(1000);
			myaccpg.clkpswd();	
			logger.info("Changepassword page displayed ...............");
			ChangePasswordPage cngpwd = new ChangePasswordPage(driver);
			boolean cangpwd = cngpwd.cngpwdhedisDisplayed();
			Assert.assertEquals(cangpwd, true);
			cngpwd.inptpwd("Nomith@567");
			cngpwd.inptpwdconfrm("mith@567");
			cngpwd.clkbackbtn();
			myaccpg.clkpswd();	
			logger.info("Changepassword page displayed ...............");
			ChangePasswordPage cngpwd1 = new ChangePasswordPage(driver);
			boolean cangpwd1 = cngpwd1.cngpwdhedisDisplayed();
			Assert.assertEquals(cangpwd1, true);
			boolean epmty = cngpwd1.inptpawdisDisplayed();
			Assert.assertEquals(epmty, true);
			boolean emptyconfrm = cngpwd1.inptconpawdisDisplayed();
			Assert.assertEquals(emptyconfrm, true);*/
			
			//10 Validate breadcrums in change password page 
			logger.info("Home page displayed..............."); 	
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
			Thread.sleep(1000);
			myaccpg.clkpswd();	
			logger.info("Changepassword page displayed ...............");
			ChangePasswordPage cngpwd = new ChangePasswordPage(driver);
			boolean cangpwd = cngpwd.cngpwdhedisDisplayed();
			Assert.assertEquals(cangpwd, true);
			boolean breadcrum = cngpwd.breadcrumisDisplayed();
			Assert.assertEquals(breadcrum, true);
		
		}
		    
				catch (InterruptedException e) {
				e.printStackTrace();
				}
	}
}
			    
			    
			
			
			
			
			
			
			
		
		
	







