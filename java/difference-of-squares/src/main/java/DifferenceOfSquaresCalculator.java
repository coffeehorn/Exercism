class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return squareOfSum(0, input);
    }

    int computeSumOfSquaresTo(int input) {
        return sumOfSquares(0, input);
    }

    int computeDifferenceOfSquares(int input) {
        return squareOfSum(0, input) - sumOfSquares(0, input);
    }

    private int squareOfSum(int sum, int place) {
        if(place == 0) return (int)Math.pow(sum, 2);
        return squareOfSum(sum + place, place - 1);
    }

    private int sumOfSquares(int sum, int place) {
        if(place == 0) return sum;
        return sumOfSquares(sum + (int)Math.pow(place, 2), place - 1);
    }
}
