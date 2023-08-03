package patterns;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private final List<StockObserver> observers = new ArrayList<>();

    public void subscribe(StockObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(StockObserver observer) {
        observers.remove(observer);
    }

    public void publish(String identifier, double price) {
        for (StockObserver observer : observers) {
            observer.notify(identifier, price);
        }
    }
}




