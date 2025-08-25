package core_java;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
}

public class Inheritance09 {
    public static void main(String[] args) {
        Student s = new Student("Tom", 18, 101);
        Teacher t = new Teacher("Mrs. Smith", 45, "Math");

        System.out.println("Student: " + s.name + ", Age: " + s.age + ", Roll: " + s.rollNumber);
        System.out.println("Teacher: " + t.name + ", Age: " + t.age + ", Subject: " + t.subject);
    }
}