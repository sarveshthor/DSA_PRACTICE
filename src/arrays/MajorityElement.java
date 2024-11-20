package arrays;

//You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array.
//
//Note: The answer should be returned in an increasing format.
//
//        Examples:
//
//Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
//Output: [5, 6]
//Explanation: 5 and 6 occur more n/3 times.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2,1,5,5,5,5,5,6,6,6,6,6};

        System.out.println(findMajority(arr));
    }

    public static List<Integer> findMajority(int[] nums){
        int x = nums.length/3;
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i]) != -1){
                    map.put(nums[i], map.get(nums[i]) + 1);
                    if(map.get(nums[i]) > x){
                        res.add(nums[i]);
                        map.put(nums[i], -1);
                    }
                }
            }
            else{
                map.put(nums[i], 1);
                if(map.get(nums[i]) > x){
                    res.add(nums[i]);
                    map.put(nums[i], -1);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}
