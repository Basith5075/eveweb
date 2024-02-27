package linearsearch.numbers;

public class LinearSearchElement {

    public static void main(String[] args) {
        int[] arr = {-100,22,74,85,441,523,665,12};

        int target = 195;
        boolean ans = linearSearchWithElememt2(arr,target);
        System.out.println(ans);
    }

    // Search for the target and return the element.
    static int linearSearchWithElememt(int[] arr, int target){
        if(arr.length==0)
            return Integer.MIN_VALUE;

        // Run the loop to check each element in the array.

        for (int index = 0; index <arr.length; index++){

            int element = arr[index];

            if (element == target)
                return element;

        }
        return Integer.MIN_VALUE;
    }

    // Search for the target and return true or false
    static boolean linearSearchWithElememt2(int[] arr, int target){
        if(arr.length==0)
            return false;

        // Run the loop to check each element in the array.
        for (int element : arr ){
            if (element == target)
                return true;
        }
            return false;
    }
}
