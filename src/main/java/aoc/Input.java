package aoc;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static aoc.Constants.INPUT_PATH;
import static java.nio.file.Files.readAllLines;

public class Input {

    public static List<String> of(int day) {
        try {
            return readAllLines(Path.of(INPUT_PATH + day));
        } catch (IOException e) {
            return null;
        }
    }
}
