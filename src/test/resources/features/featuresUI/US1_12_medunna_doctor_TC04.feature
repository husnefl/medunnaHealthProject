@us_12_13_medunnadoctor_TC04
Feature: US_12_medunna_doctor_TC04

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

  Scenario: US12_TC04_prescription and description can be optional
    Then verify prescription is optional
    Then verify description is optional
