@us_12_13_medunnadoctor_TC03
Feature: US_12_medunna_doctor_TC03

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


  Scenario: US12_TC03_doctor types required fields in patient appointment
    Then verify you see "this field is required" message on empty Anamnesis field when you enter the save button
    Then verify you see "this field is required" message on empty Treatment field when you enter the save button
    Then verify you see "this field is required" message on empty Diagnosis field when you enter the save button

