package Command;

public class Buy implements Command {

    private Stock stock;

    public Buy(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();

    }

}
