import java.util.Scanner;

public class Methods {

    static void main() {
        System.out.println("Methods in Java!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a positive integer: ");
        int num2 = sc.nextInt();
//        theMain();
//        tableOf2();
        tableOfn(2, 20);
        int n = add(num1, num2, 60);
        System.out.println(n);
        int n2 = add(num1, num2);
        System.out.println(n2);
        int n3 = 55;
        int n4 = n3;
        System.out.println(n3);
        n4 = n4 + 10;
        System.out.println(n4);
        System.out.println(n3);
        System.out.println("The End!");
        sc.close();
    }

    static void theMain() {
//        String name = "Hannan Shaikh!";
//        return name;
        System.out.println("Hannan Shaikh!");
    }

    static void tableOf2() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("-> " + ans);
        }
    }

    static void tableOfn(int n, int num) {
        for (int i = 1; i <= num; i++) {
            int ans = n * i;
            System.out.println("-> " + ans);
        }


    }

    static int add(int a, int b, int c) {
        int num = a + b + c;
        return num;
    }

    static int add(int p, int q) {
        int num = p + q;
        return num;
    }


}
