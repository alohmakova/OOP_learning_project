import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //Step 1: create a Character object and initialize it
    Character character1 = new Character("Knight", 100.0, 50);
    Character character2 = new Character("King", 100.0, 60);

    //Step 1: call displayStats() method to show the output
    character1.displayStats();
    character2.displayStats();
    character1.chooseDefense();

    //Step 2: create a scenario where one character attacks another
    System.out.println(character1.getName() + " took damage as a result of the "+ character2.getName() + "'s attack " +
                        " and now "+ character1.getName() +"'s health is equal to " +  character1.takeDamage(character2.attack()) + " points " +
                        "\n--------------------------");
    //Step 2: print out the stats to show the results
    character1.displayStats();
    character2.displayStats();

  }
}