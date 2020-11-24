package ao;

public class Board{

    static void printBoard(){
        Hero myHero=new Hero("HERCULES", Sex.MALE, 95, 1, 1, 1, 1, 1);

        System.out.println(">>>>>>>10|>>>>>>>20|>>>>>>>30|>>>>>>>40|>>>>>>>50|>>>>>>>60|>>>>>>>70|>>>>>>>80|>>>>>>>90|>>>>>>100|>>>>>>110|>>>>>>120|");
        System.out.printf("%65s ", "Fight & Walk");
        System.out.printf("\n%s %87s", "+ - - - - - - - - - - - - - - - +", "+ - - - - - - - - - - - - - - - +\n");
        System.out.printf("|%10sYour HERO%12s|%54s|%9sYour Opponent%9s|\n","","","","","");
        System.out.printf("%s %3s %8s %1s %8s","|","name",":",myHero.getName(),"|");    System.out.printf("%55s %3s %8s %1s %8s \n","|","name",":",myHero.getName(),"|");
        System.out.printf("%s %3s %9s %1s %12s","|","sex",":",myHero.getSex(),"|");    System.out.printf("%55s %3s %9s %1s %12s \n","|","sex",":",myHero.getSex(),"|");
        System.out.printf("%s %3s %6s %1s %12s","|","health",":",myHero.getHealth(),"|");    System.out.printf("%55s %3s %6s %1s %12s \n","|","health",":",myHero.getHealth(),"|");
        System.out.printf("%s %3s %8s %1s %13s","|","mana",":",myHero.getMana(),"|");    System.out.printf("%55s %3s %8s %1s %13s \n","|","mana",":", myHero.getMana(),"|");
        System.out.printf("%s %87s", "+ - - - - - STATS - - - - - - - +", "+ - - - - - STATS - - - - - - - +\n");
        System.out.printf("%s %3s %7s %1s %10s","|","strength",":",myHero.getStrength(),"|");    System.out.printf("%55s %3s %8s %1s %9s \n","|","strength",":",myHero.getStrength(),"|");
        System.out.printf("%s %3s %8s %1s %11s","|","stamina",":",myHero.getStamina(),"|");    System.out.printf("%55s %3s %9s %1s %10s \n","|","stamina",":",myHero.getStamina(),"|");
        System.out.printf("%s %3s %6s %1s %12s","|","dexterity",":",myHero.getDexterity(),"|");    System.out.printf("%55s %3s %7s %1s %11s \n","|","dexterity",":",myHero.getDexterity(),"|");
        System.out.printf("%s %3s %3s %1s %12s","|","intelligence",":",myHero.getIntelligence(),"|");    System.out.printf("%55s %3s %4s %1s %11s \n","|","intelligence",":", myHero.getIntelligence(),"|");
        System.out.printf("%s %3s %9s %1s %12s","|","wisdom",":",myHero.getWisdom(),"|");    System.out.printf("%55s %3s %10s %1s %11s \n","|","wisdom",":", myHero.getWisdom(),"|");
        System.out.printf("%s %3s %7s %1s %12s","|","charisma",":",myHero.getCharisma(),"|");    System.out.printf("%55s %3s %8s %1s %11s \n","|","charisma",":", myHero.getCharisma(),"|");
        System.out.printf("%s %87s", "+ - - - - - FIGHT STATS - - - - +", "+ - - - - - FIGHT STATS - - - - +\n");
        System.out.printf("%s %3s %7s %1s %7s","|","base damage",":",myHero.getStrength(),"|");    System.out.printf("%55s %3s %8s %1s %6s \n","|","base damage",":",myHero.getStrength(),"|");
        System.out.printf("%s %3s %8s %1s %8s","|","base block",":",myHero.getStamina(),"|");    System.out.printf("%55s %3s %9s %1s %7s \n","|","base block",":",myHero.getStamina(),"|");
        System.out.printf("%s %3s %13s %1s %9s","|","coins",":",myHero.getDexterity(),"|");    System.out.printf("%55s %3s %14s %1s %8s \n","|","coins",":",myHero.getDexterity(),"|");
        System.out.printf("%s %3s %4s %1s %9s","|","movement speed",":",myHero.getIntelligence(),"|");    System.out.printf("%55s %3s %5s %1s %8s \n","|","movement speed",":", myHero.getIntelligence(),"|");
        System.out.printf("%s %3s %13s %1s %9s","|","buffs",":",myHero.getWisdom(),"|");    System.out.printf("%55s %3s %14s %1s %8s \n","|","buffs",":", myHero.getWisdom(),"|");
        System.out.printf("%s %87s", "+ - - - - - - - - - - - - - - - +", "+ - - - - - - - - - - - - - - - +\n");
    }




}
