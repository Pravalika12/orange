package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import genericUtilities.ExcelUtil;

public class Userpage {
WebDriver driver;

@FindBy(xpath="//option[text()='Admin]")
private WebElement admindd;
@FindBy(xpath="//option[text='ESS]")
private WebElement essdd;

@FindBy(id="systemUser_employeeName_empName")
private WebElement employename;

@FindBy(id="systemUser_userName")
private WebElement username;

@FindBy(xpath="//option[text='Enabled]")
private WebElement enableddd;
@FindBy(xpath="//option[text='Disabled]")
private WebElement disableddd;

@FindBy(id="systemUser_password")
private WebElement userpassword;

@FindBy(id="systemUser_confirmPassword")
private WebElement confirmpassword;

@FindBy(id="btnSave")
private WebElement savebutton;

@FindBy(id="btnDelete")
private WebElement deleteButton;

public WebElement getDeleteButton() {
	return deleteButton;
}

public WebElement getAdmindd() {
	return admindd;
}

public WebElement getEssdd() {
	return essdd;
}

public WebElement getEmployename() {
	return employename;
}

public WebElement getUsername() {
	return username;
}

public WebElement getEnableddd() {
	return enableddd;
}

public WebElement getDisableddd() {
	return disableddd;
}

public WebElement getUserpassword() {
	return userpassword;
}

public WebElement getConfirmpassword() {
	return confirmpassword;
}

public WebElement getSavebutton() {
	return savebutton;
}

public Userpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void addDetails()
{
	getEmployename().sendKeys("Alexa Sen");
	getUsername().sendKeys("prav@123");
	getUserpassword().sendKeys("123456789@pra");
	getConfirmpassword().sendKeys("123456789@pra");
	getSavebutton().click();
}
//public void admindropdown(String sheetname,int cellvalue,int rowvalue) throws Throwable
//{
//	String admindd=ExcelUtil.objOfExcelUtil().readExcelData(sheetname, cellvalue, rowvalue);
//	
//	
//  
//}
}
