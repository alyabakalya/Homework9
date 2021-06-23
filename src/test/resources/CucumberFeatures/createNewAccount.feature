Feature: As a user I want to be able to create an account at the web site

  @Test
  Scenario Outline: After clicking on Join button, a user is able to fill in the form for account creation
    Given A user clicks on Sign In-Join button at Home Page
    When A user fills "<name>", "<email>", and "<password>" at Join form
    And A user clicks on Create Your Account button
    Then A logged in user can go to My Account page

    Examples:
      | name   | email            | password  |
      | Name15 |email992@email.com|PassWoRd8# |
      | Name16 |email982@email.com|PASSWORD987|
