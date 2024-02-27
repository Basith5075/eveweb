package linearsearch.numbers;

public class LinearSearchMaxElement {

    public static void main(String[] args) {
        int[] arr = {-100,22,74,85,441,523,121,10505};

        int target = 195;
        int ans = maxElementInArray(arr,target);
        System.out.println(ans);
    }

    static int maxElementInArray(int arr[], int target){

        if(arr.length<1)
            return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;

        for(int element : arr){
            if (element > max)
                max = element;
        }
        return max;
    }
}