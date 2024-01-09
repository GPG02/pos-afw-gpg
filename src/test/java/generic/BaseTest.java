package generic;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void postConditions()
	{
		driver.quit();
	}
}
