public class BasicMaths {

    static boolean isPerfectNum(int n) {
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int j = n / i;
                sum = sum + i + j;


            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    static void main() {

        printDigits(5312789);

        int digitsCount = countDigits(531278970);
        System.out.println("No of digits: " + digitsCount);

        int sum = sumDigits(531278970);
        System.out.println("Sum: " + sum);

        int rev = revDigits(1498);
        System.out.println("Rev: " + rev);

        boolean palindrome = isPalindrome(1221);
        System.out.println("Palindrome: " + palindrome);

        boolean prime = newIsPrime(49);
        System.out.println("Prime: " + prime);

        System.out.println("GCD: " + getGCD(12, 18));

        System.out.println("LCM: " + getLCM(36, 18));

        System.out.println("ArmStrong: " + armstrongNum(121));

        System.out.println("Perfect Num: " + isPerfectNum(6));

    }

    static void printDigits(int n) {
        int rem = 0;
        while (n > 0) {

            rem = n % 10;
            System.out.println(rem);
            n = n / 10;

        }

    }

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

    static int revDigits(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n) {
        int original = n;
        int rev = revDigits(n);

        if (rev == original) return true;
        return false;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean newIsPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static int getGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int ans = a;
        return ans;

    }

    static int getLCM(int a, int b) {
        int gcd = getGCD(a, b);
        int prod = a * b;
        int lcm = prod / gcd;
        return lcm;
    }

    static boolean armstrongNum(int n) {
        int original = n;
        int prod = 0;
        while (n != 0) {
            int rem = n % 10;
            int cube = (int) Math.pow(rem, 3);
            prod += cube;
            n = n / 10;

        }
        if (prod == original) {
            return true;
        }
        return false;
    }

}
