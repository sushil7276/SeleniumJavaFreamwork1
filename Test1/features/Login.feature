Feature: Login

  Scenario: Successful login with Valid Credentials
    Given User Launch Chrome browser
    When User open URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When USer click on log out link
    Then Page Tilte should be "Your store. Login"
    And close browser
