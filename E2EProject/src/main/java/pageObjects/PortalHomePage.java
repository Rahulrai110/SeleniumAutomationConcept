package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {
	
	public WebDriver driver;
	
	//By email = By.id("user_email");
	By searchbox = By.name("query");

	
	public PortalHomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement searchboxoption()
	{
		return driver.findElement(searchbox);
	}
	
}
