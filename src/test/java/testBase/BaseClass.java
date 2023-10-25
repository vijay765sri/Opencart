package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;
public Logger logger;
public ResourceBundle rb;
//public Actions act;
public JavascriptExecutor js;

	
	@BeforeClass(groups = { "Master", "Sanity", "Regression" })
	@Parameters({"browser"})
	public void setup(@Optional("chrome")String br)
	//public void setup(String br)
	{
		rb=ResourceBundle.getBundle("config");
		//ResourceBundle rb=ResourceBundle.getBundle("config");
		logger=LogManager.getLogger(this.getClass());
		js=(JavascriptExecutor) driver;
		
		
		//WebDriver driver = new ChromeDriver();
		
		if(br.equals("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			//WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			//WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		}
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Sreedhar\\Chrome Driver");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(rb.getString("appURL"));   // local app URL
		//driver.get(rb.getString("email"));
		//
		//driver.get(rb.getString("password"));
		
		//driver.get("https://demo.opencart.com/index.php");   // remote App URL
		driver.manage().window().maximize();
	}
	
	/*@AfterClass
	public void tearDown()
	{
		driver.close();
	}*/


	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomeNumber()
	{
		String generatedString2=RandomStringUtils.randomNumeric(10);
		return generatedString2;
	}
	
	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(4);
		String num=RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
	}

	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}
	
}


	

