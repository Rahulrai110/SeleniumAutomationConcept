package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By textHeader = By.cssSelector("div[class='text-center'] h2");
	By NavBar = By.cssSelector("ul[class='nav navbar-nav navbar-right']");
	By popup = By.xpath("//button[text()='NO THANKS']");
	
	public LandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
		//LoginPage lp = new LoginPage(driver);
		//return lp;
	}
	
	public WebElement gettextHeader()
	{
		return driver.findElement(textHeader);
	}
	public WebElement getNavBar()
	{
		return driver.findElement(NavBar);
	}
	
	public int popupoptionsize()
	{
		return driver.findElements(popup).size();
	}
	
	public WebElement popupoption()
	{
		return driver.findElement(popup);
	}
}
