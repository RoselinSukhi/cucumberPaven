Feature: Login
  
  Scenario: Succesfull login with valid credientials
    Given User launch chrome browser
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user sends emailid as "admin@yourstore.com" and password as "admin"
    And click on login
    When user clicks on logout link
    And Close Browser

Scenario Outline: Login Data Driven
    Given User launch chrome browser
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user sends emailid as "<email>" and password as "<password>"
    And click on login
    When user clicks on logout link
    And Close Browser

    Examples:
    
    
    | email | password |
    | admin@yourstore.com | admin |
    | roselinsukhi@gmail.com | adin |
    
    