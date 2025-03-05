import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = getEmployees();
        for (String s : names) {
            System.out.println(s);
        }
    }

    private static HashSet<String> getEmployees() {
        HashSet<String> employees = new HashSet<>();
        employees.add("John");
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}