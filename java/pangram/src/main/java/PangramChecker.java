import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class PangramChecker {

    public static final int LETTERS_IN_ALAPHABET = 26;

    public boolean isPangram(String input) {
        return input.toLowerCase().chars()
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == LETTERS_IN_ALAPHABET;
    }
}
