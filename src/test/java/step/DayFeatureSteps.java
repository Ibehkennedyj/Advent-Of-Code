package step;

import aoc.Day;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;

import static aoc.Constants.INPUT_PATH;
import static aoc.Constants.SOLUTION_PATH;
import static java.lang.ClassLoader.getSystemResource;
import static java.nio.file.Files.readAllLines;
import static java.nio.file.Path.of;
import static java.util.Optional.ofNullable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class DayFeatureSteps {

    int day;
    Day implementation;
    List<String> solutions;

    @When("I provide a number {int}")
    public void iProvideANumber(int day) {
        this.day = day;
    }

    @Then("check that the input for the number exists")
    public void checkThatTheInputForTheNumberExists() {
        assertNotNull(getSystemResource(INPUT_PATH + day));
    }

    @And("check that the solution has been provided")
    public void checkThatTheSolutionHasBeenProvided() throws IOException {
        solutions = readAllLines(of(SOLUTION_PATH + day));
    }

    @And("check that the solution provider has been implemented")
    public void checkThatTheSolutionProviderHasBeenImplemented() throws ReflectiveOperationException {
        implementation = (Day) Class.forName("Day" + day).getConstructor().newInstance();
    }

    @And("check that the solutions provided is correct")
    public void checkThatTheSolutionProvidedIsCorrect() {
        ofNullable(implementation.getSolution1()).ifPresent(solution -> assertEquals(solution, solutions.get(0)));
        ofNullable(implementation.getSolution2()).ifPresent(solution -> assertEquals(solution, solutions.get(1)));
    }
}
