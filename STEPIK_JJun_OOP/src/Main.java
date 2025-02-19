public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        box1.height = 10;
//        box1.length = 10;
//        box1.width = 10;
//
//        Box box2 = new Box();
//        box2.height = 20;
//        box2.length = 20;
//        box2.width = 20;
//
//        double volume = box1.height * box1.length * box1.width;
//        System.out.println(volume);
//        double volume2 = box2.height * box2.width * box2.length;
//        System.out.println(volume2);

        Person john = new Person();
        john.name = "John";
        john.age = 22;
        john.weight = 75;

        Person ann = new Person();
        ann.name = "Anya";
        ann.age = 15;
        ann.weight = 55;

        Person dima = new Person();
        dima.name = "Dima";
        dima.age = 56;
        dima.weight = 89;

        double summAge = john.age + ann.age + dima.age;
        System.out.println(summAge / 3);
    }
}