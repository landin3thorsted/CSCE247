// Landin Thorsted
/**
 * This class is an observer and responds to the update from the subject
 */
public class Teacher implements Observer {

  private Subject watchman;
  /**
   * Adds the subject to observe it
   */
  public Teacher(Subject watchman) {
    this.watchman = watchman;
    watchman.registerObserver(this);
  }
  /**
   * Displays an action based on the level of warning
   */
  public void update(int warning) {
    if(warning == 1) {
      System.out.println("Teacher: Helps get every kid home safe");
    } else if(warning == 2) {
      System.out.println("Teacher: Brings all students to the underground shelter");
    } else {
      System.out.println("Unknown warning.");
    }
  }
}
