package corejava;
import java.util.Scanner;
public class Datatypes12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string number: ");
        String str = sc.nextLine();
        int num = Integer.parseInt(str);
        System.out.println("String to integer: " + num);
        String str2 = Integer.toString(num);
        System.out.println("Integer to string: " + str2);
    }
}
