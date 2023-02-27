package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_01UserManagementPage {

    public US_01UserManagementPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement firstRoomNumber;

    @FindBy(xpath = "//table//thead//th[1]")
    public WebElement idIcon;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement SSN;

    @FindBy(xpath = "//tbody//tr[1]//td[11]/div/a[2]/span/span")
    public WebElement editButton;

    @FindBy(id = "activated")
    public WebElement activationCheckbox;

    @FindBy(id = "authorities")
    public WebElement selectOptions;

    @FindBy(xpath= "//*[@id='authorities']/option[5]")
    public WebElement physician;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement editSaveButton;


    @FindBy(id = "firstName")
    public WebElement editFirstName;

    @FindBy(id = "firstName")
    public WebElement editLastName;







//option[contains(@value,'ROLE_PHYSICIAN')]


}
