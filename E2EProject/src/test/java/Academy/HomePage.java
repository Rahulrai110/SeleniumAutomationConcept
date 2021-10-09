package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();

	}
		
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password) throws IOException
	{	
		
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		//LoginPage lp=l.getLogin();
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		
		log.info("Text");
		
		lp.getlogin().click();
		
	} 
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		//Row stands for how many different data types test should run
		//Column stands for how many values per each test
		Object[][] data = new Object[2][2];
		
		//for Array size 2 Index will always start with Zero for all Array so array is 00,01
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="12345";
		//data[0][2]="non Restricted user";
		
		data[1][0]="restricteduser@qw.com";
		data[1][1]="67890";
		//data[1][2]="Restricted user";
		
		return data;
	}

}