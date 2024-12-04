package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7,4,11,2, 2, 5,8,9};

        quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int r){
        if(l>=r) return;
        int pi = partition(l, r, arr);
        quickSort(arr, l, pi-1);
        quickSort(arr, pi+1, r);
    }

    private static int partition(int l, int r, int[] arr){
        int i = l-1;
        int pivot = arr[r];

        for(int j = l ; j<r ; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);

        return i+1;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
