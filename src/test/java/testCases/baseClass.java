package testCases;

import java.time.Duration;
import java.util.logging.LogManager;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class baseClass {
	protected WebDriver driver;
	public LogManager logger;
	
	@BeforeClass
	public void setup()
	{
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
	}
	@SuppressWarnings("deprecation")
	public String randomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;	
	}
	
	public String AlphaNumeric()
	{
		@SuppressWarnings("deprecation")
		String generateAlphaNumeric= RandomStringUtils.randomAlphanumeric(10);
		return generateAlphaNumeric;
	}
	public String randomNumber(int num)
	{
		@SuppressWarnings("deprecation")
		String randomNum=RandomStringUtils.randomNumeric(num).toString();
		return randomNum;
	}
	
	@AfterClass
	public void tearDown () throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}
