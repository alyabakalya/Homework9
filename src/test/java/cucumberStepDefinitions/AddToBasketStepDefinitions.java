package cucumberStepDefinitions;

import org.junit.Assert;

import Pages.*;
import io.cucumber.java.en.*;

public class AddToBasketStepDefinitions {
	private HomePage homePage = new HomePage();
	private SearchResultsPage searchResultsPage = new SearchResultsPage();
	private AddToBasketPopUp addToBasketPopUp = new AddToBasketPopUp();
	private BasketPage basketPage = new BasketPage();

	String searchTerm = "lord of the rings";
	String expectedSuccessMessage = "Item added to your basket";
	String expectedPageTitle = "Your basket";

	@Given("A user is at Search Results page")
	public void goToSearchResultsPage() {
		homePage.openHomePage();
		homePage.enterSearchTerm(searchTerm);
		homePage.clickOnSearchButton();
	}

	@When("A user clicks on Add to Basket button")
	public void clickOnAddToBasketButton() {
		searchResultsPage.clickOnAddToBasketButton();
	}

	@Then("Pop-up with a success message is shown")
	public void popUpWithSuccessMessageIsDisplayed() {
		Assert.assertEquals("Success message is incorrect", expectedSuccessMessage, addToBasketPopUp.getSuccessMessage());
	}

	@And("A user is able to go to Basket page by clicking on Basket-Checkout button on the pop-up")
	public void goToBasketPageAndVerifyPageTitle() {
		addToBasketPopUp.goToBasketPage();
		Assert.assertEquals("Title for the Basket page is incorrect",expectedPageTitle, basketPage.getPageTitle());
	}
}
