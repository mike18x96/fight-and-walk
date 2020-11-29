package ao;

import java.util.Formatter;

public class Board{

    static void printBoardWithOutEnemy() {

        System.out.println("\n>>>>>>>10|>>>>>>>20|>>>>>>>30|>>>>>>>40|>>>>>>>50|>>>>>>>60|>>>>>>>70|>>>>>>>80|>>>>>>>90|>>>>>>100|>>>>>>110|>>>>>>120|");
        System.out.printf(ConsoleUtils.c_purple("%25s\n"), "Fight & Walk");
        System.out.printf("%s", ConsoleUtils.c_blue("+ ------------------------------------ +\n"));
        System.out.printf(ConsoleUtils.c_blue("|%14sYour HERO%15s|\n"),"","");

        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","name",":",Hero.getInstance().getName(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","sex",":",Hero.getInstance().getSex(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","health",":",Hero.getInstance().getHealth(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","mana",":",Hero.getInstance().getMana(),"|");
        System.out.printf("%s", ConsoleUtils.c_blue("+ ---------------STATS---------------- +\n"),
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","strength",":",Hero.getInstance().getStrength(),"|"));
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","stamina",":",Hero.getInstance().getStamina(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","dexterity",":",Hero.getInstance().getDexterity(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","intelligence",":",Hero.getInstance().getIntelligence(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","wisdom",":",Hero.getInstance().getWisdom(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","charisma",":",Hero.getInstance().getCharisma(),"|");
        System.out.printf("%s", ConsoleUtils.c_blue("+ ------------FIGHT STATS------------- +\n"),
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","base damage",":",Hero.getInstance().getStrength(),"|"));
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","base block",":",Hero.getInstance().getStamina(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","coins",":",Hero.getInstance().getDexterity(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","movement speed",":",Hero.getInstance().getIntelligence(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s\n"),"|","buffs",":",Hero.getInstance().getWisdom(),"|");
        System.out.printf("%s", ConsoleUtils.c_blue("+ ------------------------------------ +\n"));
    }


    static void printBoardWithEnemy(){

        EnemyBuilder enemy = new EnemyBuilder();
        Enemy chooseEnemy=null;

        switch (1){
            case 1: chooseEnemy=enemy.enemyViper;
            break;
            case 2: chooseEnemy=enemy.enemyPalfrey;
            break;
            case 3: chooseEnemy=enemy.enemySpider;
            break;
            case 4: chooseEnemy=enemy.enemyMotherInLaw;
            break;
        }

        System.out.println("\n>>>>>>>10|>>>>>>>20|>>>>>>>30|>>>>>>>40|>>>>>>>50|>>>>>>>60|>>>>>>>70|>>>>>>>80|>>>>>>>90|>>>>>>100|>>>>>>110|>>>>>>120|");
        System.out.printf(ConsoleUtils.c_purple("%65s "), "Fight & Walk");
        System.out.printf("\n%s %88s", ConsoleUtils.c_blue("+ ------------------------------------ +"),                                   ConsoleUtils.c_red("+ ------------------------------------ +\n"));
        System.out.printf(ConsoleUtils.c_blue("|%14sYour HERO%15s|"),"","");                                                              System.out.printf(ConsoleUtils.c_red("%39s|%12sYour Opponent%13s|\n"),"","","");

        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","name",":",Hero.getInstance().getName(),"|");                   System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","name",":",chooseEnemy.getName(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","sex",":",Hero.getInstance().getSex(),"|");                     System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","sex",":",chooseEnemy.getSex(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","health",":",Hero.getInstance().getHealth(),"|");               System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","health",":",chooseEnemy.getHealth(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","mana",":",Hero.getInstance().getMana(),"|");                   System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","mana",":", chooseEnemy.getMana(),"|");
        System.out.printf("%s %88s", ConsoleUtils.c_blue("+ ---------------STATS---------------- +"),                                     ConsoleUtils.c_red("+ ---------------STATS---------------- +\n"));
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","strength",":",Hero.getInstance().getStrength(),"|");           System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","strength",":",chooseEnemy.getStrength(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","stamina",":",Hero.getInstance().getStamina(),"|");             System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","stamina",":",chooseEnemy.getStamina(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","dexterity",":",Hero.getInstance().getDexterity(),"|");         System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","dexterity",":",chooseEnemy.getDexterity(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","intelligence",":",Hero.getInstance().getIntelligence(),"|");   System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","intelligence",":", chooseEnemy.getIntelligence(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","wisdom",":",Hero.getInstance().getWisdom(),"|");               System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","wisdom",":", chooseEnemy.getWisdom(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","charisma",":",Hero.getInstance().getCharisma(),"|");           System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","charisma",":", chooseEnemy.getCharisma(),"|");
        System.out.printf("%s %88s", ConsoleUtils.c_blue("+ ------------FIGHT STATS------------- +"),                                     ConsoleUtils.c_red("+ ------------FIGHT STATS------------- +\n"));
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","base damage",":",Hero.getInstance().getStrength(),"|");        System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","base damage",":",chooseEnemy.getStrength(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","base block",":",Hero.getInstance().getStamina(),"|");          System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","base block",":",chooseEnemy.getStamina(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","coins",":",Hero.getInstance().getDexterity(),"|");             System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","coins",":",chooseEnemy.getDexterity(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","movement speed",":",Hero.getInstance().getIntelligence(),"|"); System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","movement speed",":", chooseEnemy.getIntelligence(),"|");
        System.out.printf(ConsoleUtils.c_blue("%s %-16s %s %-17s %s"),"|","buffs",":",Hero.getInstance().getWisdom(),"|");                System.out.printf(ConsoleUtils.c_red("%40s %-16s %s %-17s %s \n"),"|","buffs",":", chooseEnemy.getWisdom(),"|");
        System.out.printf("%s %88s", ConsoleUtils.c_blue("+ ------------------------------------ +"),                                     ConsoleUtils.c_red("+ ------------------------------------ +\n"));

       }

    }
