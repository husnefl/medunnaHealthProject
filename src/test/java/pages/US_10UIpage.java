package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_10UIpage {


  public US_10UIpage() {
    PageFactory.initElements(Driver.getDriver(), this);
  }
  @FindBy(xpath = "//a[@class=\"d-flex align-items-center dropdown-toggle nav-link\"]")
  public WebElement Dropdown;

  @FindBy(xpath = "//[@class=\"dropdown-item\"]")
  public WebElement searchPatient;

  @FindBy(name = "ssn")
  public WebElement SSNBox;

  @FindBy(xpath = "d-none d-md-inline")
  public WebElement editPatient;

  @FindBy(id = "patient-firstName")
  public WebElement editButton;

  @FindBy(id = "patient-lastName")
  public WebElement patientLastName;

  @FindBy(id = "email")
  public WebElement patientEmail;
}