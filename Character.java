//Landin Thorsted
public abstract class Character {

  protected String name;
  WeaponBehavior weaponBehavior;
  
  public Character(String name) {
    this.name = name;
  }
  
  public void attack() {
    this.weaponBehavior.attack();
  }
  
  public void setWeaponBehavior(WeaponBehavior wb) {
    weaponBehavior = wb;
  }
  
  public void display() {
    System.out.print(name + " ");
  }
}
