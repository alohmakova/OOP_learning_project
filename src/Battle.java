import java.util.Scanner;

//Step 6: in a separate Battle class create a method that takes two Character objects
// and simulates a turn-based battle between them until one’s health reaches zero
public class Battle {

  public void battle(Hero hero, Monster monster) {
    //the player has the opportunity to choose a name for the characters
    System.out.println("What is the name of your Hero?");
    Scanner sc = new Scanner(System.in);
    String nameHero = sc.nextLine();
    hero.setName(nameHero);
    System.out.println("What is the name of your Monster?");
    String nameMonster = sc.nextLine();
    monster.setName(nameMonster);
    //the player can start and end the game, there's an opportunity to play a few times
    boolean play = true;
    while(play) {
      System.out.println("Would you like to play? \n\t[1]yes \n\t[2]no" );
      Scanner scan = new Scanner(System.in);
      int choise = scan.nextInt();
      switch (choise){
        //this is where the game begins
        case 1:
          //multiple rounds can be played in one game
          System.out.println("How many rounds would you like to play?");
          int rounds = scan.nextInt();
          for (int i = 0; i<rounds; i++){
            System.out.println("Round: " + (i+1));
            //characters are introduced to the player
            System.out.println("The battle between " + hero.getName() + " and " + monster.getName() + " starts! \n-----------------------");
            //If you choose ability 1, defence 1 (or ability 3, defence 3), there is no winner, as both players get minus life points at the same time
            //If you choose ability 3, defence 2 or 1t, hero is winner
            hero.setHealth(300.0);//life points are updated every round
            monster.setHealth(300.0);
            hero.specialAbility = " ";//a special ability can only be used for 1 round, you must buy it again in the next round
            //the monster's characteristics return to their original values each round, otherwise it is likely that the monster will always win
            monster.setRage(0);
            monster.setFerocity(2);
            //each character's statistics are displayed before the battle starts
            hero.displayStats();
            monster.displayStats();
            //the hero has the option to choose a defence and a special ability
            hero.chooseSpecialAbility();
            hero.chooseDefense();
            //this is where the battle begins
            while (hero.getHealth() > 0 && monster.getHealth() > 0) {//turn-based battle until one’s health reaches zero
              //I use these variables to calculate how many health points have been lost.
              double monstersHealthBefore = monster.getHealth();
              double heroesHealthBefore = hero.getHealth();
              //hero's turn
              System.out.println(hero.getName() + " attacks " + monster.getName());
              monster.takeDamage(hero.attack());
              //Step 6: Print out each turn’s result
              System.out.println(monster.getName() + " loses " + (monstersHealthBefore - monster.getHealth()) + " health points");
              //monster's turn
              System.out.println(monster.getName() + " attacks " + hero.getName());
              hero.takeDamage(monster.attack());
              //Step 6: Print out each turn’s result
              System.out.println(hero.getName() + " loses " + (heroesHealthBefore - hero.getHealth()) + " health points");
            }
            //Step 6: declare the winner at the end
            if (hero.getHealth() > 0) {
              System.out.println("----------------------- \nThe winner is: " + hero.getName() + "! \n-----------------------");
              hero.setLevel(hero.getLevel() + 1);
              hero.setExperience(hero.getExperience() + (int) hero.getHealth());
              //If both characters reach 0 or go into minus at the same time, there is no winner in this round
            } else if (hero.getHealth() <= 0 && monster.getHealth() <= 0) {
              System.out.println("----------------------- \nWe do not have a winner! \n-----------------------");

            } else {
              System.out.println("----------------------- \nThe winner is: " + monster.getName() + "! \n-----------------------");
              monster.setLevel(monster.getLevel() + 1);
              monster.setExperience(monster.getExperience() + (int) monster.getHealth());
            }
            //each character's statistics are displayed after the battle
            hero.displayStats();
            monster.displayStats();
          }
          break;
          //if the user has cancelled the game
        case 2:
          System.out.println("See you next time!" );
          play = false;
          break;
          //if the user has selected an item that is not in the menu
        default:
          System.out.println("Invalid chooice");
      }
    }
  }
}

