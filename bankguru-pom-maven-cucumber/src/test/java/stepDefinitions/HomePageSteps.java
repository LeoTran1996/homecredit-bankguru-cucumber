package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import pageUIs.HomePageUIs;

public class HomePageSteps extends AbstractPage {
	WebDriver driver;

	public HomePageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
	}

	@Then("^Homepage is displayed$")
	public void homepageIsDisplayed() {
		isElementDisplayed(driver, HomePageUIs.WELCOME_MESSAGE);
	}

	@Given("^Open New Customer page$")
	public void openNewCustomerPage() {
		waitforElementClickable(driver, HomePageUIs.NEW_CUSTOMER_LINK);
		clickToElement(driver, HomePageUIs.NEW_CUSTOMER_LINK);

	}

}
