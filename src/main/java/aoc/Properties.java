package aoc;

import static java.lang.System.getenv;
import static java.util.Optional.ofNullable;

public class Properties {

    public static final String RESOURCE_PATH = ofNullable(getenv("resources")).orElse("/res");
    public static final String INPUT_PATH = RESOURCE_PATH + "/input";
    public static final String SOLUTION_PATH = RESOURCE_PATH + "/solution";
    public static final String EXPLANATION_PATH = RESOURCE_PATH + "/explanation";
}
