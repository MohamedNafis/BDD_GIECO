package geico.bdd.objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import geico.bdd.common.CommonActions;
import java.time.Duration;

public class LandingPage {

	CommonActions actions;

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

		actions = new CommonActions(driver);
	}

	@FindBy(xpath = "//h1[@id='section1heading' and text()='The Insurance Savings You Expect']")
	WebElement landingPageTitle;

	@FindBy(xpath = "//div[@class='product-checkbox']//following-sibling::span[@class='icon-vehicle']")
	WebElement carLOB;

	@FindBy(css = ".modal-trigger.btn.btn--primary.btn--full-mobile")
	WebElement startMyQuoteBtn;

	@FindBy(xpath = "//h2[contains(text(),\"You're getting an auto quote today!\")]")
	WebElement autoQuotePageTitle;

	@FindBy(css = "#bundle-modal-zip")
	WebElement zipCodeInput;

	@FindBy(xpath = "(//span[@class='icon-homeowner-ins'])[2]")
	WebElement homeOwnerLobBtn;

	@FindBy(xpath = "//input[@class='btn btn--primary btn--full-mobile']")
	WebElement continueBtn;

	public void validateLandingPageTitle(String expectedTitle) {
		actions.validate(landingPageTitle, expectedTitle);
	}

	public void clickCarLob() {
		actions.click(carLOB);
	}

	public void clickStartNewQuote() {

		actions.click(startMyQuoteBtn);
	}

	public void ValidateAutoQuotePage(String expectedTitle) {
		actions.validate(autoQuotePageTitle, expectedTitle);
	}

	public void insertZipCodeField(String zip) {

		actions.insert(zipCodeInput, zip);

	}

	public void clickHomeOwnerLobBtn() {
		actions.click(homeOwnerLobBtn);
	}

	public void clickContinueBtn() {
		actions.click(continueBtn);
	}

}
