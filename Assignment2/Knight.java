// Landin Thorsted
/**
 * This class is an observer and responds to the update from the subject
 */
public class Knight implements Observer {
  
  private Subject watchman;
  /**
   * Adds the subject to observe it
   */
  public Knight(Subject watchman) {
    this.watchman = watchman;
    watchman.registerObserver(this);
  }
  /**
   * Displays an action based on the level of warning
   */
  public void update(int warning) {
    if(warning == 1) {
      System.out.println("Knight: Helps everyone get home safe");
    } else if(warning == 2) {
      System.out.println("Knight: Prepares for battle");
    } else {
      System.out.println("Unknown warning.");
    }
  }
}
