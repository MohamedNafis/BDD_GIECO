package geico.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import geico.bdd.common.CommonActions;


public class AboutYouPage {

	WebDriver driver;
	CommonActions actions;

	public AboutYouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}

	@FindBy(css = ".title.active")
	WebElement aboutYouPageTitle;
	@FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
	WebElement dateOfBirthInput;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement nextBtn1;
	@FindBy(xpath = "(//input[@size='21'])[1]")
	WebElement firstNameInput;
	@FindBy(xpath = "(//input[@size='21'])[2]")
	WebElement lastNmaeInput;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement nextBtn2;
	@FindBy(xpath = "//input[@name='autocomplete'][1]")
	WebElement addressInput;
	@FindBy(xpath = "//input[@data-formotivid='UnitNumber']")
	WebElement aptInput;
	@FindBy(css = "button.btn.btn--primary.btn--full-mobile.btn--pull-right")
	WebElement nextBtn3;

	public void ValidateAboutYouPageTitle(String expectedTitle) {
		actions.validate(aboutYouPageTitle, expectedTitle);
	}

	public void insertDateOfBirthField(String dateOfBirth) {
		actions.insert(dateOfBirthInput, dateOfBirth);
	}

	public void clickNextBtn1() {
		actions.click(nextBtn1);
	}

	public void insertFirstNameField(String firstName) {

		actions.insert(firstNameInput, firstName);

	}

	public void insertLastNameField(String lastName) {
		actions.insert(lastNmaeInput, lastName);
	}

	public void clickNextBtn2() {
		actions.click(nextBtn2);
	}

	public void insertAddressField(String address) {

		actions.insert(addressInput, address);
		actions.enter(aboutYouPageTitle);
	}

	public void insertAptField(String apt) {
		actions.insert(aptInput, apt);
	}

	public void clickNextBtn3() {
		actions.click(nextBtn3);
	}

}
