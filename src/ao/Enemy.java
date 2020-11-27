package ao;

public class Enemy {

        //statistics given by player
        private String name = "unnamed_hero";
        private Sex sex = Sex.OTHER;

        // phisical stats
        private int strength;
        private int stamina;
        private int dexterity;

        // mind stats
        private int intelligence;
        private int wisdom;
        private int charisma;

        // base stats
        private float baseDamage;
        private float baseBlock;

        // derived stats
        private float movementSpeed;
        private float mana;
        private float health;

        private int coins;
        private Buff buffs = null;

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

        public void setCoins(int coins) {
                this.coins = coins;
        }

        public Enemy(String name, Sex sex, int strength, int stamina, int dexterity, int intelligence, int wisdom, int charisma) {
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





}
