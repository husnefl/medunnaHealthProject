@US08
Feature:Patient appointment

  Scenario:TC_01 An invalid appointment date
    Given user is medunnaUrl url7
    When Click on user icon on menu08
    And Click on Sign In optionHA
    And Enter registered usernameHA
    And Enter registered  passwordHA
    And Click on Sign In submit buttonHA
    And click My pages(Patient) iconHA
    And click  Make an AppointmentHA
    And enter a phone numberHA
    And Enter invalid dateHA
    And Click Send an Appointment Request ButtonHA
    And Verify the user should not be see the past date messageHA
    And Click Sign in IconHA
    Then click sign outHA

  Scenario:TC_02 A proper format valid appointment date
    Given user is medunnaUrl url7
    When Click on user icon on menu08
    And Click on Sign In optionHA
    And Enter registered usernameHA
    And Enter registered  passwordHA
    And Click on Sign In submit buttonHA
    And click My pages(Patient) iconHA
    And click  Make an AppointmentHA
    And enter a phone numberHA
    And choose a valid date in proper formatHA
    And Click Send an Appointment Request ButtonHA
    Then Verify the user should  be see the appointment  messageHA
    Then Close Application07






