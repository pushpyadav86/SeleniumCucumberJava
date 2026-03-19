package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
	
	public DashboardPage(WebDriver driver) {
        super(driver);
    }
	
	@FindBy(css ="[class='oxd-userdropdown-tab']")
	WebElement userMenuTab;
	
	@FindBy(xpath ="//*[text()='Logout']")
	WebElement logoutBtn;
	
	@FindBy(xpath ="//*[text()='Admin']")
	WebElement adminOption;
	
	public void clickUserMenu() {
	clickElement(userMenuTab);
	}
	
	public void clickLogoutBtn() {
		clickElement(logoutBtn);
	}
	
	public void clickAdminBtn() {
		clickElement(adminOption);
	}

}
