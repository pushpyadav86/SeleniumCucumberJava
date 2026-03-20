
package TestRunner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "./Feature",
    glue = {"StepDefinition", "hooks"},
    monochrome = true,
    dryRun = false,
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber-report.json",
        "junit:target/cucumber-report.xml"
    },
    tags = "@regression"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
	public void setBrowser(@Optional("chrome") String browser) {
        System.setProperty("browser", browser);
    public void setParameters(@Optional("chrome") String browser) {

        String finalBrowser = System.getProperty("browser");
        // String finalEnv = System.getProperty("env");

        if (finalBrowser == null || finalBrowser.isBlank()) {
            finalBrowser = browser;
        }

        // if (finalEnv == null || finalEnv.isBlank()) {
        //     finalEnv = env;
        // }

        System.setProperty("browser", finalBrowser);
        // System.setProperty("env", finalEnv);

        System.out.println("Browser selected: " + finalBrowser);
        // System.out.println("Environment selected: " + finalEnv);
    public void setParameters(@Optional("chrome") String browser) {

        String finalBrowser = System.getProperty("browser");
        // String finalEnv = System.getProperty("env");

        if (finalBrowser == null || finalBrowser.isBlank()) {
            finalBrowser = browser;
        }

        // if (finalEnv == null || finalEnv.isBlank()) {
        //     finalEnv = env;
        // }

        System.setProperty("browser", finalBrowser);
        // System.setProperty("env", finalEnv);

        System.out.println("Browser selected: " + finalBrowser);
        // System.out.println("Environment selected: " + finalEnv);
    public void setParameters(@Optional("chrome") String browser) {

        String finalBrowser = System.getProperty("browser");
        // String finalEnv = System.getProperty("env");

        if (finalBrowser == null || finalBrowser.isBlank()) {
            finalBrowser = browser;
        }

        // if (finalEnv == null || finalEnv.isBlank()) {
        //     finalEnv = env;
        // }

        System.setProperty("browser", finalBrowser);
        // System.setProperty("env", finalEnv);

        System.out.println("Browser selected: " + finalBrowser);
        // System.out.println("Environment selected: " + finalEnv);
    public void setParameters(@Optional("chrome") String browser) {

        String finalBrowser = System.getProperty("browser");
        // String finalEnv = System.getProperty("env");

        if (finalBrowser == null || finalBrowser.isBlank()) {
            finalBrowser = browser;
        }

        // if (finalEnv == null || finalEnv.isBlank()) {
        //     finalEnv = env;
        // }

        System.setProperty("browser", finalBrowser);
        // System.setProperty("env", finalEnv);

        System.out.println("Browser selected: " + finalBrowser);
        // System.out.println("Environment selected: " + finalEnv);
    public void setParameters(@Optional("chrome") String browser) {

        String finalBrowser = System.getProperty("browser");
        // String finalEnv = System.getProperty("env");

        if (finalBrowser == null || finalBrowser.isBlank()) {
            finalBrowser = browser;
        }

        // if (finalEnv == null || finalEnv.isBlank()) {
        //     finalEnv = env;
        // }

        System.setProperty("browser", finalBrowser);
        // System.setProperty("env", finalEnv);

        System.out.println("Browser selected: " + finalBrowser);
        // System.out.println("Environment selected: " + finalEnv);
    public void setParameters(@Optional("chrome") String browser) {

        String finalBrowser = System.getProperty("browser");
        // String finalEnv = System.getProperty("env");

        if (finalBrowser == null || finalBrowser.isBlank()) {
            finalBrowser = browser;
        }

        // if (finalEnv == null || finalEnv.isBlank()) {
        //     finalEnv = env;
        // }

        System.setProperty("browser", finalBrowser);
        // System.setProperty("env", finalEnv);

        System.out.println("Browser selected: " + finalBrowser);
        // System.out.println("Environment selected: " + finalEnv);
    public void setParameters(@Optional("chrome") String browser) {

        String finalBrowser = System.getProperty("browser");
        // String finalEnv = System.getProperty("env");

        if (finalBrowser == null || finalBrowser.isBlank()) {
            finalBrowser = browser;
        }

        // if (finalEnv == null || finalEnv.isBlank()) {
        //     finalEnv = env;
        // }

        System.setProperty("browser", finalBrowser);
        // System.setProperty("env", finalEnv);

        System.out.println("Browser selected: " + finalBrowser);
        // System.out.println("Environment selected: " + finalEnv);
    public void setParameters(@Optional("chrome") String browser) {

        String finalBrowser = System.getProperty("browser");
        // String finalEnv = System.getProperty("env");

        if (finalBrowser == null || finalBrowser.isBlank()) {
            finalBrowser = browser;
        }

        // if (finalEnv == null || finalEnv.isBlank()) {
        //     finalEnv = env;
        // }

        System.setProperty("browser", finalBrowser);
        // System.setProperty("env", finalEnv);

        System.out.println("Browser selected: " + finalBrowser);
        // System.out.println("Environment selected: " + finalEnv);
    public void setParameters(@Optional("chrome") String browser) {

        String finalBrowser = System.getProperty("browser");
        // String finalEnv = System.getProperty("env");

        if (finalBrowser == null || finalBrowser.isBlank()) {
            finalBrowser = browser;
        }

        // if (finalEnv == null || finalEnv.isBlank()) {
        //     finalEnv = env;
        // }

        System.setProperty("browser", finalBrowser);
        // System.setProperty("env", finalEnv);

        System.out.println("Browser selected: " + finalBrowser);
        // System.out.println("Environment selected: " + finalEnv);
    public void setParameters(@Optional("chrome") String browser) {

        String finalBrowser = System.getProperty("browser");
        // String finalEnv = System.getProperty("env");

        if (finalBrowser == null || finalBrowser.isBlank()) {
            finalBrowser = browser;
        }

        // if (finalEnv == null || finalEnv.isBlank()) {
        //     finalEnv = env;
        // }

        System.setProperty("browser", finalBrowser);
        // System.setProperty("env", finalEnv);

        System.out.println("Browser selected: " + finalBrowser);
        // System.out.println("Environment selected: " + finalEnv);
    public void setParameters(@Optional("chrome") String browser) {

        String finalBrowser = System.getProperty("browser");
        // String finalEnv = System.getProperty("env");

        if (finalBrowser == null || finalBrowser.isBlank()) {
            finalBrowser = browser;
        }

        // if (finalEnv == null || finalEnv.isBlank()) {
        //     finalEnv = env;
        // }

        System.setProperty("browser", finalBrowser);
        // System.setProperty("env", finalEnv);

        System.out.println("Browser selected: " + finalBrowser);
        // System.out.println("Environment selected: " + finalEnv);
    }

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}


// package TestRunner;

// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.DataProvider;
// import org.testng.annotations.Parameters;
// import org.testng.annotations.Optional;
// import io.cucumber.testng.AbstractTestNGCucumberTests;
// import io.cucumber.testng.CucumberOptions;

// @CucumberOptions(
//     features = ".//Feature",
//     glue = {"StepDefinition", "hooks"},
//     monochrome = true,
//     dryRun = false,
//     plugin = {
//         "pretty",
//         "html:target/cucumber-report.html",
// //        "json:target/cucumber-report.json",
// //        "junit:target/cucumber-report.xml",
//         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//     },
//     tags = "@regression"
// )
// public class TestRunner extends AbstractTestNGCucumberTests {
	
// 	@BeforeClass(alwaysRun = true)
//     @Parameters("browser")
//     public void setBrowser(@Optional("chrome") String browser) {
//         System.setProperty("browser", browser);
//     }

//     @Override
//     @DataProvider(parallel = false)
//     public Object[][] scenarios() {
//         return super.scenarios();
//     }        
// }
