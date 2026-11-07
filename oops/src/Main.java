import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static void main() {
        int a = 34;
        int b = 89;

        int arr[] = {1, 2, 3, 4, 5, 6};

        int arr2[][] = {
                {1, 2, 3, 4, 5},
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25}
        };

        System.out.println(a + b);
        System.out.println(Arrays.deepToString(arr2));
    }


}
