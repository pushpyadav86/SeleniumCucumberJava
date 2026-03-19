package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPage extends BasePage{
	
	public PIMPage(WebDriver driver) {
        super(driver);
    }
	
	@FindBy(xpath ="//span[normalize-space()='PIM']")
	WebElement pimOption;
	
	@FindBy(xpath ="//*[@class='oxd-icon bi-plus oxd-button-icon']")
	WebElement addOption;
	
	@FindBy(xpath ="//*[@placeholder='First Name']")
	WebElement firstNameTextBox;
	
	@FindBy(xpath ="//*[@placeholder='Last Name']")
	WebElement lastNameTextBox;
	
	@FindBy(xpath ="//*[@type='submit']")
	WebElement saveBtn;
	
	@FindBy(xpath ="(//*[@class='oxd-input oxd-input--active'])[2]")
	WebElement employeeID;
	
	@FindBy(xpath ="//*[@class='orangehrm-edit-employee-name']")
	WebElement profileName;
	
	@FindBy(xpath ="(//*[@placeholder='Type for hints...'])[1]")
	WebElement employeeNameBox;
	
	
	@FindBy(css ="[class='oxd-icon bi-trash']")
	WebElement deleteOption;
	
	@FindBy(xpath ="//*[@class='oxd-icon bi-trash oxd-button-icon']")
	WebElement deleteConfirmation;
	
	
	public void clickPIMOption() {
	clickElement(pimOption);
	}	
	
	public void clickAddBtn() {
		clickElement(addOption);
	}
	
	public void enterFirstName(String firstName) {
		typeText(firstNameTextBox,firstName);
	}

	public void enterLastName(String lastName) {
		typeText(lastNameTextBox,lastName);
	}
	
	public void enterEmployeeID() {
		String randomNumber = String.valueOf((int)(Math.random() * 1000000));
		typeText(employeeID,randomNumber);
	}
	
	public void clickSaveBtn() {
		clickElement(saveBtn);
	}
	
	
	public void enterEmployeeName(String employeeName) {
		typeText(employeeNameBox,employeeName);
	}
	
	public String getProfileName() {
		 return getElementText(profileName);
	}
	
	public boolean elementIsDesplayed() {
		return profileName.isDisplayed();
	}
	
	public void clickDeleteOption() {
		clickElement(deleteOption);
	}
	
	public void deleteYesConfirmation() {
		clickElement(deleteConfirmation);
	}
}
