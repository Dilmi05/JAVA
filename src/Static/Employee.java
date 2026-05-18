package Static;

class Employee {

    static int count = 0;

    Employee() {
        count++;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        System.out.println("Total Employees: " + count);
    }
}