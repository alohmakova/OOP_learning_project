import java.util.Scanner;

public class Character {
  //Step 1: create Attributes
  //I put "private" modifier because I use getters and setters
  private String name;
  private double  health;
  private int strength;

  //Step 2: new attributes
  private String defense;
  private int damage;
  private int level;
  private int experience;

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
  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;//the remaining health after a battle is converted into experience
  }

  //Step 1: create a constructor to initialize the Attributes
    public Character(String name, int strength){
    this.setName(name);
    this.setHealth(300.0);
    this.setStrength(strength);
    this.setDefense(" ");
    this.setLevel(0);
    this.setExperience(0);
}
  //Step 1: method that prints character's stats
  public void displayStats(){
    System.out.println("Name: " + name);
    System.out.println("Points of healts: " + health);
    System.out.println("Strength: " + strength);
    System.out.println("Defense: " + defense);
    System.out.println("Level: " + level);
    System.out.println("Experience: " + experience);
    System.out.println("---------------------------");
  }
  //Step 2: method gives possibility to choose a defense
  public void chooseDefense(){
    Scanner scan = new Scanner(System.in);
    System.out.println(getName() +", choose the armor to defend yourself: \n\t[1]helmet \n\t[2]breastplate \n\t[3]forearm protector \n\t[0]nothing");
    int choiseOfDefense = scan.nextInt();
    switch (choiseOfDefense){
      case 1:
        defense = "helmet";
        System.out.println(name + " can defend yourself with the " + defense + " now");
        System.out.println("---------------------------");
        break;
      case 2:
        defense = "breastplate";
        System.out.println(name + " can defend yourself with the " + defense + " now");
        System.out.println("---------------------------");
        break;
      case 3:
        defense = "forearm protector";
        System.out.println(name + " can defend yourself with the " + defense + " now");
        System.out.println("---------------------------");
        break;
      default:
        defense = " ";
        System.out.println(name + " do not have any defense");
        System.out.println("---------------------------");
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
