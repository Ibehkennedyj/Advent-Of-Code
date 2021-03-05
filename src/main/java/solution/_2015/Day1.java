package solution._2015;

import aoc.Day;

import static java.lang.String.valueOf;

public class Day1 implements Day {

    @Override
    public String getSolution1(String input) {
        var leftBracket = input.replaceAll("\\)", "").length();
        var rightBracket = input.replaceAll("\\(", "").length();
        return valueOf(leftBracket - rightBracket);
    }

    @Override
    public String getSolution2(String input) {
        int level = 0;
        for (int i = 0; i < input.length(); ) {
            level += (input.charAt(i++) == ')') ? -1 : 1;
            if (level == -1) {
                return valueOf(i);
            }
        }
        return null;
    }
}
