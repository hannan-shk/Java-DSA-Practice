public class StringExercise {
    static void main() {

        String str = "Hello";
        String str2 = str.concat(" World");
        System.out.println(str2);

        char ch = 'a';
        char ch2 = ch;

        String sentence = "Hello My name is Abdul Hannan Shaikh";

        int consoCount = consonent(sentence);
        System.out.println(consoCount);

        String upperCase = upperCase("Hannan Shaikh  !45");
        System.out.println(upperCase);

        int frequency = frequency("Hello My name is Abdul Hannan Shaikh", 'a');
        System.out.println(frequency);

        String removeSpace = removeSpace("Hello My name is Abdul Hannan Shaikh");
        System.out.println(removeSpace);

        boolean onlyDigit = onlyDigit("1234!56789");
        System.out.println(onlyDigit);

        int countWords = countWords(sentence);
        System.out.println(countWords);


    }

    static int consonent(String sentence) {
        int count = 0;
        String sentence1 = sentence;
        for (int i = 0; i < sentence1.length(); i++) {
            char ch = sentence1.charAt(i);

            if (ch != ' ' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                    count++;
                }
            }

        }
        return count;
    }

    static String upperCase(String sentence) {
        String upperSentence = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 97 && ch <= 122) {
                ch = (char) (ch - 32);
                upperSentence += ch;
            } else {
                upperSentence += ch;
            }
        }
        return upperSentence;

    }

    static int frequency(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    static String removeSpace(String str) {
        String result = str.replace(" ", "");
        return result;


    }

    static boolean onlyDigit(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
                return false;
            }
        }
        return true;
    }

    static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                count++;
            }
        }
        return count;
    }

}
