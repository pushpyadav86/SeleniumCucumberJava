package StepDefinition;

import io.cucumber.java.en.Then;

public class CloseStep extends BaseTest{
	@Then("User close the browser")
	public void user_close_the_browser() {
	   driver.close();
	   log.info("Driver closed");
	}
}
