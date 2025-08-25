package core_java;
class HumanPerson {
    String name;
    int age;

    HumanPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class CompanyEmployee extends HumanPerson {
    int id;
    double salary;

    CompanyEmployee(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }
}

public class Inheritance21 {
    public static void main(String[] args) {
        CompanyEmployee emp = new CompanyEmployee("Alice", 29, 1101, 75000.0);
        System.out.println("Name: " + emp.name + ", Age: " + emp.age + ", ID: " + emp.id + ", Salary: " + emp.salary);
    }
}

