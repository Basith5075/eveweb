package linearsearch.numbers.leetcode;

public class RichestCustomerWeath {

    // 1672. Richest Customer Wealth
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};

        int maxWealth = maximumWealth(accounts);
        System.out.println(maxWealth);
    }

    static int maximumWealth(int[][] accounts) {

        int maxAccount = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person ++){
            int personSum = 0;
            for(int account = 0; account <accounts[person].length; account++ ){
                personSum += accounts[person][account];
            }
            if(personSum > maxAccount)
                maxAccount = personSum;
        }

        return maxAccount;

    }

}
