public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e1 = new Employee("Chithara", 15000);//Employee 1
        Employee e2 = new Employee("Jack", 20000);//Employee 2

        System.out.println("Employee 1 name: " + e1.getName());
        System.out.println("Employee 1 salary: " + e1.getSalary() + "\n");

        System.out.println("Employee 2 name: " + e2.getName());
        System.out.println("Employee 2 salary: " + e2.getSalary() + "\n");
    }
}
