package geico.bdd.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import geico.bdd.objects.AboutYouPage;
import geico.bdd.objects.GetAHomeQuote;
import geico.bdd.objects.LandingPage;
import geico.bdd.objects.VehicleDetailsPage;
import geico.bdd.utils.Constant;
import geico.bdd.utils.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;

import static geico.bdd.utils.Constant.*;
import static geico.bdd.utils.IConstant.*;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseClass  {

	public static WebDriver driver;
	public static LandingPage landingPage;
	public static AboutYouPage aboutYouPage;
	public static VehicleDetailsPage vehicleDetailsPage;
	public static GetAHomeQuote getAHomeQuote;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;
	ReadProperties envVar = new ReadProperties();

	
	public void setUpDriver(String browserName) {
		// Enum example
		// String browserName = envVar.getProperty(getString(browser));
		// String browserName = envVar.getProperty(browser.name());

		// IConstant interface example
		// String browserName = envVar.getProperty(BROWSER);
		String url = envVar.getProperty(URL);
		long pageLoadWait = envVar.getNumProperty(PAGELOAD_WAIT);
		long implicitWait = envVar.getNumProperty(IMPLECIT_WAIT);
		// long explicitWait = envVar.getNumProperty(EXPLICIT_WAIT);
		initDriver(browserName);
		initClasses(driver);

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		// wait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait));
	}

	public void initClasses(WebDriver driver) {
		js = (JavascriptExecutor) driver;
		landingPage = new LandingPage(driver);
		aboutYouPage = new AboutYouPage(driver);
		vehicleDetailsPage = new VehicleDetailsPage(driver);
		getAHomeQuote = new GetAHomeQuote(driver);

	}

	public void initDriver(String driverName) {
		switch (driverName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		default:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
	}

	
	public void tearUp() {
		driver.quit();
	}

	

	@SuppressWarnings("unused")
	private String getString(Constant constant) {
		return constant.name();
	}

}
