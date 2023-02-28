@Ui_Dr_Appt
Feature: Ui_Feature

  Background:Login
    Given User navigate to "medunnaUrl"
    When Click Sign in icon11
    And Choose Sign in from dropdown11
    And Enter the username11
    And Enter the password11
    And Click the sign in button11
    And Click on MY PAGE11
    And Choose My Appointments from dropdown11

  @TC_01
  Scenario:Doctor should be able to see his/her appointment list11
    Then Verify that their Appointments list on My Appointments page11
    Then Verify that their Appointments time slots on My Appointments page11
    Then close the application01


  @TC_02
  Scenario:User(doctor) can see patient id, start date, end date, status…
    Then Verify that patient id, start date, end date, status
    Then close the application11

