package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US_07_HomePage;
import pages.US_07_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_07_UI_SignInStepDefs {
    US_07_HomePage us_07_homePage =new US_07_HomePage();
    US_07_LoginPage us_07_loginPage = new US_07_LoginPage();


    @Given("user is on {string} page")
    public void user_is_on_page(String string) {
        ReusableMethods.waitFor(1);
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @When("click on user icon on menu")
    public void clickOnUserIconOnMenu() {
        ReusableMethods.waitFor(1);
        us_07_homePage.userIcon.click();
    }


    @When("click on Sign In option")
    public void click_on_sign_in_option() {
        ReusableMethods.waitFor(1);
        us_07_homePage.signInOption.click();
    }

    @And("enter registered username")
    public void enterRegisteredUsername() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.usernameInput.sendKeys(ConfigReader.getProperty("patientUsername07"));
    }

    @And("enter registered  password")
    public void enterRegisteredPassword() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.passwordInput.sendKeys(ConfigReader.getProperty("patientPassword07"));

    }
    @When("click on Sign In submit button")
    public void click_on_sign_in_submit_button() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.signInSubmitButton.click();
    }

    @When("Click On User  Registered User Name icon")
    public void clickOnUserRegisteredUserNameIcon() {
        ReusableMethods.waitFor(1);

        us_07_loginPage.registeredUserName.click();
    }


    @And("Click Setting")
    public void clickSetting() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.userSetting.click();

    }



    @And("Edit the first name")
    public void editTheFirstName() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.editedFirstName.clear();
        us_07_loginPage.editedFirstName.sendKeys(ConfigReader.getProperty("patientEditedUserame07"));
    }

    @And("Edit the last name")
    public void editTheLastName() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.editedLastName.clear();
        us_07_loginPage.editedLastName.sendKeys(ConfigReader.getProperty("patientEditedLastname07"));
    }

    @And("Edit the email")
    public void editTheEmail() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.editedEmail.clear();
        us_07_loginPage.editedEmail.sendKeys(ConfigReader.getProperty("patientEditedEmail07"));

    }

    @And("Click save button")
    public void clickSaveButton() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.saveButton.click();

    }


    @Then("Verify  Setting saved is displayed")
    public void verifySettingSavedIsDisplayed() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.settingSavedAlert.isDisplayed();
    }


    @And("close the application")
    public void closeTheApplication() {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }

}
