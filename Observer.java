public interface Observer 
{
    void update();
}

public interface Subject
 {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
public class ConcreteObserver implements Observer {
    private ConcreteSubject subject;
    
    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    
    public void update() {
        int state = subject.getState();
        // update observer state based on subject state
    }
}
public class ConcreteSubject implements Subject 
{
    private List<Observer> observers = new ArrayList<>();
    private int state;
    
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
    
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}


public static void main(String[] args) {
    ConcreteSubject subject = new ConcreteSubject();
    ConcreteObserver observer1 = new ConcreteObserver(subject);
    ConcreteObserver observer2 = new ConcreteObserver(subject);
    
    subject.setState(1);
    // Both observers will be notified and update their state
    
    subject.removeObserver(observer2);
    subject.setState(2);
    // Only observer1 will be notified and update its state
}
