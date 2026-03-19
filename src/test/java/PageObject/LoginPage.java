package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
        super(driver);
    }
	
	@FindBy(css ="[placeholder='Username']")
	WebElement usernameTextBox;
	
	@FindBy(css ="[placeholder='Password']")
	WebElement passwordTextBox;
	
	@FindBy(css = "[type='submit']")
	WebElement loginBtn;
	
	public void login(String username, String password) {
		typeText(usernameTextBox, username);
		typeText(passwordTextBox, password);
	}
	
	public void clickLoginBtn() {
		clickElement(loginBtn);
	}

}
