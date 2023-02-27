@us_13_TC02
Feature: US_13_medunna_doctor_TC02

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


  Scenario: US13_TC02_Doctor request test
    And click on "Request A Test" button
    Then verify "Glucose" "Urea" "Creatinine" "Sodium Potassium" "Total protein" "Albumin"  "Hemoglobin" has checkmark options