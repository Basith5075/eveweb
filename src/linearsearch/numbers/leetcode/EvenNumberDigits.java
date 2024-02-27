package linearsearch.numbers.leetcode;

public class EvenNumberDigits {
//LeetCode 1295. Find Numbers with Even Number of Digits

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,789};

        int res = findNumbers(nums);

//        int res = findDigits(12);

        System.out.println(res);
    }

    static int findNumbers(int[] nums) {

        int evenDigits = 0;

        for(int num : nums) {
            int digits = findDigits(num);
            if(digits % 2 == 0)
                evenDigits++;
        }

        return evenDigits;
    }

    static int findDigits(int nums){

//        int digits = 0;
//
//        while(nums != 0){
//            nums = nums/10;
//            digits ++;
//        }
//        return digits;

        int digits = (int)(Math.log10(nums) )+1;

        return  digits;
    }
}
