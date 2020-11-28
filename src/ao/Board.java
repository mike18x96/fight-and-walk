package ao;

public class Board{

    static void printBoardWithOutEnemy() {
        //Hero myHero=new Hero("HERCULES", Sex.MALE, 95, 1, 1, 1, 1, 1);

        //HeroBuilder heroBuilder=new HeroBuilder();
        Hero.getInstance();
        EnemyBuilder enemy = new EnemyBuilder();
        Enemy chooseEnemy = null;


        switch (1) {
            case 1:
                chooseEnemy = enemy.enemyViper;
                break;
            case 2:
                chooseEnemy = enemy.enemyPalfrey;
                break;
            case 3:
                chooseEnemy = enemy.enemySpider;
                break;
            case 4:
                chooseEnemy = enemy.enemyMotherInLaw;
                break;
        }


//        System.out.println(">>>>>>>10|>>>>>>>20|>>>>>>>30|>>>>>>>40|>>>>>>>50|>>>>>>>60|>>>>>>>70|>>>>>>>80|>>>>>>>90|>>>>>>100|>>>>>>110|>>>>>>120|");
//        System.out.printf("%65s ", "Fight & Walk");
//        System.out.printf("\n%s %87s", "+ - - - - - - - - - - - - - - - +", "+ - - - - - - - - - - - - - - - +\n");
//        System.out.printf("|%10sYour HERO%12s|%54s|%9sYour Opponent%9s|\n","","","","","");
//        System.out.printf("%s %-17s %s %-9s %s","|","name",":",heroBuilder.myHero.getName(),"|");                   System.out.printf("%55s %-17s %s %-9s %s \n","|","name",":",chooseEnemy.getName(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","sex",":",heroBuilder.myHero.getSex(),"|");                     System.out.printf("%55s %-17s %s %-9s %s \n","|","sex",":",chooseEnemy.getSex(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","health",":",heroBuilder.myHero.getHealth(),"|");               System.out.printf("%55s %-17s %s %-9s %s \n","|","health",":",chooseEnemy.getHealth(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","mana",":",heroBuilder.myHero.getMana(),"|");                   System.out.printf("%55s %-17s %s %-9s %s \n","|","mana",":", chooseEnemy.getMana(),"|");
//        System.out.printf("%s %87s", "+ - - - - - STATS - - - - - - - +", "+ - - - - - STATS - - - - - - - +\n");
//        System.out.printf("%s %-17s %s %-9s %s","|","strength",":",heroBuilder.myHero.getStrength(),"|");           System.out.printf("%55s %-17s %s %-9s %s \n","|","strength",":",chooseEnemy.getStrength(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","stamina",":",heroBuilder.myHero.getStamina(),"|");             System.out.printf("%55s %-17s %s %-9s %s \n","|","stamina",":",chooseEnemy.getStamina(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","dexterity",":",heroBuilder.myHero.getDexterity(),"|");         System.out.printf("%55s %-17s %s %-9s %s \n","|","dexterity",":",chooseEnemy.getDexterity(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","intelligence",":",heroBuilder.myHero.getIntelligence(),"|");   System.out.printf("%55s %-17s %s %-9s %s \n","|","intelligence",":", chooseEnemy.getIntelligence(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","wisdom",":",heroBuilder.myHero.getWisdom(),"|");               System.out.printf("%55s %-17s %s %-9s %s \n","|","wisdom",":", chooseEnemy.getWisdom(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","charisma",":",heroBuilder.myHero.getCharisma(),"|");           System.out.printf("%55s %-17s %s %-9s %s \n","|","charisma",":", chooseEnemy.getCharisma(),"|");
//        System.out.printf("%s %87s", "+ - - - - - FIGHT STATS - - - - +", "+ - - - - - FIGHT STATS - - - - +\n");
//        System.out.printf("%s %-17s %s %-9s %s","|","base damage",":",heroBuilder.myHero.getStrength(),"|");        System.out.printf("%55s %-17s %s %-9s %s \n","|","base damage",":",chooseEnemy.getStrength(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","base block",":",heroBuilder.myHero.getStamina(),"|");          System.out.printf("%55s %-17s %s %-9s %s \n","|","base block",":",chooseEnemy.getStamina(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","coins",":",heroBuilder.myHero.getDexterity(),"|");             System.out.printf("%55s %-17s %s %-9s %s \n","|","coins",":",chooseEnemy.getDexterity(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","movement speed",":",heroBuilder.myHero.getIntelligence(),"|"); System.out.printf("%55s %-17s %s %-9s %s \n","|","movement speed",":", chooseEnemy.getIntelligence(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","buffs",":",heroBuilder.myHero.getWisdom(),"|");                System.out.printf("%55s %-17s %s %-9s %s \n","|","buffs",":", chooseEnemy.getWisdom(),"|");
//        System.out.printf("%s %87s", "+ - - - - - - - - - - - - - - - +", "+ - - - - - - - - - - - - - - - +\n");
//    }


//    static void printBoardWithEnemy(){
//        //Hero myHero=new Hero("HERCULES", Sex.MALE, 95, 1, 1, 1, 1, 1);
//
//        HeroBuilder heroBuilder=new HeroBuilder();
//        EnemyBuilder enemy = new EnemyBuilder();
//        Enemy chooseEnemy=null;
//
//
//        switch (1){
//            case 1: chooseEnemy=enemy.enemyViper;
//            break;
//            case 2: chooseEnemy=enemy.enemyPalfrey;
//            break;
//            case 3: chooseEnemy=enemy.enemySpider;
//            break;
//            case 4: chooseEnemy=enemy.enemyMotherInLaw;
//            break;
//        }
//
//
//        System.out.println(">>>>>>>10|>>>>>>>20|>>>>>>>30|>>>>>>>40|>>>>>>>50|>>>>>>>60|>>>>>>>70|>>>>>>>80|>>>>>>>90|>>>>>>100|>>>>>>110|>>>>>>120|");
//        System.out.printf("%65s ", "Fight & Walk");
//        System.out.printf("\n%s %87s", "+ - - - - - - - - - - - - - - - +", "+ - - - - - - - - - - - - - - - +\n");
//        System.out.printf("|%10sYour HERO%12s|%54s|%9sYour Opponent%9s|\n","","","","","");
//        System.out.printf("%s %-17s %s %-9s %s","|","name",":",heroBuilder.myHero.getName(),"|");                   System.out.printf("%55s %-17s %s %-9s %s \n","|","name",":",chooseEnemy.getName(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","sex",":",heroBuilder.myHero.getSex(),"|");                     System.out.printf("%55s %-17s %s %-9s %s \n","|","sex",":",chooseEnemy.getSex(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","health",":",heroBuilder.myHero.getHealth(),"|");               System.out.printf("%55s %-17s %s %-9s %s \n","|","health",":",chooseEnemy.getHealth(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","mana",":",heroBuilder.myHero.getMana(),"|");                   System.out.printf("%55s %-17s %s %-9s %s \n","|","mana",":", chooseEnemy.getMana(),"|");
//        System.out.printf("%s %87s", "+ - - - - - STATS - - - - - - - +", "+ - - - - - STATS - - - - - - - +\n");
//        System.out.printf("%s %-17s %s %-9s %s","|","strength",":",heroBuilder.myHero.getStrength(),"|");           System.out.printf("%55s %-17s %s %-9s %s \n","|","strength",":",chooseEnemy.getStrength(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","stamina",":",heroBuilder.myHero.getStamina(),"|");             System.out.printf("%55s %-17s %s %-9s %s \n","|","stamina",":",chooseEnemy.getStamina(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","dexterity",":",heroBuilder.myHero.getDexterity(),"|");         System.out.printf("%55s %-17s %s %-9s %s \n","|","dexterity",":",chooseEnemy.getDexterity(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","intelligence",":",heroBuilder.myHero.getIntelligence(),"|");   System.out.printf("%55s %-17s %s %-9s %s \n","|","intelligence",":", chooseEnemy.getIntelligence(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","wisdom",":",heroBuilder.myHero.getWisdom(),"|");               System.out.printf("%55s %-17s %s %-9s %s \n","|","wisdom",":", chooseEnemy.getWisdom(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","charisma",":",heroBuilder.myHero.getCharisma(),"|");           System.out.printf("%55s %-17s %s %-9s %s \n","|","charisma",":", chooseEnemy.getCharisma(),"|");
//        System.out.printf("%s %87s", "+ - - - - - FIGHT STATS - - - - +", "+ - - - - - FIGHT STATS - - - - +\n");
//        System.out.printf("%s %-17s %s %-9s %s","|","base damage",":",heroBuilder.myHero.getStrength(),"|");        System.out.printf("%55s %-17s %s %-9s %s \n","|","base damage",":",chooseEnemy.getStrength(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","base block",":",heroBuilder.myHero.getStamina(),"|");          System.out.printf("%55s %-17s %s %-9s %s \n","|","base block",":",chooseEnemy.getStamina(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","coins",":",heroBuilder.myHero.getDexterity(),"|");             System.out.printf("%55s %-17s %s %-9s %s \n","|","coins",":",chooseEnemy.getDexterity(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","movement speed",":",heroBuilder.myHero.getIntelligence(),"|"); System.out.printf("%55s %-17s %s %-9s %s \n","|","movement speed",":", chooseEnemy.getIntelligence(),"|");
//        System.out.printf("%s %-17s %s %-9s %s","|","buffs",":",heroBuilder.myHero.getWisdom(),"|");                System.out.printf("%55s %-17s %s %-9s %s \n","|","buffs",":", chooseEnemy.getWisdom(),"|");
//        System.out.printf("%s %87s", "+ - - - - - - - - - - - - - - - +", "+ - - - - - - - - - - - - - - - +\n");
//    }

    }
}
