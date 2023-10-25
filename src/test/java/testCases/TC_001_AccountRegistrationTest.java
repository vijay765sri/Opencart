package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	@Test
	public void test_accountRegistration()
	{
		logger.info("******Starting TC_001_AccountRegistration**********");
		HomePage hp=new HomePage(driver);
		logger.info("Clicking on mYaccount");
		hp.clickMyAccount();
		logger.info("Clicking on Registerlink");
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("Providing customer details");
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		String confmsg=regpage.getConfirmationMsg();
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			logger.info("Registartaion Sucessful");
			Assert.assertTrue(true);	
		}
		else
		{
			logger.error("Registration Failed");
			Assert.fail();
		}
		
		logger.info("************Finished TC_001AccountRegistration*******");
		
	}
		
	
}
