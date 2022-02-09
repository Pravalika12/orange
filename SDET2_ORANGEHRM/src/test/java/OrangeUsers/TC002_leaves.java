package OrangeUsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomClasses.LoginPage;

public class TC002_leaves {
	static WebDriver driver;
	public static void main(String[] args) {
		
	
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
  LoginPage lp=new LoginPage(driver);
  lp.loginToApp();
}
}
