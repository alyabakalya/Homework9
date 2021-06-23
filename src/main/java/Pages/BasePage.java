package Pages;

import org.openqa.selenium.support.PageFactory;

import cucumberDriver.DriverManager;

public abstract class BasePage {
	public BasePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
}
