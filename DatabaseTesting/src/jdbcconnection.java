import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection {

	public WebDriver driver;
	public void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/rahuldb", "root", "admin");

		Statement s=con.createStatement();
		
		ResultSet rs= s.executeQuery("select * from EmployeeInfo where name='Sohan';");
		
		System.setProperty("webdriver.chrome.driver","D:\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		

		while(rs.next())
		{

			driver = new ChromeDriver(); 
			driver.get("https://login.salesforce.com/?locale=in");
			//int a = rs.getInt("id");
			//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getInt("id"));
		//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getInt("id"));
		//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("rs.getString('location')");
			//rs.getString("location");
		}

	}

}
