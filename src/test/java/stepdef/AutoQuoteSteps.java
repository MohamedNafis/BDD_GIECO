package stepdef;

import geico.bdd.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoQuoteSteps extends BaseClass {

	@Given("Click Car Lob button")
	public void click_car_lob_button() {
		landingPage.clickCarLob();
	}

	@Given("Click Start New Quote button1")
	public void click_start_new_quote_button1() {
		landingPage.clickStartNewQuote();
	}

	@When("Insert Zip Code1 {string}")
	public void insert_zip_code1(String zipCode) {
		landingPage.insertZipCodeField(zipCode);
	}

	@When("Click Continue button")
	public void click_continue_button() {
		landingPage.clickContinueBtn();
	}

	@Then("Validate About You Page Title {string}")
	public void validate_about_you_page_title(String expectedTitle) {
		aboutYouPage.ValidateAboutYouPageTitle(expectedTitle);
	}

	@When("Insert Date Of Birth {string}")
	public void insert_date_of_birth(String dateOfBirth) {
		aboutYouPage.insertDateOfBirthField(dateOfBirth);
	}

	@When("Click Next button1")
	public void click_next_button1() {
		aboutYouPage.clickNextBtn1();
	}

	@When("Ckick Next button2")
	public void ckick_next_button2() {
		aboutYouPage.clickNextBtn2();
	}

	@When("Insert First Name {string}")
	public void insert_first_name(String firstName) {
		aboutYouPage.insertFirstNameField(firstName);
	}

	@When("Insert Last Name {string}")
	public void insert_last_name(String lastName) {
		aboutYouPage.insertLastNameField(lastName);
	}

	@When("Click Next button01")
	public void click_next_button01() {
		aboutYouPage.clickNextBtn1();
	}

	@When("Click Next button02")
	public void click_next_button02() {
		aboutYouPage.clickNextBtn2();
	}

	@When("Insert Address {string}")
	public void insert_address(String address) {
		aboutYouPage.insertAddressField(address);
	}

	@When("Insert Apt Number {string}")
	public void insert_apt_number(String aptNumber) {
		aboutYouPage.insertAptField(aptNumber);
	}

	@When("Click Next button3")
	public void click_next_button3() {
		aboutYouPage.clickNextBtn3();
	}

	@Then("Validate Vehicle Details Page Title {string}")
	public void validate_vehicle_details_page_title(String expectedTitle) {
		vehicleDetailsPage.validateVehicleDetailsPageTitle(expectedTitle);
	}

	@When("Click Alert Close button")
	public void click_alert_close_button() {
		vehicleDetailsPage.clickAlertCloseBtn();
	}

	@When("Click Vehicle Year Select {string}")
	public void click_vehicle_year_select(String year) {
		vehicleDetailsPage.clickVehicleYearSelect(year);
	}

	@When("Click Vehicle Make Select {string}")
	public void click_vehicle_make_select(String make) {
		vehicleDetailsPage.clickVehicleMakeSelect(make);
	}

	@When("Click Vehicle Model Select {string}")
	public void click_vehicle_model_select(String model) {
		vehicleDetailsPage.clickVehicleModelSelect(model);
	}

}
