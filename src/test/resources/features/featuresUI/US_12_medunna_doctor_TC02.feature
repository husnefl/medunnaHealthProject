@us_12_13_medunnadoctor_TC02
Feature: US_12_medunna_doctor_TC02

  Background: Signin Medunna
    Given user is on "https://medunna.com" page
    When click on user icon
    And click on Sign In option
    And enter "doktorfazilet" in username input
    And enter "unutma." in password input
    And click on Sign In submit button
    And click on MY PAGES
    And click on My Appointments
    And clicks on edit button to create or edit an appointment




  Scenario: US12_TC02_doctor sees patiets info
    Then verify patient's id;
    Then verify patient's start date time;
    Then verify patient's end date time;
    Then verify patient's status;


