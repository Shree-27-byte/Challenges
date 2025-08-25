package core_java;
public class Inheritance08 {
    public static void main(String[] args) {
        Manager m = new Manager("Bob", 102, 82000, "IT", "Tech Lead");
        System.out.println("Name: " + m.name);
        System.out.println("ID: " + m.id);
        System.out.println("Salary: " + m.salary);
        System.out.println("Department: " + m.department);
        System.out.println("Designation: " + m.designation);
    }
}

