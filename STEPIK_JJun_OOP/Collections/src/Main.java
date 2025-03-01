public class Main {
    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        employees.add("James");

        employees.remove("Emma");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }

//        String[] newArray = new String[employees.length + 1];
//        for (int i = 0; i < employees.length; i++) {
//            newArray[i] = employees[i];
//        }
//        for (String employee : employees) {
//            System.out.println(employee);
//        }
//        System.out.println();
//
//        // Добавляем James
//        newArray[newArray.length - 1] = "James";
//        employees = newArray;
//        for (String employee : employees) {
//            System.out.println(employee);
//        }
//        System.out.println();
//
//        employees[0] = null;
//        for (String employee : employees) {
//            System.out.println(employee);
//        }
//        System.out.println();
//
//        String[] newestArray = new String[employees.length - 1];
//        for (int i = 0, j = 0; i < employees.length; i++) {
//            String employee = employees[i];
//            if (employee != null) {
//                newestArray[j] = employee;
//                j++;
//            }
//        }
//        employees = newestArray;
//        for (String employee : employees) {
//            System.out.println(employee);
//        }
    }

    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}