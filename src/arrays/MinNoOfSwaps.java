package arrays;

//calculate the minimum number of swaps required to sort the array

import java.util.Arrays;
import java.util.Comparator;

public class MinNoOfSwaps {

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        System.out.println(minSwaps(arr));
    }

    public static int minSwaps(int[] arr) {

        int n = arr.length;
        Pair[] parr = new Pair[n];
        int count = 0;

        for(int i = 0 ; i<n ; i++){
            parr[i] = new Pair(arr[i],i);
        }

        Comparator<Pair> comparator = new Comparator<>(){
            public int compare(Pair p1, Pair p2){
                return Integer.compare(p1.x , p2.x);
            }
        };

        Arrays.sort(parr, comparator);

        for(int i = 0 ; i<n ; i++){
            if(parr[i].i != i){
                swap(parr, i , parr[i].i);
                count++;
                i--;
            }
            else{
                continue;
            }
        }
        return count;
    }

    public static void swap(Pair[] parr, int i, int j){
        Pair temp = parr[i];
        parr[i] = parr[j];
        parr[j] = temp;
    }
}

