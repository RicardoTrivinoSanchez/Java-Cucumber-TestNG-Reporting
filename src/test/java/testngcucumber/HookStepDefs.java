package testngcucumber;

import cucumber.api.java.Before;

import java.util.Properties;

public class HookStepDefs {

    @Before
    public void startUp() {
        Properties props = System.getProperties();
        props.setProperty("cucumber.reporting.config.file", "./src/test/resources/cucumber-reporting.properties");
    }
}
