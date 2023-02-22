package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_07_LoginPage {

    public US_07_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;


    @FindBy(xpath = "//*[@id=\"account-menu\"]/a/span")
    public WebElement registeredUserName;

    @FindBy(xpath = "//span[.='Settings']")
    public WebElement userSetting;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement editedFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement editedLastName;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//h2[@id='settings-title']")
    public WebElement settingSavedAlert;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement editedEmail;


}