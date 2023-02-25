package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_05_HomePage;
import pages.US_06_AppointmentPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_06_AppointmentStepDefinitions {
    US_05_HomePage us_05_homePage = new US_05_HomePage();
    US_06_AppointmentPage us_06_appointmentPage = new US_06_AppointmentPage();

    @When("user click on make an appointment button")
    public void user_click_on_make_an_appointment_button() {
        ReusableMethods.waitFor(2);
        us_05_homePage.makeAppointmentButton.click();
    }
    @When("user enter firstname that contains any chars")
    public void user_enter_firstname_that_contains_any_chars() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.firstNameInput.sendKeys(ConfigReader.getProperty("fNameWithAnyChars"));
    }
    @When("user enter  registered lastname")
    public void user_enter_registered_lastname() {
        ReusableMethods.waitFor(2);
       us_06_appointmentPage.lastNameInput.sendKeys(ConfigReader.getProperty("registeredLastname"));
    }
    @When("user enter registered SSN id")
    public void user_enter_registered_ssn_id() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.ssnInput.sendKeys(ConfigReader.getProperty("registeredSsn"));
    }
    @When("user enter registered email address")
    public void user_enter_registered_email_address() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.emailInput.sendKeys(ConfigReader.getProperty("registeredEmail"));
    }
    @When("user enter valid phone number")
    public void user_enter_valid_phone_number() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.phoneInput.sendKeys(ConfigReader.getProperty("validPhoneNumber"));
    }
    @And("user click on Send and Appointment Request Button")
    public void userClickOnSendAndAppointmentRequestButton() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.appointmentSubmitButton.click();
    }

    @Then("Verify Appointment registration saved message is displayed on the page")
    public void verifyAppointmentRegistrationSavedMessageIsDisplayedOnThePage() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_06_appointmentPage.appointmentSavedText.isDisplayed());
    }

    @When("user enter registered firstname")
    public void userEnterRegisteredFirstname() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.firstNameInput.sendKeys(ConfigReader.getProperty("registeredFirstname"));
    }

    @And("user enter lastname that contains any chars")
    public void userEnterLastnameThatContainsAnyChars() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.lastNameInput.sendKeys(ConfigReader.getProperty("lNameWithAnyChars"));
    }
    @Then("Verify your firstname is required message is pop up on the page")
    public void verifyYourFirstnameIsRequiredMessageIsPopUpOnThePage() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_06_appointmentPage.firstNameWarningMessage.isDisplayed());
    }

    @Then("Verify your lastname is required message is pop up on the page")
    public void verifyYourLastnameIsRequiredMessageIsPopUpOnThePage() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_06_appointmentPage.lastNameWarningMessage.isDisplayed());
    }

    @And("user enter different SSN id")
    public void userEnterDifferentSSNId() {
        ReusableMethods.waitFor(2);
        us_06_appointmentPage.ssnInput.sendKeys(ConfigReader.getProperty("differentSSN"));
    }

    @And("Verify Email is already in use message is displayed on the page")
    public void verifyEmailIsAlreadyInUseMessageIsDisplayedOnThePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_06_appointmentPage.differentSSNWarningMessage.isDisplayed());
    }

    @Then("Verify your SSN is required message is pop up on the page")
    public void verifyYourSSNIsRequiredMessageIsPopUpOnThePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_06_appointmentPage.ssnWarningMessage.isDisplayed());
    }

    @Then("Verify your email is required message is pop up on the page")
    public void verifyYourEmailIsRequiredMessageIsPopUpOnThePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_06_appointmentPage.emailWarningMessage.isDisplayed());
    }
}
