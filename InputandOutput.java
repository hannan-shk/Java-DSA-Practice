
import java.math.BigInteger;
import java.util.Scanner;

public class InputandOutput {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for firstNum: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the value for secondNum: ");
        int secondNum = sc.nextInt();

        int sum = firstNum + secondNum;
        System.out.println(sum);

        int sub = firstNum - secondNum;
        System.out.println(sub);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger: " + bg);

        sc.close();
    }
}
