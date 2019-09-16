// Landin Thorsted
/**
 * Allows for addition, removal, and notification of the observers
 */
import java.util.ArrayList;
public class Watchman implements Subject {

  private ArrayList<Observer> observers;
  private int warning;
  /**
   * Creates an ArrayList of observers
   */
  Watchman() {
    observers = new ArrayList<Observer>();
  }
  /**
   * Creates a new observer
   */
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }
  /**
   * Removes an observer
   */
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }
  /**
   * Loops through the observers and updates them with the warning number
   */
  public void notifyObservers() {
    for(Observer observer : observers) {
      observer.update(this.warning);
    }
  }
  /**
   * Prints the warning message and calls notifyObservers to update them
   */
  public void issueWarning(int warning) {
    if(warning == 1) {
      System.out.println("WARNING:  1 trumpet was played!");
    } else if(warning == 2) {
      System.out.println("WARNING:  2 trumpets were played!");
    } else {
      System.out.println("Unknown warning.");
    }
    this.warning = warning;
    this.notifyObservers();
  }
}
