package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;
import testBase.BaseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TC_003_DataDriven_Test extends BaseClass{
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void test_Login(String email,String pwd, String expres) 
	{
	    logger.info("Starting TC_003_DataDrivenTest...............");
	    try
	    {
		//HomePage
	    HomePage hp = new HomePage(driver);
	    hp.clickMyAccount();
	    hp.clickLogin();
	  
		
		//LoginPage
	    
	    LoginPage lp=new LoginPage(driver);
	    lp.setEmail(email);
	    lp.setPassword(pwd);
	    lp.clickLogin();
	    
		//MyAccountPage
	    MyAccountPage macp = new MyAccountPage(driver);
	    boolean targetpage = macp.isMyAccountPageExists();
	    if(expres.equals("Valid"))
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
	    }
	    }
	    catch(Exception e)
	    {
	    	Assert.fail();
	    }
	    logger.info("Finishing TC_003_DatDrivenTest...............");
	}
}

   
	
