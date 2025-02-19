public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void showInfo(){
        System.out.println("Name: " + this.name + "\nPosition: " + this.position + "\nSalary: " + this.salary);
    }
}
