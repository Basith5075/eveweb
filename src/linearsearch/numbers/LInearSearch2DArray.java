package linearsearch.numbers;

import java.util.Arrays;

public class LInearSearch2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {22,415,11,874},
                {15,65,41,525,645,69},
                {94,46,25,4152,441}
        };

        int target = 645;
        int ans[] = searchIndex(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIndex(int[][] arr,int target){

        for(int row = 0; row<arr.length; row++){

            for(int col =0; col <arr[row].length; col++){
                if(arr[row][col] == target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
