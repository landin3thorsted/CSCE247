// Landin Thorsted
/**
 * An interface for the subject to add, remove and update the observers
 */
public interface Subject {
    
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObservers();
  
}
