
package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_006_ForgotPassword extends BaseClass{

	@Test(groups={"sanity","master"})
	public void test_forgotPassword()
	{
		logger.info("Starting TC_006_Test...............");
	    try
	    {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		//LoginPage
		LoginPage lp=new LoginPage(driver);
		lp.clickForgottenPwd();
		//ForgotPassword
		ForgotPasswordPage fp=new ForgotPasswordPage(driver);
		fp.inputEmail(rb.getString("email"));
		fp.clickcontinue();
		boolean alertmsg = lp.isforgotpwdmsgdisplayed();
		Assert.assertEquals(alertmsg, true);} 
		catch(Exception e)
		{
			Assert.fail();
		}
	    logger.info("Finishing TC_006_Test...............");
		
	}
	
}
