public class PatternPrinting {
    static void main() {

        // int n = 3;

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // System.out.println();

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n + 2; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 8;

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // System.out.println();

        // for (int row = 1; row <= n; row++) {

        // for (int space = n - row; space > 0; space--) {
        // System.out.print(" ");
        // }

        // for (int col = 1; col <= n; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 8;

        // for (int row = n; row >= 1; row--) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // System.out.println();

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= (n - row) + 1; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        int n = 4;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= n - (n - row) + (row - 1); col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= (2 * row) - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= (n - row) * 2 + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

}
