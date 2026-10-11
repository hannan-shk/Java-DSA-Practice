public class PatternExercise {
    static void main() {
        System.out.println("Pattern Exercise");
        System.out.println();

        int n = 15;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++) {

                if ((i + j) % 4 == 0 ||
                        (i == 2 && j % 4 == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        int n2 = 5;

        for (int row = 1; row <= n2; row++) {


            int number = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number = number * (row - col) / col;
            }
            System.out.println();

        }

        System.out.println();

        int n3 = 4;

        for (int row = 1; row <= n3; row++) {

            for (int col = 1; col <= n3; col++) {
                System.out.print(col + " ");
            }
            System.out.println();

        }


    }
}
