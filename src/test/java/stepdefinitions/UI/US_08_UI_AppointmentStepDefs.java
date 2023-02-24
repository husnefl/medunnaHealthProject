package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_07_HomePage;
import pages.US_07_LoginPage;
import pages.US_08_AppointmentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_08_UI_AppointmentStepDefs {
    US_07_HomePage us_07_homePage = new US_07_HomePage();

    US_08_AppointmentPage us_08_appointmentPage = new US_08_AppointmentPage();


    @And("click My pages\\(Patient) icon")
    public void clickMyPagesPatientIcon() {
        us_08_appointmentPage.myPages.click();
    }


    @And("click  Make an Appointment")
    public void clickMakeAnAppointment() {
        us_08_appointmentPage.makeAnAppointment.click();
    }

    @And("enter a phone number")
    public void enterAPhoneNumber() {
        us_08_appointmentPage.phoneNumber.sendKeys(ConfigReader.getProperty("patientPhoneNumber08"));
    }


    @And("Click Send an Appointment Request Button")
    public void clickSendAnAppointmentRequestButton() {
        ReusableMethods.waitFor(2);
        us_08_appointmentPage.requestButton.click();
    }


    @When("Click on user icon on menu")
    public void clickOnUserIconOnMenu() {
        ReusableMethods.waitFor(1);
        us_08_appointmentPage.userIcon08.click();
    }

    @And("Click on Sign In option")
    public void clickOnSignInOption() {
        ReusableMethods.waitFor(1);
        us_08_appointmentPage.signInOption08.click();
    }

    @And("Enter registered username")
    public void enterRegisteredUsername() {
        ReusableMethods.waitFor(1);
        us_08_appointmentPage.usernameInput08.sendKeys(ConfigReader.getProperty("patientUsername07"));
    }

    @And("Enter registered  password")
    public void enterRegisteredPassword() {
        ReusableMethods.waitFor(1);
        us_08_appointmentPage.passwordInput08.sendKeys(ConfigReader.getProperty("patientPassword07"));
    }

    @And("Click on Sign In submit button")
    public void clickOnSignInSubmitButton() {
        ReusableMethods.waitFor(1);
        us_08_appointmentPage.signInSubmitButton08.click();
    }


    @Then("Close the application")
    public void closeTheApplication() {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }


    @And("Enter invalid date")
    public void enterInvalidDate() {
        ReusableMethods.waitFor(3);
        us_08_appointmentPage.appointmentDate.sendKeys(ConfigReader.getProperty("patientAnInvalidDate"));
    }


    @And("Verify the user should be see the past date message")
    public void verifyTheUserShouldBeSeeThePastDateMessage() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_08_appointmentPage.invalidDateMessage.isDisplayed());
    }


    @And("Click appointment button")
    public void clickAppointmentButton() {
        ReusableMethods.waitFor(3);
        us_08_appointmentPage.appointmentDateButton.click();
    }

    @And("click request button")
    public void clickRequestButton() {
        ReusableMethods.waitFor(2);
        us_08_appointmentPage.requestButton.click();
    }


    @Then("click sign out")
    public void clickSignOut() {
        ReusableMethods.waitFor(3);
        us_08_appointmentPage.signOut.click();
    }


    @And("Verify the user should not be see the past date message")
    public void verifyTheUserShouldNotBeSeeThePastDateMessage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_08_appointmentPage.requestButtonMessage.isEnabled());
    }

    @And("Click Sign in Icon")
    public void clickSignInIcon() {
        ReusableMethods.waitFor(2);
        us_08_appointmentPage.registeredNameIcon.click();
    }


    @And("Verify the user should  be see the appointment  message")
    public void verifyTheUserShouldBeSeeTheAppointmentMessage() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_08_appointmentPage.requestButtonMessage.isDisplayed());
    }

    @And("choose a valid date in proper format")
    public void chooseAValidDateInProperFormat() {
        ReusableMethods.waitFor(3);
        us_08_appointmentPage.appointmentDateButton.sendKeys(ConfigReader.getProperty("patientValidDate"));
    }

    @And("click My pages\\(Patient) menu")
    public void clickMyPagesPatientMenu() {
        ReusableMethods.waitFor(2);
        us_08_appointmentPage.myPages.click();
    }

}
