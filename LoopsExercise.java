public class LoopsExercise {
    static void main() {
        boolean dec = false;
        for (int i = 1; i <= 100; i++) {
            if (i == 1 || i == 2) {
                System.out.println(i);
            } else {
                for (int j = 2; j <= i; j++) {
                    int n = j - 1;
                    if (n == 1) {
                        continue;
                    } else {
                        if (i % n != 0) {
                            dec = true;
                        } else {
                            dec = false;
                            break;
                        }
                    }
                }

                if (dec) {
                    System.out.println(i);
                }
            }
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
