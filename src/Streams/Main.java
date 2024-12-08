package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //sum of all even numbers in an array
        int sum = Arrays.stream(arr).filter(n -> n%2 == 0).sum();
        //System.out.println(sum);

        List<String> ls = Arrays.asList("apple", "banana", "cherry");

        Stream<String> stream = ls.stream();

        int[] arr1 = {3, 2,5,3,3};

        Stream<Integer> st = Arrays.stream(arr1).boxed();

        String[] str = {"apple", "banana", "cherry"};

        Stream<String> mystream = Arrays.stream(str);

        Stream<Integer> stream2 = Stream.of(1,2,3);

        Stream<Integer> stream3 = Stream.iterate(0, n -> n+1).limit(100);

        Object[] printstream = stream3.toArray();

        for(Object o : printstream){
            System.out.println((int) o);
        }

    }
}
