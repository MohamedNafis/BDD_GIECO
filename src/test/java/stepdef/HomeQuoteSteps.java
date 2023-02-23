package stepdef;

import geico.bdd.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeQuoteSteps extends BaseClass {

	@Given("Click Home Lob button")
	public void click_home_lob_button() {
		getAHomeQuote.clickHomeLob(driver);
	}

	@When("Insert Zip Code")
	public void insert_zip_code() {
		getAHomeQuote.insertZipCode2("10467");
	}

	@When("Click Start New Quote button")
	public void click_start_new_quote_button() {
		getAHomeQuote.clickStartNewQuote(driver);
	}

	@Then("Validate Home Quote Page Title")
	public void validate_home_quote_page_title() {
		getAHomeQuote.validateGetAHomeQuotePageTitle("Let's Get Started!");
	}

	@When("Insert Location")
	public void insert_location() {
		getAHomeQuote.insertLocation("3106 Decatur Ave");
	}

	@When("Insert Unit Number")
	public void insert_unit_number() {
		getAHomeQuote.insertUnitNumber("34B");
	}

	@When("Click Next button")
	public void click_next_button() {
		getAHomeQuote.clickNextBtn();
	}

}
