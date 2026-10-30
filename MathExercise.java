public class MathExercise {

    static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static int countEvenDig(int n) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            boolean even = isEven(rem);
            if (even) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }


    static int powerOfNum(int num, int pow) {
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result = result * num;
        }
        return result;
    }

    static void main() {

        float a = 2.15f;
        double b = 34.36;
        int c = 34;
        long d = 87;

        int num1 = 32;
        int num2 = 3;

        float prod = num1 / num2;
        System.out.println(prod);

        System.out.println(num1 / num2);

        float e = c / a;
        System.out.println(e);

        double f = d / b;

        System.out.println(c / a);

        System.out.println(f);

        System.out.println(isEven(6));
        System.out.println(factorial(5));
        System.out.println(powerOfNum(2, 5));
        System.out.println(countEvenDig(24853156));

    }

}
