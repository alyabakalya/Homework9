Feature: As a user I want to search products from the home page

  @Test
  Scenario: After searching for a product, search results page should be displayed
    Given A user opens Book Depository web site
    When A user enters a search term into the search input field
    And A user clicks on Search button
    Then Search Results page with correct title is displayed
