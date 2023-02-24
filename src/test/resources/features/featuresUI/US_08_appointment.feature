@US08
Feature:Patient appointment

  Scenario:TC_01 An invalid appointment date
    Given user is on "https://medunna.com" page
    When Click on user icon on menu
    And Click on Sign In option
    And Enter registered username
    And Enter registered  password
    And Click on Sign In submit button
    And click My pages(Patient) icon
    And click  Make an Appointment
    And enter a phone number
    And Enter invalid date
    And Click Send an Appointment Request Button
    And Verify the user should not be see the past date message
    And Click Sign in Icon
    Then click sign out

  Scenario:TC_02 A proper format valid appointment date
    Given user is on "https://medunna.com" page
    When Click on user icon on menu
    And Click on Sign In option
    And Enter registered username
    And Enter registered  password
    And Click on Sign In submit button
    And click My pages(Patient) icon
    And click  Make an Appointment
    And enter a phone number
    And choose a valid date in proper format
    And Click Send an Appointment Request Button
    Then Verify the user should  be see the appointment  message
    Then close the application






