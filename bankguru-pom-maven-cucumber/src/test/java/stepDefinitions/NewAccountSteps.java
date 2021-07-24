package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageUIs.NewAccountPageUIs;

public class NewAccountSteps extends AbstractPage {

	WebDriver driver;
	static String accountID;

	public NewAccountSteps() {
		this.driver = Hooks.openAndQuitBrowser();
	}

	@When("^Input to CustomerID textbox$")
	public void inputToCustomerIDTextbox() {
		waitforElementVisible(driver, NewAccountPageUIs.CUSTOMER_ID);
		sendkeyToElement(driver, NewAccountPageUIs.CUSTOMER_ID, NewCustomerSteps.customerID);

	}

	@When("^Select Current type in Account Type$")
	public void selectCurrentTypeInAccountType() {
		waitforElementVisible(driver, NewAccountPageUIs.ACOUNT_TYPE_DROPDOWN);
		selectItemInDropdown(driver, NewAccountPageUIs.ACOUNT_TYPE_DROPDOWN, "Current");
	}

	@When("^Input to Initial deposit textbox with \"([^\"]*)\"$")
	public void inputToInitialDepositTextboxWith(String initialDeposit) {
		waitforElementVisible(driver, NewAccountPageUIs.INITIAL_DEPOSIT);
		sendkeyToElement(driver, NewAccountPageUIs.INITIAL_DEPOSIT, initialDeposit);
	}

	@When("^Click to Submit button at New Accout page$")
	public void clickToSubmitButtonAtNewAccoutPage() {
		waitforElementClickable(driver, NewAccountPageUIs.SUBMIT_BUTTON);
		clickToElement(driver, NewAccountPageUIs.SUBMIT_BUTTON);

	}

	@Then("^Verify Account successmessage is dispalyed$")
	public void verifyAccountSuccessmessageIsDispalyed() {
		isElementDisplayed(driver, NewAccountPageUIs.SUCCESS_MESSAGE);

	}

	@When("^Get Account ID$")
	public void getAccountID() {
		waitforElementVisible(driver, NewAccountPageUIs.ACCOUNT_ID);
		accountID = getElementText(driver, NewAccountPageUIs.ACCOUNT_ID);

	}

	@Given("^Open Deposit page$")
	public void openDepositPage() {
		waitforElementClickable(driver, NewAccountPageUIs.DEPOSIT_LINK);
		clickToElement(driver, NewAccountPageUIs.DEPOSIT_LINK);

	}
}
