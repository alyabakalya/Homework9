package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumberDriver.DriverManager;

public class JoinPage extends BasePage{

	@FindBy(xpath = "//iframe[@class='register-iframe']")
	WebElement formFrame;

	@FindBy(xpath = "//input[@id = 'ap_customer_name']")
	WebElement nameInputField;

	@FindBy(xpath = "//form[@id='ap_register_form']//input[@id='ap_email']")
	WebElement emailInputField;

	@FindBy(xpath = "//form[@id='ap_register_form']//input[@id='ap_password']")
	WebElement passwordInputField;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement createYourAccountButton;

	public void enterUserInfo(String name, String email, String password) {
		DriverManager.getDriver().switchTo().frame(formFrame);
		nameInputField.sendKeys(name);
		emailInputField.sendKeys(email);
		passwordInputField.sendKeys(password);
	}

	public void clickOnCreateYourAccountButton() {
		createYourAccountButton.click();
	}
}
