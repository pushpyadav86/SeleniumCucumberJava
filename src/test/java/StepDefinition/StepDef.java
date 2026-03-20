package StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import PageObject.AdminPage;
import PageObject.DashboardPage;
import PageObject.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;

public class StepDef extends BaseTest{
	
	    
	@Before
	public void setup() throws IOException {
		
		log = LogManager.getLogger(StepDef.class);
		
	    properties = new Properties();
	    FileInputStream file = new FileInputStream("config.properties");
	    properties.load(file);
	    
	    String browser = System.getProperty("browser");
        String env = System.getProperty("env");

        if (browser == null || browser.isBlank()) {
            browser = properties.getProperty("browser");
        }

        if (env == null || env.isBlank()) {
            env = properties.getProperty("env");
        }

        System.out.println("Running on browser: " + browser);
        System.out.println("Running on environment: " + env);
	    
	    switch(browser.toLowerCase()) {
	    case "chrome": driver = new ChromeDriver(); break;
	    case "firefox": driver = new FirefoxDriver(); break;
	    case "edge": driver = new EdgeDriver(); break;
	    default: System.out.println("Invalid browser name."); return;
	    }
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    lp = new LoginPage(driver);
	    db = new DashboardPage(driver);
	    admin = new AdminPage(driver);
	}
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
	    
		
	}
	
	@When("User opens url {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	    log.info("Open URL");
	}

	@Then("Page title contains {string}")
	public void page_title_contains(String Tilte) {
	    String actualTitle = driver.getTitle();
	    Assert.assertTrue(actualTitle.contains(Tilte));
	    log.debug("Title verified");
	}

	@Then("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
	    lp.login(username, password);
	    log.info("Entered username and password");
	}

	@Then("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		lp.clickLoginBtn();
		log.warn("Clicked on login button");
	}

	@Then("the url contains {string}")
	public void the_url_contains(String url) throws InterruptedException {
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
	    Assert.assertTrue(actualURL.contains(url));
	    log.warn("Dashboard URL verified");
	}

	@Then("User clicks on the user account tab")
	public void user_clicks_on_the_user_account_tab() {
		db.clickUserMenu();
		log.info("Clicked on User menu");
	}

	@When("User clicks on the Log out button")
	public void user_clicks_on_the_log_out_button() {
	   db.clickLogoutBtn();
	   log.info("Clicked on logout button");
	}

	
	@After
	public void tearDown(){
//
//	    if (sc.isFailed()) {
//	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//	        File dest = new File("screenshots/" + sc.getName() + ".png");
//	        FileUtils.copyFile(src, dest);
//	    }
	   driver.quit();
	   log.info("Quited driver");
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) {
		if(scenario.isFailed()){
			final byte[] screenshot =
		
	            ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

	    scenario.attach(screenshot, "image/png", scenario.getName()+ "_" + System.currentTimeMillis()
	   );
	}
	}

	@Then("user should see {string} in the search table")
	public void user_should_see_in_the_search_table(String string) {
	 
	}

}
