@Appointment_Feature
Feature: Appointment Feature

  Background:
    Given user navigate to "https://www.medunna.com/" page
    When user click on make an appointment button

  @TC_01A
  Scenario: TC_01 Verify making an appointment with any chars in firstname input
    When user enter firstname that contains any chars
    And user enter  registered lastname
    And user enter registered SSN id
    And user enter registered email address
    And user enter valid phone number
    And user click on Send and Appointment Request Button
    Then Verify Appointment registration saved message is displayed on the page
    Then close the application

  @TC_02A
  Scenario: TC_02 Verify making an appointment with any chars in lastname input
    When user enter registered firstname
    And user enter lastname that contains any chars
    And user enter registered SSN id
    And user enter registered email address
    And user enter valid phone number
    And user click on Send and Appointment Request Button
    Then Verify Appointment registration saved message is displayed on the page
    Then close the application

  @TC_03A
  Scenario: TC_03 Verify that firstname input should not be blank
    When user enter  registered lastname
    And user enter registered SSN id
    And user enter registered email address
    And user enter valid phone number
    And user click on Send and Appointment Request Button
    Then Verify your firstname is required message is pop up on the page
    Then close the application

  @TC_04A
  Scenario: TC_04 Verify that lastname input should not be blank
    When user enter registered firstname
    And user enter registered SSN id
    And user enter registered email address
    And user enter valid phone number
    And user click on Send and Appointment Request Button
    Then Verify your lastname is required message is pop up on the page
    Then close the application

  @TC_05A
  Scenario: TC_05 Verify that user can make an appointment with registered SSN id
    When user enter registered firstname
    And user enter  registered lastname
    And user enter registered SSN id
    And user enter registered email address
    And user enter valid phone number
    And user click on Send and Appointment Request Button
    And Verify Appointment registration saved message is displayed on the page
    Then close the application

  @TC_06A
  Scenario: TC_06 Verify that user can not make an appointment with different than registered SSN id
    When user enter registered firstname
    And user enter  registered lastname
    And user enter different SSN id
    And user enter registered email address
    And user enter valid phone number
    And user click on Send and Appointment Request Button
    And Verify Email is already in use message is displayed on the page
    Then close the application

  @TC_07A
  Scenario: TC_07 Verify that SSN id input should not be blank
    When user enter registered firstname
    And user enter  registered lastname
    And user enter registered email address
    And user enter valid phone number
    And user click on Send and Appointment Request Button
    Then Verify your SSN is required message is pop up on the page
    Then close the application

  @TC_08A
  Scenario: TC_08 Verify that email input should not be blank
    When user enter registered firstname
    And user enter  registered lastname
    And user enter registered SSN id
    And user enter valid phone number
    And user click on Send and Appointment Request Button
    Then Verify your email is required message is pop up on the page
    Then close the application


