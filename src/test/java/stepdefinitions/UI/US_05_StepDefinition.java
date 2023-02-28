package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_05_HomePage;
import pages.US_05_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_05_StepDefinition {
    US_05_HomePage us_05_homePage = new US_05_HomePage();
    US_05_LoginPage us_05_loginPage=new US_05_LoginPage();
    @Given("user navigate to {string} page5")
    public void user_navigate_to_page(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("user click on user icon option5")
    public void user_click_on_user_icon_option() {
        ReusableMethods.waitFor(3);
        us_05_homePage.userIcon.click();
    }
    @When("user click on sign in option5")
    public void user_click_on_sign_in_option() {
        us_05_homePage.signInOption.click();
    }
    @When("user enter valid username5")
    public void user_enter_valid_username() {
       ReusableMethods.waitFor(2);
       us_05_loginPage.userNameInput.sendKeys(ConfigReader.getProperty("patientUsername5"));
    }
    @When("user enter valid password5")
    public void user_enter_valid_password() {
        ReusableMethods.waitFor(2);
        us_05_loginPage.passwordInput.sendKeys(ConfigReader.getProperty("patientPassword5"));
    }
    @When("user click on remember me button5")
    public void user_click_on_remember_me_button() {
      us_05_loginPage.rememberMeBox.click();
    }
    @When("user click on sign in submit button5")
    public void user_click_on_sign_in_submit_button() {
       us_05_loginPage.signInSubmitButton.click();
    }
    @Then("verify user logged in with valid credentials and Welcome to medunna on the page5")
    public void verifyUserLoggedInWithValidCredentialsAndWelcomeToMedunnaOnThePage() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_05_homePage.welcomeText.isDisplayed());
    }

    @And("user enter invalid password5")
    public void userEnterInvalidPassword() {
        ReusableMethods.waitFor(1);
        us_05_loginPage.passwordInput.sendKeys(ConfigReader.getProperty("invalidPassword"));
    }

    @Then("verify failed to sign in message displayed on the page5")
    public void verifyFailedToSignInMessageDisplayedOnThePage() {
        Assert.assertTrue(us_05_loginPage.failedMessage.isDisplayed());
    }

    @Then("close the application5")
    public void closeTheApplication() {
        Driver.closeDriver();
    }
    @When("user enter invalid username5")
    public void userEnterInvalidUsername() {
        ReusableMethods.waitFor(1);
        us_05_loginPage.userNameInput.sendKeys(ConfigReader.getProperty("invalidUsername"));

    }
    @Then("verify remember me option is on the page5")
    public void verifyRememberMeOptionIsOnThePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_loginPage.rememberMeBox.isDisplayed());
    }
    @Then("verify remember me button is selectable5")
    public void verifyRememberMeButtonIsSelectable() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_loginPage.rememberMeBox.isSelected());
    }

    @And("user click on sign out option5")
    public void userClickOnSignOutOption() {
        ReusableMethods.waitFor(3);
        us_05_homePage.signOutOption.click();
    }

    @Then("verify thank you for choosing us message on the page5")
    public void verifyThankYouForChoosingUsMessageOnThePage() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_05_homePage.thankYouMessage.isDisplayed());
    }
    @And("user click on Sign in Again button5")
    public void userClickOnSignInAgainButton() {
        ReusableMethods.waitFor(3);
        us_05_homePage.signInAgainButton.click();
    }
    @Then("verify valid credentials displayed on username and password box automatically5")
    public void verifyValidCredentialsDisplayedOnUsernameAndPasswordBoxAutomatically() {
        ReusableMethods.waitFor(3);
        us_05_loginPage.userNameInput.click();
        ReusableMethods.waitFor(3);
        //Assert.assertEquals("HastaBerfin", ?);
       // Assert.assertEquals("merhaba-21",us_05_loginPage.passwordInput.getText());
    }

    @Then("verify Register a new account link option is on the page5")
    public void verifyRegisterANewAccountLinkOptionIsOnThePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_loginPage.registerLink.isDisplayed());
    }
    @And("user click on the Register a new account link5")
    public void userClickOnTheRegisterANewAccountLink() {
       ReusableMethods.waitFor(2);
       JSUtils.clickElementByJS(us_05_loginPage.registerLink);
    }

    @Then("verify user is taken to Registration page5")
    public void verifyUserIsTakenToRegistrationPage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_homePage.RegistrationText.isDisplayed());
    }

    @Then("verify there is cancel button on the login page5")
    public void verifyThereIsCancelButtonOnTheLoginPage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_loginPage.cancelButton.isDisplayed());
    }
    @And("user click on the cancel button5")
    public void userClickOnTheCancelButton() {
        ReusableMethods.waitFor(2);
        us_05_loginPage.cancelButton.click();
    }
    @Then("verify user is taken to home page5")
    public void verifyUserIsTakenToHomePage() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_homePage.welcomeText.isDisplayed());
    }

}
