package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{

	//constructor
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//WebElement
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement msgHeading;
	
	
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Logout']")
	WebElement btnLogout;
	
	//Action
	public boolean isMyAccountPageExist()
	{
		try
		{
			return(msgHeading.isDisplayed());
		}catch(Exception e)
		{
			return(false);
		}
	}
	
	public void clickLogout()
	{
		btnLogout.click();
	}
}
