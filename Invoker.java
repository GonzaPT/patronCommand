package Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> comandList = new ArrayList<Command>();

    public void takeOrder(Command order) {
        comandList.add(order);
    }

    public void placeOrder() {
        for (Command command : comandList) {
            command.execute();
        }
        comandList.clear();
    }
}
