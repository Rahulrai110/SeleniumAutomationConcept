package Academy;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;
//adding logs
//generate html reporting
//Screenshot failure

public class ValidateNavigationBar extends base{
	
	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(base.class.getName());
		
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
		LandingPage lp = new LandingPage(driver);
		//compare the text from the browser with actual text
		Assert.assertTrue(lp.getNavBar().isDisplayed());
		log.info("Navigation bar is display");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
