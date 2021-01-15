import java.util.ArrayList;
import java.util.List;

class RaindropConverter {

    private int input;
    private List<Integer> factors = new ArrayList<>();

    String convert(int number) {
        this.input = number;
        return findDrops(number);
    }

    private String findDrops(int number) {
        findFactors(number);
        String drops = "";
        if(factors.contains(3)) {
            drops += "Pling";
        }
        if(factors.contains(5)) {
            drops += "Plang";
        }
        if(factors.contains(7)) {
            drops += "Plong";
        }
        if(drops.isEmpty()) {
            drops += number;
        }
        return drops;
    }

    private List<Integer> findFactors(int position) {
        if (position == 0) return factors;
        if (input % position == 0) factors.add(position);
        return findFactors(position - 1);
    }

}
