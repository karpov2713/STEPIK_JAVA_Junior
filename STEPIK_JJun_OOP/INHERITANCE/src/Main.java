public class Main {
    public static void main(String[] args) {

//        Cat cat = new Cat();
//        Lion lion = new Lion();
//        System.out.println(cat.canEatPerson);
//        System.out.println(lion.canEatPerson);
//        cat.eat();
//        lion.eat();
//
//        Box box = new Box(10);
//        WeightBox weightBox = new WeightBox(10, 20);
//        box.showInfo();
//        weightBox.showInfo();
        Rect rect = new Rect(10, 20);
        ColoredRect rect1 = new ColoredRect(10, 20);
        Triangle triangle = new Triangle(10, 10, 10);

        rect.showPerimeter();
        rect1.showPerimeter();
        triangle.showPerimeter();

    }
}