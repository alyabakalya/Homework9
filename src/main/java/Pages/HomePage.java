package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumberDriver.DriverManager;

public class HomePage extends BasePage{
	private static final String HOME_PAGE_URL = "https://www.bookdepository.com/";

	@FindBy(xpath = "//input[@name='searchTerm']")
	WebElement searchInput;

   @FindBy(xpath = "//button[@aria-label='Search']")
	WebElement searchButton;

   @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-user']")
	WebElement signInJoinButton;

   @FindBy(xpath = "//div[@class = 'user-nav']//a[text() = 'My Account']")
	WebElement myAccountButton;

   public void openHomePage() {
   	DriverManager.getDriver().get(HOME_PAGE_URL);
	}

	public void enterSearchTerm(String searchTerm) {
		searchInput.sendKeys(searchTerm);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public void goToJoinPage() {
   	signInJoinButton.click();
	}

	public void goToMyAccountPage() {
   	myAccountButton.click();
	}
}
