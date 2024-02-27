package arrays.Test;

import java.util.Arrays;

public class MaxInArray {

    public static void main(String[] args) {
        int[] arr = {32,4,1,2,12,111,230};

        max(arr);
    }

    private static void max(int[] arr) {

        int max = arr[0];
        int index = 0;

            for(int i = 0; i<arr.length; i++){
                if(arr[i]>max){
                    max = arr[i];
                    index = i;
                }
            }
        System.out.println("The Array  "+ Arrays.toString(arr));
        System.out.println("The max value in the array is "+max);
        System.out.println("The index of max value is "+index);
    }
}
