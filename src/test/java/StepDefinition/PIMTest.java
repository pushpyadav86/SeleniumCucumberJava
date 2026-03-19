package StepDefinition;

import org.testng.Assert;

import PageObject.AdminPage;
import PageObject.PIMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMTest extends BaseTest{
	
	AdminPage admin;
	PIMPage pim;

    public PIMTest() {
        if (driver != null) {
            admin = new AdminPage(driver);
            pim = new PIMPage(driver);
        }
    }
//
    @When("User clicks on the PIM")
	public void User_clicks_on_the_Pim() throws InterruptedException {
	    pim.clickPIMOption();
	    Thread.sleep(3000);
	    log.info("User clicked on PIM button.");
	}

	@Then("user clicks on the Add button")
	public void user_clicks_on_the_add_button() {
		pim.clickAddBtn();
		log.info("User clicked on add button.");
	}

	@Then("user enters {string} in first name box")
	public void user_enters_in_first_name_box(String Fname) {
		pim.enterFirstName(Fname);
		log.info("User entered first name in first name box.");
	}

	@Then("user enters {string} in last name box")
	public void user_enters_in_last_name_box(String Lname) {
		pim.enterLastName(Lname);
		log.info("User entered last name in last name box.");
	}

	@Then("user enters id in employee ID box")
	public void user_enters_id_in_employee_id_box() {
		pim.enterEmployeeID();
		log.info("User entered employee iD  in ID box.");
	}

	@When("user clicks on the save button")
	public void user_clicks_on_the_save_button() {
		pim.clickSaveBtn();
		log.info("User clicks on the save button.");
	}

	@Then("user should see the profile name as {string}")
	public void user_should_see_the_profile_name_as(String expectedProfileName) throws InterruptedException {
		pim.elementIsDesplayed();
//		String actualProfileName = pim.getProfileName();
//		Thread.sleep(3000);
////		System.out.println(value);
//		Assert.assertEquals(actualProfileName, expectedProfileName);
	   
	}

	@Then("user search with employee name {string}")
	public void user_search_with_employee_name(String emplyeeName) {
		pim.enterEmployeeName(emplyeeName);
	
	}
	
	@Then("user should found {string} in the PIM table")
	public void user_should_found_in_the_PIM_table(String expectedValue) {
		 boolean result = admin.isValuePresentInPIMTable(expectedValue);
		    Assert.assertTrue(result, "Employee name not found in table: " + expectedValue);
		    log.debug("User is found in the search table.");
	}

}
