package arrays;

//Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.
//
//        Examples:
//
//Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//Output: [1, 2, 4, 3, 5, 0, 0, 0]
//Explanation: There are three 0s that are moved to the end.

import java.util.Arrays;

public class ZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        int n = arr.length;

        int j = 0;

        for(int i = 0 ; i<n ; i++){
            if(arr[i] != 0){
                //push non-zero element to front and update the jth index
                arr[j] = arr[i];
                j++;
            }
        }

        //now fill the rest indexes with 0;
        while(j<n){
            arr[j] = 0;
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
