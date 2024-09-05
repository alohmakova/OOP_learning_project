public class Character {
  //create Attributes
  //I put "private" modifier because I use getters and setters
  private String name;
  private double  health;
  private int strength;

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

  //Create a constructor to initialize the Attributes
    public Character(String name, double  health, int strength){
    this.setName(name);
    this.setHealth(health);
    this.setStrength(strength);
}
  //Write a method that prints character's stats
  public void displayStats(){
    System.out.println("My name is: " + getName());
    System.out.println("I have " + getHealth() + " points of healts");
    System.out.println("My strength is: " + getStrength());
  }


}
