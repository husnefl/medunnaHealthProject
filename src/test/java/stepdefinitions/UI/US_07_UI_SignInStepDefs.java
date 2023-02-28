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
    



    @Then("Close Application{int}")
    public void closeApplication(int arg0) {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }

    @When("click on user icon on menu{int}")
    public void clickOnUserIconOnMenu(int arg0) {
        ReusableMethods.waitFor(1);
        us_07_homePage.userIcon.click();
    }

    @And("click on Sign In option{int}")
    public void clickOnSignInOption(int arg0) {
        ReusableMethods.waitFor(1);
        us_07_homePage.signInOption.click();
    }

    @And("enter registered username{int}")
    public void enterRegisteredUsername(int arg0) {
        ReusableMethods.waitFor(1);
        us_07_loginPage.usernameInput.sendKeys(ConfigReader.getProperty("patientUsername07"));
    }

    @And("enter registered  password{int}")
    public void enterRegisteredPassword(int arg0) {
        ReusableMethods.waitFor(1);
        us_07_loginPage.passwordInput.sendKeys(ConfigReader.getProperty("patientPassword07"));
    }

    @And("click on Sign In submit button{int}")
    public void clickOnSignInSubmitButton(int arg0) {
        ReusableMethods.waitFor(1);
        us_07_loginPage.signInSubmitButton.click();
    }

    @When("Click On User  Registered User Name icon{int}")
    public void clickOnUserRegisteredUserNameIcon(int arg0) {
        ReusableMethods.waitFor(1);
        us_07_loginPage.registeredUserName.click();
    }

    @And("Click Setting{int}")
    public void clickSetting(int arg0) {
        ReusableMethods.waitFor(1);
        us_07_loginPage.userSetting.click();
    }

    @And("Edit the first name{int}")
    public void editTheFirstName(int arg0) {
        us_07_loginPage.editedFirstName.clear();
        us_07_loginPage.editedFirstName.sendKeys(ConfigReader.getProperty("patientEditedUserame07"));
    }

    @And("Click save button{int}")
    public void clickSaveButton(int arg0) {
        ReusableMethods.waitFor(1);
        us_07_loginPage.saveButton.click();

    }

    @And("Edit the last name{int}")
    public void editTheLastName(int arg0) {
        us_07_loginPage.editedLastName.clear();
        us_07_loginPage.editedLastName.sendKeys(ConfigReader.getProperty("patientEditedLastname07"));
    }

    @Then("Verify  Setting saved is displayed{int}")
    public void verifySettingSavedIsDisplayed(int arg0) {
        ReusableMethods.waitFor(1);
        us_07_loginPage.settingSavedAlert.isDisplayed();
    }



    @And("Edit the email{int}")
    public void editTheEmail(int arg0) {
        us_07_loginPage.editedEmail.clear();
        us_07_loginPage.editedEmail.sendKeys(ConfigReader.getProperty("patientEditedEmail07"));
    }

    @And("Close Application")
    public void closeApplication() {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }

    @Given("user is {string} url{int}")
    public void userIsUrl(String arg0, int arg1) {
        ReusableMethods.waitFor(1);
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
}
