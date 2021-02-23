package aoc;

import java.io.IOException;
import java.nio.file.Path;

import static aoc.Constants.INPUT_PATH;
import static java.nio.file.Files.readString;

public class Input {

    public static String of(int day) throws IOException {
        return readString(Path.of(INPUT_PATH + day));
    }
}
