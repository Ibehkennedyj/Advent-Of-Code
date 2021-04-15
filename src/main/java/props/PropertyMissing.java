package props;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PropertyMissing extends RuntimeException {

    private String key;

    @Override
    public String getMessage() {
        return String.format("""
            Property (%s) is missing. 
            Please provide in the correct format in command arguments.
            Example: `--%s {value}` 
            """, key, key);
    }
}
