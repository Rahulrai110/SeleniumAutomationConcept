package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {

	@Given("^User is on Netbanking landing page$")
	public void user_is_on_Netbanking_landing_page() throws Throwable
	{
		System.out.println("Navigate to login URL");
	}
	
	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable
	{
		System.out.println("Logged in successfully");		
	}
	
	@When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logged in successfully with different user");
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable
	{
		System.out.println("Validate Home Page");		
	}
	
	@And("^Cards are display$")
	public void cards_are_display() throws Throwable
	{
		System.out.println("Validate card displayed");	
	}
}
