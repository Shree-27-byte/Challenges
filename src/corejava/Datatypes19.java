package corejava;
import java.math.BigInteger;
import java.util.Scanner;
public class Datatypes19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        BigInteger fact = BigInteger.ONE;
        for(int i=1;i<=n;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial: " + fact);
    }
}
