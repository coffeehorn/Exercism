import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map<Character, String> convert = new HashMap<Character, String>();
        convert.put('C', "G");
        convert.put('G', "C");
        convert.put('T', "A");
        convert.put('A', "U");
        return dnaStrand.chars()
                .mapToObj(c -> (char) c)
                .map(convert::get)
                .collect(Collectors.joining());
    }

}
