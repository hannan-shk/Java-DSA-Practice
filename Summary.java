
import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String var1 = sc.nextLine();
        System.out.print("Enter the number of Problems you have been solved: ");
        int var2 = sc.nextInt();
        System.out.printf("%s and he has been solved %d Problems", var1, var2);

        sc.close();

    }
}
