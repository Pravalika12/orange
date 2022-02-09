package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchSystemUser {

	@FindBy(id="searchSystemUser_userName")
	private WebElement searchUsername;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	private WebElement searchEmployeName;
	@FindBy(id="searchSystemUser_userType")
	private WebElement searchUsertype;
	@FindBy(xpath="//option[text()='All']")
	private WebElement searchUserRole;
	
	@FindBy(xpath="//option[text()='Admin']")
	private WebElement searchUserRoleAdmin;
	
	@FindBy(xpath="//option[text()='ESS']")
	private WebElement searchUserRoleEss;
	
	@FindBy(id="searchSystemUser_status")
	private WebElement searchUserStatus;
	@FindBy(id="searchBtn")
	private WebElement searchButton;

	private WebDriver driver;
	public WebElement getSearchUsername() {
		return searchUsername;
	}
	public WebElement getSearchEmployeName() {
		return searchEmployeName;
	}
	public WebElement getSearchUsertype() {
		return searchUsertype;
	}
	public WebElement getSearchUserRole() {
		return searchUserRole;
	}
	public WebElement getSearchUserRoleAdmin() {
		return searchUserRoleAdmin;
	}
	public WebElement getSearchUserRoleEss() {
		return searchUserRoleEss;
	}
	public WebElement getSearchUserStatus() {
		return searchUserStatus;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	 public searchSystemUser(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void searchUser()
	 {
		 getSearchUsername().sendKeys("pravalika145");
		 getSearchEmployeName().sendKeys("Alexa Sen");
		 getSearchUserRoleAdmin().click();
		 getSearchUsertype().click();
		 getSearchUserStatus().click();
		 getSearchButton().click();
	 }
}
