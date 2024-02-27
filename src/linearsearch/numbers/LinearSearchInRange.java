package linearsearch.numbers;

public class LinearSearchInRange {

    public static void main(String[] args) {
        int[] arr = {-100,22,74,85,441,523,121,10505};

        int target = 523;
        int ans = searchMaxInRange(arr,1,6);
        System.out.println(ans);
    }

    static int searchInRange(int[] arr, int target, int start, int end){

        if (arr.length<1)
            return -1;

        for (int index = start; index <= end; index ++){
            if(arr[index] == target)
                return index;
        }

        return -1;
    }
    static int searchMaxInRange(int[] arr, int start, int end){

        if (arr.length<1)
            return -1;
        int max = Integer.MIN_VALUE;
        for (int index = start; index <= end; index ++){
            if(arr[index] > max)
                max = arr[index];
        }

        return max;
    }
}
