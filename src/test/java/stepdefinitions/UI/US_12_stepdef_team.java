package stepdefinitions.UI;

public class US_12_stepdef_team {
}

//package stepdefinitions;
//
//        import io.cucumber.java.en.*;
//        import org.junit.Assert;
//        import org.openqa.selenium.WebElement;
//        import pages.US_12_page;
//        import utilities.Driver;
//        import utilities.JSUtils;
//        import utilities.JsonUtil;
//        import utilities.ReusableMethods;
//
//        import java.sql.Connection;
//        import java.util.ArrayList;
//        import java.util.List;
//
//public class US_12_stepdef {
//
//    //pageleri obj create etmeyi unutma
//    US_12_page us_12_page=new US_12_page();
//
//    @Given("user is on {string} page")
//    public void user_is_on_page(String string) {
//        Driver.getDriver().get(string);
//
//    }
//    @When("click on user icon")
//    public void click_on_user_icon() {
//        ReusableMethods.waitFor(1);
//        us_12_page.userIcon.click();
//
//    }
//    @When("click on Sign In option")
//    public void click_on_sign_in_option() {
//        ReusableMethods.waitFor(1);
//        us_12_page.signInOption.click();
//    }
//    @When("enter {string} in username input")
//    public void enter_in_username_input(String username) {
//        ReusableMethods.waitFor(1);
//        us_12_page.usernameInput.sendKeys(username);
//    }
//    @When("enter {string} in password input")
//    public void enter_in_password_input(String password) {
//        ReusableMethods.waitFor(1);
//        us_12_page.passwordInput.sendKeys(password);
//    }
//    @When("click on Sign In submit button")
//    public void click_on_sign_in_submit_button() {
//        ReusableMethods.waitFor(1);
//        us_12_page.signInSubmitButton.click();
//    }
//    @When("click on MY PAGES")
//    public void click_on_my_pages() {
//        ReusableMethods.waitFor(1);
//        us_12_page.mypagesbutton.click();
//
//
//    }
//    @When("click on My Appointments")
//    public void click_on_my_appointments() {
//        ReusableMethods.waitFor(1);
//        us_12_page.myappointments.click();
//    }
//    @When("clicks on edit button to create or edit an appointment")
//    public void clicks_on_edit_button_to_create_or_edit_an_appointment() {
//        ReusableMethods.waitFor(1);
//        us_12_page.editbutton.click();
//    }
//    @Then("verifies patient's id,start datetime and end datetime, status")
//    public void verifies_patient_s_id_start_datetime_and_end_datetime_status() {
//        ReusableMethods.waitFor(1);
//        Assert.assertTrue(us_12_page.hastaid.isDisplayed());
//        Assert.assertTrue(us_12_page.hastastartdatetime.isDisplayed());
//        Assert.assertTrue(us_12_page.hastaenddatetime.isDisplayed());
//
//
//
//    }
//    @Then("Doctor fills in required fields, anemnesis, treatment, diagnosis")
//    public void doctor_fills_in_required_fields_anemnesis_treatment_diagnosis() {
//        ReusableMethods.waitFor(1);
//        us_12_page.anamnesisfield.clear();
//        us_12_page.anamnesisfield.sendKeys("no surgery");
//        us_12_page.treatmentfield.clear();
//        us_12_page.treatmentfield.sendKeys("medicine");
//        us_12_page.diagnosisfield.clear();
//        us_12_page.diagnosisfield.sendKeys("tumor");
//
//
//    }
//    @Then("click on save button")
//    public void click_on_save_button() {
//        ReusableMethods.waitFor(1);
//        JSUtils.clickElementByJS(us_12_page.saveappoinmentbutton);
//
//    }
//    @Then("Verify appointment is saved successfully")
//    public void verify_appointment_is_saved_successfully() {
//        ReusableMethods.waitFor(1);
//        String text= us_12_page.appointmentstextondoctorsappoinmentspage.getText();
//        Assert.assertTrue(text.equals("Appointments"));
//    }
//
//    //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02
//
//    @Then("verify patient's id;")
//    public void verify_patient_s_id() {
//        ReusableMethods.waitFor(1);
//
//        String textid=JSUtils.getValueInStringByJS("appointment-id");
//        System.out.println(textid);
//        ReusableMethods.waitFor(1);
//        Assert.assertEquals("2469",textid);
//
//
//    }
//    @Then("verify patient's start date time;")
//    public void verify_patient_s_start_date_time() {
//
//        ReusableMethods.waitFor(1);
//        String Textstartdatefield=JSUtils.getValueInStringByJS("appointment-startDate");
//        System.out.println(" startdatein icindeki tarih "+Textstartdatefield);
//        ReusableMethods.waitFor(1);
//        Assert.assertEquals("2023-02-21T18:00",Textstartdatefield);
//
//
//    }
//    @Then("verify patient's end date time;")
//    public void verify_patient_s_end_date_time() {
//        ReusableMethods.waitFor(1);
//        String Textenddatefield=JSUtils.getValueInStringByJS("appointment-endDate");
//        System.out.println(" enddatein icindeki tarih "+Textenddatefield);
//        ReusableMethods.waitFor(1);
//        Assert.assertEquals("2023-02-21T19:00",Textenddatefield);
//
//    }
//    @Then("verify patient's status;")
//    public void verify_patient_s_status() {
//        ReusableMethods.waitFor(1);
//        String Textstatusfield=JSUtils.getValueInStringByJS("appointment-status");
//        System.out.println(" STATUSUN ICINDEKI TEXT "+Textstatusfield);
//        ReusableMethods.waitFor(1);
//        Assert.assertEquals("PENDING",Textstatusfield);
//    }
//
//    @Then("click on signout")
//    public void click_on_signout() {
//        us_12_page.signOutOption.click();
//
//    }
//
//    @Then("verify you see {string} message on empty Anamnesis field when you enter the save button")
//    public void verify_you_see_message_on_empty_anamnesis_field_when_you_enter_the_save_button(String string) {
//
//        ReusableMethods.waitFor(1);
//        us_12_page.anamnesisfield.clear();
//        JSUtils.clickElementByJS(us_12_page.saveappoinmentbutton);
//        ReusableMethods.waitFor(1);
//        Assert.assertTrue(us_12_page.emptyfieldmessage.isDisplayed());
//
//    }
//
//    @Then("verify you see {string} message on empty Treatment field when you enter the save button")
//    public void verify_you_see_message_on_empty_treatment_field_when_you_enter_the_save_button(String string) {
//
//        ReusableMethods.waitFor(1);
//        us_12_page.treatmentfield.clear();
//        ReusableMethods.waitFor(2);
//        Assert.assertTrue(us_12_page.emptyfieldmessage.isDisplayed());
//    }
//
//    @Then("verify you see {string} message on empty Diagnosis field when you enter the save button")
//    public void verify_you_see_message_on_empty_diagnosis_field_when_you_enter_the_save_button(String string) {
//
//        ReusableMethods.waitFor(1);
//        us_12_page.diagnosisfield.clear();
//        ReusableMethods.waitFor(2);
//        Assert.assertTrue(us_12_page.emptyfieldmessage.isDisplayed());
//
//    }
//
//    @Then("verify prescription is optional")
//    public void verify_prescription_is_optional() {
//
//        us_12_page.appointmentprescriptionfield.clear();
//        ReusableMethods.waitFor(1);
//        JSUtils.clickElementByJS(us_12_page.saveappoinmentbutton);
//        ReusableMethods.waitFor(6);
//        String text= us_12_page.appointmentstextondoctorsappoinmentspage.getText();
//        Assert.assertTrue(text.equals("Appointments"));
//        ReusableMethods.waitFor(1);
//
//
//
//
//    }
//    @Then("verify description is optional")
//    public void verify_description_is_optional() {
//
//        JSUtils.clickElementByJS(us_12_page.editbutton);
//        us_12_page.appointmentprescriptionfield.clear();
//        ReusableMethods.waitFor(1);
//        JSUtils.clickElementByJS(us_12_page.saveappoinmentbutton);
//        ReusableMethods.waitFor(5);
//        String text= us_12_page.appointmentstextondoctorsappoinmentspage.getText();
//        Assert.assertTrue(text.equals("Appointments"));
//
//
//    }
//
//    @Then("verify Status dropdown has PENDING,COMPLETED AND CANCELLED options")
//    public void verify_status_dropdown_has_pending_completed_and_cancelled_options() {
//
//        List<WebElement> statusdropdownlist=us_12_page.appointmentstatusdropdownlist;
//        System.out.println(statusdropdownlist.size());
//        String pendingtext=statusdropdownlist.get(1).getText();
//        String completedtext =statusdropdownlist.get(2).getText();
//        String canselledtext=statusdropdownlist.get(3).getText();
//        List<String> statusdropdownlisttext=new ArrayList<>();
//        statusdropdownlisttext.add(pendingtext);
//        statusdropdownlisttext.add(completedtext);
//        statusdropdownlisttext.add(canselledtext);
//        Assert.assertTrue(statusdropdownlist.size()==4);
//        Assert.assertTrue(statusdropdownlisttext.contains("PENDING"));
//        Assert.assertTrue(statusdropdownlisttext.contains("COMPLETED"));
//        Assert.assertTrue(statusdropdownlisttext.contains("CANCELLED"));
//
//
//    }
//
//}

