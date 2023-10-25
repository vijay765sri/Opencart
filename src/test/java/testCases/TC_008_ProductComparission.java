package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductDisplayPage;
import pageObjects.SerchCriteriaPage;
import pageObjects.SerchPage;
import testBase.BaseClass;
@Test

public class TC_008_ProductComparission extends BaseClass {
	@Test
	public void test_ProductComparission()
	{
		{
			logger.info("Starting TC_008_Test...............");
		    try
		    {
			HomePage hp=new HomePage(driver);
			hp.inputtxt(rb.getString("Txt"));
			hp.txtinputserchbtn();
			//search criteria page
			SerchCriteriaPage spg = new SerchCriteriaPage(driver);
			boolean inputserchcriteria = spg.inputserchcriteriaisdisplayed();
			Assert.assertEquals(inputserchcriteria, true);
			WebElement drpcategryEle = driver.findElement(By.xpath("//select[@name='category_id']"));
			Select drpcategry = new Select(drpcategryEle);
			drpcategry.selectByIndex(1);
			spg.rdiobtnserchsubcatgry();
			boolean pddisply = spg.SerchProductsTxtisdisplayed();
			Assert.assertEquals(pddisply, true);
			spg.productdisplayed();
			//Serchpg
			SerchPage scpg = new SerchPage(driver);
			scpg.btncompareproduct();
			//Prddisplaypage
			ProductDisplayPage pcp = new ProductDisplayPage(driver);
			pcp.lnkprdcomp();
			boolean pdCompmsg = pcp.pdCompmsg();
			Assert.assertEquals(pdCompmsg, true);}		 
			catch(Exception e)
			{
				Assert.fail();
			}
		    logger.info("Finishing TC_008_Test...............");
		}	
	}
}