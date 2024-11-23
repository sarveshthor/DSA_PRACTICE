package arrays;

//multiple transactions allowed
public class BuyAndSellStocks2 {

    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] arr){
        int profit = 0;

        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i] > arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }

        return profit;
    }
}
