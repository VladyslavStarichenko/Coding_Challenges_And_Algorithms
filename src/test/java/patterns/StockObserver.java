package patterns;
public interface StockObserver {
    void notify(String identifier, double price);
}
