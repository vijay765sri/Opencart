package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountInformationPage extends BasePage{
	
	public MyAccountInformationPage
	(WebDriver driver)
	{
		super(driver);
	}

//My Account info page displayed 
@FindBy(xpath="//h1[normalize-space()='My Account Information']") 
WebElement myactinfopage;

//Updation of Myaccount information - Your Personal details

@FindBy(xpath="//input[@id='input-firstname']") 
WebElement inptfirstname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement inptlastname;

@FindBy(xpath="//input[@id='input-email']") 
WebElement inputemail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement inputtel;

//Click on Continue btn after updating personal details

@FindBy(xpath="//input[@value='Continue']") 
WebElement clkctnbtn;

//Updation of Myaccount information with empty values- Your Personal details

@FindBy(xpath="//input[@id='input-firstname']") 
WebElement fnamefield;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement lnamefield;

@FindBy(xpath="//input[@id='input-email']") 
WebElement emailfield;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement telfield;

//Validation of input text boxes of personal details alert meaasge recived

@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]") 
WebElement fnmalertmg;

@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]") 
WebElement lnmalertmg;

@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]") 
WebElement emlalertmg;

@FindBy(xpath="//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
WebElement telalertmg;

//Fields * symbol in red color should be displayed as a symbol of mandatory

@FindBy(xpath="//label[normalize-space()='First Name']") 
WebElement fnmalrt;

@FindBy(xpath="//label[normalize-space()='Last Name']") 
WebElement lnmalrt;

@FindBy(xpath="//label[normalize-space()='E-Mail']")
WebElement emlalrt;

@FindBy(xpath="//label[normalize-space()='Telephone']") 
WebElement telalrt;

//Updated my Email Field with some INvalid data

@FindBy(xpath="//input[@id='input-email']") 
WebElement inputedit;

//Back button in Myaccount Information page

@FindBy(xpath="//a[normalize-space()='Back']") 
WebElement clkback;

//My Account info page displayed 
public boolean myactinfopageisdiply()
{try
{
return (myactinfopage.isDisplayed());
}
catch(Exception e)
{
	return(false);
}
}
//Updation of Myaccount information - Your Personal details

public void inptfirstname(String Txt)
{
	inptfirstname.sendKeys();
} 

public void inptlastname(String Txt)
{
	inptlastname.sendKeys();
} 

public void inputemail(String Txt)
{
	inputemail.sendKeys();
} 

public void inputtel(String Txt)
{
	inputtel.sendKeys();
}
//Click on Continue btn after updating personal details

	public void clkctnbtn()
	{
		clkctnbtn.click();
	}
//Updation of Myaccount information with empty values- Your Personal details

	
public void fnamefieldinput()
{if (fnamefield != null) {
	fnamefield.clear();
} else {fnamefield.sendKeys("NAME");
	}}

public void lnamefieldinput()
{if (lnamefield != null) {
	lnamefield.clear();
} else {lnamefield.sendKeys("NAME");
	}}

public void emailfieldinput()
{if (emailfield != null) {
	emailfield.clear();
} else {emailfield.sendKeys("@mail");
	}}

public void telfieldinput()
{if (telfield != null) {
	telfield.clear();
} else {telfield.sendKeys("899");
	}}

//Validation of input text boxes of personal details alert meaasge recived

public boolean fnmalertmgisdiply()
{try
{
return (fnmalertmg.isDisplayed());
}
catch(Exception e)
{
	return(false);
}
}
public boolean lnmalertmgisdiply()
{try
{
return (lnmalertmg.isDisplayed());
}
catch(Exception e)
{
	return(false);
}
}

public boolean emlalertmgisdiply()
{try
{
return (emlalertmg.isDisplayed());
}
catch(Exception e)
{
	return(false);
}
}

public boolean telalertmgisdiply()
{try
{
return (telalertmg.isDisplayed());
}
catch(Exception e)
{
	return(false);
}
}
//Fields * symbol in red color should be displayed as a symbol of mandatory

public boolean fnmalrtisdiply()
{try
{
return (fnmalrt.isDisplayed());
}
catch(Exception e)
{
	return(false);
}
}

public boolean lnmalrtisdiply()
{try
{
return (lnmalrt.isDisplayed());
}
catch(Exception e)
{
	return(false);
}
}

public boolean emlalrtisdiply()
{try
{
return (emlalrt.isDisplayed());
}
catch(Exception e)
{
	return(false);
}
}

public boolean telalrtisdiply()
{try
{
return (telalrt.isDisplayed());
}
catch(Exception e)
{
	return(false);
}
}
//Updated my Email Field with some INvalid data

public void inputedit(String str)
{
	inputedit.sendKeys("Vijay");
}

//Back button in Myaccount Information page

public void clkback()
{
	clkback.click();
}


}