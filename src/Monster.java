//Step 3: create a Monster class and make it inherit from Character
public class Monster extends Character{

  //Step 3: add unique attributes like rage or ferocity
  private int rage;//Starts at 0, builds up during the battle
  private int ferocity;//Determines how aggressive the monster is

  //Step 4: create getter and setter methods for accessing and modifying private attributes
  public int getRage() {
    return rage;
  }

  public void setRage(int rage) {
    this.rage = rage;
  }

  public int getFerocity() {
    return ferocity;
  }

  public void setFerocity(int ferocity) {
    this.ferocity = ferocity;
  }

  //Step 3: create a constructor to initialize the attributes
  public Monster (String name, int strength, int ferocity) {
    super(name, strength);
    this.rage = 0;
    this.ferocity = ferocity;

  }

  //Step 3: override or add methods specific to Monster
  //Step 3: method that prints monster's stats
  public void displayStats(){
    System.out.println("Name of a monster: " + getName());
    System.out.println("Points of healts: " + getHealth());
    System.out.println("Strength: " + getStrength());
    System.out.println("Ferocity: " + ferocity);
    System.out.println("Rage: " + rage);
    System.out.println("Level: " + getLevel());
    System.out.println("Experience: " + getExperience());
    System.out.println("---------------------------");
  }

  public int attack(){
    setDamage(getStrength() * ferocity);
    return getDamage();
  }
  public double takeDamage(int damage){
    if (rage>=250 && rage<=350) {
      System.out.println(getName() + " enters a berserk rage!");
      setHealth(getHealth()-damage/2.0);//If a monster enters a berserk rage, it takes less damage
      ferocity +=1;                     //and its ferocity is greater, which increases the amount of damage it deals
      rage += damage;
    }else {
      setHealth(getHealth()- damage);
      rage += damage;                   //as the monster's health decreases, its rage increases until the monster enters a berserk rage
    }
    return getHealth();
  }


}
