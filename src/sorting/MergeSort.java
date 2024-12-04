package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 6,1,11,33,2,10};
        msort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void msort(int[] arr, int l, int r){
        if(l==r) return;
        int mid = l + (r-l)/2;
        msort(arr, l, mid);
        msort(arr, mid+1, r);
        merge(arr, l, mid, r);

    }

    private static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0 ; i<n1 ; i++){
            left[i] = arr[l+i];
        }

        for(int i = 0 ; i<n2 ; i++){
            right[i] = arr[mid + 1 +i];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of left[], if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements of right[], if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
