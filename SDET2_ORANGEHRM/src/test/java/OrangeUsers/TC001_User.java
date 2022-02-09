package OrangeUsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import genericUtilities.Baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomClasses.HomePage;
import pomClasses.LoginPage;
import pomClasses.Userpage;
import pomClasses.searchSystemUser;

public class TC001_User  {
	static WebDriver driver;
@Test
public void addUser()
{
	

		
		
	WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
 LoginPage lp=new LoginPage(driver);
	 lp.loginToApp();

	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 driver.findElement(By.xpath("//b[text()='Admin']")).click();
	 driver.findElement(By.id("btnAdd")).click();
//	 HomePage hp=new HomePage(driver);
//	 hp.adminclick();
//	 Userpage up=new Userpage(driver);
//	 up.addDetails(); 
//	 searchSystemUser ssu=new searchSystemUser(driver);
//	 ssu.searchUser();
}
}
