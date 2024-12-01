package DP;

public class MinNoOfSquares {

    public static void main(String[] args) {
        System.out.println(count(12));
    }

    public static int count(int N){
        int[] ans = new int[N+1];
        ans[0] = 0;
        for(int i = 1 ; i<=N ; i++){
            ans[i] = i; //worst possible ans - 1 + 1 + 1 ....
            for(int x = 1 ; x*x <= i ; x++){
                ans[i] = Math.min(ans[i] , 1 + ans[i - (x*x)]);
            }
        }

        return ans[N];
    }
}
