package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SerchCriteriaPage;

import org.openqa.selenium.support.ui.Select;

import testBase.BaseClass;

public class TC_007_Serch extends BaseClass{
	
	@Test(groups={"master"})
	public void test_Serch()
	{
		logger.info("Starting TC_007_Test...............");
	   try
	    {
		HomePage hp=new HomePage(driver);
		hp.inputtxt(rb.getString("Txt"));
		hp.serch();
		logger.info("Serched the product...............");
	    //SerchCriteriaPage
		SerchCriteriaPage spg = new SerchCriteriaPage(driver);
		boolean inputserchcriteria = spg.inputserchcriteriaisdisplayed();
		Assert.assertEquals(inputserchcriteria, true);
		logger.info("Serched the product displayed...............");
		WebElement drpcategryEle = driver.findElement(By.xpath("//select[@name='category_id']"));
		Select drpcategry = new Select(drpcategryEle);
		drpcategry.selectByIndex(1);
		logger.info("Dropdown Categeory...............");
		spg.rdiobtnserchsubcatgry();
		logger.info("Click Serch RadioButton...............");
		boolean productdisplayed = spg.SerchProductsTxtisdisplayed();
		logger.info("Serched product displayed...............");
		Assert.assertEquals(productdisplayed, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	    logger.info("Finishing TC_006_Test...............");
	    
	}

}
