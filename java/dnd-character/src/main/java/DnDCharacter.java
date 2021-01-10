import java.util.Random;

class DnDCharacter {
    private final int ability = rollDice();
    private final int strength = rollDice();
    private final int dexterity = rollDice();
    private final int constitution = rollDice();
    private final int intelligence = rollDice();
    private final int wisdom = rollDice();
    private final int charisma = rollDice();

    private int rollDice() {
        Random rand = new Random();
        return rand.ints(4, 1, 7)
                .sorted()
                .skip(1)
                .sum();
    }

    int ability() {
        return ability;
    }

    int modifier(int input) {
        return Math.floorDiv((input - 10), 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }

}
