package arrays;

//Given an array arr[ ], your task is to find the minimum number of increment operations required to
//make all the elements of the array unique. i.e.- no value in the array should occur more than once.
//In one operation, a value can be incremented by 1 only.

import java.util.Arrays;
import java.util.HashSet;

//Input: arr[] = [1, 1, 2, 3]
//Output: 3
//Explanation: If we increase arr[0] by 3, then all array elements will be unique. Hence,
//the answer is 3 in this case.
public class UniqueElements {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3};

        Arrays.sort(arr);

        HashSet<Integer> hset = new HashSet<>();

        int count = 0;
        int max_value = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if(hset.contains(arr[i])){
                count = count + max_value - arr[i] + 1;
                arr[i] = max_value + 1;
                max_value = arr[i];
                hset.add(max_value);
            }
            else{
                if(max_value < arr[i]) max_value = arr[i];
                hset.add(arr[i]);
            }

        }

        System.out.println(count);
    }
}
