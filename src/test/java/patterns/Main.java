package patterns;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        StockObserver observer = new ConsoleStockObserver();
        stockMarket.subscribe(observer);

// Publish a stock update
        String identifier = "AAPL";
        double price = 135.52;
        stockMarket.publish(identifier, price);

// Unsubscribe the observer
        stockMarket.unsubscribe(observer);
    }
}
