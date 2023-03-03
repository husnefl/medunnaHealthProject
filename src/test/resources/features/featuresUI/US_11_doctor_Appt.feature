@UI_Dr_Appt
Feature: Ui_Feature

  Background:Login
    Given User navigate to "medunnaUrl"
    When Click Sign in iconHA
    And Choose Sign in from dropdownHA
    And Enter the usernameHA
    And Enter the passwordHA
    And Click the sign in buttonHA
    And Click on MY PAGEHA
    And Choose My Appointments from dropdownHA

  @TC_01
  Scenario:Doctor should be able to see his/her appointment listHA
    Then Verify that their Appointments list on My Appointments pageHA
    Then Verify that their Appointments time slots on My Appointments pageHA
    Then close the applicationHA


  @TC_02
  Scenario:User(doctor) can see patient id, start date, end date, status…HA
    Then Verify that patient id, start date, end date, statusHA

