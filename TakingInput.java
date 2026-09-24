
import java.util.Scanner;

public class TakingInput {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the number of Problem Solved: ");
        int num = sc.nextInt();

        System.out.printf("%s the number of problems you solved is %d%n", name, num);

        // String num2 = sc.next();
        // System.out.println(num2 + 60);

        System.out.print("Enter a boolean value: ");
        boolean bool = sc.nextBoolean();
        System.out.printf("The value is %b", bool);

        sc.close();

    }
}
