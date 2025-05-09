package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AccountRegistrationPage;
import Pages.HomePage;

public class TC001AccountRegistrationTest extends baseClass{

	public String Password;
	public String userName;
			
	@Test
	public void verifyAccountRegistration()
	{
		HomePage homepage = new HomePage(driver);
		homepage.clickRegister();
		AccountRegistrationPage accpage = new AccountRegistrationPage(driver);
		accpage.setFirtstname("Akash"+randomString());
		accpage.setLastName( randomString());
		accpage.setAddress( randomString());
		accpage.setCity( randomString());
		accpage.setState( randomString());
		accpage.setZipcode( randomNumber(6));
		accpage.setSSN( randomNumber(4));
		accpage.setPhnNum( randomNumber(10));
		userName = "Akash"+ randomNumber(3);
		accpage.setUserName(userName);
		Password =  AlphaNumeric();
		accpage.setPassword(Password);
		accpage.confirmPassword(Password);
		accpage.confirmmRegisteration();
		
		String UserIdCreatedMessage = accpage.usernameConfirmationStatus();
		Assert.assertEquals("Welcome "+userName, UserIdCreatedMessage);
		System.out.println("-------SUCCESS:-UserName given and created both are same....");
		
		Assert.assertEquals(accpage.accountConfirmStatus(), "Your account was created successfully. You are now logged in.");
		System.out.println("-------SUCCESS:-Account created successfully");
		System.out.println(userName+",,,,"+Password);
	}
	
	
}
