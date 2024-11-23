package arrays;

import java.util.HashMap;

/*Input: arr[] = [1, 4, 45, 6, 10, 8], target =16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16*/

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(twosum(arr, 11));
    }

    public static boolean twosum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(target - arr[i])){
                return true;
            }
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
        }
        return false;
    }
}
