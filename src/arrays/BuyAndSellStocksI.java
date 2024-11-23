package arrays;


//single transaction allowed
public class BuyAndSellStocksI {


    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr){
        int min_so_far = arr[0];
        int max_profit = 0;
        int n = arr.length;

        for(int i = 1 ; i<n ; i++){
            min_so_far = Math.min(min_so_far, arr[i]);
            int profit = arr[i] - min_so_far;
            max_profit = Math.max(profit, max_profit);
        }
        return max_profit;
    }

}
