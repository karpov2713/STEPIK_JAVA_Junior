public class WaiterBob implements Waiter {

    @Override
    public void bringOrder(String food) {
        System.out.println("Я вам принес: " + food);
    }
}
