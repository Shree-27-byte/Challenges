package core_java;
public class Inheritance10 {
    public static void main(String[] args) {
        Student s = new Student("Lisa", 20, 102);
        Teacher t = new Teacher("Mr. John", 50, "Science");

        System.out.println("Student: " + s.name + ", Age: " + s.age + ", Roll No: " + s.rollNumber);
        System.out.println("Teacher: " + t.name + ", Age: " + t.age + ", Subject: " + t.subject);
    }
}
