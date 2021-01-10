import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Grains {
    private final int BOARD_SIZE = 64;

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > BOARD_SIZE) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return BigInteger.TWO.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        return BigInteger.TWO.pow(BOARD_SIZE).subtract(BigInteger.ONE);
    }
}
