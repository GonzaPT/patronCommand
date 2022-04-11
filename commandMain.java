package Command;

public class commandMain {

    public static void main(String[] args) {
        Stock stock = new Stock();

        Buy buyStock = new Buy(stock);

        Invoker customer = new Invoker();
        customer.takeOrder(buyStock);

        customer.placeOrder();
    }
}
