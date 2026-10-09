public class Loops {
    static void main() {
        System.out.println("Loops in JAVA:");

        // String name="My Name is Hannan";

        // for(int i=1;i<=10000;i++){
        // System.out.println(i);
        // }

        // for(int i=0;i<=name.length();i++){
        // char c=name.charAt(i);
        // System.out.println(c);
        // }

        // for(int i=1;i<=10;i+=2){
        // System.out.println(i);
        // }

        // for(int i=1;i<=5;i++) {
        // for(int j=1;j<=5;j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > 1 && i < n) {
                    if (j > 1 && j < n) {
                        System.out.print("  ");
                    } else {

                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

        // for(int i=1;i<=5;i++) {
        // for(int j=1;j<=5;j++) {
        // System.out.print(" i = "+i+", j = "+j);
        // }
        // System.out.println();
        // }
        System.out.println();
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println();

        int a = 1;
        int num = 10;

        while (a <= num) {
            int j = 1;
            while (j <= num) {
                if (a > 1 && a < num) {
                    if (j > 1 && j < num) {
                        System.out.print("  ");
                    } else {

                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }

                j++;
            }
            System.out.println();
            a++;
        }

        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

    }

}
