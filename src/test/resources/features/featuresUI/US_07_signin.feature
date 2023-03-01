@US07
Feature: User info segment (User Settings) should be editable on Homepage



  Scenario:TC_01 Signin Medunna
    Given user is "https://www.medunna.com/" url7
    When click on user icon on menu07
    And click on Sign In option07
    And enter registered username07
    And enter registered  password07
    And click on Sign In submit button07


  Scenario:TC_02 There should be an option to update firstname
    Given user is "https://www.medunna.com/" url7
    When Click On User  Registered User Name icon07
    And Click Setting07
    And Edit the first name07
    And Click save button07
    Then Verify  Setting saved is displayed07



  Scenario:TC_03 There should be an option to update lastname
    When Click On User  Registered User Name icon07
    And Click Setting07
    And Edit the last name07
    And Click save button07
    Then Verify  Setting saved is displayed07



  Scenario:TC_04 There should be an option to update email

    When Click On User  Registered User Name icon07
    And Click Setting07
    And Edit the email07
    And Click save button07
    Then Verify  Setting saved is displayed07
    Then Close Application07



