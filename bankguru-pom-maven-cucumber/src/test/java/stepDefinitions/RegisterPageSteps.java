package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageUIs.RegisterPageUI;

public class RegisterPageSteps extends AbstractPage {

	WebDriver driver;
	static String username, password;

	public RegisterPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
	}

	@When("^Input to Email textbox with \"([^\"]*)\"$")
	public void inputToEmailTextbox(String email) {
		waitforElementVisible(driver, RegisterPageUI.EMAIL_TEXT);
		sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXT, email);
	}

	@When("^Click to Submit button at Register page$")
	public void clickToSubmitButtonAtRegisterPage() {
		waitforElementClickable(driver, RegisterPageUI.SUBMIT_BUTTON);
		clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
	}

	@Then("^Get UserID and Password infor$")
	public void getUserIDAndPasswordInfor() {
		waitforElementVisible(driver, RegisterPageUI.USERNAME_ID);
		username = getElementText(driver, RegisterPageUI.USERNAME_ID);
		waitforElementVisible(driver, RegisterPageUI.PASSWORD);
		password = getElementText(driver, RegisterPageUI.PASSWORD);

	}

	@When("^Back to Login page$")
	public void backToLoginPage() {
		driver.get(LoginPageSteps.url);
	}

}
