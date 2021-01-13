import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hamming {
    private String left;
    private String right;

    public Hamming(String leftStrand, String rightStrand) {
        this.left = leftStrand;
        this.right = rightStrand;
        if (left.length() == 0 && right.length() == 0) return;
        else if (left.length() == 0) throw new IllegalArgumentException("left strand must not be empty.");
        else if (right.length() == 0) throw new IllegalArgumentException("right strand must not be empty.");
        else if (left.length() != right.length()) throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

    }

    public int getHammingDistance() {
        if (left.length() == 0 || right.length() == 0) return 0;
        return distance(0, left.length());
    }

    private int distance(int sum, int position) {
        if (position == 0) return sum;
        return distance(sum + (Objects.equals(left.charAt(position - 1), right.charAt(position - 1)) ? 0 : 1), position - 1);
    }
}
