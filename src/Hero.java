import java.util.Scanner;

//Step 3: create a Hero class and make it inherit from Character
public class Hero extends Character{

  //Step 3: add unique attributes to Hero, like mana or specialAbility
  int mana;//mana is the energy that is reduced by using a special ability
  String specialAbility;
  int specialAbilityDamage;//increases damage, but does not give defence

  //Step 3: create a constructor to initialize the attributes
  public Hero (String name, int strength) {
    super(name, strength);
    this.specialAbility = " ";
    this.mana = 1000;
    this.setDefense(" ");
    this.specialAbilityDamage = 0;
  }

  //Step 3: method that prints Heroe's stats
  public void displayStats(){
    System.out.println("Name of a hero: " + getName());
    System.out.println("Points of healts: " + getHealth());
    System.out.println("Strength: " + getStrength());
    System.out.println("Defense: " + getDefense());
    System.out.println("Special ability: " + specialAbility);
    System.out.println("Mana: " + mana);
    System.out.println("---------------------------");
  }

  //Step 3: method gives possibility to choose a special ability
  public void chooseSpecialAbility(){
    Scanner scan = new Scanner(System.in);
    System.out.println(getName() +", choose a special ability: \n\t[1]Invisibility \n\t[2]Meteor strike \n\t[3]Magic \n\t[0]Nothing");
    int choiseOfSpecialAbility = scan.nextInt();
    switch (choiseOfSpecialAbility){
      case 1:
        specialAbility = "Invisibility";
        mana-=200;
        specialAbilityDamage = 20;
        System.out.println(getName() + " has " + specialAbility +" as a special ability");
        System.out.println("---------------------------");
        break;
      case 2:
        specialAbility = "Meteor strike";
        mana-=150;
        specialAbilityDamage = 15;
        System.out.println(getName() + " has " + specialAbility +" as a special ability");
        System.out.println("---------------------------");
        break;
      case 3:
        specialAbility = "Magic";
        mana-=300;
        specialAbilityDamage = 30;
        System.out.println(getName() + " has " + specialAbility +" as a special ability");
        System.out.println("---------------------------");
        break;
      default:
        specialAbility = " ";
        System.out.println(getName() + " do not have special abilities");
        System.out.println("---------------------------");
    }
  }

  //Step 3: override the attack() method to include the special ability
  public int attack(){
    damage = getStrength() + specialAbilityDamage;
    return damage;
  }
}
