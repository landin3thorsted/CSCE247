//Landin Thorsted
public class Queen extends Character {

  public Queen(String name) {
    super(name);
    weaponBehavior = new WeaponKnife();
  }
  
  public void display() {
    super.display();
    System.out.println("is a beautiful queen");
  }
}
