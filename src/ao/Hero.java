package ao;

public class Hero {

    //statistics given by player
    protected String name;
    protected Sex sex = Sex.MALE;

    // phisical stats
    protected int strength;
    protected int stamina;
    protected int dexterity;

    // mind stats
    protected int intelligence;
    protected int wisdom;
    protected int charisma;

    // base stats
    protected float baseDamage;
    protected float baseBlock;

    // derived stats
    protected float movementSpeed;
    protected float mana;
    protected float health;

    protected int coins;
    protected Buff buffs = null;

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public float getBaseDamage() {
        return baseDamage;
    }

    public float getBaseBlock() {
        return baseBlock;
    }

    public float getMovementSpeed() {
        return movementSpeed;
    }

    public float getMana() {
        return mana;
    }

    public float getHealth() {
        return health;
    }

    public int getCoins() {
        return coins;
    }

    public Buff getBuffs() {
        return buffs;
    }

    /**
     * Singleton class because only one hero builder can exist
     */
    private static Hero single_instanceHero = null;

    private Hero(String name, Sex sex, int strength, int stamina, int dexterity, int intelligence, int wisdom, int charisma) {
        int maleBonus = sex == Sex.MALE ? 10 : 0;
        int femaleBonus = sex == Sex.FEMALE ? 10 : 0;
        int otherBonus = sex == Sex.OTHER ? 10 : 0;

        this.name = name;
        this.sex = sex;
        this.strength = strength + maleBonus;
        this.stamina = stamina + maleBonus;
        this.dexterity = dexterity + femaleBonus;
        this.intelligence = intelligence + femaleBonus;
        this.wisdom = wisdom + otherBonus;
        this.charisma = charisma + otherBonus;

        this.baseDamage = strength * 0.1f;
        this.baseBlock = dexterity * 0.1f;
        this.movementSpeed = stamina * 0.1f;

        this.health = strength * 0.5f + stamina * 0.2f + dexterity * 0.1f;
        this.mana = intelligence * 0.5f + wisdom + stamina * 0.1f;

    }

    public static Hero getInstance() {
        if (single_instanceHero == null) {
            single_instanceHero = new Hero("HERCULES", Sex.MALE, 95, 1, 1, 1, 1, 1);
        }
        return single_instanceHero;
    }



}
