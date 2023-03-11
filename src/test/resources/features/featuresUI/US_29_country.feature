@US_29_Country
Feature: Country Creation And Deletion
  Background: Create Country
    Given Admin should navigate to "https://www.medunna.com/" pageYA
    When click on user icon optionYA
    And click on sign in optionYA
    And Enter Admin "AdminTeam03" into username inputYA
    And Enter Admin "Team03+" into password inputYA
    And Click on Sign In submit buttonYA
    And Click on Items&Titles dropdown iconYA
    And Click on Country optionYA

    Scenario: TC_01 Verify Admin can create a country
      When Click on Create a new Country buttonYA
      And Enter a Country name into Name fieldYA
      And Click on Save submit buttonYA
      Then Verify A new Country is created message displayed on the pageYA
      #And Verify created country is on country pageYA
      Then close the applicationYA

  Scenario: TC_02 Verify Admin can delete a country
    When Click on Delete button of the last created countryYA
    And Click on confirm delete buttonYA
    Then Verify country is deleted message displayed on the pageYA
    Then close the applicationYA

