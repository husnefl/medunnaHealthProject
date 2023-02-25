@US04
Feature: An admin must activate the registered user otherwise user should not be able to login.

  Background:
    Given user goes to medunna url
    When clicks on account icon
    And clicks on user sign in option
    And send admin username into username input
    And send admin password into password input
    And clicks on Sign in button
    And verify administration option is displayed
    And click on administration option
    And click on user management link
    And goes to activation page url

  Scenario: TC_01 Admin user should activate the registered patient
     And click on deactivated registered "patient" edit button
     And click on Activated checkbox if not checked
     And select Role_Patient option from profiles dropdown
     And click on save button
     Then verify user updated message is displayed
    And click on adminTeam03
    And click on sign out
    And close the application

  Scenario: TC_02 Admin user should activate the registered staff
    And click on deactivated registered "staff" edit button
    And click on Activated checkbox if not checked
    And select Role_Staff option from profiles dropdown
    And click on save button
    Then verify user updated message is displayed
    And click on adminTeam03
    And click on sign out
    And close the application

  Scenario: TC_03 Admin user should activate the registered doctor
     And click on deactivated registered "doctor" edit button
     And click on Activated checkbox if not checked
     And select Role_Physician option from profiles dropdown
     And click on save button
     Then verify user updated message is displayed
    And click on adminTeam03
    And click on sign out
     And close the application

  Scenario: TC_04 Admin user should activate the registered user
    And click on deactivated registered "user" edit button
    And click on Activated checkbox if not checked
    And select Role_USER option from profiles dropdown
    And click on save button
    Then verify user updated message is displayed
    And click on adminTeam03
    And click on sign out
    And close the application