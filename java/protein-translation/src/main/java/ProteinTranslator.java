import java.util.*;
import java.util.stream.Collectors;

class ProteinTranslator {

    private final Map<String, List<String>> proteins = new HashMap<String, List<String>>() {{
        put("Methionine", Collections.singletonList("AUG"));
        put("Phenylalanine", Arrays.asList("UUU", "UUC"));
        put("Leucine", Arrays.asList("UUA", "UUG"));
        put("Serine", Arrays.asList("UCU", "UCC", "UCA", "UCG"));
        put("Tyrosine", Arrays.asList("UAU", "UAC"));
        put("Cysteine", Arrays.asList("UGU", "UGC"));
        put("Tryptophan", Collections.singletonList("UGG"));
        put("STOP", Arrays.asList("UAA", "UAG", "UGA"));
    }};


    List<String> translate(String rnaSequence) {
        return Arrays.stream(rnaSequence.split("(?<=\\G...)"))
                .map(this::findProtein)
                .filter(e -> !e.isEmpty())
                .takeWhile(e -> !e.equals("STOP"))
                .collect(Collectors.toList());
    }

    private String findProtein(String rna) {
        return proteins.entrySet().stream()
                .filter(e -> (e.getValue().contains(rna)))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");
    }
}
