package step;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import solution._2015.Day1;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeatureWithDatatable {

    List<Day1> days;

    @DataTableType
    public Day1 day1Converter(Map<String, String> map){
        var day1 = new Day1();
        day1.setInputs(List.of(map.get("input")));
        return day1;
    }

    @And("^provide inputs$")
    public void provideInput(DataTable table) {
        days = table.asList(Day1.class);
    }

    @Then("check that the solution is {string}")
    public void checkThatTheSolutionIs(String answer) {
        days.stream()
            .map(Day1::getSolution1)
            .forEach(solution -> assertEquals(answer, solution));
    }
}
