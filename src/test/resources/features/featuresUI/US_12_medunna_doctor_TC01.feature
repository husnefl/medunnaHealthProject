@us_12_13_medunnadoctor
Feature: US_12_medunna_doctor

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


    Scenario: US12_TC01_Populate info in appointment
      Then  verifies patient's id,start datetime and end datetime, status
      And  Doctor fills in required fields, anemnesis, treatment, diagnosis
      And  click on save button
      Then Verify appointment is saved successfully
      Then click on user icon
      And  click on signout




