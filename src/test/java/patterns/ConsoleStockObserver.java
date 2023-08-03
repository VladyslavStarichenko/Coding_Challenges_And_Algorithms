package patterns;

public class ConsoleStockObserver implements StockObserver {
    @Override
    public void notify(String identifier, double price) {
        System.out.println("Stock: " + identifier + " - Price: " + price);
    }
}
