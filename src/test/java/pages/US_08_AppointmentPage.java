package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_08_AppointmentPage {
    public US_08_AppointmentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIcon08;

    @FindBy(id = "login-item")
    public WebElement signInOption08;


    @FindBy(id = "username")
    public WebElement usernameInput08;

    @FindBy(id = "password")
    public WebElement passwordInput08;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton08;

    @FindBy(xpath = "//span[.='MY PAGES(PATIENT)']")
    public WebElement myPages;

    @FindBy(xpath = "//span[.='Make an Appointment']")
    public WebElement makeAnAppointment;


    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement appointmentDate;

    @FindBy(xpath = "//span[.='Send an Appointment Request']")
    public WebElement requestButton;


    @FindBy(xpath = "//*[text()='Appointment registration saved!']")
    public WebElement requestButtonMessage;


    @FindBy(xpath = "//input[@value='2023-03-26']")
    public WebElement aValidDate;



    @FindBy(xpath = "//span[.='Appointment date can not be past date!']")
    public WebElement invalidDateMessage;

    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement appointmentDateButton;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;

    @FindBy(xpath = "//span[.='Bilge Bella Pery']")
    public WebElement registeredNameIcon;





}
