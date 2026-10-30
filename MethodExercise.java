public class MethodExercise {

    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static int getMaximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static void main() {
        System.out.println("Start");
        PrintWelcomeMessage();
        PrintWelcomeMessage(25, "Hannan");
        int x = 25;
        verUpdate(x);
        System.out.println(x);
//        int sum = add(5, 33);
//        System.out.println(sum);
//        boolean numIden = isEven(5);
//        System.out.println(numIden);
//        int max = getMaximum(-5, 3);
//        System.out.println(max);
        float percent = percentage(34.5f, 66);
        System.out.println(percent);
        System.out.println("End");
    }

    static void PrintWelcomeMessage() {
        System.out.println("Welcome to Method Exercise");
    }

    static void PrintWelcomeMessage(int a, String b) {
        System.out.printf("Welcome %s Happy %dth birthday%n", b, a);
    }

    static float percentage(float obt, float total) {
        float percent = (obt / total) * 100;
        return percent;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static void verUpdate(int x) {
        x = x + 45;
        System.out.println(x);
    }
}
