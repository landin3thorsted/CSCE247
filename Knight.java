//Landin Thorsted
public class Knight extends Character {

  public Knight(String name) {
    super(name);
    weaponBehavior = new WeaponBow();
  }
  
  public void display() {
    super.display();
    System.out.println("is a valiant knight");
  }
}
