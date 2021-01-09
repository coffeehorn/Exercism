class Darts {

    private final double result;

    Darts(double x, double y) {
        this.result = Math.hypot(x, y);
    }

    int score() {
        if (result > 10) return 0;
        else if (result > 5) return 1;
        else if (result > 1) return 5;
        else return 10;
    }

}
