package props;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.setProperty;
import static java.util.Objects.isNull;

public class PropertiesManager {

    private static final Map<String, String> defaultProperties = new HashMap<>() {{
        put("resources", "src/main/resources");
    }};

    public static void processArgs(String[] args) {
        var argMap = parseArgs(args);
        defaultProperties.forEach(
            (key, value) -> {
                var prop = argMap.getOrDefault(key, value);
                if (isNull(prop)) { throw new PropertyMissing(key); }
                setProperty(key, prop);
            }
        );
    }

    private static HashMap<String, String> parseArgs(String[] args) {
        var argMap = new HashMap<String, String>();
        for (int i = 0; i < args.length; ) {
            var key = args[i++];
            if (!key.startsWith("--")) { continue; }
            var value = args[i++];
            argMap.put(key.substring(2), value);
        }
        return argMap;
    }
}
