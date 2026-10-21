
public class Strings {
    static void main() {
        // String s1 = "Hannan";
        // String s2 = s1;
        // System.out.println(s2);
        // s2 = "Abdul Hannan";
        // s1 = "Hannan Shaikh";
        // System.out.println(s2);
        // System.out.println(s1);

        // String str = "Hannan";
        // String str2 = "Shaikh";
        // String str3 = new String("Hannan");
        // String str4 = new String("Shaikh");
        //
        // System.out.println(str == str2);
        //
        // System.out.println(str + " " + str4);
        //
        // System.out.println(str.length());
        // System.out.println(str3.charAt(2));
        //
        // System.out.println(str.equals(str3));

        // Scanner sc = new Scanner(System.in);
        //
        // System.out.println("Provide the string content: ");
        // String str = sc.nextLine();
        // System.out.println("Value of nextLine: " + str);
        //
        // String str2 = sc.next();
        // System.out.println("Value of next: " + str2);

        // int arr[] = {1, 2, 3, 4, 5};
        //
        // System.out.println(arr.length);

        // String str3 = "";
        // System.out.println(str3.length());
        // System.out.println(str3.isEmpty());
        // System.out.println(str3.isBlank());
        // String str4 = " ";
        // System.out.println(str4.length());
        // System.out.println(str4.isEmpty());
        // System.out.println(str4.isBlank());

        // String str5 = " Hannan ";
        // System.out.println(str5.length());
        // String str6 = str5.trim();
        // System.out.println(str6.length());
        // System.out.println(str6.charAt(0));

        // String str7 = "My Name is Abdul Hannan!";

        // System.out.println(str7.substring(11, 16));

//        int num = 5235;
//
//        String str8 = String.valueOf(num);
//        System.out.println(num + 1);
//        System.out.println(str8 + 1);
//
        String name = "Hannan ShaikhE!";
//        char crr[] = name.toCharArray();
//
//        for (char ch : crr) {
//            System.out.println(ch);
//        }
//
//        int arr[] = { 1, 2, 3, 4, 5, 6 };
//
//        for (int no : arr) {
//            System.out.println(no);
//        }

        printStr(name);

        int len = getLength(name);

        System.out.println(len);

        int vowel = countVowels(name);
        System.out.println(vowel);

        String reverse = reverseStr("Hannan");
        System.out.println(reverse);

        boolean palindrome = isPalindrome("racecar");
        System.out.println(palindrome);


    }

    static void printStr(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getLength(String str) {
        int count = 0;

        char chr[] = str.toCharArray();

        for (char ch : chr) {
            count++;
        }
        return count;
    }

    static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }

        }
        return count;
    }

    static String reverseStr(String str) {
        String reverseStr = "";
        for (int i = 0; i < str.length(); i++) {
            reverseStr = str.charAt(i) + reverseStr;
        }
        return reverseStr;
    }

    static boolean isPalindrome(String str) {
        String reverseStr = reverseStr(str);
        String originStr = str;
//        boolean palindrome = true;
//        for (int i = 0; i < str.length(); i++) {
//            reverseStr = str.charAt(i) + reverseStr;
//        }

        for (int i = 0; i < str.length(); i++) {
            char revChar = reverseStr.charAt(i);
            char originChar = originStr.charAt(i);
            if (originChar != revChar) {
                return false;
            }
        }
//
//        if (reverseStr.equalsIgnoreCase(originStr)) {
//            palindrome = true;
//        } else {
//            palindrome = false;
//        }
//        return palindrome;
        return true;
    }

}
