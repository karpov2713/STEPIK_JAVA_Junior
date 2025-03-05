import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        //WaiterBob waiterBob = new WaiterBob();
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String food) {
                System.out.println("Я вам принес: " + food);
            }
        }, "Пицца");



    }
}