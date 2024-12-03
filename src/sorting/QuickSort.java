package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7,4,11,2, 2, 5,8,9};

        quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int l, int r){
        if(l>=r) return;
        int pivot = arr[r];
        int pi = partition(arr, l, r); // where the array is partitioned
        quickSort(arr, l, pi-1);
        quickSort(arr, pi+1, r);
    }

    public static int partition(int[] arr, int l, int r){
        int pivot = arr[r];
        int i = l-1;
        for(int j = l ; j<=r-1 ; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int t = arr[r];
        arr[r] = arr[i+1];
        arr[i+1] = t;

        return i+1;
    }
}
