package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.AccountResgistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass
{

	
	
	
	@Test(groups= {"regression","master"})
	void test_account_Registration() throws InterruptedException
	{
		logger.debug("application logs..............");
		logger.info("**** statrting TC_001_AccountRegistrationTest ****");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		logger.info("clicked on myaccount");
		
		hp.clickRegister();
		logger.info("clicked on register");
		
		AccountResgistrationPage regpage=new AccountResgistrationPage(driver);
		logger.info("providing new data");
		
		regpage.setFistname(randomString());
		regpage.setLastname(randomString());
		regpage.setEmail(randomString()+"@gmail.com");
		regpage.setPassword(randomAlphaNumber());
		
		
		regpage.clickpolicy();
		
		
		regpage.clickContinue();
		logger.info("clicked on continue ");
		
	/*	Thread.sleep(5000);
		String confmsg= regpage.confirmation();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");*/
		}catch(Exception e)
		{
			Assert.fail();
		}
	
		logger.info("**** finished TC_001_AccountRegistrationTest ****");
	}
	
	
	
}
