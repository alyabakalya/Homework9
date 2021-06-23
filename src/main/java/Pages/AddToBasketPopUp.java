package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumberDriver.DriverManager;


public class AddToBasketPopUp extends BasePage{

	@FindBy(xpath = "//h3[@class='modal-title']")
	WebElement successMessage;

	@FindBy(xpath = "//a[@class='btn btn-primary pull-right continue-to-basket string-to-localize link-to-localize']")
	WebElement basketCheckoutButton;


	public String getSuccessMessage() {
		new WebDriverWait(DriverManager.getDriver(), 15)
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[@class='modal-title']")));
		return successMessage.getText();
	}

	public void goToBasketPage() {
		new WebDriverWait(DriverManager.getDriver(), 15)
				.until(ExpectedConditions.presenceOfElementLocated
						(By.xpath("//a[@class='btn btn-primary pull-right continue-to-basket string-to-localize link-to-localize']")));
		basketCheckoutButton.click();
	}
}
