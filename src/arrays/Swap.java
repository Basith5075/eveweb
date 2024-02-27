package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int[] arr = {1,3,9,4,2};

        swap(arr,0,4);

    }

    private static void swap(int[] arr, int i, int j) {

       int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(Arrays.toString(arr));

    }
}
