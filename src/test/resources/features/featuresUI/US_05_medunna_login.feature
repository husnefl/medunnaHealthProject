@Login_Feature
Feature: Login_Feature

  Background: Login
    Given user navigate to "https://www.medunna.com/" page
    When user click on user icon option
    And user click on sign in option

  @TC_01Login
  Scenario: TC_01_Login_With_Valid_Credentials
    When user enter valid username
    And user enter valid password
    And user click on remember me button
    And user click on sign in submit button
    Then verify user logged in with valid credentials and Welcome to medunna on the page
    Then close the application

  @TC_02Login
  Scenario: TC_02_Login_With_Invalid_Password
    When user enter valid username
    And user enter invalid password
    And user click on remember me button
    And user click on sign in submit button
    Then verify failed to sign in message displayed on the page
    Then close the application

  @TC_03Login
  Scenario: TC_03_Login_With_Invalid_Username
    When user enter invalid username
    And user enter valid password
    And user click on remember me button
    And user click on sign in submit button
    Then verify failed to sign in message displayed on the page
    Then close the application

  @TC_04Login
  Scenario: TC_04_Verify_RememberMeOption
    When user enter valid username
    And user enter valid password
    Then verify remember me option is on the page
    And user click on remember me button
    Then verify remember me button is selectable
    Then close the application

  @TC_05Login
  Scenario: TC_05_Verify_Credentials_seen_automatically_after_clicking_rememberMe
    When user enter valid username
    And user enter valid password
    And user click on remember me button
    And user click on sign in submit button
    And user click on user icon option
    And user click on sign out option
    Then verify thank you for choosing us message on the page
    And user click on Sign in Again button
    Then verify valid credentials displayed on username and password box automatically
    Then close the application

   @TC_06Login
    Scenario: TC_06_Verify_Registration_Link_option_on_the_login_page
      Then verify Register a new account link option is on the page
      And user click on the Register a new account link
      Then verify user is taken to Registration page
      Then close the application

   @TC_07Login
    Scenario: TC_07_Verify_There_Is_Cancel_Option_On_The_Page
      When user enter valid username
      And user enter valid password
      And user click on remember me button
      Then verify there is cancel button on the login page
      And user click on the cancel button
      Then verify user is taken to home page
      Then close the application
