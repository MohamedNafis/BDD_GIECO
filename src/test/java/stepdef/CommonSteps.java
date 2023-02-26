package stepdef;

import geico.bdd.base.BaseClass;
import geico.bdd.reporting.Logs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonSteps extends BaseClass {
	
	@Given("this is quote test")
	public void this_is_quote_test() {
	   Logs.log("*** This is a background step ***");
	}
	
	

}
