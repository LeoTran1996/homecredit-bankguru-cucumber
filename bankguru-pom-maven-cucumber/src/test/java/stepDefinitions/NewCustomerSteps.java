package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageUIs.NewCustomerPageUI;

public class NewCustomerSteps extends AbstractPage {
	WebDriver driver;
	static String customerID;

	public NewCustomerSteps() {
		this.driver = Hooks.openAndQuitBrowser();
	}

	@When("^Input to CustomerName textbox with \"([^\"]*)\"$")
	public void inputToCustomerNameTextboxWith(String CustomerName) {
		waitforElementVisible(driver, NewCustomerPageUI.CUSTOMER_NAME_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.CUSTOMER_NAME_TEXTBOX, CustomerName);
	}

	@When("^Click to Female radio button$")
	public void clickToFemaleRadioButton() {
		waitforElementClickable(driver, NewCustomerPageUI.FEMALE_RADIO_BUTTON);
		clickToElement(driver, NewCustomerPageUI.FEMALE_RADIO_BUTTON);
	}

	@When("^Input to Date of Birth textbox with \"([^\"]*)\"$")
	public void inputToDateOfBirthTextboxWith(String dob) {
		waitforElementVisible(driver, NewCustomerPageUI.DATE_OF_BIRTH_FIELD);
		sendkeyToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_FIELD, dob);
	}

	@When("^Input to Address textbox with	\"([^\"]*)\"$")
	public void inputToAddressTextboxWith(String add) {
		waitforElementVisible(driver, NewCustomerPageUI.ADDRESS_TEXTAREA);
		sendkeyToElement(driver, NewCustomerPageUI.ADDRESS_TEXTAREA, add);
	}

	@When("^Input to City textbox with\"([^\"]*)\"$")
	public void inputToCityTextboxWith(String city) {
		waitforElementVisible(driver, NewCustomerPageUI.CITY_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.CITY_TEXTBOX, city);
	}

	@When("^Input to State textbox with	\"([^\"]*)\"$")
	public void inputToStateTextboxWith(String state) {
		waitforElementVisible(driver, NewCustomerPageUI.STATE_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.STATE_TEXTBOX, state);
	}

	@When("^Input to PIN textbox with	\"([^\"]*)\"$")
	public void inputToPINTextboxWith(String pin) {
		waitforElementVisible(driver, NewCustomerPageUI.PIN_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.PIN_TEXTBOX, pin);
	}

	@When("^Input to Mobile Number textbox with	\"([^\"]*)\"$")
	public void inputToMobileNumberTextboxWith(String mobileNumber) {
		waitforElementVisible(driver, NewCustomerPageUI.MOBILE_NUMBER_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.MOBILE_NUMBER_TEXTBOX, mobileNumber);
	}

	@When("^Input to Emai textbox	with \"([^\"]*)\"$")
	public void inputToEmaiTextboxWith(String email) {
		waitforElementVisible(driver, NewCustomerPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.EMAIL_TEXTBOX, email);
	}

	@When("^Input to Password textbox	with \"([^\"]*)\"$")
	public void inputToPasswordTextboxWith(String password) {
		waitforElementVisible(driver, NewCustomerPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, NewCustomerPageUI.PASSWORD_TEXTBOX, password);
	}

	@When("^Click to Submit button at New Customer page$")
	public void clickToSubmitButtonAtCustomerPage() {
		waitforElementClickable(driver, NewCustomerPageUI.SUBMIT_BUTTON);
		clickToElement(driver, NewCustomerPageUI.SUBMIT_BUTTON);
	}

	@Then("^Verify Customer successmessage is displayed$")
	public void verifyCustomerSuccessmessageIsDisplayed() {
		isElementDisplayed(driver, NewCustomerPageUI.SUCCESS_MESSAGE);
	}

	@When("^get CustomerID$")
	public void getCustomerID() {
		waitforElementVisible(driver, NewCustomerPageUI.CUSTOMER_ID);
		customerID = getElementText(driver, NewCustomerPageUI.CUSTOMER_ID);
	}

	@Given("^Open New Account page$")
	public void openNewAccountPage() {
		waitforElementClickable(driver, NewCustomerPageUI.NEW_ACCOUNT_LINK);
		clickToElement(driver, NewCustomerPageUI.NEW_ACCOUNT_LINK);
	}
}
