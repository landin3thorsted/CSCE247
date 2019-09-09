//Landin Thorsted
public class Troll extends Character {

  public Troll(String name) {
    super(name);
    weaponBehavior = new WeaponAxe();
  }
  
  public void display() {
    super.display();
    System.out.println("is a funny troll");
  }
}
