import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", 17);
        System.out.println(person.toString());

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(1, 7);
            System.out.printf("Ваше число: %s%n", a);
        }

    }
}