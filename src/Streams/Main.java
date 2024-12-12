package Streams;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] sorted = Arrays.stream(arr).sorted().toArray();

        int sum = Arrays.stream(arr).sum();

        System.out.println("sum -> "+ sum);

        System.out.println(Arrays.toString(sorted));

        //sum of all even numbers in an array
        int sum1 = Arrays.stream(arr).filter(n -> n%2 == 0).sum();
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

//        for(Object o : printstream){
//            System.out.println((int) o);
//        }
//

        List<String> strls = Arrays.asList("sarvsh", "sldkfsldfjlsdfj", "rohira");

        //longest string in the given list
        Optional<String> longestString = strls.stream()
                .distinct()
                .max((String s1, String s2) -> (s1.length() - s2.length()));

        longestString.ifPresent(System.out::println);


    }
}
