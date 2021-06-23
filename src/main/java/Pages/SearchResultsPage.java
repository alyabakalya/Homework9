package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

	@FindBy(xpath = "//a[@data-isbn='9780345538376']")
	WebElement addToBasketButtonForAProduct;

	@FindBy(xpath = "//div[@class='main-content search-page']/h1")
	WebElement pageTitle;

	public String getPageTitle(){
		return pageTitle.getText();
	}

	public void clickOnAddToBasketButton(){
		addToBasketButtonForAProduct.click();

	}
}