package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_005_Currency extends BaseClass{
	
	@Test(groups = {"master"})
	public void test_Currency()
	{	logger.info("Starting TC_004_Logout...............");
		try
		{	
		HomePage hp = new HomePage(driver);
		hp.clickCurrencyDropDown();
		//Euro currency
		hp.clickCurrencyEuro();
		boolean Euro=hp.isEuroSymbolDisplayed();
		Assert.assertTrue(Euro, "Euro Symbol is not Displayed");
		//Pound Currency
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		hp.clickCurrencyDropDown();
		hp.clickCurrencyPoundSterling();
		boolean pound = hp.isPoundSymbolDisplayed();
		Assert.assertTrue(pound, "Pound Symbol is not displayed");
		//Dollar Currency
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		hp.clickCurrencyDropDown();
		hp.clickCurrencyUSDollar();
		boolean dollar = hp.isDollarSymbolDisplayed();
		Assert.assertTrue(dollar, "DOllar Symbol is not Displayed");
		} catch(Exception e)
		    {
		    	Assert.fail();
		    }
		    logger.info("Finishing TC_004_Logout...............");
	}
}