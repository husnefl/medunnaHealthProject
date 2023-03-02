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
        tags = "@email_validation_api"
=======
          tags = "@us_12_13_medunnadoctor_TC05"
>>>>>>> 9ed12f9e61214ad0cad566a348c1981ae84e35db
)
public class Runner {

}