package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='customer.firstName']")
	WebElement txtFirstname;
	public void setFirtstname(String fname)
	{
		txtFirstname.sendKeys(fname);
	}

	
	@FindBy(xpath = "//input[@name='customer.lastName']")
	WebElement txtLastname;
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}

	
	@FindBy(xpath = "//input[@name='customer.address.street']")
	WebElement txtAddress;
	public void setAddress(String address)
	{
		txtAddress.sendKeys(address);
	}

	@FindBy(xpath = "//input[@name='customer.address.city']")
	WebElement txtCity;
	public void setCity(String city)
	{
		txtCity.sendKeys(city);
	}

	
	@FindBy(xpath = "//input[@name='customer.address.state']")
	WebElement txtState;
	public void setState(String state)
	{
		txtState.sendKeys(state);
	}
	
	
	@FindBy(xpath = "//input[@name='customer.address.zipCode']")
	WebElement txtZipCode;
	public void setZipcode(String zipcode)
	{
		txtZipCode.sendKeys(zipcode);
	}
	
	
	@FindBy(xpath = "//input[@name='customer.phoneNumber']")
	WebElement phnNumber;
	public void setPhnNum(String phnNum)
	{
		phnNumber.sendKeys(phnNum);
	}
	
	
	@FindBy(xpath = "//input[@name='customer.ssn']")
	WebElement SSN;
	public void setSSN(String ssn)
	{
		SSN.sendKeys(ssn);
	}
	
	
	@FindBy(xpath = "//input[@name='customer.username']")
	WebElement userName;
	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
	}
	
	@FindBy(xpath = "//input[@name='customer.password']")
	WebElement Password;
	public void setPassword(String passkey)
	{
		Password.sendKeys(passkey);
	}
	
	@FindBy(xpath = "//input[@name='repeatedPassword']")
	WebElement confirmPassword;
	public void confirmPassword(String cnfmPass)
	{
		confirmPassword.sendKeys(cnfmPass);
	}
	
	
	@FindBy(xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	WebElement btnConfirmRegister;
	public void confirmmRegisteration()
	{
		btnConfirmRegister.click();
	}
	
	
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/h1")
	WebElement userNameConfirmationStatusString;
	public String usernameConfirmationStatus()
	{
		try
		{
		return userNameConfirmationStatusString.getText();
		}
		catch(Exception e){
			return(e.getMessage());
		}
	}
	
	@FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
	WebElement accConfmStatusMsg;
	public String accountConfirmStatus()
	{
		try
		{
		return accConfmStatusMsg.getText();
		}
		catch(Exception e){
			return(e.getMessage());
		}
	}
	
	}
