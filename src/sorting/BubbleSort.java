package sorting;

import java.util.Arrays;

//In each iteration, the largest element bubbles up to the right most position
//After n iterations the array becomes sorted

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,1,5,8,2,9,0};

        bubblesort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr){
        int n = arr.length;

        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n-1 ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
