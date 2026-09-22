public class Operators {

    public static void main(String[] args) {

        int solvedWeek1 = 40;
        int solvedWeek2 = 35;

        int totalSolved = solvedWeek1 + solvedWeek2;
        // System.out.println(totalSolved);

        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = (solvedThisWeek / 7);
        int remainder = solvedThisWeek % 7;

        // System.out.println(total);
        // System.out.println(difference);
        // System.out.println(projected);
        // System.out.println(average);
        // System.out.println(remainder);

        boolean val = true;
        // System.out.println(val);

        int currentStreak = 45;
        int targetStreak = 50;

        // System.out.println(currentStreak == targetStreak);
        // System.out.println(currentStreak != targetStreak);
        // System.out.println(currentStreak > targetStreak);
        // System.out.println(currentStreak < targetStreak);
        // System.out.println(currentStreak >= targetStreak);
        // System.out.println(currentStreak <= targetStreak);

        // System.out.println(currentStreak && targetStreak);
        // System.out.println(currentStreak || targetStreak);

        boolean completedDSA = true;
        boolean completedCore = false;

        // System.out.println(completedDSA && completedCore);
        // System.out.println(completedDSA || completedCore);
        // System.out.println(!completedCore);

        int a = 5;
        int b = -a;
        int c = -b;

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        // int d = 10;
        // System.out.println(d++);
        // System.out.println(++d);

        // int e = 15;
        // System.out.println(e--);
        // System.out.println(--e);

        int activeUsers = 100;

        int prefix = ++activeUsers;
        int postfix = activeUsers++;

        // System.out.println(prefix);
        // System.out.println(postfix);
        // System.out.println(activeUsers);

        String exp = (targetStreak < currentStreak) ? "Yes" : "No";

        System.out.println(exp);

    }
}
