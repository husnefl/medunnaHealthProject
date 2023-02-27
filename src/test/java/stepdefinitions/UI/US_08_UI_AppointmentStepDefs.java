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


    @When("Click on user icon on menu{int}")
    public void clickOnUserIconOnMenu(int arg0) {
        ReusableMethods.waitFor(1);
        us_08_appointmentPage.userIcon08.click();
    }

    @And("Click on Sign In optionHA")
    public void clickOnSignInOptionHA() {
        ReusableMethods.waitFor(1);
        us_08_appointmentPage.signInOption08.click();
    }

    @And("Click Sign in IconHA")
    public void clickSignInIconHA() {
        ReusableMethods.waitFor(2);
        us_08_appointmentPage.registeredNameIcon.click();
    }

    @And("Enter registered usernameHA")
    public void enterRegisteredUsernameHA() {
        ReusableMethods.waitFor(1);
        us_08_appointmentPage.usernameInput08.sendKeys(ConfigReader.getProperty("patientUsername07"));
    }

    @And("Enter registered  passwordHA")
    public void enterRegisteredPasswordHA() {
        ReusableMethods.waitFor(1);
        us_08_appointmentPage.passwordInput08.sendKeys(ConfigReader.getProperty("patientPassword07"));
    }

    @And("Click on Sign In submit buttonHA")
    public void clickOnSignInSubmitButtonHA() {
        ReusableMethods.waitFor(1);
        us_08_appointmentPage.signInSubmitButton08.click();
    }

    @And("click My pages\\(Patient) iconHA")
    public void clickMyPagesPatientIconHA() {
        ReusableMethods.waitFor(2);
        us_08_appointmentPage.myPages.click();
    }

    @And("click  Make an AppointmentHA")
    public void clickMakeAnAppointmentHA() {
        ReusableMethods.waitFor(2);
        us_08_appointmentPage.makeAnAppointment.click();
    }

    @And("enter a phone numberHA")
    public void enterAPhoneNumberHA() {
        us_08_appointmentPage.phoneNumber.sendKeys(ConfigReader.getProperty("patientPhoneNumber08"));
    }

    @And("Enter invalid dateHA")
    public void enterInvalidDateHA() {
        ReusableMethods.waitFor(3);
        us_08_appointmentPage.appointmentDate.sendKeys(ConfigReader.getProperty("patientAnInvalidDate"));
    }

    @And("Click Send an Appointment Request ButtonHA")
    public void clickSendAnAppointmentRequestButtonHA() {
        ReusableMethods.waitFor(2);
        us_08_appointmentPage.requestButton.click();
    }

    @And("Verify the user should not be see the past date messageHA")
    public void verifyTheUserShouldNotBeSeeThePastDateMessageHA() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_08_appointmentPage.requestButtonMessage.isEnabled());
    }

    @Then("click sign outHA")
    public void clickSignOutHA() {
        ReusableMethods.waitFor(3);
        us_08_appointmentPage.signOut.click();
    }

    @And("choose a valid date in proper formatHA")
    public void chooseAValidDateInProperFormatHA() {
        ReusableMethods.waitFor(3);
        us_08_appointmentPage.appointmentDateButton.sendKeys(ConfigReader.getProperty("patientValidDate"));
    }

    @Then("Verify the user should  be see the appointment  messageHA")
    public void verifyTheUserShouldBeSeeTheAppointmentMessageHA() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_08_appointmentPage.requestButtonMessage.isDisplayed());
    }
}
