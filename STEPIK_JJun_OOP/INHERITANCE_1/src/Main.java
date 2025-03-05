public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.canEatPerson);
        System.out.println(lion.canEatPerson);
        cat.eat();
        lion.eat();

        Box box = new Box(10);
        WeightBox weightBox = new WeightBox(10, 20);
        box.showInfo();
        weightBox.showInfo();
    }
}