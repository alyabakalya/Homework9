package cucumberStepDefinitions;

import org.junit.Assert;
import Pages.HomePage;
import Pages.SearchResultsPage;
import io.cucumber.java.en.*;

public class SearchStepDefinitions {
	private HomePage homePage = new HomePage();
	private SearchResultsPage searchResultsPage = new SearchResultsPage();

	String searchTerm = "lord of the rings";
	String expectedTitle = "Search results for".concat(" ").concat(searchTerm);

	@Given("A user opens Book Depository web site")
	public void openHomePage() {
		homePage.openHomePage();
	}

	@When("A user enters a search term into the search input field")
	public void enterSearchTerm() {
		homePage.enterSearchTerm(searchTerm);
	}

	@And("A user clicks on Search button")
	public void clickOnSearchButton() {
		homePage.clickOnSearchButton();
	}

	@Then("Search Results page with correct title is displayed")
	public void searchPageResultsTitleIsDisplayed() {
		Assert.assertEquals("Page title is incorrect", expectedTitle, searchResultsPage.getPageTitle());
	}
}