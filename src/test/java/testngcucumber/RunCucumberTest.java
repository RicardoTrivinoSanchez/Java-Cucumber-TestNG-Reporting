package testngcucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(plugin= {
        "timeline:target/reports/timeline",
        "html:target/reports/html",
        "pretty",
        "json:target/report.json",
        "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"
})
public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}