package props;

import static java.lang.System.getProperty;

public class Properties {

    public static final String RESOURCE_PATH = getProperty("resources");
    public static final String INPUT_PATH = RESOURCE_PATH + "/input";
    public static final String SOLUTION_PATH = RESOURCE_PATH + "/solution";
    public static final String EXPLANATION_PATH = RESOURCE_PATH + "/explanation";
}
