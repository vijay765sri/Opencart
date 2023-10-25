package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ImacProductPage;
import pageObjects.ShoppingCartPage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.ProductDisplayPage;
import pageObjects.SerchCriteriaPage;
import pageObjects.CheckoutPage;
import pageObjects.MacBookProdcutPage;
import testBase.BaseClass;


public class EndtoEndTestCase extends BaseClass{
	@Test(groups = {"master"})
	public void test_ChangePassword() {
		try 
		{   logger.info("...........Starting of EndtoEndTestCase..............");
			// Validate end to end test case
			HomePage hp = new HomePage(driver);	
			Thread.sleep(5000);
			hp.clickMyAccount();
			hp.clickLogin(); 
			logger.info("Login page displayed...............");
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickLogin();
			logger.info("My accountpage displayed...............");
			MyAccountPage macp = new MyAccountPage(driver);
		    boolean targetpage = macp.isMyAccountPageExists();
		    Assert.assertEquals(targetpage, true);
		    macp.macbkinpttxt(rb.getString("Txt1"));
		    logger.info("MacBook prodcut was paassed in serch field.............");
		    macp.macbokserch();
		    logger.info("SerchPage was displayed.............");
		    SerchCriteriaPage serchpg = new SerchCriteriaPage(driver);
		    WebElement drpcategryEle = driver.findElement(By.xpath("//select[@name='category_id']"));
			Select drpcategry = new Select(drpcategryEle);
			drpcategry.selectByIndex(1);
			Thread.sleep(1000);
			logger.info("Dropdown Categeory...............");
			serchpg.rdiobtnserchsubcatgry();
			Thread.sleep(1000);
			logger.info("Click Serch RadioButton...............");
			serchpg.serchbtn();
			Thread.sleep(1000);
			logger.info("Name of the product displayed...............");
			boolean prdname = serchpg.macbktitleisdisplayed();
			Assert.assertEquals(prdname, true);
			logger.info("Product displayed...............");
			boolean prdimage = serchpg.macbkprdisdisplayed();
			Assert.assertEquals(prdimage, true);
			serchpg.clkprdmacbk();
			Thread.sleep(1000);
			logger.info("Opening iMac product page");
			MacBookProdcutPage impg = new MacBookProdcutPage(driver);
			logger.info("Clicking on Thumbnail image");
			impg.macbkimg();
			Thread.sleep(1000);
			logger.info("Clicking on next button");
			impg.macbknxt();
			Thread.sleep(1000);
			logger.info("Clicking on previous button");
			impg.macbkprev();
			Thread.sleep(1000);
			logger.info("Clicking on close button");
			impg.clkclose();
			Thread.sleep(1000);
			//normal sized thumbnial images
			logger.info("Opening normal size thumbanil pic");
			impg.Thumnailimgclk();
			Thread.sleep(1000);
			logger.info("Clicking on next button of normal thumbnail pic");
			impg.clkrigt();
			Thread.sleep(1000);
			logger.info("Clicking on prev button of normal thumbnail pic");
			impg.clklft();
			Thread.sleep(1000);
			logger.info("Clicking on close button of normal thumbnail pic");
			impg.clkcls();
			Thread.sleep(1000);
			logger.info("Prodcust title diaplyed");
			boolean imgtitle = impg.Titlemacbookisdisplayeed();
			Assert.assertEquals(imgtitle, true);
			logger.info("Prodcust brandname diaplyed");
			Thread.sleep(1000);
			boolean brnd = impg.brndisdispalyed();
			Assert.assertEquals(brnd, true);
			logger.info("Prodcust productcode diaplyed");
			Thread.sleep(1000);
			boolean prdcode = impg.prdcodeisdisplyd();
			Assert.assertEquals(prdcode, true);
			logger.info("Prodcust rewardpoint diaplyed");
			Thread.sleep(1000);
			boolean rwdpnt = impg.rewdptnisdisplyd();
			Assert.assertEquals(rwdpnt, true);
			logger.info("Prodcust stock Avilability diaplyed");
			Thread.sleep(1000);
			Boolean avil = impg.stkavlisdisplyd();
			Assert.assertEquals(avil, true);
			logger.info("Prodcust itemprice diaplyed");
			Thread.sleep(1000);
			boolean itemprc = impg.itmprcisdisplyd();
			Assert.assertEquals(itemprc, true);
			logger.info("Prodcust price exluding tax diaplyed");
			Thread.sleep(1000);
			boolean priceexclu = impg.prcexcludingtaxisdisply();
			Assert.assertEquals(priceexclu, true);
			logger.info("Prodcust description");
			Thread.sleep(1000);
			impg.prddesc();
			boolean prddecptn = impg.prddescptnisdisply();
			Assert.assertEquals(prddecptn, true);
			logger.info("Prodcust Spec");
			Thread.sleep(1000);
			impg.prdspec();
			Thread.sleep(1000);
			boolean spec = impg.prdspectnisdisply();
			Assert.assertEquals(spec, true);
			logger.info("Prodcust Review");
			Thread.sleep(1000);
			impg.prdrevew();
			Thread.sleep(1000);
			logger.info("Qty of prodcuts ordered");
			Thread.sleep(1000);
			impg.qty("1");
			logger.info("Prodcuts added to cart");
			Thread.sleep(1000);
			impg.clkadcart();
			logger.info("Prodcuts added to cartmsg displayed");
			Thread.sleep(1000);
			boolean mgsg = impg.Mgslnkisdisply();
			Assert.assertEquals(mgsg, true);
			logger.info("Clicked on Mag link for Shopping Cart Page");
			impg.lnkclk();
			logger.info("Shopping cart page opened");
			ShoppingCartPage shopngcrt = new ShoppingCartPage(driver);
			logger.info("Product title displayed");
			boolean msgspg = shopngcrt.Shopingcarttitleisdiplyd();
			Assert.assertEquals(msgspg, true);
			logger.info("Product Image displayed");
			boolean prodtimage = shopngcrt.productimageisdiplyd();	
			Assert.assertEquals(prodtimage, true);
			logger.info("Product Name displayed");
			boolean pdname = shopngcrt.prodctnameisdiplyd();
			Assert.assertEquals(pdname, true);
			logger.info("Product model displayed");
			boolean pdmodel = shopngcrt.modelisdiplyd();
			Assert.assertEquals(pdmodel, true);
			logger.info("Product qty displayed");
			boolean pdqty = shopngcrt.quntyisdiplyd();
			Assert.assertEquals(pdqty, true);
			logger.info("Product unitprc displayed");
			boolean pdprice = shopngcrt.unitpriceisdiplyd();	
			Assert.assertEquals(pdprice, true);
			logger.info("Product totalprice displayed");
			boolean totlamount = shopngcrt.totalisdiplyd();
			Assert.assertEquals(totlamount, true);
			logger.info("Product checkout");
			shopngcrt.clickcheckout();
			logger.info("checkout will be displayed");
			CheckoutPage ckout = new CheckoutPage(driver);
			boolean pg = ckout.ischeckoutDisplayed();
			Assert.assertEquals(pg, true);
			ckout.clkbillgdetails();
			ckout.clkcontinue();
		
	

		} catch (InterruptedException e) {
		    e.printStackTrace();
			}
		}
	}

	

