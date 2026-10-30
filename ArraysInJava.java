import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJava {
    static void main() {
        System.out.println("Arrays in Java!");
        int arr[] = {55, 47, -4, 68, 25, 98};
        int n = 10;
        int brr[] = new int[n];
//        arr[4] = 56;
//        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println();
//
//        for (int val : arr) {
//            System.out.println(val);
//        }

//        for (int i = 0; i < brr.length; i++) {
//            System.out.print("Enter number: ");
////            int num = sc.nextInt();
//            brr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(brr));
//        sc.close();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);


//        int multiply = 1;
//        for (int i = 0; i < arr.length; i++) {
//            multiply *= arr[i];
//        }
//        System.out.println(multiply);

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val > max) {
                max = val;
            }
        }
        System.out.println(max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

        int crr[][] = {{1, 2, 3, 4, 5}, {11, 12, 13, 14, 15}, {21, 22, 23, 24, 25}};
        System.out.println(Arrays.deepToString(crr));
//        for (int i = 0; i < crr.length; i++) {
//            for (int j = 0; j < crr[i].length; j++) {
//                System.out.print(crr[i][j] + " ");
//            }
//            System.out.println();
//        }
        int sum2 = 0;
        for (int row = 0; row < crr.length; row++) {
            for (int col = 0; col < crr[row].length; col++) {
                int val = crr[row][col];
                sum2 += val;
            }
        }
        System.out.println(sum2);

        long multiply2 = 1;
        for (int row = 0; row < crr.length; row++) {
            for (int col = 0; col < crr[row].length; col++) {
                int val = crr[row][col];
                multiply2 *= val;
            }
        }
        System.out.println(multiply2);
    }


}





