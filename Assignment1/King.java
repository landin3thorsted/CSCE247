//Landin Thorsted
public class King extends Character {
  
  public King(String name) {
    super(name);
    weaponBehavior = new WeaponSword();
  }
  
  public void display() {
    super.display();
    System.out.println("is a Noble King");
  }
}
