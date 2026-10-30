import java.util.Arrays;

public class ArraysExercise {

    static void main() {
        int arr[][] = {{126, 2, 3, 4, 5}, {111, 12, 13, 14, 15}, {21, 22, 2367, 24, 25}};

        int min = arr[0][0];
//        System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Min: " + min);

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max: " + max);

//        System.out.println(Arrays.deepToString(arr));

        int arr2[] = {11, 3, 24, 87, 92, 67, 15};

        int start = 0;
        int end = arr2.length - 1;
        int temp = 0;

        while (start < end) {
            temp = arr2[start];
            arr2[start] = arr2[end];
            arr2[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr2));

//        Column wise sum
        int sum = 0;
        for (int col = 0; col < arr[0].length; col++) {
            for (int row = 0; row < arr.length; row++) {
                sum += arr[row][col];
            }
            System.out.println("Column " + col + " sum: " + sum);
        }

        int brr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int col = 0; col < brr[0].length; col++) {
            for (int row = 0; row < brr.length; row++) {
                System.out.print(brr[row][col] + " ");
            }
            System.out.println();
        }

        int diagSum = 0;

        for (int row = 0; row < brr.length; row++) {
            for (int col = 0; col < brr[row].length; col++) {
                diagSum += brr[row][row];
                break;
            }
        }
        System.out.println(diagSum);

        int Elem = 200;
        boolean check = true;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == Elem) {
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }
            if (check) {
                break;
            }
        }
        System.out.println(check);

//        int crr[][] = {
//                {5, 1, 3},
//                {2, 0, 2},
//                {3, 1, 5}
//        };

        int crr[][] = {
                {2, 3, 6},
                {3, 4, 5},
                {6, 5, 9}
        };

        boolean isSemetric = true;

        for (int row = 0; row < crr.length; row++) {
            for (int col = 0; col < crr[row].length; col++) {
                if (crr[row][col] != crr[col][row]) {
                    isSemetric = false;
                    break;
                } else {
                    isSemetric = true;
                }
            }
            if (!isSemetric) {
                break;
            }
        }
        System.out.println("Is the matrix Symmetric: " + isSemetric);

        int[][] testArr = new int[3][3];

        testArr[0] = new int[2];
        testArr[1] = new int[4];
        testArr[2] = new int[3];

        testArr[0][0] = 10;
        testArr[0][1] = 20;

        testArr[1][0] = 30;
        testArr[1][1] = 40;
        testArr[1][2] = 50;
        testArr[1][3] = 60;

        testArr[2][0] = 70;
        testArr[2][1] = 80;
        testArr[2][2] = 90;

        for (int row = 0; row < testArr.length; row++) {
            for (int col = 0; col < testArr[row].length; col++) {
                System.out.print(testArr[row][col] + " ");
            }
            System.out.println();
        }

    }

}
