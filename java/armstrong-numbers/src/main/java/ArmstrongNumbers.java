class ArmstrongNumbers {
    private char[] stringNumber = null;
    private int power;

    private int calculateValue(int accumulator, int place) {
        if (place >= power) return accumulator;
        return calculateValue(accumulator + (int) (Math.pow(Double.parseDouble(String.valueOf(stringNumber[place])), (double)power)), place + 1);
    }

    boolean isArmstrongNumber(int numberToCheck) {
        stringNumber = String.valueOf(numberToCheck).toCharArray();
        power = stringNumber.length;
        return (calculateValue(0, 0) == numberToCheck);

    }

}
