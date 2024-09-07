import java.util.Scanner;

//Step 3: create a Hero class and make it inherit from Character
public class Hero extends Character {

  //Step 3: add unique attributes to Hero, like mana or specialAbility
  int mana;//mana is the energy that is reduced by using a special ability
  String specialAbility;
  int specialAbilityDamage;//increases damage, but does not give defence

  //Step 3: create a constructor to initialize the attributes
  public Hero(String name, int strength) {
    super(name, strength);
    this.specialAbility = " ";
    /*mana becomes less with each new game and each round of the same game if the player buys special abilities.
    There is currently no way to refill mana. This will be implemented in Step 7*/
    this.mana = 500;
    this.specialAbilityDamage = 0;
  }

  //Step 3: method that prints Heroe's stats
  public void displayStats() {
    System.out.println("Name of a hero: " + getName());
    System.out.println("Points of healts: " + getHealth());
    System.out.println("Strength: " + getStrength());
    System.out.println("Defense: " + getDefense());
    System.out.println("Special ability: " + specialAbility);
    System.out.println("Mana: " + mana);
    System.out.println("Level: " + getLevel());
    System.out.println("Experience: " + getExperience());
    System.out.println("---------------------------");
  }

  //Step 3: method gives possibility to choose a special ability
  public void chooseSpecialAbility() {
    boolean choise = true;
    while (choise) {
      if (mana > 0) {
        Scanner scan = new Scanner(System.in);
        System.out.println(getName() + ", choose a special ability: \n\t[1]Invisibility \n\t[2]Meteor strike \n\t[3]Magic \n\t[0]Nothing");
        int choiseOfSpecialAbility = scan.nextInt();
        switch (choiseOfSpecialAbility) {
          case 1:
            if (mana >= 200) {
              specialAbility = "Invisibility";
              mana -= 200;
              specialAbilityDamage = 20;
              System.out.println(getName() + " has " + specialAbility + " as a special ability");
              System.out.println("---------------------------");
              choise = false;
            } else {
              System.out.println("Invisibility costs 200. You do not hava enough mana to buy Invisibility \n---------------------------");
              //continue;
            }
            break;
          case 2:
            if (mana >= 150) {
              specialAbility = "Meteor strike";
              mana -= 150;
              specialAbilityDamage = 15;
              System.out.println(getName() + " has " + specialAbility + " as a special ability");
              System.out.println("---------------------------");
              choise = false;
            } else {
              System.out.println("Meteor strike costs 150. You do not have enough mana to buy Meteor strike \n---------------------------");
              //continue;
            }
            break;
          case 3:
            if (mana >= 300) {
              specialAbility = "Magic";
              mana -= 300;
              specialAbilityDamage = 30;
              System.out.println(getName() + " has " + specialAbility + " as a special ability");
              System.out.println("---------------------------");
              choise = false;
            } else {
              System.out.println("Magic costs 300. You do not have enough mana to buy Magic \n---------------------------");
              //continue;
            }
            break;
          default:
            specialAbility = " ";
            System.out.println(getName() + " do not have special abilities");
            System.out.println("---------------------------");
            choise = false;
        }

      } else {
        System.out.println(getName() + " do not have mana to choose a special ability");
        choise = false;
      }
    }
  }
    //Step 3: override the attack() method to include the special ability
    public int attack () {
      setDamage(getStrength() + specialAbilityDamage);
      return getDamage();
    }

}