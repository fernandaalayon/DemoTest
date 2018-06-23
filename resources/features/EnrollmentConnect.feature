Feature: Enrollment

  Scenario: First attemp to enroll new member
    Given the user access to "https://connectmiles.copaair.com/es/web/guest"
    When the user press the button "IniciarSesión/Afílliese"
    Then the user should be modal to login
