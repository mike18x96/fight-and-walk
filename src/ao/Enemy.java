package ao;

public class Enemy extends Hero {

    public Enemy(String name, Sex sex, int strength, int stamina, int dexterity, int intelligence, int wisdom, int charisma) {
        super(name, sex, strength, stamina, dexterity, intelligence, wisdom, charisma);
    setCoins(50);
    }
}
