package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountResgistrationPage extends BasePage
{

	//constructor
	public AccountResgistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	//WebElements
	@FindBy(name="firstname")
	WebElement txtFirstname;
	
	@FindBy(name="lastname")
	WebElement txtLstname;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	//Action
	public void setFistname(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastname(String lname)
	{
		txtLstname.sendKeys(lname);
	}
	
	public void setEmail(String mail)
	{
		txtEmail.sendKeys(mail);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void clickpolicy()
	{
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		mywait.until(ExpectedConditions.elementToBeClickable(chkdPolicy)).click();
		//chkdPolicy.click();
	}
	
	public void clickContinue()
	{
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		//btnContinue.click();
	}
	
	public String confirmation()
	{
		try
		{
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
