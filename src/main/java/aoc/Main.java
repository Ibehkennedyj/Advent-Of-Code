package aoc;

import static aoc.Input.of;

public class Main {

    public static void main(String[] args) throws Exception {
        var day = 1;
        var implementation = (Day) Class.forName("solution._2015.Day" + day).getConstructor().newInstance();
        System.out.printf("""
                Solution 1: %s
                Solution 1: %s
                """,
            implementation.getSolution1(of(day)),
            implementation.getSolution2(of(day))
        );
    }
}
