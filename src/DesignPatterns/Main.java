package DesignPatterns;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5);
        List<String> res = Arrays.asList("apple", "cheeku" , "banana");

        String s = "sarvesh";

        String rev = new StringBuilder(s).reverse().toString();

        System.out.println(rev);

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);//desc
            }
        };

        ls.sort(comp);

        Comparator<String> comp1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };

        res.sort(comp1);

        System.out.println(ls.toString());
        System.out.println(res.toString());
    }
}
