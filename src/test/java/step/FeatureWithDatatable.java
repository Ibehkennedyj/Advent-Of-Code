package step;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import solution._2015.Day1;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeatureWithDatatable {

    List<String> inputs;

    @And("provide inputs")
    public void provideInput(DataTable table) {
        inputs = table.asList();
    }

    @Then("check that the solution is {string}")
    public void checkThatTheSolutionIs(String answer) {
        inputs.stream()
            .map(s -> {
                var day1 = new Day1();
                day1.setInputs(List.of(s));
                return day1;
            })
            .map(Day1::getSolution1)
            .forEach(solution -> assertEquals(answer, solution));
    }
}
