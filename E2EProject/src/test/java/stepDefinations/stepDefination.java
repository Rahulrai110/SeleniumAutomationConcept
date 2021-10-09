package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

public class stepDefination extends base{

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();	    
	}

	@Given("^Navigate to the \"([^\"]*)\" site$")
	public void navigate_to_the_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);	    
	}

	@Given("^click on Login link in homepage to land on Secure signIn Page$")
	public void click_on_Login_link_in_homepage_to_land_on_Secure_signIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l = new LandingPage(driver);
		if(l.popupoptionsize()>0)
		{
			l.popupoption().click();
		}
		l.getLogin().click();
	}

	@When("^User enters (.+) and (.+) and login$")
	public void user_enters_and_and_login(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getlogin().click();
	}

	@Then("^verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    PortalHomePage ph = new PortalHomePage(driver);
	   Assert.assertTrue(ph.searchboxoption().isDisplayed());
	} 
	
	@Then("^close browsers$")
	public void close_browsers() throws Throwable {
		driver.close();
	}
	
}
