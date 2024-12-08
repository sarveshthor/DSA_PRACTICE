package Streams;

import java.util.Arrays;
import java.util.*;

public class LongestString {

    public static void main(String[] args) {
        List<String> ls = Arrays.asList("sarvesh", "adssfsdfsdf","srsersdfsdfsdfsdf");

        Optional<String> longestString = ls.stream().max(Comparator.comparingInt(String::length));

        longestString.ifPresent(System.out::println);

    }
}
