package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{

	@Test(groups= {"sanity","master"})
	public void test_login()
	{
		try
		{
		logger.info("******Starting TC_002_LoginTest******* ");
		
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		lp.cliclLogin();
		
		MyAccountPage mp=new MyAccountPage(driver);
		boolean targetpage=mp.isMyAccountPageExist();
		Assert.assertEquals(targetpage, true,"Invalid Login");
		mp.clickLogout();
		}catch(Exception e)
		{
			Assert.fail();
		}
		
		
		logger.info("*******Finished TC_002_LoginTest********");
		
	}
}
