package core_java;
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

class Manager extends Employee {
    String department;
    String designation;

    Manager(String name, int id, double salary, String department, String designation) {
        super(name, id, salary);
        this.department = department;
        this.designation = designation;
    }
}

public class Inheritance07 {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 101, 75000, "HR", "Senior Manager");
        System.out.println("Name: " + m.name);
        System.out.println("ID: " + m.id);
        System.out.println("Salary: " + m.salary);
        System.out.println("Department: " + m.department);
        System.out.println("Designation: " + m.designation);
    }
}

