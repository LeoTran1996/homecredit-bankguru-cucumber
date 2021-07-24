package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageUIs.DepositPageUIs;

public class DepositPageSteps extends AbstractPage {
	WebDriver driver;

	public DepositPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
	}

	@When("^Input to Account No textbox$")
	public void inputToAccountNoTextbox() {
		waitforElementVisible(driver, DepositPageUIs.ACCOUNT_NO_TEXTBOX);
		sendkeyToElement(driver, DepositPageUIs.ACCOUNT_NO_TEXTBOX, NewAccountSteps.accountID);

	}

	@When("^Input to Amount textbox with \"([^\"]*)\"$")
	public void inputToAmountTextboxWith(String amount) {
		waitforElementVisible(driver, DepositPageUIs.AMOUNT_TEXTBOX);
		sendkeyToElement(driver, DepositPageUIs.AMOUNT_TEXTBOX, amount);

	}

	@When("^Input to Description textbox \"([^\"]*)\"$")
	public void inputToDescriptionTextbox(String description) {
		waitforElementVisible(driver, DepositPageUIs.DESCRIPTION);
		sendkeyToElement(driver, DepositPageUIs.DESCRIPTION, description);

	}

	@When("^Click to Submit button a Deposit page$")
	public void clickToSubmitButton() {
		waitforElementClickable(driver, DepositPageUIs.SUBMIT_BUTTON);
		clickToElement(driver, DepositPageUIs.SUBMIT_BUTTON);
	}

	@Then("^Verify Transaction successmessage is displayed$")
	public void verifyTransactionSuccessmessageIsDisplayed() {
		isElementDisplayed(driver, DepositPageUIs.SUCCESS_MESSAGE);
	}
}
