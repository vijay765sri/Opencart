package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ImacProductPage;
import pageObjects.ProductDisplayPage;
import pageObjects.SerchCriteriaPage;
import testBase.BaseClass;

public class TC_009_ProductDisplayPageTest extends BaseClass{
	@Test(groups = {"master"})
	
	public void test_ProductDisplayPageTest()
	{
		HomePage hp = new HomePage(driver);
		logger.info("input for serch column");
		hp.inputtxt(rb.getString("Txt"));
		hp.txtinputserchbtn();
		//SerchCriteriaPg
		logger.info("Opening SerchCriteriaPage");
		SerchCriteriaPage scpg = new SerchCriteriaPage(driver);
		logger.info("clicking on product displayed");
		scpg.productdisplayed();
		//Imacprodcutpage mainproductthumbnailimage
		//Include assertions for Images displayed
		logger.info("Opening iMac product page");
		ImacProductPage impg = new ImacProductPage(driver);
		logger.info("Clicking on Thumbnail image");
		impg.imagedisplyed();
		logger.info("Clicking on next button");
		impg.nextimage();
		logger.info("Clicking on previous button");
		impg.previmage();
		logger.info("Clicking on close button");
		impg.imageclose();
		//normal sized thumbnial images
		logger.info("Opening normal size thumbanil pic");
		impg.normalthumsizeimg();
		logger.info("Clicking on next button of normal thumbnail pic");
		impg.normalthumbsizeimagenextbtn();
		logger.info("Clicking on prev button of normal thumbnail pic");
		impg.normalthumbsizeimageprevbtn();
		logger.info("Clicking on close button of normal thumbnail pic");
		impg.normalthumsizeimgclose();
		//Productdisplaypage
		logger.info("Opening prodcut display page");
		ProductDisplayPage pddis = new ProductDisplayPage(driver);
		logger.info("Product name displayed");
		boolean pddiplay = pddis.productname();
		Assert.assertEquals(pddiplay, true);
		logger.info("Brand name diaplyed");
		boolean brandnamedisply = pddis.brandname();
		Assert.assertEquals(brandnamedisply, true);
		logger.info("Product code displayed");
		boolean prdcode = pddis.productcode();
		Assert.assertEquals(prdcode, true);
		logger.info("Stock avilability");
		boolean prdstockavil = pddis.stockavilability();
		Assert.assertEquals(prdstockavil, true);
		logger.info("product price with tax");
		boolean prdpriceicludtax = pddis.prdpriceincludtax();
		Assert.assertEquals(prdpriceicludtax, true);
		logger.info("product price with out tax");
		boolean prdpriceextax = pddis.prdpriceextax();
		Assert.assertEquals(prdpriceextax, true);
		logger.info("input given to quantity button");
		pddis.setvalue();
		logger.info("Clicking on add to cart button");
		pddis.addtocart();
		logger.info("Validation of prd added to cart msg is displayed");
		boolean prdaddedtocartsucessmsg = pddis.prdaddedtocartmsg();
		Assert.assertEquals(prdaddedtocartsucessmsg, true);
	//Review of product
	//	logger.info("Clicking on Review");
		//pddis.clickElementWithJS("WebElement element");
	     pddis.performActionWithJavaScript("review_rd");
	    logger.info("Give details in name field");
		pddis.inputyourname("Name");
		logger.info("Give your review on the product");
		pddis.inputyourreview(rb.getString("Review"));
		//logger.info("Validation of review text with less than 25 charecters");
		boolean alertlesschar = pddis.alertmsgwithlessthan25char();
		Assert.assertEquals(alertlesschar, false);
		logger.info("Validation of review text with more than 1k charecters");
		boolean allertmorechar = pddis.alertmsgmorethan1k();
		Assert.assertEquals(allertmorechar, false);
		logger.info("Validation of review text with less than 25 charecters");
		boolean sucessmsg = pddis.confrmmsgafterreview();
		Assert.assertEquals(sucessmsg, true);
		logger.info("Give your ratting on the product");
		pddis.ratingradiobtn();
		logger.info("Clicking on the continue button for submitting the review");
		pddis.btncontinue();
		logger.info("Acknowledgement of review will be displayed");
		boolean reviewsubackdisplayed = pddis.confrmmsgafterreview();
		Assert.assertEquals(reviewsubackdisplayed, true);
	}
	
}