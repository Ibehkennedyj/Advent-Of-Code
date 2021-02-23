package solution._2015;

import aoc.Day;

import static java.lang.String.valueOf;

public class Day1 implements Day {

    public Day1() {
        super();
    }

    @Override
    public String getSolution1(String input) {
        var leftBracket = input.replaceAll("\\)", "").length();
        var rightBracket = input.replaceAll("\\(", "").length();
        return valueOf(leftBracket - rightBracket);
    }

    @Override
    public String getSolution2(String input) {
        return null;
    }
}
