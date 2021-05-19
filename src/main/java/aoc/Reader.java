package aoc;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Files.readAllLines;
import static java.nio.file.Files.readString;

public class Reader {

    private static final String resourcePath = System.getProperty("resources");

    public static String inputOf(int day) throws IOException {
        return readString(Path.of(resourcePath + "/input/day" + day));
    }

    public static List<String> solutionOf(int day) throws IOException {
        return readAllLines(Path.of(resourcePath + "/solution/day" + day));
    }

    public static String explanationOf(int day) throws IOException {
        return readString(Path.of(resourcePath + "/explanation/day" + day));
    }
}
