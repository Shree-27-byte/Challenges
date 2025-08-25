package corejava;
import java.util.Scanner;
class Student{
    String name;
    int age;
    Student(String n,int a){name=n; age=a;}
}
public class Datatypes20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            arr[i] = new Student(name, age);
        }
        System.out.println("Student Details:");
        for(Student s: arr){
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
    }
}
