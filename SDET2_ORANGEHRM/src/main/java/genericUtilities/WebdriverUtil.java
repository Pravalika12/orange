package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtil {
	WebDriver driver;
public  void WebDriverUtil(WebDriver driver)
{
	this.driver=driver;
}
public void windowMaximize()
{
	driver.manage().window().maximize();
}
public void pageLoadTimeout()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

}





