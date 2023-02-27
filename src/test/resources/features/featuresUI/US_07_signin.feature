@US07
Feature: User info segment (User Settings) should be editable on Homepage



  Scenario:TC_01 Signin Medunna
    Given user is on "https://medunna.com" page
    When click on user icon on menu
    And click on Sign In option
    And enter registered username
    And enter registered  password
    And click on Sign In submit button


  Scenario:TC_02 There should be an option to update firstname
    Given user is on "https://medunna.com" page
    When Click On User  Registered User Name icon
    And Click Setting
    And Edit the first name
    And Click save button
    Then Verify  Setting saved is displayed




  Scenario:TC_03 There should be an option to update lastname
    When Click On User  Registered User Name icon
    And Click Setting
    And Edit the last name
    And Click save button
    Then Verify  Setting saved is displayed



  Scenario:TC_04 There should be an option to update email
    When Click On User  Registered User Name icon
    And Click Setting
    And Edit the email
    And Click save button
    Then Verify  Setting saved is displayed
    And Close Application

