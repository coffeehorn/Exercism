public class Say {
    private static final String[] onesNames = {
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };
    private static final String[] tensNames = {
            "",
            "ten",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
    };

    String say(long number) {
        if (number > 999999999999L) throw new IllegalArgumentException();
        if (number < 0) throw new IllegalArgumentException();
        if (number == 0) return "zero";

        String words = "";
        if ((number / 1000000000) > 0) {
            words += say(number / 1000000000) + " billion ";
            number %= 1000000000;
        }

        if ((number / 1000000) > 0) {
            words += say(number / 1000000) + " million ";
            number %= 1000000;
        }

        if ((number / 1000) > 0) {
            words += say(number / 1000) + " thousand ";
            number %= 1000;
        }

        if ((number / 100) > 0) {
            words += say(number / 100) + " hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20)
                words += onesNames[(int) number];
            else {
                words += tensNames[(int) number / 10];
                if ((number % 10) > 0)
                    words += "-" + onesNames[(int) number % 10];
            }
        }

        return words.trim();
    }

    String say(int number) {
        return say((long) number);
    }
}
