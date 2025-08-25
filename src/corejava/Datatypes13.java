package corejava;
import java.util.Scanner;
public class Datatypes13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Substring(0,3): " + str.substring(0,3));
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.print("Enter another string to compare: ");
        String str2 = sc.nextLine();
        System.out.println("Equals? " + str.equals(str2));
    }
}
