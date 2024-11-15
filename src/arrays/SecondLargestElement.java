package arrays;

//Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
//
//Note: The second largest element should not be equal to the largest element.

import java.util.Arrays;

//Input: arr[] = [10, 5, 10]
//Output: 5
//Explanation: The largest element of the array is 10 and the second largest element is 5.
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 10};

        System.out.println(normalSearch(arr));
        System.out.println(streamSearch(arr));
    }

    public static int normalSearch(int[] arr){

        Arrays.sort(arr);
        int n = arr.length;
        if(n == 1){
            return -1;
        }
        else{
            for(int i = n-2 ; i>-1 ; i--){
                if(arr[i+1] > arr[i]) return arr[i];
            }
        }

        return -1;
    }

    public static int streamSearch(int[] arr){
        int max = Arrays.stream(arr).max().orElse(-1);
        return Arrays.stream(arr).filter(i -> i != max).max().orElse(-1);
    }


}
