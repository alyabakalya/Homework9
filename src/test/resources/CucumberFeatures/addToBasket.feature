Feature: As a user I want to be able to add items to the basket

  @Test
  Scenario: After searching for a product, a user is able to add an item to the basket
    Given A user is at Search Results page
    When A user clicks on Add to Basket button
    Then Pop-up with a success message is shown
    And A user is able to go to Basket page by clicking on Basket-Checkout button on the pop-up