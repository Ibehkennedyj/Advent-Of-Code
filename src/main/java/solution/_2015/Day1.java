package solution._2015;

import aoc.Solution;

import static java.lang.String.valueOf;

public class Day1 extends Solution {

    public Day1() {
        super(1);
    }

    @Override
    public String getSolution1() {
        var input = getInputs().get(0);
        var leftBracket = input.replaceAll("\\)", "").length();
        var rightBracket = input.replaceAll("\\(", "").length();
        return valueOf(leftBracket - rightBracket);
    }

    @Override
    public String getSolution2() {
        return null;
    }
}
