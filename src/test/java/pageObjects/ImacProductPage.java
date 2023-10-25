package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImacProductPage extends BasePage {
	
	public ImacProductPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Img thumbnail Product Display
	
		@FindBy(xpath="//li[1]//a[1]//img[1]") 
		WebElement mainimage;
		
		@FindBy(xpath="//button[@title='Next (Right arrow key)']") 
		WebElement clicknextbutton;
		
		@FindBy(xpath="//button[@title='Previous (Left arrow key)']") 
		WebElement clickprevbutton;
		
		@FindBy(xpath="//button[@title='Close (Esc)']") 
		WebElement Imgclose;
		
		
		//Normal sized thumnail display iamges
		
		@FindBy(xpath="//li[2]//a[1]//img[1]") 
		WebElement normalthumsizeimg;
		
		@FindBy(xpath="//button[@title='Next (Right arrow key)']") 
		WebElement normalthumbsizeimagenextbtn;
		
		@FindBy(xpath="//button[@title='Previous (Left arrow key)']") 
		WebElement normalthumbsizeimageprevbtn;
		
		@FindBy(xpath="//button[@title='Close (Esc)']") 
		WebElement normalthumsizeimgclose;


		public void imagedisplyed()
		{
			mainimage.click();
		}
		
		public void nextimage()
		{
			clicknextbutton.click();
		}
		
		public void previmage()
		{
			clickprevbutton.click();
		}
		
		public void imageclose()
		{
			Imgclose.click();
		}
		
		public void normalthumsizeimg()
		{
			normalthumsizeimg.click();
		}
		public void normalthumbsizeimagenextbtn()
		{
			normalthumbsizeimagenextbtn.click();
		}
		
		public void normalthumbsizeimageprevbtn()
		{
			normalthumbsizeimageprevbtn.click();
		}
		
		public void normalthumsizeimgclose()
		{
			normalthumsizeimgclose.click();
		}
}