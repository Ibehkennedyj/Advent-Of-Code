package step;

import aoc.Day;
import aoc.Reader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import props.PropertiesManager;

import java.io.IOException;
import java.util.List;

import static java.util.Optional.ofNullable;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DayFeatureSteps {

    int day;
    int year;
    String input;
    Day implementation;
    List<String> solutions;

    @Given("I set the active day as {int}")
    public void iSetActiveDay(int day) {
        this.day = day;
    }

    @Given("I set the active year as {int}")
    public void iSetActiveYear(int year) {
        this.year = year;
    }

    @Then("load the input")
    public void checkThatTheInputForTheNumberExists() throws IOException {
        input = Reader.inputOf(day);
    }

    @And("load the solutions")
    public void checkThatTheSolutionHasBeenProvided() throws IOException {
        solutions = Reader.solutionOf(day);
    }

    @And("load the solution implementation")
    public void checkThatTheSolutionProviderHasBeenImplemented() throws ReflectiveOperationException {
        final String className = String.format("solution%s.Day%s", year == 0 ? "" : "._" + year, day);
        implementation = (Day) Class.forName(className).getConstructor().newInstance();
    }

    @And("check that the solutions provided is correct")
    public void checkThatTheSolutionProvidedIsCorrect() {
        ofNullable(implementation.getSolution1(input)).ifPresent(solution -> assertEquals(solution, solutions.get(0)));
        ofNullable(implementation.getSolution2(input)).ifPresent(solution -> assertEquals(solution, solutions.get(1)));
    }

    @And("^confirm that ([^\"]*) will return ([^\"]*)$")
    public void confirmThatInputWillReturnOutput(String input, String answer) {
        assertEquals(answer, implementation.getSolution1(input));
    }

    @Then("process properties")
    public void processProperties() {
        PropertiesManager.processArgs(new String[]{});
    }
}
