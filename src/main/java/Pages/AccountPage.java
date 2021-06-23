package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountPage extends BasePage{
	@FindBy(xpath = "//div[@class = 'content account-landing']/h1")
	WebElement pageTitle;

	public String getPageTitle() {
		return pageTitle.getText();
	}
}
