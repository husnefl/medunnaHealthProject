@medunna_register

  Feature:SSN_Validation

    Background: user_goes_to_medunna_page
      Given user goes to medunna homePage1


    @medunna_register_data
    Scenario Outline: TC01_Register
      When user clicks user icon1
      And user clicks Register option1
      And user enters the SSN number "<SSN_number>"
      And user enters the first name "<first_name>"
      And user enters the last name "<last_name>"
      And user enters the user name "<user_name>"
      And user enters the user email "<user_email>"
      And user enters the user new pasword "<user_password>"
      And user enters the user confirm new password "<user_confirm_password>"
      And user clicks the register button1

      Examples: registiration_data
        | SSN_number  | first_name | last_name | user_name    | user_email       | user_password | user_confirm_password |
        | 481-15-3553 | Tom        | Cruise    | DoctorCruise | cruise@gmail.com | Tom20         | Tom20                 |

    @medunna_SSN_verify
    Scenario Outline: TC01_Validation_SSN_Number
      When admin clicks on user icon1
      And admin clicks Sign in option1
      And admin enters user's name "<adminusername>" in field
      And admin enterspasswords's   "<adminpassword>" in field
      And admin on Remember Me checkbox1
      And admin click on Sign In submit button1
      And admin clicks Administration section
      And admin clicks usermanagement option1
      And admin clicks ID sign1
      Then verify that fourth character  of SSN should be dash
      Then verify that seventh character  of SSN should be dash
      Then verify that SSN number length should be nine digits

      Examples: ssn_verify_data
        | adminusername | adminpassword |
        | AdminTeam01  | Team01+       |

    @medunna_Validation_SSN_Not_Blank
    Scenario Outline: TC02_Validation_SSN_Number

      And admin clicks Administration section
      And admin clicks usermanagement option1
      And admin clicks ID sign1
      Then verify that SSN number should not be blank

      Examples: ssn_verify_data
        | adminusername | adminpassword |
        | AdminTeam01  | Team01+       |

    @medunna_Validation_SSN_Not_Blank
    Scenario Outline: TC03_Validation_Firstname
      And admin clicks Administration section
      And admin clicks usermanagement option1
      And admin clicks ID sign1
      Then verify that firstname should not be blank
      Examples: ssn_verify_data
        | adminusername | adminpassword |
        | AdminTeam01  | Team01+       |

    @medunna_Validation_SSN_Not_Blank
    Scenario Outline: TC04_Validation_Lastname
      And admin clicks Administration section
      And admin clicks usermanagement option1
      And admin clicks ID sign1

      Then verify that lastname should not be blank

      Then close the application1

      Examples: ssn_verify_data
        | adminusername | adminpassword |
        | AdminTeam01  | Team01+       |
























