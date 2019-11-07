package testngcucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class PendingStepDefs {
    @Given("Pending step from {string} in {string} feature file")
    public void pendingStepFromScenarioInScenariosFeatureFile(int arg0) {
        throw new PendingException();
    }
}
