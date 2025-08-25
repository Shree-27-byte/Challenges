package corejava;
import java.util.Scanner;
public class Datatypes18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sb.append(" Added");
        System.out.println("After append: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
