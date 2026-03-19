package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = ".//Feature",
    glue = {"StepDefinition", "hooks"},
    monochrome = true,
    dryRun = false,
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
//        "json:target/cucumber-report.json",
//        "junit:target/cucumber-report.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    },
    tags = "@regression"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
