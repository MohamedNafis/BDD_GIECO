package geico.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import geico.bdd.common.CommonActions;

public class VehicleDetailsPage {

	CommonActions actions;

	public VehicleDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new CommonActions(driver);
	}

	@FindBy(xpath = "//h4[text()='Vehicle Details']")
	WebElement vehicleDetailsPageTitle;

	@FindBy(xpath = "(//button[@aria-label='Close modal'])[1]")
	WebElement alertCloseBtn;// button[@class='btn-close icon-close' and @aria-label='Close
								// modal']//following-sibling::h2[@class='modal-headline']//following-sibling::div[@class='modal-content']

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/select[1]")
	WebElement vehicleYearSelect;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[2]/select[1]")
	WebElement vehicleMakeSelect;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]/div[2]/section[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/select[1]")
	WebElement vehicleModelSelect;

	public void validateVehicleDetailsPageTitle(String expectedTitle) {
		actions.validate(vehicleDetailsPageTitle, expectedTitle);
	}

	public void clickAlertCloseBtn() {
		// Alert alert = driver.switchTo().alert();
		// alert.dismiss();
		actions.click(alertCloseBtn);
	}

	public void clickVehicleYearSelect(String year) {
		actions.click(vehicleYearSelect);
		actions.dropDown(vehicleYearSelect, year);

	}

	public void clickVehicleMakeSelect(String make) {
		actions.click(vehicleMakeSelect);
		actions.dropDown(vehicleMakeSelect, make);

	}

	public void clickVehicleModelSelect(String model) {
		actions.click(vehicleModelSelect);
		actions.dropDown(vehicleModelSelect, model);

	}

}
