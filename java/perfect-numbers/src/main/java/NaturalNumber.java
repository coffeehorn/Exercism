import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NaturalNumber {
    private int number;

    public NaturalNumber(int number) {
        if (number <= 0) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number = number;
    }

    public Classification getClassification() {
        int sumFactors = IntStream.rangeClosed(1, number/2).parallel().filter(i -> number % i == 0).sum();
        if (sumFactors == number) return Classification.PERFECT;
        else if (sumFactors > number) return Classification.ABUNDANT;
        return Classification.DEFICIENT;
    }


}
