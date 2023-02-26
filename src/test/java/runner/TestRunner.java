package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@regression1", 
							features = {"src/test/java/features"}, 
							glue = {"geico.bdd.base","stepdef"}, 
							monochrome = false , 
							dryRun = false,
							plugin = { "pretty","html:target/report.html", "json:target/report_json.json" ,"junit:target/junit_report.xml"})
public class TestRunner {

}
