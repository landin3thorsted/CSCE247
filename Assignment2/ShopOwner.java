// Landin Thorsted
/**
 * This class is an observer and responds to the update from the subject
 */
public class ShopOwner implements Observer {
  
  private Subject watchman;
  /**
   * Adds the subject to observe it
   */
  public ShopOwner(Subject watchman) {
    this.watchman = watchman;
    watchman.registerObserver(this);
  }
  /**
   * Displays an action based on the level of warning
   */
  public void update(int warning) {
    if(warning == 1) {
      System.out.println("Shop Owner: Close down shop and head home");
    } else if(warning == 2) {
      System.out.println("Shop Owner: Drops everything and find nearest hideout");
    } else {
      System.out.println("Unknown warning.");
    }
  }
}
