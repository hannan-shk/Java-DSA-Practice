
import java.util.Scanner;

public class Conditionals {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // boolean val = false;
        // boolean tern = (val == true) ? true : false;
        // System.out.println(tern);

        // int dailyPractice = 9;
        // if (dailyPractice >= 10) {
        // System.out.println("Good consistency!");
        // } else {
        // System.out.println("Bad consistency!");
        // }

        // System.out.print("Enter a Score: ");
        // int score = sc.nextInt();

        // if (score >= 50) {
        // System.out.println("Pass");
        // } else {
        // System.out.println("Fail");
        // }

        // System.out.print("Enter a Number: ");
        // int num = sc.nextInt();

        // switch (num) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("Sunday");
        // break;
        // }

        System.out.print("Enter your gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (gender == "Male" || gender == "male") {
            if (age >= 18) {
                System.out.println("He is eligible to vote.");
            } else {
                System.out.println("He is not eligible to vote.");
            }
        } else {
            if (age >= 18) {
                System.out.println("She is eligible to vote.");
            } else {
                System.out.println("She is not eligible to vote.");
            }
        }

        sc.close();

    }
}
