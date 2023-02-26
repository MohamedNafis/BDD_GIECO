package stepdef;

import geico.bdd.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeQuoteSteps extends BaseClass {

	@Given("Click Home Lob button")
	public void click_home_lob_button() {
		getAHomeQuote.clickHomeLob();
	}

	@When("Insert Zip Code2 {string}")
	public void insert_zip_code2(String zipCode) {
		getAHomeQuote.insertZipCode2(zipCode);
	}

	@When("Click Start New Quote button2")
	public void Click_Start_New_Quote_button2() {
		getAHomeQuote.clickStartNewQuote();
	}

	@Then("Validate Home Quote Page Title {string}")
	public void validate_home_quote_page_title(String expectedTitle) {
		getAHomeQuote.validateGetAHomeQuotePageTitle(expectedTitle);
	}

	@When("Insert Location {string}")
	public void insert_location(String location) {
		getAHomeQuote.insertLocation(location);
	}

	@When("Insert Unit Number {string}")
	public void insert_unit_number(String aptNo) {
		getAHomeQuote.insertUnitNumber(aptNo);
	}

	@When("Click Next button")
	public void click_next_button() {
		getAHomeQuote.clickNextBtn();
	}
	
}
