package StepDefinition;



import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import PageObject.AdminPage;
import PageObject.DashboardPage;
import PageObject.LoginPage;
import org.apache.logging.log4j.Logger;


public class BaseTest {
	
	public static WebDriver driver;
	public LoginPage lp;
	public DashboardPage db;
	public AdminPage admin;
	public static Logger log;
	public Properties properties;
	
	public static String random6DigitNumber() {
	    return String.valueOf(100000 + new Random().nextInt(900000));
	}
	
}
