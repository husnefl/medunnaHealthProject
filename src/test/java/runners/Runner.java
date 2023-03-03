package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome=true,

        features = "./src/test/resources/features",
        glue = {"stepdefinitions","hooks"},
        dryRun = false,
<<<<<<< HEAD
        tags = "@US_05_Login_Feature"
=======
        tags = "@US04"
>>>>>>> 13069ee32ed1b28d4559dbb944287b0831c9a5ca
)
public class Runner {

}
