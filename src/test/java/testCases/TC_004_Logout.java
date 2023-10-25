package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_004_Logout extends BaseClass{
	@Test(groups = {"master"})
	public void test_Logout()
	{
		 logger.info("Starting TC_004_Logout...............");
		    try
		    {
			//HomePage_
		    HomePage hp = new HomePage(driver);
		    hp.clickMyAccount();
		    hp.clickLogin();
		    
			//LoginPage
		    LoginPage lp=new LoginPage(driver);
		    lp.setEmail(rb.getString("email"));
		    lp.setPassword(rb.getString("password"));
		    lp.clickLogin();
		    
			//MyAccountPage
		    MyAccountPage macp = new MyAccountPage(driver);
		    macp.clickLogout();
		    
		    //LogoutDisplayed
		    Boolean Logoutmsg =hp.isLogoutMsgDisplayed();
		    Assert.assertEquals(Logoutmsg, true);}
		    catch(Exception e)
		    {
		    	Assert.fail();
		    }
		    logger.info("Finishing TC_004_Logout...............");
		
	}
}