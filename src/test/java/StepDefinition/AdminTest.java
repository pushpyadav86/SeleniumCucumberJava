package StepDefinition;

import org.apache.logging.log4j.LogManager;

import org.testng.Assert;

import PageObject.AdminPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminTest extends BaseTest{
	
//	AdminPage admin;
	

    public AdminTest() {
        if (driver != null) {
            admin = new AdminPage(driver);
            log = LogManager.getLogger(StepDef.class);
        }
    }

	@When("User clicks on the Admin")
	public void user_clicks_on_the_admin() {
		admin.clicAdminBtn();
		log.info("Clicked on Admin button.");
	}

	@Then("user enters {string} in username box")
	public void user_enters_in_username_box(String username) {
		admin.enterUsername(username);
		log.info("Entered username in username text box.");
	}

	@When("user clicks on the search button")
	public void user_clicks_on_the_search_button() {
		admin.clickSearchBtn();
		log.info("Clicked on search button.");
	}

	@Then("user should found {string} in the admin table")
	public void user_should_found_in_the_admin_table(String expectedValue) {
		 boolean result = admin.isValuePresentInAdminTable(expectedValue);
		    Assert.assertTrue(result, "Employee ID not found in table: " + expectedValue);
		    log.debug("User is found in the search table.");
	}
}
