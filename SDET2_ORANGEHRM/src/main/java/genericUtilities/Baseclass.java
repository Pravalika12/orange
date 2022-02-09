package genericUtilities;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pomClasses.LoginPage;

public class Baseclass {
   WebDriver driver;
	@BeforeSuite()
	public void connectToDatabase()
	{
		System.out.println("connect to database");
	}
	@BeforeClass()
	public void launchBrowser_url() throws IOException
	{
		FileUtil FileUtil=new FileUtil();
		String browser=FileUtil.readDataFromPropfile("browser");
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new SafariDriver();
		}
		//get url
		driver.get(FileUtil.readDataFromPropfile("url"));
		WebdriverUtil util=new WebdriverUtil();
		util.windowMaximize();
		util.pageLoadTimeout();
	}
	
	@BeforeMethod()
	public void loginToApp()
	{
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp();
	}
	
	@AfterMethod()
	public void logoutFromApp()
	{
		
	}
	@AfterClass()
	public void closeBrowser()
	{
		driver.close();
	}
	@AfterSuite()
	public void dissconnectFromDb()
	{
		System.out.println("disconnect from database");
	}
	
	
	
}
