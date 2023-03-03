@db_validation_id
 Feature: db_customer_testing


   Scenario: TC01_read_customer_login_info
    Given user connects to the application database

    And user gets the column "id" from table "physician"

     And user reads all the  column data

     Then verify that 1329 should be in physician list











