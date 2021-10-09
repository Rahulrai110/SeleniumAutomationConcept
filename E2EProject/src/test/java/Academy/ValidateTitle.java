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

public class ValidateTitle extends base{
	
	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("Driver is initialise");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home page");		
	}
		
	@Test
	public void basePageNavigation() throws IOException
	{	
		LandingPage lp = new LandingPage(driver);
		//compare the text from the browser with actual text
		Assert.assertEquals(lp.gettextHeader().getText(), "FEATURED COURSES");
		//lp.gettextHeader().getText();
		log.info("Successfully validated Text in page");			
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
