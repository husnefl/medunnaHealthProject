package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US_0102HomePage;
import pages.US_0102UserManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_01RegisterStepDefs {



    US_0102HomePage us_01HomePage = new US_0102HomePage();
    US_0102UserManagementPage us_01UserManagementPage = new US_0102UserManagementPage();

    String sinNumber;
   static String userEmail;

    @Given("user goes to medunna homePage")
    public void user_goes_to_medunna_home_page() {
        ReusableMethods.waitFor(2);
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @When("user clicks user icon")
    public void user_clicks_user_icon() {
        ReusableMethods.waitFor(2);
        us_01HomePage.userIcon.click();
    }

    @And("user clicks Register option")
    public void user_clicks_register_option() {
        ReusableMethods.waitFor(2);
        us_01HomePage.registerOption.click();
    }

    @When("user enters the SSN number {string}")
    public void user_enters_the_ssn_number(String SSN) {
        ReusableMethods.waitFor(2);
        us_01HomePage.ssnNumber.sendKeys(SSN);

        if (SSN.length() != 11 || SSN.charAt(3) != '-' || SSN.charAt(6) != '-') {

            us_01HomePage.firstName.click();
            System.out.println(us_01HomePage.invalidSSNText.getText());
            ReusableMethods.waitFor(1);
            us_01HomePage.invalidSSNText.isDisplayed();
            System.out.println(us_01HomePage.ssnNumber.getText().length());

        }

    }
    @When("user enters the first name {string}")
    public void user_enters_the_first_name(String firstname) {
        ReusableMethods.waitFor(2);
        us_01HomePage.firstName.sendKeys(firstname);

        if (firstname.length() == 0) {
            ReusableMethods.waitFor(2);
            us_01HomePage.lastName.click();
            System.out.println(us_01HomePage.invalidSSNText.getText());
            us_01HomePage.invalidFirstNameText.isDisplayed();

        }

    }

    @When("user enters the last name {string}")
    public void user_enters_the_last_name(String lastname) {
        ReusableMethods.waitFor(2);
        us_01HomePage.lastName.sendKeys(lastname);

    }

    @When("user enters the user name {string}")
    public void user_enters_the_user_name(String username) {
        ReusableMethods.waitFor(2);
        us_01HomePage.userName.sendKeys(username);
    }


    @And("user enters the user email {string}")
    public void userEntersTheUserEmail(String email) {
        ReusableMethods.waitFor(2);
        us_01HomePage.email.sendKeys(email);
    }

    @When("user enters the user new pasword {string}")
    public void user_enters_the_user_new_pasword(String newpassword) {
        ReusableMethods.waitFor(1);
        us_01HomePage.newPassword.sendKeys(newpassword);
    }

    @When("user enters the user confirm new password {string}")
    public void user_enters_the_user_confirm_new_password(String confirmationpassword) {
        ReusableMethods.waitFor(2);
        us_01HomePage.newConfirmPassword.sendKeys(confirmationpassword);
    }


    @When("user clicks the register button")
    public void user_clicks_the_register_button() {
        ReusableMethods.waitFor(2);
        us_01HomePage.registerButton.click();
    }

    @When("admin clicks on user icon")
    public void adminClicksOnUserIcon() {
        ReusableMethods.waitFor(2);
        us_01HomePage.userIcon.click();
    }
    @When("admin clicks Sign in option")
    public void user_clicks_sign_in_option() {
        ReusableMethods.waitFor(2);
        us_01HomePage.signInOption.click();
    }

    @When("admin enters user's name {string} in field")
    public void user_enters_user_s_name_in_field(String adminusername) {
        ReusableMethods.waitFor(2);
        us_01HomePage.usernameInput.sendKeys(adminusername);
    }

    @When("admin enterspasswords's   {string} in field")
    public void user_enterspasswords_s_in_field(String adminpassword) {
        ReusableMethods.waitFor(1);
        us_01HomePage.passwordInput.sendKeys(adminpassword);
    }


    @And("admin on Remember Me checkbox")
    public void clickOnRememberMeCheckbox() {
        ReusableMethods.waitFor(2);
        us_01HomePage.rememberMeCheckbox.click();
    }

    @And("admin click on Sign In submit button")
    public void clickOnSignInSubmitButton() {
        us_01HomePage.signInSubmitButton.click();
    }

    @And("admin clicks Administration section")
    public void userClicksAdministrationSection() {
        ReusableMethods.waitFor(2);
        us_01HomePage.administirationSection.click();

    }

    @And("admin clicks usermanagement option")
    public void userClicksUsermanagementOption() {
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(us_01HomePage.userManagementOption);

    }

    @And("admin clicks ID sign")
    public void userClicksIDSign() {

        JSUtils.clickElementByJS(us_01UserManagementPage.idIcon);
        ReusableMethods.waitFor(1);
       userEmail=us_01UserManagementPage.email.getText();
       System.out.println(userEmail);

    }

    @Then("verify that fourth character  of SSN should be dash")
    public void verifyThatFourthCharacterOfSSNShouldBeDash() {

        String sinNumber = us_01UserManagementPage.SSN.getText();             // replaceAll("[A-Za-z0-9]","") ;
        ReusableMethods.waitFor(1);
        Assert.assertEquals('-', sinNumber.charAt(3));

    }
    @Then("verify that seventh character  of SSN should be dash")
    public void verifyThatSeventhCharacterOfSSNShouldBeDash() {

        String sinNumber = us_01UserManagementPage.SSN.getText();             // replaceAll("[A-Za-z0-9]","") ;
        ReusableMethods.waitFor(1);
        Assert.assertEquals('-', sinNumber.charAt(6));

    }
    @Then("verify that SSN number length should be nine digits")
    public void verifyThatSSNNumberLengthShouldBeNineDigits() {
         sinNumber = us_01UserManagementPage.SSN.getText();
        ReusableMethods.waitFor(1);
        String str = sinNumber.replaceAll("[^A-Za-z0-9]", "");
        Assert.assertEquals(9, str.length());

    }

    @Then("verify that SSN number should not be blank")
    public void verifyThatSSNNumberShouldNotBeBlank() {

        String sinNumber = us_01UserManagementPage.SSN.getText();
        ReusableMethods.waitFor(1);
        System.out.println(sinNumber);
        Assert.assertFalse(sinNumber.isBlank());

    }

    @Then("verify that firstname should not be blank")
    public void verifyThatFirstnmeShouldNotBeBlank() {
        JSUtils.clickElementByJS(us_01UserManagementPage.editButton);
        ReusableMethods.waitFor(1);
        Assert.assertFalse(! us_01UserManagementPage.editFirstName.getText().isBlank());

    }

    @Then("verify that lastname should not be blank")
       public void verifyThatLastnameShouldNotBeBlank() {
        JSUtils.clickElementByJS(us_01UserManagementPage.editButton);
        ReusableMethods.waitFor(1);
       JSUtils.clickElementByJS(us_01UserManagementPage.activationCheckbox);
       ReusableMethods.waitFor(1);
        ReusableMethods.waitFor(1);
        WebElement dropdown= us_01UserManagementPage.selectOptions;
        ReusableMethods.waitFor(1);
        Select select = new Select(dropdown);
        select.selectByIndex(4);
        ReusableMethods.waitFor(1);
       JSUtils.clickElementByJS(us_01UserManagementPage.editSaveButton);

}

}