class Scrabble {

    private final String word;

    Scrabble(String word) {
        this.word = word;
    }

    private static int getValueOfChar(char aChar) {
        if ("QZ".indexOf(aChar) != -1)
            return 10;
        else if ("JX".indexOf(aChar) != -1)
            return 8;
        else if ("K".indexOf(aChar) != -1)
            return 5;
        else if ("FHVWY".indexOf(aChar) != -1)
            return 4;
        else if ("BCMP".indexOf(aChar) != -1)
            return 3;
        else if ("DG".indexOf(aChar) != -1)
            return 2;
        return 1;
    }

    int getScore() {
        return word.toUpperCase().chars().map(x -> getValueOfChar((char) x)).sum();
    }

}
