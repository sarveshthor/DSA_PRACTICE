package Bitwise;

public class MaxAndRepKEle {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(max_and(arr, 3, 3));
    }

    public static int max_and(int[] arr, int k, int n){

        int[] setBits = new int[31];

        //counting the set bits at jth index of every element
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<31 ; j++){
                if((arr[i] & (1 << j) )!= 0){
                    setBits[j]++;
                }
            }
        }

        // updating the setbits count as N if k allows
        for(int i = 30 ; i>=0 ; i--){
            if(k > (n - setBits[i])){
                k -= (n - setBits[i]);
                setBits[i] = n;
            }
        }

        int ans = 0;

        for(int i = 0 ; i<31 ; i++){
            if(setBits[i] == n){
                ans += (1 << i);
            }
        }

        return ans;

    }
}
