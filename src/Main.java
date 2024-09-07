import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //Step 1: create a Character object and initialize it
    Character knight = new Character("Knight",  50);
    Character king = new Character("King", 60);
    //Step 3: create instances of Hero and Monster
    Hero hero1 = new Hero("Tristan",70);
    Monster monster1 = new Monster("Dragon", 40, 2);

    //Step 1: call displayStats() method to show the output
    knight.displayStats();
    king.displayStats();
    //Step 3: call displayStats() method to show the output
    hero1.displayStats();
    monster1.displayStats();

    //Step 1: let the character choose a defense
    knight.chooseDefense();
    king.chooseDefense();
    hero1.chooseDefense();

    //Step 3: let the hero select a special ability
    hero1.chooseSpecialAbility();


    //Step 2: create a scenario where one character attacks another
    System.out.println("The battle between " + knight.getName() + " and "+ king.getName() + " starts!");
    double kingsHealthBefore = king.getHealth();
    double knightsHealthBefore = knight.getHealth();
    System.out.println(king.getName() + " attacks " + knight.getName());
    knight.takeDamage(king.attack());
    System.out.println(knight.getName() + " loses " + (knightsHealthBefore - knight.getHealth()) + " health points");
    System.out.println(knight.getName() + " attacks " + king.getName());
    king.takeDamage(knight.attack());
    System.out.println(king.getName() + " loses " + (kingsHealthBefore - king.getHealth()) + " health points");
    System.out.println("--------------------------");

    //Step 3: simulate an attack scenario between Character and Hero
    System.out.println("The battle between " + knight.getName() + " and "+ hero1.getName() + " starts!");
    double heroesHealthBefore = hero1.getHealth();
    double knightsHealthBeforeHero = knight.getHealth();
    System.out.println(hero1.getName() + " attacks " + knight.getName());
    knight.takeDamage(hero1.attack());
    System.out.println(knight.getName() + " loses " + (knightsHealthBeforeHero - knight.getHealth()) + " health points");
    System.out.println(knight.getName() + " attacks " + hero1.getName());
    hero1.takeDamage(knight.attack());
    System.out.println(hero1.getName() + " loses " + (heroesHealthBefore - hero1.getHealth()) + " health points");
    System.out.println("--------------------------");

    //Step 3: simulate an attack scenario between Character and Monster
    System.out.println("The battle between " + monster1.getName() + " and "+ king.getName() + " starts!");
    double monstersHealthBefore = monster1.getHealth();
    double kingsHealthBeforeMonster = king.getHealth();
    System.out.println(king.getName() + " attacks " + monster1.getName());
    monster1.takeDamage(king.attack());
    System.out.println(monster1.getName() + " loses " + (monstersHealthBefore - monster1.getHealth()) + " health points");
    System.out.println(monster1.getName() + " attacks " + king.getName());
    king.takeDamage(monster1.attack());
    System.out.println(king.getName() + " loses " + (kingsHealthBeforeMonster - king.getHealth()) + " health points");
    System.out.println("--------------------------");

    //Step 3: simulate an attack scenario between Monster and Hero
    System.out.println("The battle between " + hero1.getName() + " and "+ monster1.getName() + " starts!");
    double monstersHealthBeforeHero = monster1.getHealth();
    double heroesHealthBeforeMonster = hero1.getHealth();
    System.out.println(hero1.getName() + " attacks " + monster1.getName());
    monster1.takeDamage(hero1.attack());
    System.out.println(monster1.getName() + " loses " + (monstersHealthBeforeHero - monster1.getHealth()) + " health points");
    System.out.println(monster1.getName() + " attacks " + hero1.getName());
    hero1.takeDamage(monster1.attack());
    System.out.println(hero1.getName() + " loses " + (heroesHealthBeforeMonster - hero1.getHealth()) + " health points");

    //Step 3: displaying the results
    System.out.println("⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜ \nThe result of the buttle is: \n⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜⁜");
    knight.displayStats();
    king.displayStats();
    hero1.displayStats();
    monster1.displayStats();

  }
}