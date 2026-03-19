package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage{
	
	public AdminPage(WebDriver driver) {
        super(driver);
    }
	
	
	@FindBy(xpath ="//*[normalize-space()='Admin']/span")
	WebElement adminOption;
	
	@FindBy(xpath ="(//*[@class='oxd-input oxd-input--active'])[2]")
	WebElement usernameBox;
	
	@FindBy(xpath ="//*[@type='submit']")
	WebElement searchBtn;
	
	@FindBy(css ="[role='rowgroup']>div>[role='row']")
	List<WebElement> rows;
	
	@FindBy(xpath ="//*[@class='oxd-main-menu-item active']//*[text()='Performance']")
	WebElement cell;
	
	public void clicAdminBtn() {
		clickElement(adminOption);
	}
	
	public void enterUsername(String username) {
		typeText(usernameBox, username);
	}
	
	public void clickSearchBtn() {
		clickElement(searchBtn);
	}
	
	public boolean isValuePresentInAdminTable(String expectedValue) {

		return super.isValuePresent(rows, 2, expectedValue);
	}
	
	public boolean isValuePresentInPIMTable(String expectedValue) {

		return super.isValuePresent(rows, 3, expectedValue);
	}
}
