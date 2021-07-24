package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageUIs.LoginPageUI;

public class LoginPageSteps extends AbstractPage {
	WebDriver driver;
	static String url;

	public LoginPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
	}
	
	@Given("^Get Login page Url$")
	public String getLoginPageUrl() {
		url = getCurrentUrl(driver);
		return url;
	}
	
	@When("^Open Register page$")
	public void openRegisterPage() {
		waitforElementClickable(driver, LoginPageUI.HERE_LINK);
		clickToElement(driver, LoginPageUI.HERE_LINK);
	}

	@When("^Submit valid infor to login form$")
	public void submitValidInforToLoginForm() {
		waitforElementClickable(driver, LoginPageUI.USER_NAME_ID);
		sendkeyToElement(driver, LoginPageUI.USER_NAME_ID, RegisterPageSteps.username);
		
		waitforElementClickable(driver, LoginPageUI.PASSWORD);
		sendkeyToElement(driver, LoginPageUI.PASSWORD, RegisterPageSteps.password);
		
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}
}
