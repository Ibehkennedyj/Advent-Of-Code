package aoc;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public abstract class Solution implements Day {

    private final int day;

    @Setter
    @Getter
    private List<String> inputs;

    public Solution(int day) {
        this.day = day;
        loadInputs();
    }

    private void loadInputs() {
        inputs = Input.of(day);
    }
}
