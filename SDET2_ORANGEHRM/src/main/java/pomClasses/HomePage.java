package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
@FindBy(xpath="//b[text()='Admin']")
private WebElement adminclick;
@FindBy(id="btnAdd")
private WebElement addButton;

public WebElement getAdminclick() {
	return adminclick;
}
	
	public WebElement getAddButton() {
		return addButton;
	
}
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void adminclick()
	{
		getAdminclick().click();
		getAddButton().click();
	}

}
