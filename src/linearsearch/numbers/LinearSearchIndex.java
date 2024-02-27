package linearsearch.numbers;

public class LinearSearchIndex {

    public static void main(String[] args) {
        int[] arr = {22,74,85,441,523,665,12};

        int target = -100;
        int ans = linearSearch(arr,target);

        System.out.println(ans);
    }


    // Search in the array: return the index if item found

    // Otherwise if item not found return -1
    private static int linearSearch(int[] arr, int target) {

        if(arr.length==0){
            System.out.println("this method called");
            return -1;
        }


        // run a loop
        for(int index = 0; index<arr.length; index++){
            int element = arr[index];
            if( element == target) {
                return index;
            }
        }
        return -1;
    }

}
