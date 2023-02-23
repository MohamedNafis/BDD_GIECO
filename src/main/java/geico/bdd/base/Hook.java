package geico.bdd.base;

import static geico.bdd.utils.IConstant.*;
import geico.bdd.utils.ReadProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	BaseClass baseClass;
	ReadProperties envVar = new ReadProperties();

	@Before
	public void initDriver() {
		baseClass = new BaseClass();
		baseClass.setUpDriver(envVar.getProperty(BROWSER));
	}

	@After
	public void exitingDriver() {
		baseClass.tearUp();
	}
}
