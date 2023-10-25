package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TC_002_LoginTest extends BaseClass{
	
	@Test(groups={"sanity","master"})
	public void test_Login() 
	{
	    logger.info("Starting TC_002_Test...............");
	    try
	    {
		//HomePage
	    HomePage hp = new HomePage(driver);
	    hp.clickMyAccount();
	    hp.clickLogin();
	    logger.info("Login page displayed...............");
		//LoginPage
	    
	    LoginPage lp=new LoginPage(driver);
	    lp.setEmail(rb.getString("email"));
	    lp.setPassword(rb.getString("password"));
	    lp.clickLogin();
	    logger.info("My accountpage displayed...............");
	    
		//MyAccountPage
	    MyAccountPage macp = new MyAccountPage(driver);
	    boolean targetpage = macp.isMyAccountPageExists();
	    Assert.assertEquals(targetpage, true);
	    } 
	    catch(Exception e)
	    {
	    	Assert.fail();
	    }
	    logger.info("Finishing TC_002_Test...............");
	}

} 