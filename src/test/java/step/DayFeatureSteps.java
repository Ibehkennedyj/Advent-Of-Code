package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DayFeatureSteps {

    int day;

    @When("I provide a number {int}")
    public void iProvideANumber(int day) {
        this.day = day;
    }

    @Then("check that the input for the number exists")
    public void checkThatTheInputForTheNumberExists() {
    }

    @And("check that the solution provider has been implemented")
    public void checkThatTheSolutionProviderHasBeenImplemented() {
    }

    @And("check that the solution has been provided")
    public void checkThatTheSolutionHasBeenProvided() {
    }

    @And("check that the solution provided is correct")
    public void checkThatTheSolutionProvidedIsCorrect() {
    }
}
