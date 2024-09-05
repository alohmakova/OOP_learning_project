import java.util.Scanner;

public class Character {
  //Step 1: create Attributes
  //I put "private" modifier because I use getters and setters
  private String name;
  private double  health;
  private int strength;

  //Step 2: new attributes
  private String defense;
  int damage;
  int level;
  double experience;

  //generate Getters and Setters to modify and view the attribute values
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHealth() {
    return health;
  }

  public void setHealth(double health) {
    this.health = health;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public String getDefense() {
    return defense;
  }

  public void setDefense(String defense) {
    this.defense = defense;
  }

  //Step 1: create a constructor to initialize the Attributes
    public Character(String name, double  health, int strength){
    this.setName(name);
    this.setHealth(health);
    this.setStrength(strength);
    this.setDefense(" ");
}
  //Step 1: method that prints character's stats
  public void displayStats(){
    System.out.println("My name is: " + name);
    System.out.println("I have " + health + " points of healts");
    System.out.println("My strength is: " + strength);
    System.out.println("My defense is: " + defense);
    System.out.println("---------------------------");
  }
  //Step 2: method gives possibility to choose the defense
  public void chooseDefense(){
    Scanner scan = new Scanner(System.in);
    System.out.println(getName() +", choose the armor to defend yourself: \n\t[1]helmet \n\t[2]breastplate \n\t[3]forearm protector \n\t[0]nothing");
    int choiseOfDefense = scan.nextInt();
    switch (choiseOfDefense){
      case 1:
        defense = "helmet";
        System.out.println(name + " can defend yourself with the " + defense + " now");
        break;
      case 2:
        defense = "breastplate";
        System.out.println(name + " can defend yourself with the " + defense + " now");
        break;
      case 3:
        defense = "forearm protector";
        System.out.println(name + " can defend yourself with the " + defense + " now");
        break;
      default:
        defense = " ";
        System.out.println(name + " do not have any defense");
    }
  }

  //Step 2: method that reduces the character's health by the damage amount, considering the defense attribute
  public double takeDamage(int damage){
    if (defense.equals(" ") || defense.isEmpty()) {//defense.isEmpty() there is ""
      health = getHealth() - damage;
    }else if (defense.equals("helmet")) {
      health = getHealth() - damage/1.5;//40
    }else if (defense.equals("breastplate")) {
      health = getHealth() - damage /2.0;//30
    }else if (defense.equals("forearm protector")) {
      health = getHealth() - damage /1.2;
    }
    return health;
  }
  //Step 2: method that returns the character’s strength as the damage value
  public int attack(){
    damage = getStrength();
    return damage;
  }


}
