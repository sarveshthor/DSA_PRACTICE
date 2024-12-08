package Streams;

//how will you flatten a list of list using streams

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Flatten {

    public static void main(String[] args) {
        List<List<Integer>> ls = new ArrayList<>();

        ls.add(Stream.of(1,2,3,4,5).toList());
        ls.add(Stream.of(66,33,2,3,4).toList());

        List<Integer> res = ls.stream().flatMap(List::stream).toList();

        System.out.println(res);

        //filter res above a certain value and calculate sum
        //first of all convert it into int stream
        int sum = res.stream().filter(n -> n > 7).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
