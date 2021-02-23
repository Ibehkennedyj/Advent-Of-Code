package step;

import aoc.Day;
import aoc.Input;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.List;

import static aoc.Constants.SOLUTION_PATH;
import static java.nio.file.Files.readAllLines;
import static java.nio.file.Path.of;
import static java.util.Optional.ofNullable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class DayFeatureSteps {

    int day;
    String input;
    Day implementation;
    List<String> solutions;

    @Given("I set the active day as {int}")
    public void iProvideANumber(int day) {
        this.day = day;
    }

    @Then("load the input")
    public void checkThatTheInputForTheNumberExists() throws IOException {
        input = Input.of(day);
    }

    @And("load the solutions")
    public void checkThatTheSolutionHasBeenProvided() throws IOException {
        solutions = readAllLines(of(SOLUTION_PATH + day));
    }

    @And("load the solution implementation")
    public void checkThatTheSolutionProviderHasBeenImplemented() throws ReflectiveOperationException {
        implementation = (Day) Class.forName("solution.Day" + day).getConstructor().newInstance();
    }

    @And("check that the solutions provided is correct")
    public void checkThatTheSolutionProvidedIsCorrect() {
        ofNullable(implementation.getSolution1(input)).ifPresent(solution -> assertEquals(solution, solutions.get(0)));
        ofNullable(implementation.getSolution2(input)).ifPresent(solution -> assertEquals(solution, solutions.get(1)));
    }
}
