package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_11_DrApptPage {
    public US_11_DrApptPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "account-menu")
    public WebElement signIn;
    @FindBy(id = "login-item")
    public WebElement signInOption;
    @FindBy(id = "username")
    public WebElement usernameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(xpath = "//a[@class=\"d-flex align-items-center dropdown-toggle nav-link\"]")
    public WebElement Dropdown;
    @FindBy(name = "ssn")
    public WebElement SSNBox;

    //        @FindBy(id = "patient-firstName")
//        public WebElement patientName;
//
//        @FindBy(id = "patient-lastName")
//        public WebElement patientLastName;
//
//        @FindBy(id = "email")
//        public WebElement patientEmail;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;
    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement myPagesDropDown;
    @FindBy(xpath = "//span[text() ='Search Patient']")
    public WebElement searchPatient;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement editButton;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement patientFirstName;
    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement patientLastName;
}

