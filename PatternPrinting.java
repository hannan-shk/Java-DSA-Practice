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

        // int n = 4;

        // for (int row = 1; row <= n; row++) {

        // for (int col = 1; col <= n - row; col++) {
        // System.out.print(" ");
        // }

        // for (int col = 1; col <= n - (n - row) + (row - 1); col++) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // System.out.println();

        // for (int row = 1; row <= n; row++) {

        // for (int col = 1; col <= n - row; col++) {
        // System.out.print(" ");
        // }

        // for (int col = 1; col <= (2 * row) - 1; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // System.out.println();

        // for (int row = 1; row <= n; row++) {

        // for (int col = 1; col <= row - 1; col++) {
        // System.out.print(" ");
        // }

        // for (int col = 1; col <= (n - row) * 2 + 1; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // System.out.println();

        // for (int row = 1; row <= n; row++) {

        // for (int col = 1; col <= row - 1; col++) {
        // System.out.print(" ");
        // }

        // for (int col = 1; col <= (2 * n) - row - (row - 1); col++) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // }

        // int n = 20;

        // for (int row = 1; row <= n; row++) {

        // for (int col = 1; col <= n + 2; col++) {
        // if (row > 1 && row < n) {

        // if (col > 1 && col < n + 2) {

        // System.out.print(" ");
        // } else {
        // System.out.print("* ");
        // }
        // } else {
        // System.out.print("* ");
        // }

        // }
        // System.out.println();

        // }

        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= n + 2; col++) {
        // if (row == 1 || row == n) {
        // System.out.print("* ");
        // } else {
        // if (col == 1) {
        // System.out.print("* ");
        // } else if (col == n + 2) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // }
        // System.out.println();
        // }

//        int n = 10;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                if (row == 1 || row == 2 || row == n) {
//                    System.out.print("* ");
//                } else {
//                    if (col == 1 || col == row) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (int row = 1; row <= n; row++) {
//            if (row == 1 || row == 2 || row == n) {
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//                for (int col = 1; col <= (row - 2); col++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n = 10;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//            if (row == 1 || row == n) {
//                for (int col = 1; col <= (row * 2) - 1; col++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//
//                for (int col = 1; col <= ((row * 2) - 2) - 1; col++) {
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//            if (row == 1 || row == n) {
//                for (int col = 1; col <= (row * 2) - 1; col++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//
//                for (int col = 1; col <= (row * 2) - 3; col++) {
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//
//            for (int col = 1; col <= (row * 2) - 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//
//        for (int row = 1; row <= n; row++) {
//            if (row == 1) {
//                continue;
//            }
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print("  ");
//            }
//
//            for (int col = 1; col <= (n * 2) - ((row * 2) - 1); col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//
//
//            for (int col = 1; col <= (row * 2) - 1; col++) {
//
//                if (row > 1) {
//                    if (col > 1 && col < (row * 2) - 1) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//                } else {
//
//                    System.out.print("* ");
//                }
//            }
//
//
//            System.out.println();
//
//        }
//
//        for (int row = 1; row <= n; row++) {
//            if (row == 1) {
//                continue;
//            }
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print("  ");
//            }
//
//            for (int col = 1; col <= (n * 2) - ((row * 2) - 1); col++) {
//
//                if (row < n) {
//
//                    if (col > 1 && col < (n * 2) - ((row * 2) - 1)) {
//                        System.out.print("  ");
//                    } else {
//                        System.out.print("* ");
//                    }
//
//                } else {
//
//                    System.out.print("* ");
//                }
//
//            }
//            System.out.println();
//
//        }
//
//        System.out.println();

//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//
//            for (int col = 1; col <= 2 * (n - row); col++) {
//                System.out.print("  ");
//            }
//
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//
//        for (int row = 1; row <= n; row++) {
//
//            for (int col = 1; col <= n - (row - 1); col++) {
//                System.out.print("* ");
//            }
//
//            for (int col = 1; col <= 2 * (row - 1); col++) {
//                System.out.print("  ");
//            }
//
//            for (int col = 1; col <= n - (row - 1); col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//
//        System.out.println();

//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//
//        }
//
//        System.out.println();
//
//        int num = 1;
//        for (int row = 1; row <= n; row++) {
//
//            for (int col = 1; col <= row; col++) {
//                System.out.print(num + " ");
//                num++;
//            }
//            System.out.println();
//
//        }
//
//        System.out.println();
//
//
//        for (int row = 1; row <= n; row++) {
//
//            for (int col = 1; col <= row; col++) {
//                char letter = (char) (col + ('A' - 1));
//                System.out.print(letter + " ");
//
//            }
//            System.out.println();
//
//        }
//
//        System.out.println();


        int n = 6;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                int a = n - col;
                char b = 'A';
                char letter = (char) (a + b);
                System.out.print(letter + " ");

            }
            System.out.println();

        }

        System.out.println();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n * 2 - (row * 2) + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row <= n; row++) {
            if (row == 1) {
                continue;
            }
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row * 2 - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            for (int col = 1; col <= row - 1; col++) {
                System.out.print(row - col + " ");
            }

            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col < row * 2; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                char letter = (char) ('A' - 1 + col);
                System.out.print(letter + " ");
            }

            for (int col = 1; col < row; col++) {
                char letter = (char) ('A' - col - 1 + row);
                System.out.print(letter + " ");
            }
            System.out.println();
        }

    }

}
