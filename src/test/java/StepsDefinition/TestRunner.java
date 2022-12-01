package StepsDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepsDefinition"},
monochrome=true,
plugin={"pretty","html:target/htmlReports/Reports.html",
"json:target/JSONReports/report.json",
"junit:target/JunitReports/report.xml"},
tags="Smoketest"		
		)
public class TestRunner {

}
