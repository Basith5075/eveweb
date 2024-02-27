package linearsearch.numbers;

public class LinearSearchMinElement {
    public static void main(String[] args) {
        int[] arr = {-100,22,74,85,441,523,-121,10505};

        int target = 195;
        int ans = minElementInArray(arr,target);
        System.out.println(ans);
    }

    static int minElementInArray(int arr[], int target){

        if(arr.length<1)
            return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;

        for(int element : arr){
            if (element < min)
                min = element;
        }
        return min;
    }
}
