package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
   @FindBy(id="txtUsername")
   private WebElement username;
   
   @FindBy(id="txtPassword")
   private WebElement password;
   @FindBy(id="btnLogin")
   private WebElement Loginbutton;
public WebDriver getDriver() {
	return driver;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLoginbutton() {
	return Loginbutton;
}
 public LoginPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 public void loginToApp()
 {
	getUsername().sendKeys("Admin");
	getPassword().sendKeys("admin123");
	Loginbutton.click();
 }
}
