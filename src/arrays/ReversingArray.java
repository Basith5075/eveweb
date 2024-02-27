package arrays;

import java.util.Arrays;

public class ReversingArray {

    public static void main(String[] args) {
        int[] arr = {2,43,12,31,4,21,89};

        reverseArray(arr);
    }

    static void reverseArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        int temp = 0;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }


}
