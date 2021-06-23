package cucumberStepDefinitions;

import org.junit.Assert;
import Pages.*;
import io.cucumber.java.en.*;

public class CreateNewAccountStepDefinitions {
	HomePage homePage = new HomePage();
	JoinPage joinPage  = new JoinPage();
	AccountPage accountPage = new AccountPage();
	String expectedPageTitle = "My Account";

	@Given("A user clicks on Sign In-Join button at Home Page")
	public void clickOnSignInJoinButton() {
		homePage.openHomePage();
		homePage.goToJoinPage();
	}

	@When("A user fills {string}, {string}, and {string} at Join form")
	public void aUserFillsAndAtJoinForm(String name, String email, String password) {
		joinPage.enterUserInfo(name, email, password);
	}

	@And("A user clicks on Create Your Account button")
	public void clickOnCreateYourAccountButton() {
		joinPage.clickOnCreateYourAccountButton();
	}

	@Then("A logged in user can go to My Account page")
	public void goToMyAccountPage() {
		homePage.goToMyAccountPage();
		Assert.assertEquals("Page title is incorrect", expectedPageTitle, accountPage.getPageTitle());
	}
}
