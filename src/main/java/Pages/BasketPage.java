package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{
	@FindBy(xpath = "//h1[text()='Your basket']")
	WebElement pageTitle;

	public String getPageTitle() {
		return pageTitle.getText();
	}
}
