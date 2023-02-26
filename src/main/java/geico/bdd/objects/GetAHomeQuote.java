package geico.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import geico.bdd.common.CommonActions;


public class GetAHomeQuote {

	CommonActions actions;

	public GetAHomeQuote(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}

	@FindBy(xpath = "(//div[@class='product-checkbox'])[2]")
	WebElement homeLOB;

	@FindBy(xpath = "//input[@class='zip-code-input' and @id='zip']")
	WebElement zipCodeInput2;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[5]/button[1]")
	WebElement startMyQuoteBtn;

	@FindBy(xpath = "//h1[@class='breakdownQuestionHeader']")
	WebElement getAHomeQuotePageTitle;

	@FindBy(css = ".address-search-field.pac-target-input.address_1")
	WebElement enterLocation;
	@FindBy(className = "f_Apt")
	WebElement unitNumberInput;

	@FindBy(css = ".btn.btn--primary.btn--full-mobile.wizardNavigation.wizardForwardsNavigation")
	WebElement nextBtn;

	public void clickHomeLob() {
		actions.click(homeLOB);
	}

	public void insertZipCode2(String zip) {

		actions.insert(zipCodeInput2, zip);

	}

	public void clickStartNewQuote() {

		actions.click(startMyQuoteBtn);
	}

	public void validateGetAHomeQuotePageTitle(String expectedTitle) {
		actions.validate(getAHomeQuotePageTitle, expectedTitle);
	}

	public void insertLocation(String location) {
		actions.insert(enterLocation, location);
		
	}

	public void insertUnitNumber(String unitNumber) {
		actions.insert(unitNumberInput, unitNumber);
	}

	public void clickNextBtn() {
		actions.click(nextBtn);
	}

}
