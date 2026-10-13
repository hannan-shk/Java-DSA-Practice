public class NewPatternExercise {

    static void main() {

        System.out.println("New Pattern Exercise");

        System.out.println();

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + num + "  ");
                num = num * (i - j) / j;
            }
            System.out.println();

        }

        System.out.println();

        int n2 = 9;

//        for (int i = 1; i <= 4; i++) {
//
//            for (int j = 1; j <= n2; j++) {
//                if ((i + j) % 4 == 0 || (j % 2 == 0 && i % 2 == 0)) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//
//        }

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= n2; j++) {
                if ((i + j) % 4 == 0 || (j % 4 == 0 && i % 2 == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }

}
