package stepdefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US_10UIpage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_10StepDefs {
    US_10UIpage page=new US_10UIpage();

    @Given("user go to {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));

    }
    @Then("user clicks MY PAGE dropdown")
    public void user_clicks_my_page_dropdown() {
        page.Dropdown.click();

    }
    @Then("user clicks Search Patient button")
    public void user_clicks_search_patient_button() {
        page.searchPatient.click();

    }
    @Then("user provides patient in ssn box {string}")
    public void user_provides_patient_in_ssn_box(String string) {
        page.SSNBox.sendKeys("300-20-3030");

    }
    @Then("user edits {string}")
    public void user_edits(String string) {


    }

}

