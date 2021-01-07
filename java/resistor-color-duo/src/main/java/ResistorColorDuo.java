import java.util.Arrays;

class ResistorColorDuo {
    int value(String[] colors) {
        String[] colorList = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        return (Arrays.asList(colorList).indexOf(colors[0]) * 10) + Arrays.asList(colorList).indexOf(colors[1]);
    }
}
