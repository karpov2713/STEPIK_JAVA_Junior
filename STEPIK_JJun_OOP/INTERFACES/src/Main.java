import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        ArrayList<AbleToRun> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        for (AbleToRun animal:animals){
            animal.run();
        }
        AbleToFly ableToFly = new Bird();
        ableToFly.fly();

        Director director = new Director();
        Chief chief = new Chief();
        Programmer programmer = new Programmer();

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(director);
        workers.add(chief);
        workers.add(programmer);
        for (Worker worker:workers){
            worker.work();
        }

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(chief);
        drivers.add(programmer);
        for (Driver driver:drivers){
            driver.drive();
        }



//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(bird);
//        animals.add(fish);
//
//        for(Animal animal:animals){
//            animal.eat();
//        }

//        Animal animal = new Dog(); // upcast делается автоматически
//        animal.eat();
//
//        Dog dog = (Dog) animal; // downcast необходимо делать самостоятельно
//        dog.run();


    }
}