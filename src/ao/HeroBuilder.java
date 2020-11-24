package ao;

public class HeroBuilder {

    public static int skillPoints = 100;
    
    public Hero buildHeroForTesting() {
        skillPoints=0;
        return new Hero("HERCULES", Sex.MALE, 95, 1, 1, 1, 1, 1);
    }
    
}
