import java.util.Arrays;
import java.util.stream.Collectors;

class Acronym {

    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        return Arrays.stream(phrase
                .replaceAll("-", " ")
                .replaceAll("[^a-zA-Z ]", "")
                .toUpperCase()
                .split("\\s+"))
                .map(x -> x.substring(0, 1))
                .collect(Collectors.joining());
    }

}
